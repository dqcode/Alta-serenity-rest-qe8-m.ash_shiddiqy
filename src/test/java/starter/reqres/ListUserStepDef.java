package starter.reqres;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constant;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class ListUserStepDef {
    @Steps
    RegresAPI reqresApi;

    @Given("Get list user with page {int}")
    public void getlistUserWithPage(int page) {reqresApi.getListUsers(page); }

    @When("send request get list user")
    public void sendRequestGetlistUser() {
        SerenityRest.when().get(RegresAPI.GET_LIST_USERS);

    }

//   // @Then("should return status code {int}")
//    //public void shouldReturnStatusCode(int ok) {
//        SerenityRest.then().statusCode(ok);
//    }

    @And("response body page should be {int}")
    public void responseBodyPageShouldBe(int page){
        SerenityRest.then().body( "page",equalTo(page));
    }

    @And("Validate json schema list user")
    public void validateJsonSchemaListUser(){
        File JsonSchema = new File( Constant.JSON_SCHEMA+ "/ListUserSchema.json");
        SerenityRest.then().body(JsonSchemaValidator.matchesJsonSchema(JsonSchema));
    }

    // scenario negatif

    @Given("Get list user with invalid page{int}")
    public void getlistUserWithInvalidPage(int page)
    {reqresApi.getListUsers(page); }




}
