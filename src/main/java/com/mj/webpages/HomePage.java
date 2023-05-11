package com.mj.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.time.Duration;

import static com.mj.base.TestBase.customActions;
import static com.mj.base.TestBase.homePage;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class HomePage {
    private WebDriver driver;

    //Locators
    @FindBy(xpath = "//a[text()='Apply as a Freelancer']")
    private WebElement applyAsFreeLancerLink;

    public boolean isApplyAsFreLancePresent() {
        customActions.waitUntil(Duration.ofMillis(10000), homePage.applyAsFreeLanceIsClickable());
        return applyAsFreeLancerLink.isDisplayed();
    }

    public void clickOnApplyAsFreeLance() {
        if (isApplyAsFreLancePresent()) {
            customActions.clicksOn(applyAsFreeLancerLink);
        }
    }

    public ExpectedCondition<WebElement> applyAsFreeLanceIsClickable() {
        return elementToBeClickable(applyAsFreeLancerLink);
    }

}
