package com.chenxing.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName A
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 16/08/2022 11:44
 */
public class Aservlet extends HttpServlet {
    public Aservlet(){
        System.out.println("Servlet 被创建了！");
    }
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.service(req, resp);
        System.out.println("This is A Servlet!");
    }
}
