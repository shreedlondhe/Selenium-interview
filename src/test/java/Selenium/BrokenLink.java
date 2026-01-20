package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLink {

    @Test
    public void findBroken() throws IOException {

        String link="https://toolsqa.com/selenium-webdriver/actions-class-in-selenium/";
        URL url=new URL(link);
        HttpURLConnection b = (HttpURLConnection) url.openConnection();
        System.out.println(b.getResponseCode());
        System.out.println(b.getResponseMessage());

    }

    @Test
    void findBrokenLinks() throws IOException {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--incongito");
        //  options.addArguments(("--headless=new"));
        options.setAcceptInsecureCerts(true);
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> list=driver.findElements(By.xpath("//a"));

        for(WebElement x:list){
            String foundUrl=x.getAttribute("href");
            URL url= new URL(foundUrl);
            HttpURLConnection con=(HttpURLConnection) url.openConnection();
           
            if(con.getResponseCode()==404){
                System.out.println(foundUrl= " : Link is Broken");
            }
            else{
                System.out.println("For URL : "+foundUrl+" "+con.getResponseCode()+ ": Messasge is :"+con.getResponseMessage());
            }

        }
    }
}
