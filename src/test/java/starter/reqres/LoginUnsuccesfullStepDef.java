package starter.reqres;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constant;
import starter.Utils.ReqresResponses;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class LoginUnsuccesfullStepDef {
    @Steps
    RegresAPI reqresApi;

    @Given("Post unsuccesfull login user with valid json")
    public void postUnsuccesfullLoginWithValidJson() {
        File json = new File(Constant.JSON_REQUEST + "/RequestLoginUnsuccesfull.json");
        reqresApi.postUnsuccesfullLoginUser(json);
    }
    @When("Send request post unsuccesfull login user")
    public void sendRequestPostUnsuccesfullLogin() {
        SerenityRest.when().post(RegresAPI.UNSUCCESFULL_LOGIN_USERS);
    }

    @And("Response body should be {string}")
    public void responseBodyNameShouldBeAndJob(String error) {
        SerenityRest.then()
                .body(ReqresResponses.ERROR, equalTo(error));
    }

    @And("Validate json schema unsuccesfull login user")
    public void validateJsonSchemaLoginUser() {
        File JsonSchema = new File(Constant.JSON_SCHEMA + "/LoginUnsuccesfullSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonSchema));
    }

}
