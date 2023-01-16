Feature: Testing list users Regres API ALTA QE M.ASH SHIDDIQY

  @Tugas
  Scenario Outline: Get list users with valid parameter page regres API
    Given Get list user with page <page>
    When send request get list user
    Then should return status code 200
    And response body page should be <page>
    And Validate json schema list user
    Examples:
      | page |
      | 1    |
      | 2    |

  @Tugas @negatifcase
  Scenario Outline: Get list users with invalid parameter page regres API
    Given Get list user with invalid page<page>
    When send request get list user
    Then should return status code 404
    Examples:
      | page    |
      | 7576776 |

