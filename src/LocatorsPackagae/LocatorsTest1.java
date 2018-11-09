package LocatorsPackagae;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c-deepak.jindal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("username")).sendKeys("TestUsername");
		driver.findElement(By.name("pw")).sendKeys("TestUsername");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		String ErrorMessage = driver.findElement(By.xpath("//*[@id='error']")).getText();
		System.out.println(ErrorMessage);


	}

}
