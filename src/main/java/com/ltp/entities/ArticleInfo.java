package com.ltp.entities;


/**
 * @author yu
 * @date 创建时间：2017年11月8日 上午11:21:34
 */

public class ArticleInfo{

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章链接
     */
    private String url;

    /**
     * 文章简介
     */
    private String summary;

    /**
     * 访问量
     */
    private String pageView;

    /**
     * 发布时间
     */
    private String createTime;


    public ArticleInfo() {}

    public ArticleInfo(String title, String url, String summary,
                       String pageView, String createTime) {
        this.title = title;
        this.url = url;
        this.summary = summary;
        this.pageView = pageView;
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPageView() {
        return pageView;
    }

    public void setPageView(String pageView) {
        this.pageView = pageView;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}