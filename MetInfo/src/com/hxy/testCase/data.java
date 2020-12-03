package com.hxy.testCase;

import org.testng.annotations.Test;

import com.webtest.dataProvider.NSDataProvider;

public class data {
	@Test(dataProvider = "excel",dataProviderClass = NSDataProvider.class)
	public void a(String s1,String s2,String s3,String s4) {
		System.out.println(s1);
	}
}
