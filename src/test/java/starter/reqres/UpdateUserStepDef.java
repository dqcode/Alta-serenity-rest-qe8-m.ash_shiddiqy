package starter.reqres;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constant;

import java.io.File;

public class UpdateUserStepDef {


    @Steps
    RegresAPI reqresApi;

    @Given("Put update user with valid json with id {int}")
    public void putUpdateUserWithValidJson(int id){
      File json = new File(Constant.JSON_REQUEST+"/RequestUser.json");
     reqresApi.putUpdateUser(id,json);
}
      @When("Send request put update user")
    public void sendRequestPutUpdateUser(){
      SerenityRest.when().put(RegresAPI.PUT_UPDATE_USERS);
    }


    @Given("Put update user with invalid json with {int}")
    public void putUpdateUserWithInvalidJson(int id){
        File json = new File(Constant.JSON_REQUEST+"/RequestUpdateInvalid.json");
        reqresApi.putUpdateUser(id,json);
    }
}



