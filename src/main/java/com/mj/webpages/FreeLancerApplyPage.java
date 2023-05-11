package com.mj.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.time.Duration;

import static com.mj.base.TestBase.customActions;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class FreeLancerApplyPage {

    @FindBy(xpath = "//span[text()='Apply as a Freelancer']")
    private WebElement applyAsFreeLancerButton;

    public ExpectedCondition<WebElement> applyAsFreeLancerIsClickable() {
        return elementToBeClickable(applyAsFreeLancerButton);
    }

    public boolean isApplyAsFreeLancerButtonDisplayed(){
        customActions.waitUntil(Duration.ofMillis(10000),applyAsFreeLancerIsClickable());
        return applyAsFreeLancerButton.isDisplayed();
    }
}
