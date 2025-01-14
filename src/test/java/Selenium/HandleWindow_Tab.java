package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class HandleWindow_Tab {
    @Test
    public void handleWindow() {
        ChromeOptions option = new ChromeOptions();
        option.setBrowserVersion("126");
        WebDriver driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/browser-windows");
        String current = driver.getWindowHandle();
        WebElement element = driver.findElement(By.xpath("//button[@id='tabButton']"));
        // Set<String> handles=driver.getWindowHandles();
        //aproach 1
    /*
     for(String x:handles){
            if(!x.equals(current)){
                driver.switchTo().window(x);
            }        }
        System.out.println(driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());

     */
        /*
        aproach 2

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> i = handles.iterator();
        String firstHandle=i.next();
        String secondHandle=i.next();
        driver.switchTo().window(secondHandle);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());
     */

/*
        //aproach 3
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> i = handles.iterator();
        while(i.hasNext()){
            if(i.next().equals(current)){
                driver.switchTo().window(i.next());
            }
        }
        System.out.println(driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());
        }

 */
        //approach 4
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        Set<String> handles=driver.getWindowHandles();
        ArrayList<String>list=new ArrayList<>(handles);
        for(int i=0;i<list.size();i++){
            if(!list.get(i).equals(current)){
                driver.switchTo().window(list.get(i));
            }
        }
        System.out.println(driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());
    }
}
