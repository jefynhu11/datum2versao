package org.example.tasks;

import org.example.pageobjetcs.AddProductsPageObjects;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AddProductsTask {

    private final WebDriver driver;
    private final AddProductsPageObjects addProductsPageObjects;

    public AddProductsTask(WebDriver driver) {
        this.driver = driver;
        addProductsPageObjects = new AddProductsPageObjects(driver);
    }

    public void adicionaCarrinhoProdutos() {
        addProductsPageObjects.getBlouseProductButton().click();
        addProductsPageObjects.getIframe();
        addProductsPageObjects.getAddToCartButton().click();
        addProductsPageObjects.getIframeContinueShoppingButton().click();
        addProductsPageObjects.getIframeDefalut();
        addProductsPageObjects.getFadedProductButton().click();
        addProductsPageObjects.getIframe();
        addProductsPageObjects.getAddToCartButton().click();
        addProductsPageObjects.getIframeProceedToCheckoutButton().click();
        validarPage();
        validarValue();
        addProductsPageObjects.getProceedToCheckoutButton().click();
    }

    private void validarValue() {
        Assertions.assertEquals("$45.51", addProductsPageObjects.getValueTextLabel().getText());
    }

    private void validarPage() {
        Assertions.assertTrue(addProductsPageObjects.getShoppingTextLabel().getText().contains("SHOPPING-CART SUMMARY"));
    }

}
