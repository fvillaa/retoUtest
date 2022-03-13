package co.com.choucair.certification.retofinancial.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccessUtestPage extends PageObject {
    public static final Target ACCESS_BUTTON = Target.the("Access button to the user creation form").
            located(By.xpath("//*[@id=\"unauthenticated-dropdown-nav\"]/ul/li[6]/a"));


}

