package starter.reqres;
import static org.hamcrest.Matchers.equalTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

public class ReqresStepDef {

  //  @Steps
    //RegresAPI reqresApi;

//    @Given("Get list user with page {int}")
 //   public void getlistUserWithPage(int page) {reqresApi.getListUsers(page); }

  //  @When("send request get list user")
   // public void sendRequestGetlistUser() {
     //   SerenityRest.when().get(RegresAPI.GET_LIST_USERS);

    //}

    //@Then("should return status code {int}")
   // public void shouldReturnStatusCode(int ok) {
     //   SerenityRest.then().statusCode(ok);
   // }

    //@And("response body page should be {int}")
    //public void responseBodyPageShouldBe(int page){
      //  SerenityRest.then().body( "page",equalTo(page));
    //}
//scenario ke 2
  //  @Given("Post create user with valid json")
  //  public void postCreateUserWithValidJson(){
    //    File json = new File(RegresAPI.JSON_REQUEST+"/RequestUser.json");
      //  reqresApi.postCreateUser(json);
   // }
   // @When("Send request post create user")
   // public void sendRequestPostCreateUser(){
     //   SerenityRest.when().post(RegresAPI.POST_CREATE_USERS);
   // }

    //@And("Response body name should be {string} and job {string}")
    //public void responseBodyNameShouldBeAndJob( String name, String job){
      //  SerenityRest.then()
        //        .body( "name",equalTo(name))
          //      .body( "job",equalTo(job));

  //  }

//scenario 3
//@Given("Put update user with valid json with id {int}")
//public void putUpdateUserWithValidJson(int id){
  //  File json = new File(RegresAPI.JSON_REQUEST+"/RequestUser.json");
    //reqresApi.putUpdateUser(id,json);
//}
  //  @When("Send request put update user")
    //public void sendRequestPutUpdateUser(){
      //  SerenityRest.when().put(RegresAPI.PUT_UPDATE_USERS);
    //}

// scenario 4
 //   @Given("Delete user with valid id {int}")
   // public void deleteUserWithValidId(int id) {reqresApi.deleteUser(id);

    //}

    //@When("Send request delete user")
    //public void sendRequestDeleteUser() { SerenityRest.when().delete(RegresAPI.DELETE_USERS);
    //}
}
