package com.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Date;

/**
 * 〈自定义标签类〉
 *
 * @author PitterWang
 * @create 2020/6/22
 * @since 1.0.0
 */
public class HelloTag extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().write("helloword" + new Date());
	}
}