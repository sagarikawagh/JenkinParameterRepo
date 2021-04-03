package com.demo.pratice;

import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void check()
	{
		String un = System.getProperty("username");
		String pwd = System.getProperty("password");
		
		System.out.println("username is : " + un);
		System.out.println("password is : " + pwd);
	}
}
