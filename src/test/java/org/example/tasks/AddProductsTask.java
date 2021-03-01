package org.example.tasks;

import org.example.framework.supports.Wait;
import org.example.framework.tools.JsExecutor;
import org.example.pageobjetcs.AddProductsPageObjects;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AddProductsTask {

    private final WebDriver driver;
    private final AddProductsPageObjects addProductsPageObjects;
    private final Wait wait;

    public AddProductsTask(WebDriver driver) {
        this.driver = driver;
        wait = new Wait(driver);
        addProductsPageObjects = new AddProductsPageObjects(driver);
    }

    public void adicionaCarrinhoProdutos() {
        JsExecutor.highLightElementWithClick(driver, addProductsPageObjects.getBlouseProductButton());
        addProductsPageObjects.getIframe();
        JsExecutor.highLightElementWithClick(driver, addProductsPageObjects.getAddToCartButton());
        JsExecutor.highLightElementWithClick(driver, addProductsPageObjects.getIframeContinueShoppingButton());
        addProductsPageObjects.getIframeDefalut();
        JsExecutor.highLightElementWithClick(driver, addProductsPageObjects.getFadedProductButton());
        addProductsPageObjects.getIframe();
        JsExecutor.highLightElementWithClick(driver, addProductsPageObjects.getAddToCartButton());
        JsExecutor.highLightElementWithClick(driver, addProductsPageObjects.getIframeProceedToCheckoutButton());
        validarPage();
        validarValue();
        JsExecutor.highLightElementWithClick(driver, addProductsPageObjects.getProceedToCheckoutButton());
    }

    private void validarValue() {
        Assertions.assertEquals("$45.51", addProductsPageObjects.getValueTextLabel().getText());
    }

    private void validarPage() {
        Assertions.assertTrue(addProductsPageObjects.getShoppingTextLabel().getText().contains("SHOPPING-CART SUMMARY"));
    }

}
