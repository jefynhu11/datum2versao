package org.example.tasks;

import org.example.framework.supports.Fakers;
import org.example.framework.supports.Wait;
import org.example.pageobjetcs.AuthenticationPageObjects;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AuthenticationTask {

    private final WebDriver driver;
    private final Wait wait;
    private final AuthenticationPageObjects authenticationPageObjects;
    private final Fakers fakers;

    public AuthenticationTask(WebDriver driver) {
        this.driver = driver;
        wait = new Wait(driver);
        fakers = new Fakers();
        authenticationPageObjects = new AuthenticationPageObjects(driver);
    }

    public void authenticationAlreadyAccount(String email, String password) {
        validarAuthentication();
        authenticationPageObjects.getEmailTextField().sendKeys(email);
        authenticationPageObjects.getPasswordTextField().sendKeys(password);
        authenticationPageObjects.getSignInButton().click();
        authenticationPageObjects.getProceedToCheckoutButton().click();
    }

    public void authenticationCreateAccount() {
        validarAuthentication();
        criarEmailConta();
        cadastrarDado();

    }

    private void cadastrarDado() {
        validarCreateAccount();
        authenticationPageObjects.getFirstNameTextField().sendKeys(fakers.getFirstName());
        authenticationPageObjects.getLastNameTextField().sendKeys(fakers.getLastName());
        authenticationPageObjects.getPasswordTextField().sendKeys(fakers.getPassword());
        authenticationPageObjects.getDaySelect().selectByIndex(3);
        authenticationPageObjects.getMonthSelect().selectByIndex(11);
        authenticationPageObjects.getYeahSelect().selectByIndex(1992);
        authenticationPageObjects.getAddressTextField().sendKeys(fakers.getAddress1());
        authenticationPageObjects.getCityTextField().sendKeys(fakers.getCity());
        authenticationPageObjects.getStateSelect().selectByIndex(2);
        authenticationPageObjects.getCodeTextField().sendKeys(fakers.getPostalCode());
        authenticationPageObjects.getCountrySelect().selectByIndex(21);
        authenticationPageObjects.getMobilePhoneTextField().sendKeys(fakers.getMobilePhone());
        authenticationPageObjects.getAssignAnAddressTextField().sendKeys(fakers.getEmailReference());

    }

    private void validarCreateAccount() {
//        wait.waitVisibilityElement();
//        wait.waitLoadElement(authenticationPageObjects.getCreateAnAccountTextLabel());
        Assertions.assertEquals("AUTHENTICATION", authenticationPageObjects.getCreateAnAccountTextLabel().getText());
    }

    private void criarEmailConta() {
        authenticationPageObjects.getCreateEmailTextField().sendKeys(fakers.getEmail());
        authenticationPageObjects.getCreateAnAccountButton().click();
    }

    private void validarAuthentication() {
        Assertions.assertEquals("AUTHENTICATION", authenticationPageObjects.getAuthenticationTextLabel().getText());
    }

}
