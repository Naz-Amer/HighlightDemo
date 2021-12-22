package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageobj {

    WebDriver driver;

    By username = By.xpath("//input[@id='UserName']");
    By loginpass = By.xpath("//input[@id='Password']");
    By loginbutton = By.xpath("//input[@value='Log in']");


    public pageobj(WebDriver driver) {
        this.driver = driver;

    }

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement select;

    public void login(String Username,String Password){
        driver.findElement(username).sendKeys(Username);
        driver.findElement(loginpass).sendKeys(Password);
    }

    public void loginButton(){
        driver.findElement(loginbutton).click();
    }
}
