package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ElementVisibleUtils;

import java.util.List;
import java.util.stream.Collectors;

public class WomenListPage extends BasePage {

    @FindBy(linkText = "Women")
    WebElement womenLink;

    @FindBy(css = ".navigation_page")
    WebElement navigationPageWomen;

    @FindBy(css = ".right-block .product-price")
    List<WebElement> productPrices;

    public WomenListPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnWomenLink() {
        womenLink.click();
    }

    public boolean isWomenPageDisplayed() {
        return isAlertBoxDisplayed(navigationPageWomen);
    }

    private boolean isAlertBoxDisplayed(WebElement box) {
        return  ElementVisibleUtils.isElementVisible(box, wait);
    }

/*    public boolean isWomenPageDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(navigationPageWomen));
        boolean isDisplayed = false;
        try {
            isDisplayed = navigationPageWomen.isDisplayed();
        } catch (NoSuchElementException e) {
        }
        return isDisplayed;
    }*/


    public List<Double> getProductPrices() {
        return productPrices.stream()
                .map(el -> el.getText().replace("$", " "))
                .map(e -> e.trim())
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }
}
