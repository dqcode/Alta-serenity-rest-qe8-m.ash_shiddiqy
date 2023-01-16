Feature: Testing Delete Regres API ALTA QE M.ASH SHIDDIQY

  @Tugas
  Scenario Outline: Delete users with valid id
    Given Delete user with valid id <id>
    When Send request delete user
    Then should return status code 204
    Examples:
      | id |
      | 1  |

@Tugas @Negatifcase
  Scenario Outline: Delete users with invalid id
    Given Delete user with invalid id <id>
    When Send request delete user
    Then should return status code 204
    Examples:
      | id  |
      | 940 |

  @Tugas @Negatifcase
  Scenario Outline: Delete users with valid id and invalid status code
    Given Delete user with valid id <id>
    When Send request delete user
    Then should return status code 400
    Examples:
      | id |
      | 2  |