package com.example.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

// page_url = about:blank
public class Instagram {

//    public Instagram(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }

    private WebDriver driver;

    @BeforeAll
    public static void setupDriver (){WebDriverManager.chromedriver().setup();}

    @BeforeEach
    void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();


    }

//    @AfterEach
//    void teardown(){
//        driver.quit();
//    }

    @Test

    void openInstagram(){
        driver.get("https://www.instagram.com/");

        Duration duration = Duration.ofSeconds(300);
        WebDriverWait  waiting = new WebDriverWait(driver,duration);

//        WebElement username = driver.findElement(By.name("username")); this is incorrect
//        WebElement password = driver.findElement(By.name("password")); this is incorrect when it correlates to unable to locate element
        WebElement userName = waiting.until(ExpectedConditions.elementToBeClickable(By.name ("username")));
        WebElement pass = waiting.until(ExpectedConditions.elementToBeClickable(By.name("password")));
        userName.clear();
        pass.clear();
        userName.sendKeys("cosmoapp123");
        pass.sendKeys("Timmyturner" + Keys.ENTER);
        String path = "//button[contains(text(),'Not Now')]";
        WebElement notNowButton = waiting.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
        notNowButton.click();
        WebElement notNowButton2 = waiting.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
        notNowButton2.click();
        WebElement profileButton = driver.findElement(By.linkText("Profile"));
        profileButton.click();
        WebElement followingButton = waiting.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("22 following")));
        followingButton.click();
        // Scrolls down following list div box
        JavascriptExecutor js  = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3050)");




    }
}