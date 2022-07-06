package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	@Given("^User Navigate to Application$")
	public void user_navigate_to_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is small program");
	}

	@When("^Enter (.+) and (.+) and click on Login$")
	public void enter_and_and_click_on_login(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("userName "+string+" password is "+string2);
	}


	@Then("^User should able to login into application$")
	public void user_should_able_to_login_into_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is small program");
	}

	@Then("^User able to see success message$")
	public void user_able_to_see_success_message(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is small program");
		List<List<String>> lis = table.cells();
		System.out.println(lis.get(1).get(0));
	}
}
