package LocatorsPackagae;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsWithRegularExpressions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c-deepak.jindal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("deepak");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("testing");
		

	}

}
