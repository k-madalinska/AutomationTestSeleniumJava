package pages;

import model.Address;
import model.PersonalInformation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ElementVisibleUtils;

public class SignInPage extends BasePage {

    @FindBy(id = "email_create")
    WebElement emailCreateInput;

    @FindBy(id = "SubmitCreate")
    WebElement buttonCreateAnAccount;

    @FindBy(id = "create_account_error")
    WebElement alertDangerBoxCreateAccount;

    @FindBy(className = "alert-danger")
    WebElement alertDangerBoxRegisterAccount;

    @FindBy(css = ".navigation_page")
    WebElement navigationPageAuthentication;

    @FindBy(id = "uniform-id_gender2")
    WebElement genderMrsRadio;

    @FindBy(id = "customer_firstname")
    WebElement firstNameInput;

    @FindBy(id = "customer_lastname")
    WebElement lastNameInput;

    @FindBy(id = "passwd")
    WebElement passwordInput;

    @FindBy(id = "days")
    WebElement daySelect;

    @FindBy(id = "months")
    WebElement monthSelect;

    @FindBy(id = "years")
    WebElement yearSelect;

    @FindBy(id = "newsletter")
    WebElement newsletterInput;

    @FindBy(id = "company")
    WebElement companyInput;

    @FindBy(id = "address1")
    WebElement addressInput;

    @FindBy(id = "city")
    WebElement cityInput;

    @FindBy(id = "id_state")
    WebElement stateSelect;

    @FindBy(id = "postcode")
    WebElement postCodeInput;

    @FindBy(id = "id_country")
    WebElement countrySelect;

    @FindBy(id = "other")
    WebElement additionalInformationTextArea;

    @FindBy(id = "phone_mobile")
    WebElement mobileInput;

    @FindBy(id = "submitAccount")
    WebElement registerButton;

    @FindBy(className = "info-account")
    WebElement registerInfoAccountParagraph;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmailSignIn(String email) {
        emailCreateInput.sendKeys(email);
    }

    public String alertDangerText() {
        return alertDangerBoxRegisterAccount.getText();
    }

    public void clickOnRadioGenderMrs() {
        wait.until(ExpectedConditions.visibilityOf(genderMrsRadio));
        genderMrsRadio.click();
    }

    public void clickOnRegisterButton() {
        registerButton.click();
    }

    public void clickOnCreateAnAccountButton() {
        buttonCreateAnAccount.click();
    }

    public void clickOnNewsletter() {
        newsletterInput.click();
    }

    public boolean isAlertDangerBoxCreateAccountDisplayed() {
        return isAlertBoxDisplayed(alertDangerBoxCreateAccount);
    }

    public boolean isAlertDangerBoxRegisterAccountDisplayed() {
        return isAlertBoxDisplayed(alertDangerBoxRegisterAccount);
    }

    public boolean isSignInPageDisplayed() {
        return isAlertBoxDisplayed(navigationPageAuthentication);
    }

    public boolean isRegisterInfoAccountParagraphDisplayed() {
        return isAlertBoxDisplayed(registerInfoAccountParagraph);
    }

    private boolean isAlertBoxDisplayed(WebElement box) {
        return ElementVisibleUtils.isElementVisible(box, wait);
    }

    public void sendPersonalFullInformation(PersonalInformation personalInformation) {
        firstNameInput.sendKeys(personalInformation.getFirstName());
        lastNameInput.sendKeys(personalInformation.getLastName());
        passwordInput.sendKeys(personalInformation.getPassword());
        daySelect.sendKeys(personalInformation.getDayDateOfBirth().getValue());
        monthSelect.sendKeys(personalInformation.getMonthDateOfBirth().getValue());
        yearSelect.sendKeys(personalInformation.getYearDateOfBirth().getValue());
    }

    public void sendFullAddressInformation(Address address) {
        companyInput.sendKeys(address.getCompany());
        addressInput.sendKeys(address.getAddress());
        cityInput.sendKeys(address.getCity());
        stateSelect.sendKeys(address.getState().getValue());
        postCodeInput.sendKeys(address.getPostCode());
        countrySelect.sendKeys(address.getCountry().getValue());
        additionalInformationTextArea.sendKeys(address.getAdditionalInformation());
        mobileInput.sendKeys(address.getMobilePhone());
    }
}
