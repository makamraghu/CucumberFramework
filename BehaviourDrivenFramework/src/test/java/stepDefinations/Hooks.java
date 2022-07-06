package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public WebDriver driver;
	
	@Before("@Smoke")
	public void CallBrowser() {
		WebDriverManager.chromedriver().create();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	
	@After("@Smoke")
	public void tearDown() {
		driver.quit();
	}
	

}
