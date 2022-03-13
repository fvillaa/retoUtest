package co.com.choucair.certification.retofinancial.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecordUserPage extends PageObject {

    public static final Target CLICK_FIRST_NAME = Target.the("Click first name").
            located(By.xpath("//*[@id=\"firstName\"]"));
    public  static final Target INPUT_FIRST_NAME = Target.the("enter first name").
            located(By.xpath("//*[@id=\"firstName\"]"));
    public  static final Target INPUT_LAST_NAME = Target.the("enter last name").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("enter email").
            located(By.xpath("//*[@id=\"email\"]"));
    public static final Target SELECT_MONTH = Target.the("select month").
            located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target SELECT_DAY = Target.the("select day").
            located(By.xpath("//*[@id=\"birthDay\"]"));
    public static final Target SELECT_YEAR = Target.the("select year").
            located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target CLICK_BUTTON_LOCATION = Target.the("click on the location button").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target SEE_STEP_2 = Target.the("verify that e shows step 2").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[1]"));
    public static final Target INPUT_CITY = Target.the("enter city").
            located(By.xpath("//*[@id=\"city\"]"));
    public static final Target INPUT_ZIP_CODE = Target.the("enter zip code").
            located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target SELECT_COUNTRY = Target.the("select country").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target CLICK_BUTTON_DEVICES = Target.the("click on the devices button").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
    public static final Target SEE_STEP_3 = Target.the("verify that e shows step 3").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[1]"));
    public static final Target SELECT_COMPUTER = Target.the("select computer").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/i"));
    public static final Target SELECT_VERSION = Target.the("select version").
            located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target SELECT_LENGUAGE = Target.the("select lenguage").
            located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target SELECT_MODEL = Target.the("select model mobil").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target SELECT_OS = Target.the("select Operating System").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/i"));
    public static final Target CLICK_BUTTON_LAST_STEP = Target.the("click on the last step button").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/i"));
    public static final Target SEE_STEP_4 = Target.the("verify that e shows step 4").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[1]"));
    public static final Target INPUT_CREATE_PASSWORD = Target.the("create a password").
            located(By.xpath("//*[@id=\"password\"]"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("confirm password").
            located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target CLICK_STAY_INFORMED = Target.the("click stay informed").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CLICK_ON_USER_TERMS = Target.the("accept user terms").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CLICK_ACCEPT_POLICIES = Target.the("accept privacy policies").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target CLICK_BUTTON_COMPLETE_SETUP = Target.the("click on complete configuration").
            located(By.xpath("//*[@id=\"laddaBtn\"]"));
    public static final Target CORRECT_RECORD = Target.the("Correct record").
            located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));

}
