package LocatorsPackagae;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildRelationship {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c-deepak.jindal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com");
		
		
		//Identify using linkText
		driver.findElement(By.linkText("Login")).click();
		
		//Identify using absolute xpath- using parent/child relationship
		driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("first input");
		
		//Identify using absolute xpath. Traverse to next siblings from current sibling
	//	driver.findElement(By.xpath("//div[@id='content']/div[3]/div/a[1]/following-sibling::a[1]")).click();
		
		//Identify using onlt visible text
		driver.findElement(By.xpath("//*[text()='Remember me']")).click(); //Identify the element using text only. 
		
		
		
}
	

}
