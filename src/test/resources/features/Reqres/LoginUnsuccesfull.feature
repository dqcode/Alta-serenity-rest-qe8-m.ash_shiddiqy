Feature: Testing login unsuccesfull Regres API ALTA QE M.ASH SHIDDIQY

  @Tugas
  Scenario: Post login new user with valid json
    Given Post unsuccesfull login user with valid json
    When Send request post unsuccesfull login user
    Then should return status code 400
    And Response body should be "Missing password"
    And Validate json schema unsuccesfull login user
