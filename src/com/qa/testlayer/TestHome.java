package com.qa.testlayer;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pagelayer.HomePage;

public class TestHome {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "C:\\A-SQUARE\\A-SQUARE\\Velocity-Software Testing\\01-Amar Waghamare Sir\\Software\\chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		String url ="https://www.amazon.in";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		HomePage object = new HomePage(driver);
		object.searchbox("Iphone 13");
		object.searchbutton();
		object.iphone();
		object.add2cart();
		object.proceed();
	}
}

