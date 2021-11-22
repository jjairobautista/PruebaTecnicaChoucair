package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.Shearch;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() {OnStage.setTheStage(new OnlineCast()); }


    @Given("^than Jhon wants to learn automation ah the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAhTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorCalled("Jhon").wasAbleTo(OpenUp.thePage(),Login.onThePage(academyChoucairData.get(0).getUser(),academyChoucairData.get(0).getPass()));
    }


    @When("^he search for course on the choucair academy plataform$")
    public void heSearchForCourseOnTheChoucairAcademyPlataform() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Shearch.the());
    }

    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResources(List<AcademyChoucairData> academyChoucairData) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getRefQuestion())));
    }

}
