package org.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		WebElement gender = driver.findElement(By.xpath("//div[@class='gender']//input[@id='gender-male']"));
		gender.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
		firstname.sendKeys("test1");
		WebElement lastname = driver.findElement(By.xpath("//input[contains(@id,'LastName') ]"));
		lastname.sendKeys("Test lastname");
		WebElement email = driver.findElement(By.xpath("//input[starts-with(@id,'Email')]"));
		email.sendKeys("test.test3@testing.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='Password'and@name='Password']"));
		password.sendKeys("Test@123");
		WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		confirmpassword.sendKeys("Test@123");
		WebElement register1 = driver.findElement(By.xpath("//input[@id='register-button']"));
		register1.click();
		WebElement continueclick = driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']"));
		continueclick.click();
		WebElement vote = driver.findElement(By.xpath("//li[@Class='answer']//input[@id='pollanswers-1']//following-sibling::label"));
		vote.click();
		
		
		
		
	}

}
