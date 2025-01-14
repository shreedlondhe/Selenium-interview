package Selenium;

import io.qameta.allure.Allure;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.time.Duration;

public class AllureAttachment {
    @Test
    public void addAPIResponse(){
        ValidatableResponse response = RestAssured
                .given()
                .when()
                .get("https://api.github.com/user")
                .then()
                .log().all();
        String responseAsString = response.extract().asPrettyString();
        Allure.addAttachment("API Response", new ByteArrayInputStream(responseAsString.getBytes()));
    }
    @Test
    public void addScreenShot(){
        ChromeOptions options = new ChromeOptions();
        options.setBrowserVersion("126");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://byjus.com/multiplication-tables-calculator/");
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("scshot", new ByteArrayInputStream(screenshot));

        Allure.link("Documentation", "https://app.mintpro.in/grow/");
        Allure.label("feature", "fearure name");
        Allure.description("rescription about test");

    }
}
