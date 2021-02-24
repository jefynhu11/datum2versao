package org.example.pageobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationPageObjects {

    private final WebDriver driver;

    public AuthenticationPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAuthenticationTextLabel() {
        return driver.findElement(By.cssSelector("#center_column h1"));
    }

    public WebElement getEmailTextField() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getPasswordTextField() {
        return driver.findElement(By.id("passwd"));
    }

    public WebElement getSignInButton() {
        return driver.findElement(By.id("SubmitLogin"));
    }

    public WebElement getProceedToCheckoutButton() {
        return driver.findElement(By.name("processAddress"));
    }

}
