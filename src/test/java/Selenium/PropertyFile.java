package Selenium;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
    @Test
    public void proprtyFile() throws IOException {
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config.properties");
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println(prop.getProperty("name"));
    }
}
