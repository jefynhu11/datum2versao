package org.example.tasks;

import org.example.framework.supports.Fakers;
import org.example.framework.supports.Wait;
import org.example.framework.tools.JsExecutor;
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
        JsExecutor.highLightElementWithSend(driver, authenticationPageObjects.getFirstNameTextField(), fakers.getFirstName());
        JsExecutor.highLightElementWithSend(driver, authenticationPageObjects.getLastNameTextField(), fakers.getLastName());
        JsExecutor.highLightElementWithSend(driver, authenticationPageObjects.getPasswordTextField(), fakers.getPassword());
        JsExecutor.highLightSelect(driver, authenticationPageObjects.getDaySelect());
        authenticationPageObjects.getDaySelect().selectByValue("3");
        JsExecutor.highLightSelect(driver, authenticationPageObjects.getMonthSelect());
        authenticationPageObjects.getMonthSelect().selectByValue("11");
        JsExecutor.highLightSelect(driver, authenticationPageObjects.getYeahSelect());
        authenticationPageObjects.getYeahSelect().selectByValue("1992");
        JsExecutor.highLightElementWithSend(driver, authenticationPageObjects.getAddressTextField(), fakers.getAddress1());
        JsExecutor.highLightElementWithSend(driver, authenticationPageObjects.getCityTextField(), fakers.getCity());
        JsExecutor.highLightSelect(driver, authenticationPageObjects.getStateSelect());
        authenticationPageObjects.getStateSelect().selectByVisibleText("Alaska");
        JsExecutor.highLightElementWithSend(driver, authenticationPageObjects.getCodeTextField(), fakers.getPostalCode());
        JsExecutor.highLightSelect(driver, authenticationPageObjects.getCountrySelect());
        authenticationPageObjects.getCountrySelect().selectByValue("21");
        JsExecutor.highLightElementWithSend(driver, authenticationPageObjects.getMobilePhoneTextField(), fakers.getPhone());
        authenticationPageObjects.getAssignAnAddressTextField().clear();
        JsExecutor.highLightElementWithSend(driver, authenticationPageObjects.getAssignAnAddressTextField(), fakers.getEmailReference());
        JsExecutor.highLightElementWithClick(driver, authenticationPageObjects.getRegisterButton());
        JsExecutor.highLightElementWithClick(driver, authenticationPageObjects.getProceedToCheckoutButton());
    }

    private void validarCreateAccount() {
        wait.waitLoadElement(authenticationPageObjects.getCreateAnAccountTextLabel());
        Assertions.assertEquals("AUTHENTICATION", authenticationPageObjects.getCreateAnAccountTextLabel().getText());
    }

    private void criarEmailConta() {
        JsExecutor.highLightElementWithSend(driver, authenticationPageObjects.getCreateEmailTextField(), fakers.getEmail());
        JsExecutor.highLightElementWithClick(driver, authenticationPageObjects.getCreateAnAccountButton());
    }

    private void validarAuthentication() {
        Assertions.assertEquals("AUTHENTICATION", authenticationPageObjects.getAuthenticationTextLabel().getText());
    }

}
