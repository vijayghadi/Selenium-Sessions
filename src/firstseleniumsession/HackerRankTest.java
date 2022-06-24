package firstseleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HackerRankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay\\libs\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url ="file:///C:/Users/Vijay/OneDrive/Desktop/new.html";
		
		submit(driver, url);
	}
	
	public static void submit(WebDriver driver, String url) {
		driver.get(url);
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("July");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("9");
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//fieldset[1]/input[1]")).click();
		driver.findElement(By.xpath("//fieldset[2]/input[1]")).click();
		driver.findElement(By.xpath("//fieldset[3]/input[1]")).click();
		
		driver.close();
	}
}
