package Silenium_Homework2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriver1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(1000);

        driver.findElement(By.className("ico-login")).click(); //Click on Login link
        driver.findElement(By.id("Email")).sendKeys("kena_2606@gmail.com");//Entering Email ID
        driver.findElement(By.id("Password")).sendKeys("kena123");//Entering Password
       // driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();//Click on Login Button


       // driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();//Click on Login Button //Custom xpath or own xpath
        driver.findElement(By.cssSelector("button[class='button-1 login-button']")).click();//Click on Login Button //Custom cssSelector

    }
}
