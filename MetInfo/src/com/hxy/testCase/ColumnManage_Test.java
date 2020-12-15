package com.hxy.testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hxy.Listener.JavaMailTestListener;
import com.hxy.pageObjects.ColumnManage;
import com.hxy.util.BaseTest;
/*
 *  * ?????
 */
@Listeners(JavaMailTestListener.class)
public class ColumnManage_Test extends BaseTest {
//	//6ge1
	public ColumnManage u(WebDriver webDriver) {
		ColumnManage a = new ColumnManage(webDriver);
		return a;
	}
	@Test
//	public void ColumnManage_updateTitle() throws InterruptedException {	
//		u(driver).updateTitle();
//	}
//	@Test
//	public void ColumnManage_setDisplay_no() throws InterruptedException {	
//		u(driver).setDisplay_no();
//	}
	@Test
	public void ColumnManage_setDisplay_all() throws InterruptedException {	
		u(driver).setDisplay_all();
	}
//	@Test
//	public void ColumnManage_setDisplay_tail() throws InterruptedException {	
//		u(driver).setDisplay_tail();
//	}
	@Test
	public void ColumnManage_setDisplay_head() throws InterruptedException {	
		u(driver).setDisplay_head();
	}
	@Test
	public void ColumnManage_addColumn() throws InterruptedException {	
		u(driver).addColumn();
	}
}
