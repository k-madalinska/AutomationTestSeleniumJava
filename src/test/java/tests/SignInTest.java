package tests;

import com.github.javafaker.Faker;
import enums.*;
import model.Address;
import model.PersonalInformation;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SignInPage;
import pages.TopMenuPage;
import utils.PageTitleUtils;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SignInTest extends BaseTest {
    private TopMenuPage topMenuPage;
    private SignInPage signInPage;

    Faker faker = new Faker();
    String emailFaker = faker.name().firstName() + "@onet.pl";

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        assertThat(driver.getTitle()).isEqualTo(PageTitleUtils.HOME_PAGE_TITLE);

        topMenuPage = new TopMenuPage(driver);
        signInPage = new SignInPage(driver);
    }

   @Test
    @Order(1)
    public void shouldNotAllowedToCreateAnAccountWithEmptyEmailAddress() {
        topMenuPage.clickOnSignInLink();
        signInPage.clickOnCreateAnAccountButton();

        assertThat(signInPage.isAlertDangerBoxCreateAccountDisplayed()).isTrue();
        System.out.println(signInPage.alertDangerText());
    }

    @Test
    @Order(2)
    public void shouldNotAllowedToCreateAnAccountWithInValidEmail() {
        topMenuPage.clickOnSignInLink();
        signInPage.enterEmailSignIn("test.pl");
        signInPage.clickOnCreateAnAccountButton();

        assertThat(signInPage.isAlertDangerBoxRegisterAccountDisplayed()).isTrue();
    }


    @Test
    @Order(3)
    public void shouldAllowedToSignInWithValidData() {
        topMenuPage.clickOnSignInLink();
        signInPage.enterEmailSignIn(emailFaker);
        signInPage.clickOnCreateAnAccountButton();
        signInPage.clickOnRadioGenderMrs();

        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.setFirstName("Kasia");
        personalInformation.setLastName("Test");
        personalInformation.setPassword("123456");

        personalInformation.setDayDateOfBirth(DayOfBirth.TEN);
        personalInformation.setMonthDateOfBirth(MonthOfBirth.MAY);
        personalInformation.setYearDateOfBirth(YearOfBirth.Y2000);

        signInPage.sendPersonalFullInformation(personalInformation);

        signInPage.clickOnNewsletter();
        assertThat(signInPage.isSignInPageDisplayed()).isTrue();

        Address address = new Address();
        address.setCompany("My company");
        address.setAddress("Al. Jerozolimskie 100 ");
        address.setCity("Warsaw");
        address.setPostCode("12345");
        address.setCountry(Country.UNITED_STATES);
        address.setState(State.OREGON);
        address.setMobilePhone("123456789");
        address.setAdditionalInformation("building behind the post office, third floor");
        signInPage.sendFullAddressInformation(address);
        signInPage.clickOnRegisterButton();
        assertThat(signInPage.isRegisterInfoAccountParagraphDisplayed()).isTrue();
    }

    @Test
    @Order(4)
    public void shouldNotAllowedToCreateAnAccountWithExistingEmail() {
        topMenuPage.clickOnSignInLink();
        signInPage.enterEmailSignIn("test@tesstaaala.pll");
        signInPage.clickOnCreateAnAccountButton();

        assertThat(signInPage.isAlertDangerBoxCreateAccountDisplayed()).isTrue();
    }
}

