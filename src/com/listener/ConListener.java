package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebFilter;

/**
 * 〈Web应用启动和关闭监听〉
 *
 * @author PitterWang
 * @create 2020/6/23
 * @since 1.0.0
 */
/*@WebFilter*/
public class ConListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Web服务启动");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Web服务关闭");

	}
}