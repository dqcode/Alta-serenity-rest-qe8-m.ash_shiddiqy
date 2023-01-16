Feature: Testing Regres API ALTA QE M.ASH SHIDDIQY

  @Latihan
  Scenario Outline: Get list users with valid parameter page regres API
    Given Get list user with page <page>
    When send request get list user
    Then should return status code 200
    And response body page should be <page>
    Examples:
      | page |
      | 1    |
      | 2    |

  @Latihan
  Scenario: Post create new user with invalid valid json
    Given Post create user with valid json
    When Send request post create user
    Then should return status code 201
    And Response body name should be "M.Ash Shiddiqy" and job "QA ENGINEER"

  @Latihan
  Scenario: Put update user with valid json
    Given Put update user with valid json with id 2
    When Send request put update user
    Then should return status code 200
    And Response body name should be "M.Ash Shiddiqy" and job "QA ENGINEER"

 ## @Latihan
  ##Scenario Outline: Delete users with valid id
## Given Delete user with valid id <id>
##When Send request delete user
##Then should return status code 204
##Examples:
  ##    | id |
    ##| 1 |
