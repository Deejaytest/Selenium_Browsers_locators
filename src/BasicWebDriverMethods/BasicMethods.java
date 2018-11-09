package BasicWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c-deepak.jindal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle()); //Get Page tttle
		System.out.println(driver.getCurrentUrl()); //Get current page URL
		System.out.println(driver.getPageSource()); // Get the page source using selenium
		driver.get("https://newspointapp.com");
		driver.navigate().back(); // To click browser back button in browser. Or to go back to previous screen
		driver.navigate().forward(); // To click browser forward button in browser. Or to go forward to next screen
		driver.close(); //To closes the current instance of the browsers
		driver.quit(); // closes all the browser instances opened by selenium script. 
	}

}
