package co.com.choucair.jobs.stepdefinitions;



import co.com.choucair.jobs.models.DataModel;
import co.com.choucair.jobs.questions.Result;
import co.com.choucair.jobs.questions.TextResult;
import co.com.choucair.jobs.questions.WordResult;
import co.com.choucair.jobs.tasks.*;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class JobsStepDefinition {

    @Before
    public void configuracionInicial(){

        setTheStage(new OnlineCast());
    }

    @Given("^(.*) wants to access choucair jobs$")
    public void luisWantsToAccessChoucairJobs(String luis)  {
        theActorCalled(luis).wasAbleTo(OpenBrowse.theChoucairJobsPage());
    }

    @When("^he performs the search on the page$")
    public void hePerformsTheSearchOnThePage(List<DataModel> dataSet){
        theActorInTheSpotlight().attemptsTo(ChoucairSearchJobs.con(dataSet));
    }

    @Then("^he verifies that the text Search completed is displayed on the screen$")
    public void heVerifiesThatTheTextSearchCompletedIsDisplayedOnTheScreen(List<DataModel>dataSet)  {
        theActorInTheSpotlight().should(seeThat(WordResult.isThe(dataSet)));
    }


    @Given("^that (.*) wants to join performance work$")
    public void thatEinerWantsToJoinPerformanceWork(String einer)  {
        theActorCalled(einer).wasAbleTo(OpenBrowse.theChoucairJobsPage());

    }

    @When("^he  fill  the form$")
    public void heFillTheForm(List<DataModel> dataSet){
        theActorInTheSpotlight().attemptsTo(ChoucairSignUpForWork.con(dataSet));

    }

    @Then("^he verifies that the text please verify the captcha is displayed on the screen$")
    public void heVerifiesThatTheTextPleaseVerifyTheCaptchaIsDisplayedOnTheScreen(List<DataModel>dataSet)  {
        theActorInTheSpotlight().should(seeThat(TextResult.isThe(dataSet)));
    }


    @Given("^that (.*) wants search a word in the section jobs$")
    public void thatLuisWantsSearchAWordInTheSectionJobs(String luis) {
        theActorCalled(luis).wasAbleTo(OpenBrowse.theChoucairJobsPage());
    }

    @When("^he write a word (.*)$")
    public void heWriteAWordMedico(String theWord) {
        OnStage.theActorInTheSpotlight().attemptsTo(Typing.outOfContext(theWord));
    }

    @Then("^he sees the texto (.*)$")
    public void heSeesTheTextoNoHayTrabajosCorrespondientesATuBúsqueda(String theWord) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Result.isThe(theWord)));
    }
}
