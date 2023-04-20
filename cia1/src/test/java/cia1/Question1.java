
package cia1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {
public static void main(String[] args)
{
WebDriverManager.chromedriver().setup();
WebDriver driver;
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
driver = new ChromeDriver(co);

driver.navigate().to("https://www.amazon.in/American-Tourister-AMT-SCH-02/dp/B07CJCGM1M/ref=lp_2454169031_1_3?th=1");
WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
addtocart.click();
WebElement check = driver.findElement(By.xpath("//*[@class=\"a-button-input\"]"));
check.click();
driver.navigate().to("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
WebElement del = driver.findElement(By.xpath("//*[@class=\"a-color-link\"]"));
del.click();

}
}