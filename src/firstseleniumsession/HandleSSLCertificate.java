package firstseleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HandleSSLCertificate {
	public static WebDriver driver;
	public static String browserName = "FF";
	
	public static void main(String[] args) {
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\libs\\chromedriver_win32\\chromedriver.exe");	
			
			ChromeOptions handlingSSL = new ChromeOptions();
			handlingSSL.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(handlingSSL);
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay\\libs\\geckodriver-v0.31.0-win64\\geckodriver.exe");	
			
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setAcceptInsecureCerts(true);
			driver = new FirefoxDriver(firefoxOptions);
		}
		
		//Launching the URL
		driver.get("https://expired.badssl.com/");
		System.out.println("The page title is : " +driver.getTitle());
		driver.quit();
	}
}
