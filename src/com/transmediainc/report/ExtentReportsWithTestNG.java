package com.transmediainc.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ExtentReportsWithTestNG {
	//public ExtentReports extent;
		//public ExtentSparkReporter spark;
		//public ExtentTest test;
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");
		//public ExtentReports extent;
		//public ExtentSparkReporter spark;
		public ExtentTest test;
		
		//WebElement menu_text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Desktops']")));
				//String text = menu_text.getText();
				//assertThat(text).as("Verify text of Menu link").isEqualToIgnoringCase("Desktops");
		
		public static void createExtentReportsWithTestNG(WebDriver driver) throws InterruptedException {
			// TODO Auto-generated method stub
			
			driver.findElement(By.id("email")).sendKeys("rubaet@bs.com");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("rubaet1@R");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//driver.findElement(By.id("rc-anchor-container")).click();
			//Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".bigger-110")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector(".user-info > span:nth-child(3)")).click();
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//div[@id='navbar-container']/div[2]/ul/li[3]/ul/li[3]/a/span")).click();
			Thread.sleep(2000);

		}
		
		@Test
		public void UIAutomation(){

		ExtentTest Test = extent.createTest("Launch Browser and Website").assignAuthor("John").assignCategory("UI Test").assignDevice("Desktop_chrome");

		ExtentTest Test1 = extent.createTest("Launch Browser and Website").assignAuthor("Doe").assignCategory("UI Test").assignDevice("Desktop_chrome");

		Test1.log(Status.PASS,"Browser lunched");
		Test1.pass("Browser launched successfully");
		test.info("Displaying Page");
		}
		

		@BeforeTest
		public void BeforeTest() {
			extent = new ExtentReports();
			spark = new ExtentSparkReporter("ExtentReport.html");
			extent.attachReporter(spark);
			
		}

		@AfterTest
		public void AfterTest() {
		
			extent.flush();
		}

	}


