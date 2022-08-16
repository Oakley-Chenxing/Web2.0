package com.chenxing.controller; /**
 * @ClassName ${NAME}
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 16/08/2022 12:24
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Bservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        System.out.println("This is B doGet()");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        System.out.println("This is B doPost()");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //super.service(req, res);
        // service 方法可以接收各种类型的提交方式 覆盖范围很广
        // 如果写了 service 方法 就会屏蔽其他方法
        System.out.println("This is B Servlet()!");
    }
}
