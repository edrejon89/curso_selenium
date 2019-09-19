import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Uploading Files
// Web reference: https://www.guru99.com/upload-download-file-selenium-webdriver.html
public class PG9 {
	
	
	public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "/Users/kwan/Documents/personal/OneDrive/capacitacion/Curso_Selenium/drivers/chromedriver");
	String baseUrl = "http://demo.guru99.com/test/upload/";
	WebDriver driver  = new ChromeDriver();
	
	
	driver.get(baseUrl);
	WebElement uploadElement =  driver.findElement(By.id("uploadfile_0"));
	
	
	//enter the file path onto the file-selection input field
	uploadElement.sendKeys("/Users/kwan/Documents/personal/OneDrive/capacitacion/Curso_Selenium/randomFiles/newhtml.html");
	
	// Check the "I accept the terms of service" check box
	driver.findElement(By.id("terms")).click();
	
	// click the "UploadFile button
	driver.findElement(By.name("send")).click();
	
	driver.close();
	driver.quit();
//	System.out.println("Completo exitosamente!");
	/*
	 * Remember following two things when uploading files in WebDriver

There is no need to simulate the clicking of the "Browse" button. WebDriver automatically enters the file path onto the file-selection text box of the <input type="file"> element
When setting the file path in your Java IDE, use the proper escape character for the back-slash.
	 */

	
	
	}
}
