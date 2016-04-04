Feature: Access to seleniumframework website
  Use selenium java with cucumber-jvm and navigate to websites

  Scenario: Print title and url
    When I open seleniumframework website
    Then I validate the title and url