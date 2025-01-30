package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver ();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.uk/");
			driver.close();
			
		}

	}
