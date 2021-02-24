package org.example.pageobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchaseProductsPageObjects {

    private final WebDriver driver;

    public PurchaseProductsPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getShippingTextLabel() {
        return driver.findElement(By.cssSelector("#carrier_area h1"));
    }

    public WebElement getTermsOfServiceCheckBox() {
        return driver.findElement(By.id("cgv"));
    }

    public WebElement getProceedToCheckoutButton() {
        return driver.findElement(By.name("processCarrier"));
    }

    public WebElement getNamePgeTextLabel() {
        return driver.findElement(By.cssSelector("#center_column h1"));
    }

    public WebElement getPayByBankWireButton() {
        return driver.findElement(By.className("bankwire"));
    }

    public WebElement getBankWirePaymentTextLabel() {
        return driver.findElement(By.className("page-subheading"));
    }

    public WebElement getIConfirmMyOrderButton() {
        return driver.findElement(By.cssSelector("#cart_navigation button"));
    }

    public WebElement getSignOutButton(){
        return driver.findElement(By.className("logout"));
    }
}
