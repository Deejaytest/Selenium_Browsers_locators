package LocatorsPackagae;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector_basic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c-deepak.jindal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("#username")).sendKeys("deepak");
		driver.findElement(By.cssSelector("#password")).sendKeys("tester");
		driver.findElement(By.xpath("//*[@id='forgot_password_link']")).click();
		driver.close();

	}

}
