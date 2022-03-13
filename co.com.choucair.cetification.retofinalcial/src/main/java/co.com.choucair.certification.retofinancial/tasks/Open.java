package co.com.choucair.certification.retofinancial.tasks;

import co.com.choucair.certification.retofinancial.userinterface.OpenUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Open implements Task {
    private OpenUtestPage OpenutestPage;
    public static Open thePage() {
        return Tasks.instrumented(Open.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(OpenutestPage));
        
    }
}
