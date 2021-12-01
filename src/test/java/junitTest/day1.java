package junitTest;

import java.util.Date;

import org.bouncycastle.util.test.FixedSecureRandom.Data;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utilities.HelperClass;

import FbloginPojo.FbLoginPojo;

public class day1 extends HelperClass {

	@BeforeClass
	public static void launchingBrowser() {
		launchChrome();
		loadUrl("https://www.facebook.com/");
		winMax();
	}

	@AfterClass
	public static void closingChrome() {
		quitBrowser();

	}

	@Test
	public void tc1() {
		FbLoginPojo f = new FbLoginPojo();
		sendTxt(f.getTxtuser(), "junit");
	
	}
@Test
public void tc2() {
	FbLoginPojo p=new FbLoginPojo();
	sendTxt(p.getTxtpass(),"1234567");

}
}
