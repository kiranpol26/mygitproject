package com.IntgTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class googTest {
	private WebDriver driver;
	 
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
	  
	  @Test
	  public void refreshInstacart() {
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://www.google.com/");
		  WebElement txtsearch = driver.findElement(By.name("q"));
		  txtsearch.sendKeys("selenium tutorials");
		  txtsearch.sendKeys(Keys.ESCAPE);		  
		  WebElement btnsearch = driver.findElement(By.name("btnK"));
		  clickElement(btnsearch);
		  WebElement lintut = driver.findElement(By.partialLinkText("Selenium Tutorial for Beginners"));
		  
		  Assert.assertTrue(lintut.isDisplayed());
		  
	    
	  }
	  
	  public void clickElement(WebElement e) {
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.elementToBeClickable(e));
		  e.click();
	  }
}
