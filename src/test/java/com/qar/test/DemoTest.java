package com.qar.test;

import com.qar.config.ConfigFactory;
import com.qar.config.FrameworkConfig;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void testLogin() {
        System.out.println(ConfigFactory.getConfig().browser());
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.co.in");
//        driver.quit();
    }
}
