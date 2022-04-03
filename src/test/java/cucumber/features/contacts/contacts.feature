Feature: Contacts page

  Scenario: Click submit button with empty fields
    When User click the Contact Us link
    When User click Submit button
    Then Alert Danger is shown


  Scenario: Click submit button with required fields filled
    When User click the Contact Us link
    When User elects Subject Heading Customer Service
    When User fills Email field
    When User fills Message Field
    When User click Submit Button
    Then Alert Success is shown