package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathEx1 {
	
	public static void main(String[] args) {
		
	
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/");
	WebElement searchtextbox = driver.findElement(By.xpath("//input[@id='edit-search-block-form--2' and @class='form-control form-text']"));
	searchtextbox.sendKeys("xpath");
	WebElement searchbutton = driver.findElement(By.xpath("//span[@Class='input-group-btn']//span[@class='icon glyphicon glyphicon-search']"));
	searchbutton.click();
	WebElement clicklink = driver.findElement(By.xpath("//a[text()='Examples with xpath and Css (ID, Name, Text and Links)']"));
	clicklink.click();
	WebElement testng = driver.findElement(By.xpath("//a[text()='TestNG']"));
	testng.click();
	driver.close();
	
	
	
	
	
	
	}
}
