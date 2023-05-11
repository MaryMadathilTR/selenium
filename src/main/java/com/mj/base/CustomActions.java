package com.mj.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static com.mj.base.TestBase.getLongTimeoutDuration;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import com.mj.base.TestBase.*;

public class CustomActions {

    private static final long BASIC_OPERATIONS_TIMEOUT_SECONDS = 10;

    public void waitUntil(ExpectedCondition expectedCondition){
        waitUntil(getBasicTimeoutDuration(), expectedCondition);
    }

    public void waitUntil(Duration basicTimeoutDuration, ExpectedCondition expectedCondition) {
        waitUntil(basicTimeoutDuration, Duration.ofMillis(500),expectedCondition);
    }

    private void waitUntil(Duration basicTimeoutDuration, Duration ofMillis, ExpectedCondition expectedCondition) {
    }

    public static Duration getBasicTimeoutDuration() {
        return Duration.ofSeconds(BASIC_OPERATIONS_TIMEOUT_SECONDS);
    }
    public void clicksOn(WebElement locator) {
        waitUntil(getLongTimeoutDuration(), visibilityOf(locator));
        try {
            locator.click();
        } catch (StaleElementReferenceException | ElementClickInterceptedException e) {
//            logger.error("Method: clicksOn; Message: retrying clicking on element because of exception:" + e.getMessage());
            locator.click();
        }
    }



}
