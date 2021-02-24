package org.example.tasks;

import org.example.pageobjetcs.AuthenticationPageObjects;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AuthenticationTask {

    private final WebDriver driver;
    private final AuthenticationPageObjects authenticationPageObjects;

    public AuthenticationTask(WebDriver driver) {
        this.driver = driver;
        authenticationPageObjects = new AuthenticationPageObjects(driver);
    }

    public void authenticationAccount(String email, String password) {
        validarAuthentication();
        authenticationPageObjects.getEmailTextField().sendKeys(email);
        authenticationPageObjects.getPasswordTextField().sendKeys(password);
        authenticationPageObjects.getSignInButton().click();
        authenticationPageObjects.getProceedToCheckoutButton().click();
    }

    private void validarAuthentication() {
        Assertions.assertEquals("AUTHENTICATION", authenticationPageObjects.getAuthenticationTextLabel().getText());
    }

}
