package co.com.choucair.certification.retofinancial.tasks;

import co.com.choucair.certification.retofinancial.userinterface.RecordUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Record implements Task {
    private String user;

    public Record(String user) {
        this.user = user;
    }

    public static Record the(String user) { return Tasks.instrumented(Record.class,user);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RecordUserPage.CLICK_FIRST_NAME),
        Enter.theValue("enter first name").into(RecordUserPage.INPUT_FIRST_NAME),
                Enter.theValue("enter last name").into(RecordUserPage.INPUT_LAST_NAME),
                Enter.theValue("enter email").into(RecordUserPage.INPUT_EMAIL),
               Click.on(RecordUserPage.SELECT_MONTH),
                Click.on(RecordUserPage.SELECT_DAY),
                Click.on(RecordUserPage.SELECT_YEAR),
                Click.on(RecordUserPage.CLICK_BUTTON_LOCATION),
                Enter.theValue("enter city").into(RecordUserPage.INPUT_CITY),
                Enter.theValue("enter zip code").into(RecordUserPage.INPUT_ZIP_CODE),
                Enter.theValue("enter city").into(RecordUserPage.INPUT_CITY),
                Enter.theValue("select country").into(RecordUserPage.SELECT_COUNTRY),
                Enter.theValue("click on the devices button").into(RecordUserPage.CLICK_BUTTON_DEVICES),
                Enter.theValue("select computer").into(RecordUserPage.SELECT_COMPUTER),
                Enter.theValue("select version").into(RecordUserPage.SELECT_VERSION),
                Enter.theValue("select language").into(RecordUserPage.SELECT_LENGUAGE),
                Enter.theValue("select model mobil").into(RecordUserPage.SELECT_MODEL),
                Enter.theValue("select Operating System").into(RecordUserPage.SELECT_OS),
                Click.on(RecordUserPage.CLICK_BUTTON_LAST_STEP),
                Enter.theValue("create a password").into(RecordUserPage.INPUT_CREATE_PASSWORD),
                Enter.theValue("confirm password").into(RecordUserPage.INPUT_CONFIRM_PASSWORD),
                Click.on(RecordUserPage.CLICK_STAY_INFORMED),
                Click.on(RecordUserPage.CLICK_ON_USER_TERMS),
                Click.on(RecordUserPage.CLICK_ACCEPT_POLICIES),
                Click.on(RecordUserPage.CLICK_BUTTON_COMPLETE_SETUP),
                Click.on(RecordUserPage.CORRECT_RECORD)

                );
    }
}
