package Selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

public class ScreenShot {
@Test
    public void screenShot(){
    ChromeOptions option = new ChromeOptions();
    option.setBrowserVersion("126");
    WebDriver driver = new ChromeDriver(option);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    driver.get("https://demoqa.com/browser-windows");
    TakesScreenshot ts=(TakesScreenshot)driver;
    File f=ts.getScreenshotAs(OutputType.FILE);


}
}
