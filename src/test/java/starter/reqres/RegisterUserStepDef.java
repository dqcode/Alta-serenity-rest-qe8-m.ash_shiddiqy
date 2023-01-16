package starter.reqres;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constant;
import starter.Utils.ReqresResponses;
import static org.hamcrest.Matchers.equalTo;
import java.io.File;

public class RegisterUserStepDef {
    @Steps
    RegresAPI reqresApi;

    @Given("Post register user with valid json")
    public void postRegisterUserWithValidJson(){
        File json = new File(Constant.JSON_REQUEST+ "/RequestRegister.json");
        reqresApi.postRegisterUser(json);
    }

    @When("Send request post register")
    public void sendRequestPostRegister(){
        SerenityRest.when().post(RegresAPI.REGISTER_USERS);
    }

    @And("Response body email should be {int} and password {string}")
    public void validateJsonSchemaRegister(int id, String token){
      SerenityRest.and()
              .body(ReqresResponses.ID_USER,equalTo(id))
              .body(ReqresResponses.TOKEN_USER,equalTo(token));
    }

    @And("Validate json schema register")
    public void validateJsonSchemaRegister(){
        File JsonSchema = new File(Constant.JSON_SCHEMA+ "/RegisterUserSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JsonSchema));
    }

    @Given("Post register user with invalid json")
    public void postRegisterUserWithInvaalidJson(){
        File json = new File(Constant.JSON_REQUEST+ "/RequestRegisterInvalid.json");
        reqresApi.postRegisterUser(json);
    }

}
