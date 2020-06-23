package com.servletdemo;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈第一个Servlet〉
 *
 * @author PitterWang
 * @create 2020/6/22
 * @since 1.0.0
 */
@WebServlet(name = "firstServlet",urlPatterns = {"/firstServlet"},loadOnStartup = 1,
initParams = {@WebInitParam(name="password",value = "1234")})

public class FirstServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("first创建");
		String name = getServletConfig().getInitParameter("name");
		String password = getServletConfig().getInitParameter("password");

		System.out.println(name);
		System.out.println(password);
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("index.jsp");
	}
}