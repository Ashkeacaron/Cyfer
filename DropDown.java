package com.dropdownTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
      public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\DropdownMethods\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-username")).sendKeys("AshKeacaronii");
		driver.findElement(By.name("firstname")).sendKeys("Ash");
		driver.findElement(By.name("lastname")).sendKeys("Keacarons");
		driver.findElement(By.name("email")).sendKeys("Keacarons@gmail.com");
		WebElement dd = driver.findElement(By.name("country_id"));
		dd.click();
		Select S=new Select(dd);
		List<WebElement> option= S.getOptions();
		for (WebElement a : option) {
			String T = a.getText();
			if (T.equals("Cuba")) {
			a.click();	
			}
		}
		Thread.sleep(3000);	
		S.selectByIndex(2);
//		S.deselectByIndex(2);
		Thread.sleep(3000);
		S.selectByValue("8");
//		S.deselectByValue("8");
		Thread.sleep(3000);
		S.selectByVisibleText("India");
		Robot R=new Robot();
		R.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.name("password")).sendKeys("9874563210");
//		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
		
//		S.deselectByVisibleText("India");
//		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
