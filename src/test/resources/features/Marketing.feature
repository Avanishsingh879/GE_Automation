@Marketing
Feature: Validating Marketing in Vtiger
   
  
 
@smoke1 @Marketing @Marketing_TC001  
  Scenario: verify the Marketing functionlity 
  Given I navigate to application Open URL 
  When  User Enter Username and Password by click on Login Button
  Then  User is in VtigerCRM Page
  And  User has click on Marketing Page
  And  User has selected the appropriate From group by clicked on Add New Record button
 