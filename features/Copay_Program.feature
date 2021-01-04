Feature: Copay program enrollment feature

  @tag2
  Scenario: Test Copay enrollment scenario
    Given I open Pulmozyme site
    And click on Apply now
    And As a Patient I want to enroll
    And Clicks on next
    And Select not first time Pulmozyme user
    And Click on the next
    When I complete the eligibility QN
    And Click next
    Then I fillup the patient information
    And I fill up the Insurance information
    And I fill up Login information
    And click the next
    And fillup the doctor information
    And click on submit button
    And Confirm The Information
    And Click on check box
    And Click on Confirm button
