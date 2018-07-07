package com.ltp.parse;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ltp.entities.ArticleInfo;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

public class ParseCSDN  implements PageProcessor {
    public static List<ArticleInfo> list = new ArrayList<>();

    // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me()
            .setRetryTimes(3)
            .setSleepTime(100)
            //添加cookie之前一定要先设置主机地址，否则cookie信息不生效
            //.setDomain("lt.gdou.com")
            //添加抓包获取的cookie信息
            //.addCookie("xx", "xx")
            //添加请求头，有些网站会根据请求头判断该请求是由浏览器发起还是由爬虫发起的
            .addHeader("User-Agent",
                    "ozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.80 Safari/537.36 Core/1.47.516.400 QQBrowser/9.4.8188.400")
            .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
            .addHeader("Accept-Encoding", "gzip, deflate, sdch").addHeader("Accept-Language", "zh-CN,zh;q=0.8")
            .addHeader("Connection", "keep-alive");

    public Site getSite() {
        return site;
    }

    public void process(Page page) {
        List<String> titleList = page.getHtml().xpath("//*[@class=\"article-item-box csdn-tracking-statistics\"]/html()").all();


        String titleReg = "(</span>)(.*)(</a>\\s+</h4>)";
        String hrefReg = "<p\\s+class=\\\"content\\\">\\s+<a href=\\\"(.*)\\\"\\s+target";
        String summaryReg = "<p\\s+class=\\\"content\\\">\\s+<a.*>(.*)</a>";
        String createTimeReg = "<span\\s+class=\\\"date\\\">(.*)</span>";
        String pageViewReg = "<span\\s+class=\\\"read-num\\\">阅读数：(.*)</span>";

        Pattern pTitle = Pattern.compile(titleReg);
        Pattern pHref = Pattern.compile(hrefReg);
        Pattern pSummary = Pattern.compile(summaryReg);
        Pattern pCreateTime = Pattern.compile(createTimeReg);
        Pattern pPageView = Pattern.compile(pageViewReg);

        for(String str : titleList) {
            Matcher mTitle = pTitle.matcher(str);
            Matcher mHref = pHref.matcher(str);
            Matcher mSummary = pSummary.matcher(str);
            Matcher mCreateTime = pCreateTime.matcher(str);
            Matcher mPageView = pPageView.matcher(str);


            while(mTitle.find()) {

                String title = mTitle.group(2);
                String href = null;
                if(mHref.find()) {
                    href = mHref.group(1);
                }

                String summary = null;
                if(mSummary.find()) {
                    summary = mSummary.group(1);
                }

                String createTime = null;
                if(mCreateTime.find()) {
                    createTime = mCreateTime.group(1);
                }

                String pageView = null;
                if(mPageView.find()) {
                    pageView = mPageView.group(1);
                }
                ArticleInfo articleInfo =
                        new ArticleInfo(title, href, summary,
                                pageView, createTime);
                ParseCSDN.list.add(articleInfo);
            }
        }

    }

    public static List<ArticleInfo> startParse(){
        //加入待爬去的衔接
        String[] urls = new String[5];
        String url = "https://blog.csdn.net/Bugggget/article/list/";
        for(int i = 0, len = urls.length; i < len; ++i) {
            urls[i] = url + (i + 1);
        }
        Spider.create(new ParseCSDN())
                .addUrl(urls)
                //开启5个线程抓取
                .thread(1)
                //启动爬虫
                .run();

        return ParseCSDN.list;
    }

}
