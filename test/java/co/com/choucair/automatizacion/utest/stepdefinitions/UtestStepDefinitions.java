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
    @Given("^than ecanolopera@gmail.com wants to learn and certificate as Testing at the Utest$")
    public void thanEcanoloperagmailcomWantsToLearnAndCertificateAsTestingAtTheUtest(List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled("ecanolopera@gmailcom").wasAbleTo(OpenUp.thePage(), Login.
                onThePage(utestData.get(0).getEmailUser(),utestData.get(0).getStrPassword()));

    }
    @When("^he search for the course testing basics on the Utest academy platform$")
    public void heSearchForTheCourseTestingBasicsOnTheUtestAcademyPlatform(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(utestData.get(0).getStrCourse()));


    }
    @Then("^he finds the course called Testing Basics$")
    public void heFindsTheCourseCalledTestingBasics(List<UtestData> utestData) throws Exception  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrCourse())));
    }

}
