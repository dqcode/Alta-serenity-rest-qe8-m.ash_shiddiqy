Feature: Testing Regres API ALTA QE M.ASH SHIDDIQY

  @Tugas
  Scenario: Post create new user with valid json
    Given Post create user with valid json
    When Send request post create user
    Then should return status code 201
    And Response body name should be "M.Ash Shiddiqy" and job "QA ENGINEER"
    And Validate json schema create user

  @Tugas @negatifcase
  Scenario: Post create new user with invalid json
    Given Post create user with Invalid json
    When Send request post create user
    Then should return status code 400

  @Tugas @negatifcase
  Scenario: Post create new user with null name value and null job
    Given Post create user with null name and null job
    When Send request post create user
    Then should return status code 400

  @Tugas @negatifcase
  Scenario: Post create new user with null name
    Given Post create user with null name
    When Send request post create user
    Then should return status code 400