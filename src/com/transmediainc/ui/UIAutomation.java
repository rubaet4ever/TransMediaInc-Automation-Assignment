package com.transmediainc.ui;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;

public class UIAutomation {

		public static void createUIAutomationTest (WebDriver driver) throws InterruptedException {
			try {

				driver.findElement(By.xpath("//h1[normalize-space()='Create new board']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@placeholder='Add board title']")).sendKeys("Demo UI Test"); // Input a Board name 
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@placeholder='Add board title']")).sendKeys(Keys.ENTER); // Press Enter. Verify Board created successfully.
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[@id='app']/div/div/div/div[3]/div/input")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/div/div[3]/div/input")).sendKeys("List 1"); // Add First List
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/div/div[3]/div/input")).sendKeys(Keys.ENTER); // Created First Successfully
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[@id='app']/div/div/div/div[3]/div/input")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/div/div[3]/div/input")).sendKeys("List 2"); // Add Second List
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/div/div[3]/div/input")).sendKeys(Keys.ENTER); // Created Second Successfully
				Thread.sleep(2000);
				
				driver.findElement(By.cssSelector(".inline-block:nth-child(2) > .relative > .flex path")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/div/div[2]/div[2]/div/div/div/div[3]")).click();// Delete Successfully
				Thread.sleep(2000);
				driver.findElement(By.cssSelector(".flex-grow-0")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/div/div[2]/div/div/div/div/div[3]")).click();//Delete Successfully
				Thread.sleep(2000);
				
				driver.close();
				
			}
			catch(Exception e) {
				e.printStackTrace();
				driver.quit();
			}

		}

	}
