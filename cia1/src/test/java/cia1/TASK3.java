package cia1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;


public class TASK3 {
	
		public static void main(String arg[])
		{
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver;
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
			driver.get("https://www.amazon.in/American-Tourister-AMT-SCH-02/dp/B07CJCGM1M/ref=lp_2454169031_1_3?th=1");
			
		}
}
