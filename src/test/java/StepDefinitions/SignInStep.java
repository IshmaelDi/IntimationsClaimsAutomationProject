package StepDefinitions;

import PageObject.SignInObjects;
import PageObject.PolicyNumber;

import net.serenitybdd.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

public class SignInStep extends PageObject {

    @Steps
    SignInObjects signInObjects;
    @Steps
    PolicyNumber policyNumber;

    @Given("User log In to Claim Website.")
    public void user_log_in_to_claim_website() throws InterruptedException {
        signInObjects.OpenWebsite();

    }
    @When("User enters valid credentials {string}, and click Next Button and enter {string} and clicks sign in button.")
    public void user_enters_valid_credentials_and_click_next_button_and_enter_and_clicks_sign_in_button(String Username, String Password) {
        signInObjects.PopUpLogin(Username);
        signInObjects.NextButton();
        signInObjects.EnterPassword(Password);
        signInObjects.SignInButton();
    }
    @When("Navigate to Information Board, click and enter {string} and click Search Button for results.")
    public void navigate_to_information_board_click_and_enter_and_click_search_button_for_results(String IDPassportNumber) {
        policyNumber.EnterPolicyNumber(IDPassportNumber);
        policyNumber.SearchButton();


    }





}
