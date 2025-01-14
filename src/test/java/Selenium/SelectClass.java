package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SelectClass {
    @Test
    public void selectClass() throws InterruptedException {
        ChromeOptions option=new ChromeOptions();
        option.setBrowserVersion("126");
        WebDriver driver=new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://www.wikipedia.org/");
        WebElement eleement=driver.findElement(By.xpath("//select[@id='searchLanguage']"));
        Select select=new Select(eleement);

        System.out.println(select.getFirstSelectedOption().getText());// get selected element

        List<WebElement> list=select.getAllSelectedOptions();//get all selected element amd return List of webelement

        List<WebElement> li=select.getOptions();//return list of webelement of options availble
        for(WebElement x:li){
            String text=x.getText();
            System.out.println(text);
        }

        System.out.println(select.isMultiple());//dropdown is multi selected or not return boolean
        select.selectByValue("af");// return void
        select.selectByVisibleText("Suomi");// return void
        //  select.selectByIndex(index);
        //select.deselectAll();
        //select.deselectByVisibleText("Soumi");
        //select.deselectByValue("value");
        // select.deselectByIndex(index);
    }
}
