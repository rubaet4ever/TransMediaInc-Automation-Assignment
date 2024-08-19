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
		
		public void createExtentReportsWithTestNG(WebDriver driver) throws InterruptedException {
			// TODO Auto-generated method stub
			
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


