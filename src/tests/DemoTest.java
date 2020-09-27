package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class DemoTest {
	private WebDriver driver; 
@BeforeClass
public void setup() { 
	System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

	this.driver = new ChromeDriver();
	
	
}
}
