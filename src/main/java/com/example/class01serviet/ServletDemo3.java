package com.example.class01serviet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet(value = "/demo3",name = "demo3")
public class ServletDemo3  implements Servlet {

    /**
     *
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Servlet 初始化");

    }

    /**
     *
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 执行 Service 方法
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().write("servletDemo3 执行");
        System.out.println("service 执行");
    }

    /**
     * 获取 servlet 信息
     *
     * @return
     */
    @Override
    public String getServletInfo() {
        return "";
    }

    /**
     * 执行销毁方法
     */
    @Override
    public void destroy() {
        System.out.println("销毁方法");

    }
}
