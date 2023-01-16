package starter.reqres;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constant;

import java.io.File;

public class RegresAPI {

//    public static String BASE_URL = "https://reqres.in"; // ini base url
//
//    public static final String DIR =System.getProperty("user.dir"); // untuk dapatkan location pt
//
//    public static String JSON_REQUEST = DIR+"/src/test/resources/features/JSON/Request";
//    public static String JSON_SCHEMA = DIR+"/src/test/resources/features/JSON/JsonSchema";


    public static String GET_LIST_USERS = Constant.BASE_URL + "/api/users?page={page}";

    public static String POST_CREATE_USERS = Constant.BASE_URL + "/api/users";

    public static String PUT_UPDATE_USERS = Constant.BASE_URL + "/api/users/{id}";
    public static String DELETE_USERS = Constant.BASE_URL + "/api/users/{id}";
    public static String REGISTER_USERS = Constant.BASE_URL + "/api/register";

    public static String LOGIN_USERS = Constant.BASE_URL + "/api/login";

    public static String UNSUCCESFULL_LOGIN_USERS = Constant.BASE_URL + "/api/login";

    public static String GET_LIST_SINGLE_USER = Constant.BASE_URL + "/api/users/{id}";



    //tempat pengenalan sebelum ditaro methodnya
    @Step("Get list users")
    public void getListUsers(int page) {
        SerenityRest.given().pathParam("page", page);
    }
    @Step("Get single list users")
    public void getSingleListUsers(int id) {
        SerenityRest.given().pathParam("id", id);
    }


    @Step("Get list users invalid") //untuk invalid get list user
    public void getListUsersInvalid(String page) {
        SerenityRest.given().pathParam("page", page);
    }

    @Step("Post create user")
    public void postCreateUser(File json) {
        SerenityRest
                .given()
                .contentType(ContentType.JSON)
                .body(json);
    }



    @Step("Post login user")
    public void postLoginUser(File json) {
        SerenityRest
                .given()
                .contentType(ContentType.JSON)
                .body(json);}

    @Step("Post unsuccesfull login user")
    public void postUnsuccesfullLoginUser(File json) {
        SerenityRest
                .given()
                .contentType(ContentType.JSON)
                .body(json);}

    @Step("Post register user")
    public void postRegisterUser(File json) {
        SerenityRest
                .given()
                .contentType(ContentType.JSON)
                .body(json);}

    @Step("put update user") // setiap yang ada parameternya kita harus input di dalam method nya contoh ada nya id disini
    public void putUpdateUser(int id, File json) {
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Delete user")
    public void deleteUser(int id) {
        SerenityRest.given()
                .pathParam("id", id);
    }


}
