package com.parabank.parasoft.base;

import com.parabank.parasoft.util.GeneralUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class ParaBankBaseTest {
            protected static WebDriver driver;
            private final Properties properties;
            public ParaBankBaseTest(){
                try {
                    String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\properties";
                    properties = new Properties();
                    FileInputStream inputStream = null;


                    inputStream = new FileInputStream(filepath);
                    properties.load(inputStream);
                } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                }
                catch (IOException e) {
                        throw new RuntimeException(e);
                    }
            }
            public void browserSetUP(){
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                driver.manage().window().maximize();
                driver.get(properties.getProperty("paraBank.baseUrl"));
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));

            }
            public String getUserName(){
                return  properties.getProperty("paraBank.username");
            }
            public String gePassword(){
                 return  properties.getProperty("paraBank.password");
    }

}
