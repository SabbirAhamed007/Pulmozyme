Feature: Test Copay LAP enrollment feature

  @tag3
  Scenario: LAP Copay enrollment scenario
    Given I open Pulmozyme site to enrolled
    And select apply now
    And Click on LAP
    And Choose not first time pulmozyme user
    When I complete eligibility QN
    And I fill up LAP info
    And I fill up Patient info
    And select USPS
    Then I fill up login info
    And I fill up doctor info
    And I confirm the info
    And I select the check box
    And click on confirm button