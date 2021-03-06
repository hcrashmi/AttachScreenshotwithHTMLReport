/*package com.scripts;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGDefaultReport 
{
	static WebDriver driver;
	@BeforeSuite
	public void setup(){
	System.setProperty("webdriver.gecko.driver","./src/main/resources/driver/geckodriver.exe");

	System.setProperty("org.uncommons.reportng.escape-output", "false");
	driver = new FirefoxDriver();
	}
	 
	@BeforeMethod
	public void beforeEachMethod(){
	driver.get("http://google.com");
	}
	 
	//Test case 1
	@Test
	public void cars() throws Exception {
	System.out.println("I am Test method and I am searching for cars");
	driver.findElement(By.name("q")).sendKeys("Cars");
	 
	driver.findElement(By.name("btnG")).click();
	 
	//Wait for the results to appear
	Thread.sleep(2000);
	takeScreenshot();
	if(driver.findElement(By.partialLinkText("car")).isDisplayed()){
	Assert.assertTrue(true); 
	}
	else{
	Assert.assertTrue(false);
	}
	}
	 
	@AfterSuite
	public void endOfSuite(){
	System.out.println("I am the end of suite");
	driver.quit();
	}
	 
	public static void takeScreenshot() throws Exception {
	String timeStamp;
	File screenShotName;
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//The below method will save the screen shot in d drive with name "screenshot.png"
	timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
	screenShotName = new File("D:\\MyTest\\Screenshots\\"+timeStamp+".png");
	FileUtils.copyFile(scrFile, screenShotName);
	 
	String filePath = screenShotName.toString();
	//String path = "<img src="\"file://"" alt="\"\"/" />";
	String path = "<img src=\"file://" +"\" alt=\"\"/>";
	Reporter.log(path);
	
	String screenshotPath =getScreenshot(name, driver);
     System.out.println("Screenshot taken");
     String path = "<img src=\"file://" + screenshotPath + "\" alt=\"\"/>";
     System.out.println(screenshotPath+" and path - "+path);
     Reporter.log("Capcher screenshot path is "+path);
	 
	}
}
*/