package starter.reqres;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class DeleteUserStepDef {
    @Steps
     RegresAPI reqresApi;

   @Given("Delete user with valid id {int}")
    public void deleteUserWithValidId(int id) {reqresApi.deleteUser(id);

    }

    @When("Send request delete user")
    public void sendRequestDeleteUser() {SerenityRest.when().delete(RegresAPI.DELETE_USERS);
    }

    @Then("should return status code {int}")
    public void shouldReturnStatusCode(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    //negatifcase

    @Given("Delete user with invalid id {int}")
    public void deleteUserWithInvalidId(int id) {reqresApi.deleteUser(id);

    }



}


