package starter.reqres;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constant;
import starter.Utils.ReqresResponses;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class CreateUserStepDef {

    @Steps
    RegresAPI reqresApi;

    @Given("Post create user with valid json")
    public void postCreateUserWithValidJson() {
        File json = new File(Constant.JSON_REQUEST + "/RequestUser.json");
        reqresApi.postCreateUser(json);
    }

    @When("Send request post create user")
    public void sendRequestPostCreateUser() {
        SerenityRest.when().post(RegresAPI.POST_CREATE_USERS);
    }

    // @Then("should return status code {int}")
    //public void shouldReturnStatusCode(int ok) {
    //   SerenityRest.then().statusCode(ok);
    //}

    @And("Response body name should be {string} and job {string}")
    public void responseBodyNameShouldBeAndJob(String name, String job) {
        SerenityRest.then()
                .body(ReqresResponses.NAME, equalTo(name))
                .body(ReqresResponses.JOB, equalTo(job));

    }

    @And("Validate json schema create user")
    public void validateJsonSchemaCreateUser() {
        File JsonSchema = new File(Constant.JSON_SCHEMA + "/CreateUserSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonSchema));
    }

    //negatifcase

    @Given("Post create user with Invalid json")
    public void postCreateUserWithInvalidJson() {
        File json = new File(Constant.JSON_REQUEST + "/CreateInvalid.json");
        reqresApi.postCreateUser(json);
    }
    @Given("Post create user with null name and null job")
    public void postCreateUserWithNullNameJob() {
        File json = new File(Constant.JSON_REQUEST + "/CreateNullNameJob.json");
        reqresApi.postCreateUser(json);
    }
    @Given("Post create user with null name")
    public void postCreateUserWithNullName() {
        File json = new File(Constant.JSON_REQUEST + "/CreateNullNameJob.json");
        reqresApi.postCreateUser(json);
    }
}
