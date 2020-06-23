package com.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 〈拦截用户请求，把请求的信息记录到日志〉
 *
 * @author PitterWang
 * @create 2020/6/23
 * @since 1.0.0
 */

//@WebFilter(filterName = "log",urlPatterns = {"/*"})
public class LogFilter implements Filter {

	//访问Filter的配置信息
	private FilterConfig config;

	/**
	 * 初始化方法
	 * @param filterConfig
	 * @throws ServletException
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.config = filterConfig;
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

		ServletContext servletContext = this.config.getServletContext();

		long before = System.currentTimeMillis();
		System.out.println("开始过滤");

		HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

		String servletPath = httpServletRequest.getServletPath();
		System.out.println("l拦截的地址 = "+servletPath);
		filterChain.doFilter(servletRequest,servletResponse);
		long aftet = System.currentTimeMillis();

		System.out.println("过滤结束");

		System.out.println("请求呗定位到" + httpServletRequest.getRequestURI() + "用时 "+ (aftet - before));
	}

	/***
	 * 销毁方法
	 */
	@Override
	public void destroy() {
		this.config = null;
	}
}