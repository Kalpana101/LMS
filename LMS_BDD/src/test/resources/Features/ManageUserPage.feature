Feature: Manage user Page
  Scenario: Landing Verify landing in Manage user page
  Given User launch browser
When User opens URl "https://lms-frontend-phase2.herokuapp.com/"
And User enter the username as "LMS" and password as "LMS"
Then Click on SignIN

Scenario:Verify the page title
Given User is on the Manage user page
    Then User is on any page after Login
    When User clicks the Tab "User"
    Then User should see the Manage user page title "LMS"
    