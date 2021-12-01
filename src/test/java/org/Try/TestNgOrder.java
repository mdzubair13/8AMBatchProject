package org.Try;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgOrder {

	@BeforeClass
	public void launchingBrowser() {
		System.out.println("Chrome");
	}
	@AfterClass
	private void closingBrowser() {
	System.out.println("close");
	}
	@BeforeMethod
	private void startTime() {
		System.out.println("start");

	}
	@AfterMethod
	private void endtime() {
		System.out.println("end");

	}
	@Test
	private void Tc3() {
		System.out.println("Test3");
	}
	@Test
	private void Tc2() {
		System.out.println("Test2");
	}
	@Test
	private void tc1() {
		System.out.println("test 1");
	}
	
}
