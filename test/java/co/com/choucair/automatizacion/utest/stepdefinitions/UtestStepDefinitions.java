package co.com.choucair.automatizacion.utest.stepdefinitions;


import co.com.choucair.automatizacion.utest.model.UtestData;
import co.com.choucair.automatizacion.utest.questions.Answer;
import co.com.choucair.automatizacion.utest.tasks.Login;
import co.com.choucair.automatizacion.utest.tasks.OpenUp;
import co.com.choucair.automatizacion.utest.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class UtestStepDefinitions {
    @Before
    public void  setStage(){
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("^the user Elizabeth open the webpage the Utest Longin in$")
    public void the_user_elizabeth_open_the_webpage_the_utest_longin_in(List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled("Elizabeth").wasAbleTo(OpenUp.thePage(), Login.
                onThePage(utestData.get(0).getusseremail(),utestData.get(0).getpassword()));

    }
    @When("^the user Elizabeth insert (.+) and (.+)$")
    public void the_user_elizabeth_insert_and(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(utestData.get(0).getStrCourse()));


    }
     @Then("^the page open profiles the user Elizabeth (.+)$")
    public void the_page_open_profiles_the_user_elizabeth(List<UtestData> utestData) throws Exception  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrCourse())));
    }

}
