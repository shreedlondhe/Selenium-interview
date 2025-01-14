package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleAlert {
    @Test
    public void  handleAlert() {
        ChromeOptions option = new ChromeOptions();
        option.setBrowserVersion("126");
        WebDriver driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/alerts");
        WebElement alertEle=driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
        alertEle.click();
        driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();
        // driver.switchTo().alert().getText();
        //driver.switchTo().alert().sendKeys("keys");




    }
}
