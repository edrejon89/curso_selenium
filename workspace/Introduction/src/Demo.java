import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	
	public static void main(String[] args) {
		
		//Selenium code
		//Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "/Users/kwan/Documents/personal/OneDrive/capacitacion/Curso_Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
	}

}
