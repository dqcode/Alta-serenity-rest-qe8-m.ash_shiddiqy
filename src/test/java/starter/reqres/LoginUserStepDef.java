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

public class LoginUserStepDef {

    @Steps
    RegresAPI reqresApi;

    @Given("Post login user with valid json")
    public void postCreateUserWithValidJson() {
        File json = new File(Constant.JSON_REQUEST + "/LoginUser.json");
        reqresApi.postLoginUser(json);
    }

    @When("Send request post login user")
    public void sendRequestPostLoginUser() {
        SerenityRest.when().post(RegresAPI.LOGIN_USERS);
    }
    @And("Response body token should be {string}")
    public void responseBodyNameShouldBeAndJob(String token) {
        SerenityRest.then()
                .body(ReqresResponses.TOKEN_USER, equalTo(token));


    }

    @And("Validate json schema login user")
    public void validateJsonSchemaLoginUser() {
        File JsonSchema = new File(Constant.JSON_SCHEMA + "/LoginUserSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonSchema));
    }

    @Given("Post login user with invalid json")
    public void postCreateUserWithInvalidJson() {
        File json = new File(Constant.JSON_REQUEST + "/RequestInvalidLogin.json");
        reqresApi.postLoginUser(json);
    }






}
