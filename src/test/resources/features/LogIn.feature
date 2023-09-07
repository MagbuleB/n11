Feature:

  @TC01
  Scenario Outline:
    Given user should navigate to n11 link
    When user logs in with Facebook
    And user enters "<email>" and "<password>"
    And user clicks Log In button
    Then verify user is in "n11-10 Üzerinden 11'lik Alışveriş Deneyimi" title

    Examples:
      | email                   | password    |
      | magbulebamja1@gmail.com | Discord123* |
