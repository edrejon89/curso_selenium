import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kwan/Documents/personal/OneDrive/capacitacion/Curso_Selenium/drivers/chromedriver");
		String baseUrl = "http://demo.guru99.com/test/yahoo.html";
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		WebElement downloadButton = driver.findElement(By.id("messenger-download"));
		String sourceLocation = downloadButton.getAttribute("href");
		//Comando en windows.
		//        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;
//		Comando en mac.
		//Cualquier cosa puesta desues de -P sera el destino de la descarga.
		String wget_command = "/usr/local/bin/wget -P /Users/kwan/Documents/personal/OneDrive/capacitacion/Curso_Selenium/wget " + sourceLocation;

		try {
			//Esta linea llama a wget y provee el comando especificado antes del try
			Process exec = Runtime.getRuntime().exec(wget_command);
			//waitFor() es usado para esperar que termine la descarga de wget
			int exitVal = exec.waitFor();
			System.out.println("Exit value: " + exitVal);
		} catch (InterruptedException | IOException ex) {
			System.out.println(ex.toString());
		}
		driver.close();

	}

}
