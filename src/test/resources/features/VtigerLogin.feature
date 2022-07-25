Feature: Validating Helpmate flows for Genpact Home page
   

@Regression   @Vtiger_1  @Tc_001
  Scenario: verify the Vtiger Login Page
    Given I navigate to application Open URL
    When  User Enter Username and Password by click on Login Button
    Then  User is in VtigerCRM Home Page
    And Login Sucessfully