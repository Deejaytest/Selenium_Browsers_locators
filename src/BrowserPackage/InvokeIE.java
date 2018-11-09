package BrowserPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeIE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","C:\\selenium-java-3.13.0\\Drivers\\IE\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());

	}

}
