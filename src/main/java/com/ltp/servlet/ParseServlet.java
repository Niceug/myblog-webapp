package com.ltp.servlet;

import com.ltp.entities.ArticleInfo;
import com.ltp.parse.ParseCSDN;
import net.minidev.json.JSONArray;

import java.io.IOException;

import java.util.List;

public class ParseServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        List<ArticleInfo> list = ParseCSDN.startParse();
        request.setCharacterEncoding("utf-8");
        response.setContentType("charset=utf-8;text/html");

        String array = JSONArray.toJSONString(list);
        request.setAttribute("article-list", array);
        request.getRequestDispatcher(request.getContextPath() + "/").forward(request, response);
    }
}
