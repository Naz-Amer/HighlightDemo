package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class login {

    WebDriver driver;

    @BeforeSuite

    public void setDriver() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("http://eaapp.somee.com/Account/Login");
    }


    @Test
    void testLogin(){
        WebElement username = driver.findElement(By.id("UserName"));
        helper.highLightElement(driver,username);
        username.sendKeys("Test");
    }


}