Feature: Testing list single Regres API ALTA QE M.ASH SHIDDIQY

  @Tugas
  Scenario Outline: Get list single users with valid parameter page regres API
    Given Get single list user with id <id>
    When send request get list single user
    Then should return status code 200
    And Validate json schema list single user
    Examples:
      | id |
      | 2  |

  @tuga @negatifcase
  Scenario Outline: Get list single users with invalid id
    Given Get single list user with invalid id <id>
    When send request get list single user
    Then should return status code 404
    Examples:
      | id  |
      | 345 |