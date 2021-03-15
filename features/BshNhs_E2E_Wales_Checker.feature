Feature: End to End Eligibility check for Wales

  This features deals with end to end wales eligibility check and get result of whether I will get help or Not

  Scenario: 1 - Wales End to End Eligibility check

    Given that I am on the Landing Page Using URL "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start"
    When I click on Start button
    And I click on Wales Radio button (Question  - Which country do you live in?)
    And I click on Next button
    And I enter Day as "07", Month as "01" and Year as "1996" (Question -  What is your date of birth?)
    And I click on Next button
    And I click on No Radio button (Question - Do you live with a partner?)
    And I click on Next button
    And I click on No Radio button (Question - Do you claim any benefits or tax credits?)
    And I click on Next button
    And I click on No Radio button (Question - Are you pregnant or have you given birth in the last twelve months?)
    And I click on Next button
    And I click on No Radio button (Question - Do you have an injury or illness caused by serving in the armed forces?)
    And I click on Next button
    And I click on No Radio button (Question - Do you have diabetes?)
    And I click on Next button
    And I click on No Radio button (Question - Do you have glaucoma?)
    And I click on Next button
    And I click on No Radio button (Question - Do you live permanently in a care home?)
    And I click on Next button
    And I click on Yes Radio button (Question - Do you have more than sixtheen thousand in savings, investments or property?)
    And I click on Next button
    Then I should get result "How to get your help"