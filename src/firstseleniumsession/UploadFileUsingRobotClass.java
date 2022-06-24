package firstseleniumsession;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFileUsingRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		  WebDriver driver;
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay\\libs\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		  Thread.sleep(2000);
		  
		  Actions act= new Actions(driver);
		  WebElement chooseFile=driver.findElement(By.id("fileupload1"));
		  act.moveToElement(chooseFile).click().perform();
		  Thread.sleep(2000);
		  
		  uploadFile("C:\\Users\\Hitendra\\Desktop\\TestFile.txt");
	 }
 
	public static void uploadFile(String filePath) throws AWTException {
		  setClipBoard(filePath);
		  Robot rb= new Robot();
		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_V);
		  rb.keyRelease(KeyEvent.VK_CONTROL);
		  rb.keyRelease(KeyEvent.VK_V);
		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyRelease(KeyEvent.VK_ENTER);
	}
 
	public static void setClipBoard(String file) {
		 StringSelection obj= new StringSelection(file);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}

}
