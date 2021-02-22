package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ElementVisibleUtils;

public class SearchPage extends BasePage {

    @FindBy(id = "search_query_top")
    WebElement searchInput;

    @FindBy(className = "button-search")
    WebElement searchButton;

    @FindBy(className = "product-count")
    WebElement searchProductCount;

    @FindBy(css = ".right-block > h5:nth-child(1) > a:nth-child(1)")
    WebElement resultProductNameBlouse;

    @FindBy(css = ".right-block .product-price")
    WebElement resultProductPriceBlouse;

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public String resultTextProductPriceBlouse() {
        return resultProductPriceBlouse.getText();
    }

    public String resultSearchProductNameBlouse() {
        return resultProductNameBlouse.getText();
    }

    public void clickOnSearchInput() {
        searchInput.click();
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }


    public void enterSearchInput(String product) {
        searchInput.sendKeys(product);
    }

    public boolean isSearchBlouseDisplayed() {
        return isAlertBoxDisplayed(searchProductCount);
    }

    private boolean isAlertBoxDisplayed(WebElement box) {
        return  ElementVisibleUtils.isElementVisible(box, wait);
    }
}
