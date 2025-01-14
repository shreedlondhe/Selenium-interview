package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HandleFrame {

    @Test
    public void  handleFrame(){
        ChromeOptions option=new ChromeOptions();
        option.setBrowserVersion("126");
        WebDriver driver=new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/frames");
        WebElement frameElement =driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frameElement);
      //  driver.switchTo().frame(index);
      //  driver.switchTo().frame(name or ID);
        WebElement eleInsideFrame = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        System.out.println(eleInsideFrame.getText());
        driver.switchTo().defaultContent();// switch to main content

    }}
