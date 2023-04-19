package cc2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC2 {
       public static void main(String arg[])
       {
    	   WebDriverManager.chromedriver().setup();
    	   WebDriver driver;
    	   ChromeOptions co=new ChromeOptions();
    	   co.addArguments("--remote-allow-origins=*");
    	   driver=new ChromeDriver();
    	   driver.get("https://www.yatra.com/");
    	   WebElement round = driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[1]/ul[1]/li[2]/a"));
    	   round.click();
    	   WebElement search = driver.findElement(By.id("BE_flight_flsearch_btn"));
    	   search.click();
    	   
    	   
    	   
    	   
       }
}
