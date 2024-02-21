package com.qa.pagelayer;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver; 
	public HomePage(WebDriver driver){
		this.driver=driver;		
	}

	public void searchbox(String productname) {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(productname);
	}

	public void searchbutton() {
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();		
	}

	public void iphone() {
		driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
	}	

	public void add2cart() {
		String mainwindowID = driver.getWindowHandle();
		System.out.println(mainwindowID);

		Set<String> allwindowsID = driver.getWindowHandles();

		for(String c:allwindowsID) {
			System.out.println(c);

			if(mainwindowID.equals(c)) {
				System.out.println("Focus on Main Window");
			}
			else {
				System.out.println("Focus on Child Window");
				driver.switchTo().window(c);
				driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
			}
		}
	}
	public void proceed() {
		driver.findElement(By.xpath("//input[@name=\"proceedToRetailCheckout\"]")).click();
	}
}
