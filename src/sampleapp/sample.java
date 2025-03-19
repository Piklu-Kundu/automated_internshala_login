package sampleapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class sample {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


            // Open Internshala
            driver.get("https://internshala.com/");
        driver.findElement(By.className("login-cta")).click();
        driver.findElement(By.id("modal_email")).sendKeys("your_mail");
        driver.findElement(By.id("modal_password")).sendKeys("password_of_internshala _account", Keys.ENTER);




    }
}
