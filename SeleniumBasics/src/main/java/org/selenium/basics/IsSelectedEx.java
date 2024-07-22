package org.selenium.basics;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IsSelectedEx {
	static boolean isbuttonselected; 
	static boolean isbuttonenabled;
	static boolean isbuttondisplayed;
	
	public static void verifyIsSelected()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		WebElement radiobuttonmale = driver.findElement(By.xpath("//div[@class='gender']//input[@id='gender-male']"));
		 isbuttonselected = radiobuttonmale.isSelected();
		System.out.println("Male gender element before selection: " +isbuttonselected);
		
		radiobuttonmale.click();
		isbuttonselected = radiobuttonmale.isSelected();
		 System.out.println("Male gender element after selection: " +isbuttonselected);
	driver.close();
		 
	}
	
	public void verifyIsEnabled()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement Subscribe = driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		isbuttonenabled= Subscribe.isEnabled();
		System.out.println(isbuttonenabled);
		driver.close();
		
	}
	public void verifyIsDisplayed()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement votebutton = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		isbuttondisplayed = votebutton.isDisplayed();
		System.out.println(isbuttondisplayed);
		driver.close();
	}
	
	public void verifyDropDown()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		WebElement register = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		register.click();
		WebElement countrydropdown = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(countrydropdown);
		//select.selectByVisibleText("ANTARCTICA");
		//select.selectByValue("BAHAMAS");
		//select.selectByIndex(7);
		//WebElement getCountryName = select.getFirstSelectedOption();	
		//System.out.println(getCountryName.getText());
		driver.close();
		
	}
	
	public void verifyFullDropDownValues()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		WebElement register = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		register.click();
		WebElement countrydropdown = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(countrydropdown);
		List<WebElement> elements = select.getOptions();
		System.out.println("Total num of elements: " +elements.size());
		driver.close();
		
	}
	
	public void verifyAlerts()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		//***********SIMPLE ALERT*********
		
		/*WebElement simpleAlertfirstbutton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlertfirstbutton.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.close();*/
		
		//***********CONFIRMATION ALERT*********
		
		/*WebElement confirmationalert = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmationalert.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		WebElement value = driver.findElement(By.xpath("//span[@id='confirmResult']"));	
		System.out.println(value.getText());*/
		

		//***********PROMPT ALERT*********
		
		
		WebElement promptalert = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptalert.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Drishya");
		alert.accept();
		WebElement textentered = driver.findElement(By.xpath("//span[@id='promptResult']"));
		System.out.println(textentered.getText());
		driver.close();
		
		
	}
	
	public void verifyMouseActionsRightClick()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions actions = new Actions(driver);
		actions.contextClick(rightclick).build().perform();
		driver.close();
		
	}
	
	public void verifyDoubleClick()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions actions = new Actions(driver);
		actions.doubleClick(doubleclick).build().perform();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.close();
	}

	public static void main(String[] args) {
		IsSelectedEx obj = new IsSelectedEx();
		//obj.verifyIsSelected();
		//obj.verifyIsEnabled();
		//obj.verifyIsDisplayed();
		//obj.verifyDropDown();
		//obj.verifyFullDropDownValues();
		//obj.verifyAlerts();
		//obj.verifyMouseActions();
		obj.verifyDoubleClick();
		
		

	}

}
