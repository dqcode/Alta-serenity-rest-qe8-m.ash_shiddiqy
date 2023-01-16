Feature:Testing register Regres API ALTA QE M.ASH SHIDDIQY

  @Tugas
  Scenario: Post register new user with valid json
    Given Post register user with valid json
    When Send request post register
    Then should return status code 200
    And Response body email should be 4 and password "QpwL5tke4Pnpja7X4"
    And Validate json schema register


  @Tugas @Negatifcase
  Scenario: Post register new user with invalid json
    Given Post register user with invalid json
    When Send request post register
    Then should return status code 400


