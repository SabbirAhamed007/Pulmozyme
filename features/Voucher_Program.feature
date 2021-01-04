Feature: Voucher Program enrollment feature

  @tag1
  Scenario: Enrollment scenario
    Given I open chrome browser
    And I type pulmozymesupport page
    And I click on Appply now
    And I select I am a patient
    And I click next
    And I select first time taking Pulmozyme voucher & click next button
    And I select the valid Eligibility answare & click next
    When I fillup the Patient information
    And I fillup the Insurance info
    And I fillup the doctors info
    Then I click on submit button
    And I verify Confirm The Information page
    And I click on check box & click on confirm button
