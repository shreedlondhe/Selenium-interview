package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionClass {

@Test
    public void actionClass() throws InterruptedException {
    ChromeOptions option=new ChromeOptions();
    option.setBrowserVersion("126");
    WebDriver driver=new ChromeDriver(option);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    driver.get("https://demoqa.com/browser-windows");
   WebElement ele=driver.findElement(By.xpath("//*[@id=\"tabButton\"]"));

    Actions action=new Actions(driver);

    action.click(ele).perform();
    action.moveToElement(ele).perform();
    action.moveToElement(ele).click(ele).perform();
    action.dragAndDrop(ele,ele).build().perform();
    action.contextClick(ele).perform();
    action.sendKeys(ele, Keys.ENTER);
}
}
