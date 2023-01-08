package com.NewProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.BaseClass;

public class Testcase extends BaseClass {

	@BeforeClass
	public void set() {
		setup();
	}

	@Test
	public void test1() throws InterruptedException {
		openURL();
	}

	@Test
	public void test2() throws InterruptedException {
		hp.clickonshop();
	}

	@Test
	public void test3() throws InterruptedException {
		pp.clickOnProduct();
	}

	@Test
	public void test4() throws InterruptedException {
		cp.CheckOutpage();
	}

	@AfterClass
	public void closebrowser() throws InterruptedException {
		closeBrowser();
	}

}
