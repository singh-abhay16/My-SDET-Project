package com.sdet;

import java.util.ResourceBundle;

public class App {
	public int userlogin(String in_user , String in_pwd )
	{
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String user_name=rb.getString("username");
		String pass_word=rb.getString("password");
		if (in_user.equals(user_name) && in_pwd.equals(pass_word))
			return 1;
		else 
			return 0;
			
	}
}
