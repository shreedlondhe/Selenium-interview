package Selenium;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BrokenLink {

    @Test
    public void findBroken() throws IOException {

        String link="https://toolsqa.com/selenium-webdriver/actions-class-in-selenium/";
        URL url=new URL(link);
        HttpURLConnection b = (HttpURLConnection) url.openConnection();
        System.out.println(b.getResponseCode());
        System.out.println(b.getResponseMessage());

    }
}
