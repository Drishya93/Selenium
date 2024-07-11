package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebCommandsDemoWebShop {
	
	public static void verifyLogin()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login = driver.findElement(By.className("ico-login"));
		login.click();
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("drishyasree93@gmail.com");
		WebElement pswd = driver.findElement(By.id("Password"));
		pswd.sendKeys("Apr2024@1");
		WebElement loginbutton = driver.findElement(By.className("login-button"));
		loginbutton.click();
		driver.close();
		
		
		
	}

	public static void main(String[] args) {
		
		WebCommandsDemoWebShop demo = new WebCommandsDemoWebShop();
		demo.verifyLogin();
	}

}
