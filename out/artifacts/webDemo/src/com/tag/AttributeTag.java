package com.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Date;

/**
 * 〈带属性的标签〉
 *
 * @author PitterWang
 * @create 2020/6/23
 * @since 1.0.0
 */
public class AttributeTag extends SimpleTagSupport {

	private String userName;
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().write("userName = " + userName + ",passWord = " + passWord);
	}
}