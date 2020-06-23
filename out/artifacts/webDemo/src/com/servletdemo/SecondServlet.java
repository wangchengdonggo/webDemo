package com.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈第二个servlet〉
 *
 * @author PitterWang
 * @create 2020/6/22
 * @since 1.0.0
 */
public class SecondServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("初始化");
		String name = getServletConfig().getInitParameter("name");
		System.out.println(name);
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("调用");


		resp.sendRedirect("index.jsp");
	}

	@Override
	public void destroy() {
		System.out.println("销毁");
		super.destroy();
	}
}