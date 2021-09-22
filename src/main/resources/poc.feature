Feature: graphql

  Scenario Outline: Sample Scenario
    Given Parameterize graphql query "<query>"
    Examples:
      | query     |
      | site_id   |
      | site_name |

