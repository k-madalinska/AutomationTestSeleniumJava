package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TopMenuPage extends BasePage {

    @FindBy(linkText = "Contact us")
    WebElement contactUsLink;

    @FindBy(className = "login")
    WebElement signInLink;

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCountactUsLink() {
        contactUsLink.click();
    }

    public void  clickOnSignInLink() {
        signInLink.click();
    }
}
