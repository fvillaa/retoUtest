package co.com.choucair.certification.retofinancial.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecordUtestPage extends PageObject {
    public static final Target INPUT_FIRSTNAME = Target.the("enter first name").
            located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("enter last name").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("enter email").
            located(By.xpath("//*[@id=\"email\"]"));
    public static final Target SELECT_MONTH = Target.the("select the month").
            located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("select day").
            located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("select year").
            located(By.id("birthYear"));
    public static final Target CLICK_BUTTON_LOCATION = Target.the("click on the location button").
            located(By.xpath("//a[@aria-label=\"Next step - define your location\"]"));
    public static final Target CLICK_BUTTON_DEVICES = Target.the("click on the devices button").
            located(By.xpath("//div[@class=\"pull-right next-step\"]"));
    public static final Target CLICK_SELECT_BRAND = Target.the("click on the SELECT_BRAND field").
            located(By.xpath("//span[@aria-label= 'Select Brand']"));
    public static final Target INPUT_SELECT_BRAND = Target.the("Input select brand").
          located(By.xpath("//div[text()='Apple']"));
    public static final Target CLICK_SELECT_MODEL = Target.the("select model mobil").
            located(By.xpath("//span[@aria-label= 'Select a Model']"));
    public static final Target INPUT_SELECT_MODEL = Target.the("Input select model mobil").
            located(By.xpath("//div[text()= \"iPhone 3G\"]"));
    public static final Target CLICK_SELECT_OS = Target.the("Input select model mobil").
            located(By.xpath("//span[@class = 'ui-select-placeholder text-muted']"));
    public static final Target INPUT_SELECT_OS = Target.the("Select mobile operating systems").
            located(By.xpath("//div[text()= \"iOS 11.0.3\"]"));
    public static final Target CLICK_BUTTON_LAST_STEP = Target.the("Click button last step").
            located(By.xpath("//a[@aria-label= \"Next - final step\"]"));
    public static final Target INPUT_CREATE_PASSWORD = Target.the("write password to create")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("write password to confirm")
            .located(By.id("confirmPassword"));
    public static final Target CLICK_STAY_INFORMED = Target.the("accept terms of use")
            .located(By.xpath("//span[@class = 'checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target CLICK_ON_USER_TERMS = Target.the("accept code of conduct")
            .located(By.xpath("//span[@ng-class= '{error: userForm.termOfUse.$error.required}']"));
    public static final Target CLICK_ACCEPT_POLICIES = Target.the("accept privacy & security policy")
            .located(By.xpath("//span[@ng-class= '{error: userForm.privacySetting.$error.required}']"));
    public static final Target CLICK_BUTTON_COMPLETE_SETUP = Target.the("Select button complete setup")
            .located(By.id("laddaBtn"));
    public static final Target CORRECT_RECORD = Target.the("Correct record").
            located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
