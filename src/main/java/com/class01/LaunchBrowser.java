package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launch browser
		driver.get("https://www.google.com/"); //navigate to url
		String url = driver.getCurrentUrl();//getting the url of the page
		System.out.println(url);
		String title = driver.getTitle();//getting the title of the page
		System.out.println(title);
		driver.quit();

	}

}
