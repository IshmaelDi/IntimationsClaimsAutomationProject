package stepDefinitions;

import PageObject.SignInObjects;

import net.serenitybdd.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class SignInSteps extends PageObject {

    @Steps
    SignInObjects signInObjects;

    @Given("User log In to Claim Website.")
    public void user_log_in_to_claim_website() throws InterruptedException {
        signInObjects.OpenWebsite();

    }
    @When("User enters valid credentials {string}, and click Next Button and enter {string} and clicks sign in button.")
    public void user_enters_valid_credentials_and_click_next_button_and_enter_and_clicks_sign_in_button(String Username, String Password) {
        signInObjects.PopUpLogin(Username, Password);

    }
    @Then("User Navigate to Information Board.")
    public void user_navigate_to_information_board() {

    }




}
