package org.example.pageobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

    public WebElement getCreateEmailTextField() {
        return driver.findElement(By.id("email_create"));
    }

    public WebElement getCreateAnAccountButton() {
        return driver.findElement(By.id("SubmitCreate"));
    }

    public WebElement getCreateAnAccountTextLabel() {
        return driver.findElement(By.cssSelector("#center_column h1"));
    }

    public WebElement getFirstNameTextField() {
        return driver.findElement(By.id("customer_firstname"));
    }

    public WebElement getLastNameTextField() {
        return driver.findElement(By.id("customer_lastname"));
    }

    public Select getDaySelect() {
        return new Select(driver.findElement(By.id("days")));
    }

    public Select getMonthSelect() {
        return new Select(driver.findElement(By.id("months")));
    }

    public Select getYeahSelect() {
        return new Select(driver.findElement(By.id("yeahs")));
    }

    public WebElement getAddressTextField() {
        return driver.findElement(By.id("address1"));
    }

    public WebElement getCityTextField() {
        return driver.findElement(By.id("city"));
    }

    public Select getStateSelect() {
        return new Select(driver.findElement(By.id("id_state")));
    }

    public WebElement getCodeTextField() {
        return driver.findElement(By.id("postcode"));
    }

    public Select getCountrySelect() {
        return new Select(driver.findElement(By.id("id_country")));
    }

    public WebElement getMobilePhoneTextField() {
        return driver.findElement(By.id("phone_mobile"));
    }

    public WebElement getAssignAnAddressTextField() {
        return driver.findElement(By.id("alias"));
    }
}
