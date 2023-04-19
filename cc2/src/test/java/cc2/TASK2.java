package cc2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TASK2 {
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
    	   WebElement senior = driver.findElement(By.xpath("//*[@id=\"seniorcitizen_offer\"]/a"));
    	   senior.click();
    	   WebElement d = driver.findElement(By.xpath("/html/body/div[2]/div/section/div[1]/div/div[1]/section/div/div/div/div[1]/div[1]/div[2]/ul/li[2]/ul/li[3]/section/div/div[2]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[1]/td[5]"));
    	   d.click();
    	 driver.get("https://www.yatra.com/flight-schedule/delhi-to-mumbai-flights.html");
    	   
    	   
       }
}
