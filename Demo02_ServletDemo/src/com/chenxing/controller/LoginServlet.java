package com.chenxing.controller; /**
 * @ClassName ${NAME}
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 18/08/2022 14:35
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 告诉前端响应数据的格式
        response.setContentType("text/html;charset=utf-8");
       // System.out.println("DoPost 被调用了！");
        // 模拟从数据库中拿来用户名和密码
        // userModel.getGetLoginInfo() 假设通过这个获取 用户名和密码
        String uname = "Chenxing";
        String pswd = "123321";
        System.out.println(uname);
        System.out.println(pswd);

        String username = request.getParameter("Username");
        String password = request.getParameter("Password");
        // System.out.println(username + "<====>" + password);

//        if (username.equals(uname) && password.equals(pswd)){
//            System.out.println("Welcome!" + username);
//        }else{
//            System.out.println("Wrong PSW! Please Try Again~");
//        }
        PrintWriter out = response.getWriter();
        if (username.equals(uname) && password.equals(pswd)){
            out.write("<h3>Welcome!" + username +"</h3>");
        }else {
            out.write("<h3 style='color:red'>Wrong PSW! Please Try Again~</h3>"+ username + password + uname + pswd);
        }


    }
}
