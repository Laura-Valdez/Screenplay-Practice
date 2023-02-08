package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.navigation.NavigateTo;
import starter.questions.OnThePrincipalPage;
import starter.questions.SwagLabStoreQuestions;
import starter.tasks.DoLogin;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LogininstepDefinition {


    @Given("{actor} is a {}")
    public void actor_is_a_sauce_customer(Actor actor,String CustomerType) {
        actor.wasAbleTo(NavigateTo.saucceHomePage());
    }
    @When("{actor} tries to login")
    public void actor_tries_to_login(Actor actor) {
        actor.attemptsTo(
                DoLogin.withCredentials("standard_user","secret_sauce")
        );

    }
    @Then("{actor} should see to products list")
    public void actor_should_see_to_products_list(Actor actor) {
        actor.should(
                seeThat(" the display title",
                        OnThePrincipalPage.theTitlesIs(), equalTo("PRODUCTS"))
        );

        theActorInTheSpotlight().should(
                seeThat("the title is present", SwagLabStoreQuestions.ProductsAvailable(), equalTo("PRODUCTS"))
        );
    }
}
