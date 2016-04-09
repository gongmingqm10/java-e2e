Feature: User register in github
  As a user
  I want to sign up for Github
  So that I can create my own repository

  Scenario: Sign up with username and password
    When I navigate to https://github.com/
    And I sign up with the following info
      | username   | email                 | password     |
      | rndodf21f9 | gitshutrt69@gmail.com | fdsgfdsfdsr1 |
    And I wait until page loaded
    Then I should see 'You’ve taken your first step into a larger world' in page

