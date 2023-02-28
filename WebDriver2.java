package Silenium_Homework2;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.control.TableRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(2000);

        driver.findElement(By.className("ico-login")).click(); // click on login link
        driver.findElement(By.id("Email")).sendKeys("kena_2606@ygmail.com"); // Enter Email
        driver.findElement(By.id("Password")).sendKeys("123456"); // Enter Password

        driver.findElement(By.xpath("//Button[@Class='button-1 login-button']")).click();// Create Own Xpath

    }
}
