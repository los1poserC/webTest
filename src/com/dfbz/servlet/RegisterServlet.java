package com.dfbz.servlet;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.print("得到的用户名是："+request.getParameter("name")+"<br />");
        String[] hobbies=request.getParameterValues("hobby");
        out.print("爱好是:"+ Arrays.toString(hobbies)+"<br />");

        Enumeration<String> names=request.getParameterNames();
        while (names.hasMoreElements()){
            String name=names.nextElement();
            out.print("参数名:"+name+",参数值"+request.getParameter(name)+"<br />");
        }

        Map<String,String[]> map=request.getParameterMap();
        Set<Map.Entry<String,String[]>> entries=map.entrySet();

        for(Map.Entry<String,String[]> entry:entries){
            out.print(entry.getKey()+"="+Arrays.toString(entry.getValue())+"<br />");
        }

        User user=new User();

        try {
            BeanUtils.populate(user,map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.print("用户对象："+user.toString());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
