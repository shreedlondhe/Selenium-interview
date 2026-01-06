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
// ChromeOptions options = new ChromeOptions();
// options.addArguments(
//     "--start-maximized",
//     "--disable-notifications",
//     "--incognito",
//     "--headless=new",
//     "--disable-gpu",
//     "--no-sandbox"
// );
        
    ChromeOptions option=new ChromeOptions();
    option.setBrowserVersion("126");
    WebDriver driver=new ChromeDriver(option);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    driver.get("https://demoqa.com/browser-windows");
   WebElement ele=driver.findElement(By.xpath("//*[@id=\"tabButton\"]"));

    Actions action=new Actions(driver);
    // actions.clickAndHold(ele).perform();
    // actions.release().perform();

    action.click(ele).perform();
    action.moveToElement(ele).perform();
    action.moveToElement(ele).click(ele).perform();
    action.dragAndDrop(ele,ele).build().perform();
    action.contextClick(ele).perform();
    action.sendKeys(ele, Keys.ENTER);
    actions.sendKeys(ele, "Text").perform();
        
    //actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
    //actions.keyUp(Keys.CONTROL).perform();
}
}
