package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Waits {
    @Test
    public void actionClass() throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        option.setBrowserVersion("126");
        WebDriver driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/browser-windows");
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"tabButton\"]"));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeSelected(ele));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        wait.until(ExpectedConditions.alertIsPresent());
        wait.until(ExpectedConditions.invisibilityOf(ele));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
        wait.until(ExpectedConditions.titleIs(""));
        wait.until(ExpectedConditions.visibilityOf(ele));

    }
}