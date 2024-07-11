package org.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
	
	public static void verifySauceDemoLogin()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement uname = driver.findElement(By.id("user-name"));
		uname.sendKeys("standard_user");
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		driver.close();
	}

	public static void main(String[] args) {
		
		WebElementCommands obj = new WebElementCommands();
		obj.verifySauceDemoLogin();
		

	}

}

//https://demowebshop.tricentis.com/