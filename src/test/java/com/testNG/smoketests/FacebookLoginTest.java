package com.testNG.smoketests;

import com.testNG.pages.FacebookLoginPage;
import com.testNG.utilities.ConfigurationReader;
import com.testNG.utilities.TestBaseFinal;
import org.testng.annotations.Test;

public class FacebookLoginTest extends TestBaseFinal {

    @Test
    public void girisTesti(){
        driver.get("http://facebook.com");
        FacebookLoginPage loginPage = new FacebookLoginPage(driver);
        loginPage.emailKutusu.sendKeys(ConfigurationReader.getProperty("fb_email"));
        loginPage.sifreKutusu.sendKeys(ConfigurationReader.getProperty("fb_pass"));
    }
}
