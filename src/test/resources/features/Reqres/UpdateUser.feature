Feature:Testing update Regres API ALTA QE M.ASH SHIDDIQY

  @Tugas
  Scenario: Put update user with valid json
    Given Put update user with valid json with id 2
    When Send request put update user
    Then should return status code 200
    And Response body name should be "M.Ash Shiddiqy" and job "QA ENGINEER"

  @Tugas @negatifcase
  Scenario Outline: Put update user with invalid json
    Given Put update user with invalid json with <id>
    When Send request put update user
    Then should return status code 404
    Examples:
      | id   |
      | 3000 |