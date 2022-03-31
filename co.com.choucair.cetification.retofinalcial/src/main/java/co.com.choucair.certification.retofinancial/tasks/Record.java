package co.com.choucair.certification.retofinancial.tasks;

import co.com.choucair.certification.retofinancial.userinterface.RecordUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Record implements Task {
    private String user;

    public Record(String user) {
        this.user = user;
    }

    public static Record the(String user) {
        return Tasks.instrumented(Record.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RecordUtestPage.INPUT_FIRSTNAME),
                Enter.theValue("Fernando").into(RecordUtestPage.INPUT_FIRSTNAME),
                Enter.theValue("Villa Alvarez").into(RecordUtestPage.INPUT_LASTNAME),
                Enter.theValue("fvillaa2@hotmail.com").into(RecordUtestPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("October").from(RecordUtestPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("12").from(RecordUtestPage.SELECT_DAY),
                SelectFromOptions.byVisibleText("1982").from(RecordUtestPage.SELECT_YEAR),
                Click.on(RecordUtestPage.CLICK_BUTTON_LOCATION),
                //Enter.theValue("Pereira").into(RecordUtestPage.SELECT_CITY),
                // Enter.theValue("660000").into(RecordUtestPage.INPUT_POSTALCODE),
                //Click.on(RecordUtestPage.CLICK_BUTTON_DEVICES),
                DoubleClick.on(RecordUtestPage.CLICK_BUTTON_DEVICES),
                Click.on(RecordUtestPage.CLICK_SELECT_BRAND),
                Click.on(RecordUtestPage.INPUT_SELECT_BRAND),
                Click.on(RecordUtestPage.CLICK_SELECT_MODEL),
                Click.on(RecordUtestPage.INPUT_SELECT_MODEL),
                Click.on(RecordUtestPage.CLICK_SELECT_OS),
                Click.on(RecordUtestPage.INPUT_SELECT_OS),
                Click.on(RecordUtestPage.CLICK_BUTTON_LAST_STEP),
                Enter.theValue("Poiuytre155**").into(RecordUtestPage.INPUT_CREATE_PASSWORD),
                Enter.theValue("Poiuytre155**").into(RecordUtestPage.INPUT_CONFIRM_PASSWORD),
                Click.on(RecordUtestPage.CLICK_STAY_INFORMED),
                Click.on(RecordUtestPage.CLICK_ON_USER_TERMS),
                Click.on(RecordUtestPage.CLICK_ACCEPT_POLICIES),
                Click.on(RecordUtestPage.CLICK_BUTTON_COMPLETE_SETUP),
                Click.on(RecordUtestPage.CORRECT_RECORD)

        );
    }
}




