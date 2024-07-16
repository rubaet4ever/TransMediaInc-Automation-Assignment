package com.transmediainc.main;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.transmediainc.ui.UIAutomation;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTestManager {

	static	WebDriver driver = null;

		public static void main (String[] args) throws InterruptedException {
			try {

				WebDriver driver = new ChromeDriver();    
				final String SERVER_URL = "http://localhost:3000/";
				driver.get(SERVER_URL);
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();	
				
				UIAutomation.createUIAutomationTest(driver);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				driver.quit();
			}

		}
		
		private static WebDriver getChromeDriver(String serverUrl)throws InterruptedException {

			final String DRIVER_NAME = "webdriver.chrome.driver";
		    System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(serverUrl);    
			
			System.out.println("Chrome driver found");
			return driver;
		}

		public void tearDownTest() {
			//close browser
			driver.close();
			driver.quit();
			System.out.println("Test Completed Successfully");
		}
		
	}
