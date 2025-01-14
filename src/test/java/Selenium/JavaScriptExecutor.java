package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavaScriptExecutor {
    @Test
    public void JavascriptsMethods(){
        ChromeOptions option=new ChromeOptions();
        option.setBrowserVersion("126");
        WebDriver driver=new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/browser-windows");
        WebElement ele=driver.findElement(By.xpath("//*[@id=\"tabButton\"]"));
        //click
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ele);
        //sendKeys
        js.executeScript("arguments[0].value='Admin';", ele);
        //scroll down
        js.executeScript("window.scrollBy(0,500)");

    }
}
