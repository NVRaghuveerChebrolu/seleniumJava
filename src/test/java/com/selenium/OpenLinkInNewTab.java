package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenLinkInNewTab {
	 public static void main(String[] args) {
	      //System.setProperty("webdriver.chrome.driver", "C:\Users\ghs6kor\Desktop\Java\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	      driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
	      // wait of 4 seconds
	      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	      // Keys.Chord string
	      String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
	      // open the link in new tab, Keys.Chord string passed to sendKeys
	      driver.findElement(By.xpath("//*[text()='Privacy Policy']")).sendKeys(clicklnk);
	   }
}