package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static  WebDriver driver;
	public static WebDriver loadBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	public void btnClick(WebElement ele) {
	ele.click();
	}
	
	public void ddpdwn(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByVisibleText(value);
	}
	

	public static String  gettingAttribute(WebElement ele) {
		
		String att= ele.getAttribute("value");
		System.out.println(att);
		return att;
	}

}
