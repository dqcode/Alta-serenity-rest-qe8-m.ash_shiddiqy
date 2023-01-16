package starter.reqres;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constant;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class ListSingleUserStepDef {

    @Steps
    RegresAPI reqresApi;

    @Given("Get single list user with id {int}")
    public void getSinglelistUserWithPage(int id) {reqresApi.getSingleListUsers(id); }

    @When("send request get list single user")
    public void sendRequestGetlistSingleUser() {
        SerenityRest.when().get(RegresAPI.GET_LIST_SINGLE_USER);

    }

    @And("Validate json schema list single user")
    public void validateJsonSchemaSingleListUser(){
        File JsonSchema = new File( Constant.JSON_SCHEMA+ "/GetListSingleUserSchema.json");
        SerenityRest.then().body(JsonSchemaValidator.matchesJsonSchema(JsonSchema));
    }

    @Given("Get single list user with invalid id {int}")
    public void getSinglelistUserWithInvalid(int id) {reqresApi.getSingleListUsers(id); }


}
