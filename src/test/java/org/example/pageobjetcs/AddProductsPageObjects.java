package org.example.pageobjetcs;

import org.example.framework.supports.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProductsPageObjects {

    private final WebDriver driver;
    private final Wait wait;

    public AddProductsPageObjects(WebDriver driver) {
        this.driver = driver;
        wait = new Wait(driver);
    }

    public WebElement getBlouseProductButton() {
        return driver.findElement(By.cssSelector("#homefeatured a img[title='Blouse']"));
    }

    public WebElement getFadedProductButton() {
        wait.waitElementToBeClickable(By.cssSelector("#homefeatured a img[title='Faded Short Sleeve T-shirts']"));
        return driver.findElement(By.cssSelector("#homefeatured a img[title='Faded Short Sleeve T-shirts']"));
    }

    public WebDriver getIframe() {
        WebElement iframe = driver.findElement(By.className("fancybox-iframe"));
        driver.switchTo().frame(iframe);
        return driver;
    }

    public WebDriver getIframeDefalut() {
        driver.switchTo().defaultContent();
        return driver;
    }

    public WebElement getAddToCartButton() {
        wait.waitVisibilityElement(By.cssSelector("#add_to_cart button"));
        return driver.findElement(By.cssSelector("#add_to_cart button"));
    }

    public WebElement getIframeProceedToCheckoutButton() {
        wait.waitElementToBeClickable(By.cssSelector(".clearfix a[title='Proceed to checkout']"));
        return driver.findElement(By.cssSelector(".clearfix a[title='Proceed to checkout']"));
    }

    public WebElement getIframeContinueShoppingButton() {
        wait.waitElementToBeClickable(By.cssSelector(".button-container span[title='Continue shopping']"));
        return driver.findElement(By.cssSelector(".button-container span[title='Continue shopping']"));
    }

    public WebElement getShoppingTextLabel(){
        return driver.findElement(By.id("cart_title"));
    }

    public WebElement getValueTextLabel() {
        wait.waitVisibilityElement(By.id("total_price"));
        return driver.findElement(By.id("total_price"));
    }

    public WebElement getProceedToCheckoutButton() {
        wait.waitVisibilityElement(By.cssSelector("p a[title='Proceed to checkout']"));
        return driver.findElement(By.cssSelector("p a[title='Proceed to checkout']"));
    }

}
