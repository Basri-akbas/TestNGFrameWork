package com.testNG.test;

import com.testNG.pages.AmazonPage;
import com.testNG.utilities.ConfigurationReader;
import com.testNG.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazonyeni {

    @Test
    public void test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));


        AmazonPage page=new AmazonPage();
        Select select=new Select(page.dropDownButonu);
        select.selectByIndex(6);

        page.aramaKutusu.sendKeys("bebek arabasi"+ Keys.ENTER);


    }
}
