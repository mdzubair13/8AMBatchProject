package org.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

	public static WebDriver driver;
	public static Actions a;

	public static void launchChrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zubee\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void winMax() {
		driver.manage().window().maximize();
	}

	public static void ptrnTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void ptrnUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void sendTxt(WebElement ele, String Value) {
		ele.sendKeys(Value);
	}

	public static void clickBtn(WebElement ele) {
		ele.click();
	}
	public static void closeTab() {
		driver.close();
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	public static void dragAndDropMouse(WebElement  Src, WebElement dsc) {
		a=new Actions(driver);
		a.dragAndDrop(Src, dsc).perform();
	}
	
	
	
	
	

}
