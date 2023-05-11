package com.mj.base;

import com.mj.webpages.FreeLancerApplyPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import com.mj.webpages.HomePage;

public class TestBase {
    public static WebDriver driver;
    public static Actions actions;

    //Page Url
    private static  String PAGE_URL="https://www.toptal.com";

    public static void launchToptal(){
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
        driver = new ChromeDriver(options);
        actions = new Actions(driver);
        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        initPageObjects();
        driver.get(PAGE_URL);
    }

    public static HomePage homePage = new HomePage();
    public  static CustomActions customActions = new CustomActions();
    public static FreeLancerApplyPage freeLancerApplyPage = new FreeLancerApplyPage();

   public static void initPageObjects(){
       PageFactory.initElements(driver,homePage);
       PageFactory.initElements(driver,customActions);
       PageFactory.initElements(driver,freeLancerApplyPage);
   }
    public static Duration getLongTimeoutDuration() {
        return Duration.ofSeconds(60);
    }
    public void tearDown(){
       driver.close();
    }

}
