Feature: Testing  login Regres API ALTA QE M.ASH SHIDDIQY
  @Tugas
  Scenario: Post login new user with valid json
    Given Post login user with valid json
    When Send request post login user
    Then should return status code 200
    And Response body token should be "QpwL5tke4Pnpja7X4"
    And Validate json schema login user

  @Tugas @Negatifcase
  Scenario: Post login new user with invalid json
    Given Post login user with invalid json
    When Send request post login user
    Then should return status code 400