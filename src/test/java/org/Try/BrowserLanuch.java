package org.Try;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.HelperClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLanuch extends HelperClass{
	public static void main(String[] args) {
		launchChrome();
		loadUrl("https://www.facebook.com/");
		winMax();
		ptrnTitle();
		ptrnUrl();
		
			
		
	}
	

}
