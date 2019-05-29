package org.sample.testexcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikandan\\eclipse-workspace\\Day1greenstech\\Day3xpathtasks\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactin.com/HotelApp//");
	WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	username.sendKeys("greens");
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("greens@123");
	WebElement btnlogin = driver.findElement(By.xpath("//input[@id='login']"));
	btnlogin.click();
    driver.quit();
	}
}
