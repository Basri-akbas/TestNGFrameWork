package com.testNG.test;

import com.testNG.pages.GooglePage;
import com.testNG.utilities.ConfigurationReader;
import com.testNG.utilities.Driver;
import com.testNG.utilities.TestBaseFinal;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleGmailTest extends TestBaseFinal {

        @Test
         public void GmailTest() throws InterruptedException {
                extentTest=extentReports.createTest("Gmail Test","Gmail com a google üzerinden");

                extentTest.info("Google gidiyoruz");
                Driver.getDriver().get(ConfigurationReader.getProperty("google_url"));

                extentTest.info("GooglePage'den nesne üretiyoruz.");
                GooglePage googlePage=new GooglePage();

                extentTest.info("gmailLinki webelementine tıklıyoruz.");
                googlePage.gmaillinki.click();
                extentTest.info("3 saniye bekliyoruz.");
                Thread.sleep(3000);
                extentTest.info("Assert işlemi yap.");
                Assert.assertTrue(Driver.getDriver().getTitle().contains("Gmail"));
                extentTest.pass("Testimiz PASSED !");



        }





}
