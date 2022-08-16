package com.chenxing.demo01;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @ClassName HelloServlet
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 15/08/2022 17:02
 */
public class HelloServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // super.service(req, res);
        System.out.println("Hello Everyone!");
    }
}
