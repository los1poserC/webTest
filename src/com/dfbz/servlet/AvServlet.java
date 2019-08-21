package com.dfbz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/avServlet")
public class AvServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        String referer=request.getHeader("referer");
        if (referer ==null){
            response.sendRedirect("index.jsp");
        }else if(referer!=null && referer.contains("/index.jsp")){
            out.print("<h1>您可以正常访问，精彩内容</h1>");
        }else {
            response.sendRedirect("index.jsp");
        }
    }
}
