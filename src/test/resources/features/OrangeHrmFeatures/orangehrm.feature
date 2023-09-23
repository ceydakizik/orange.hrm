@run
Feature:The user must be able to log in and the candidate must be added to the candidate page and verified

  Scenario:US_001 TC_001 Must be able to log in with registered user information

    Given :user goes to the "url"
    Given :user enters email address
    Given :user enters password
    Given :user clicks the login button

  Scenario:US_002 TC_001 The candidate must be added on the recruitment page, and the addition must be searched and verified

    Then  :user clicks on recruitment
    Given :click on the add button
    Given :the save process is performed with valid values
    Given :search is clicked on the candidate page
    Given :candidate registration must be verified
    Given :a screenshot of the candidate page is taken
    And :candidate page is closed









