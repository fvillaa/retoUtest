package co.com.choucair.certification.retofinancial.stepdefinitions;

import co.com.choucair.certification.retofinancial.questions.Answer;
import co.com.choucair.certification.retofinancial.tasks.Access;
import co.com.choucair.certification.retofinancial.tasks.Open;
import co.com.choucair.certification.retofinancial.tasks.Record;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class utestFinancialStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());}

    @Given("^That Fernando wants to create users on the utest page$")
    public void thatFernandoWantsToCreateUsersOnTheUtestPage() {
        OnStage.theActorCalled("Fernando").wasAbleTo(Open.thePage(), (Access.onThePage()));}


     @When("^Click the JOIN TODAY option (.*)$")
   public void clickTheJoinTodayOptionToRegistrerUsers(String user) {
        OnStage.theActorInTheSpotlight().attemptsTo(Record.the(user));
    }

     @Then("^complete the form in order to create a new user(.*)$")
    public void completeTheFormInOrderToCreateANewUser(String question) {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}
