package firstseleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----This is the beginning of our test !!!-----");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay\\libs\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
     	driver.manage().window().maximize();
     	driver.get("https://facebook.com");
	}
	
	
  	
  	/*@BeforeClass
  	public static void setUp(){
         	System.out.println("-----This is the beginning of our test !!!-----");
         	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
         	driver = new ChromeDriver();
         	driver.manage().window().maximize();
         	driver.get("https://facebook.com");
  	}*/
  	
  	//@Test
  	public void fillForm(){
         	System.out.println("-----Let us start the sign up process!!!-----");
         	/*
         	 * Handling text boxes to enter and clear values
         	 */
         	WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
         	fName.sendKeys("--Enter you name here--");
         	WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
         	lName.sendKeys("--Enter your last name--");
         	//Clear the textbox
         	lName.clear();
         	lName.sendKeys("XYZ");
         	WebElement eMail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
         	eMail.sendKeys("--Enter mail or contact number--");
         	WebElement pwd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
         	pwd.sendKeys("--Enter a valid password here--");
         	
         	/*
         	 * Handling dropdown to select date of birth
         	 */
         	Select date = new Select(driver.findElement(By.xpath("(id('day'))")));
         	date.selectByVisibleText("15");
         	Select month = new Select(driver.findElement(By.xpath("(id('month'))")));
         	month.selectByVisibleText("Jan");
         	Select year = new Select(driver.findElement(By.xpath("(id('year'))")));
         	year.selectByVisibleText("1990");
         	
         	/*
         	 * Handling Radio buttons to select gender
         	 */
         	driver.findElement(By.className("_58mt")).click();
         	driver.findElement(By.id("id")).click();
  	  	
         	/*
         	 * Handling the Sign Up button to perform click action
         	 */
     	
         	WebElement sgnUp = driver.findElement(By.xpath("//button[@id='u_0_13']"));
         	sgnUp.click();
	}
  	
  	//@AfterClass
	public static void tearDown(){
     	System.out.println("-----We're now closing the session...-----");
     	driver.quit();
	}
  	
}
