package org.example.tasks;

import org.example.framework.tools.JsExecutor;
import org.example.pageobjetcs.PurchaseProductsPageObjects;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class PurchaseProductsTask {

    private final WebDriver driver;
    private final PurchaseProductsPageObjects purchaseProductsPageObjects;

    public PurchaseProductsTask(WebDriver driver){
        this.driver = driver;
        purchaseProductsPageObjects = new PurchaseProductsPageObjects(driver);
    }

    public void purchaseProducts() {
        validarShipping();
        JsExecutor.highLightElementWithClick(driver, purchaseProductsPageObjects.getTermsOfServiceCheckBox());
        JsExecutor.highLightElementWithClick(driver,purchaseProductsPageObjects.getProceedToCheckoutButton());
        validarPaymentMethod();
        JsExecutor.highLightElementWithClick(driver,purchaseProductsPageObjects.getPayByBankWireButton());
        validarBankWirePayment();
        JsExecutor.highLightElementWithClick(driver,purchaseProductsPageObjects.getIConfirmMyOrderButton());
        validarConfirmation();
        JsExecutor.highLightElementWithClick(driver,purchaseProductsPageObjects.getSignOutButton());
    }

    private void validarConfirmation() {
        Assertions.assertEquals("ORDER CONFIRMATION", purchaseProductsPageObjects.getNamePgeTextLabel().getText());
    }

    private void validarBankWirePayment() {
        Assertions.assertEquals("BANK-WIRE PAYMENT.", purchaseProductsPageObjects.getBankWirePaymentTextLabel().getText());
    }

    private void validarPaymentMethod() {
        Assertions.assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD", purchaseProductsPageObjects.getNamePgeTextLabel().getText());
    }

    private void validarShipping() {
        Assertions.assertEquals("SHIPPING", purchaseProductsPageObjects.getShippingTextLabel().getText());
    }
}
