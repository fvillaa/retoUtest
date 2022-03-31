package co.com.choucair.certification.retofinancial.stepdefinitions;

//import co.com.choucair.certification.retofinancial.questions.Answer;
import co.com.choucair.certification.retofinancial.tasks.Access;
import co.com.choucair.certification.retofinancial.tasks.OpenUt;
import co.com.choucair.certification.retofinancial.tasks.Record;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class utestFinancialStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());}

    @Given("^That Fernando wants to create users on the utest page$")
    public void thatFernandoWantsToCreateUsersOnTheUtestPage() {
        OnStage.theActorCalled("Fernando").attemptsTo(OpenUt.thePage(), (Access.onThePage()));}


     @When("^Click the (.*) option$")
   public void clickTheJoinTodayOption(String user) {
        OnStage.theActorInTheSpotlight().attemptsTo(Record.the(user));

    }

     @Then("Successfully Registered User Welcome$")
    public void successfullyRegisteredUserWelcome() {

    }
}
