package com.api.cucumber.stepdfn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetResource {

	@Given("^For a given resoure \"([^\"]*)\" and \"([^\"]*)\"$")
	public void for_a_given_resoure_and(String arg1, String arg2) throws Throwable {
		System.out.println(arg1 + " : " +arg2);
	}

	@Given("^Prepare query param  \"([^\"]*)\"$")
	public void prepare_query_param(String arg1) throws Throwable {
		System.out.println(arg1);
	}

	@Given("^Prepare path param \"([^\"]*)\"$")
	public void prepare_path_param(String arg1) throws Throwable {
		System.out.println(arg1);
	}

	@When("^Send GET a resource to Client$")
	public void send_GET_a_resource_to_Client() throws Throwable {
	}

	@Then("^Receive Response Code \"([^\"]*)\"$")
	public void receive_Response_Code(String arg1) throws Throwable {
		System.out.println(arg1);
	}

	@Then("^Parse Response Text for \"([^\"]*)\"$")
	public void parse_Response_Text_for(String arg1) throws Throwable {
		System.out.println(arg1);
	}

}
