package co.com.choucair.certification.retofinancial.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUt implements Task {
    private co.com.choucair.certification.retofinancial.userinterface.OpenUtestPage openUtestPage;
    public static OpenUt thePage() {
        return Tasks.instrumented(OpenUt.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) { actor.attemptsTo(Open.browserOn(openUtestPage));

    }

}
