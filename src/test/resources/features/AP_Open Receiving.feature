@AP_OpenReceiving 
Feature: Validating AP Open Receiving in Sequence
   
  Background:
  Given User has launched the application
  
 
@smoke1 @RoleAllocation @AP_OpenReceiving_TC001  
  Scenario: verify the Role Allocation in Open Receiving 
  When User has clicked on New process in the Hot operations page
  Then User has searched for AP IE Role Allocation Dashboard by clicked on Start button
  And  User is in Role Allocation Dashboard page
  And  User has selected the appropriate From group by clicked on Add New Record button
  And  User has Add to Division and userID by click on Submit button 
  
 @smoke2 @TaskAllocation @AP_OpenReceiving_TC002  
  Scenario Outline: verify the Task Allocation in Open Receiving 
  When User has clicked on New process in the Hot operations page
  Then User has searched for AP IE Task Allocation Dashboard by clicked on Start button
  And  User is in Task Allocation Dashboard page
  And  User has selected the appropriate From Process Type click on Add New Record button
  And  Record add"<StoreNumber>" and Task allocated to the selected user by click on Add button 
  
  Examples:
  
  |StoreNumber|
  |8147|
    
@smoke1 @FlowTime @AP_OpenReceiving_TC003  
  Scenario: verify the FlowTime in Open Receiving 
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles 
  And  User has selected all Divisions from team dropdown
  And  User verify the columns displayed in the Hot Operations page 
  
@smoke1 @CaseAssignment @AP_OpenReceiving_TC004  
  Scenario: verify the Case Assignment in Open Receiving
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles 
  And  User has selected all Divisions from team dropdown
  And  User Select the three dots for any case ID and select an Associate name from the dropdown list by click on Save button
  
@smoke1 @HomeTab @AP_OpenReceiving_TC005  
  Scenario: Verify the UI contents displayed in the Home page 
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles 
  When list of cases are displayed for the User
  And  User has opened any case and fetched the task button
  
  
@smoke1 @Match_Reconcile @AP_OpenReceiving_TC006  
  Scenario: Verify the contents displayed in the match and reconcile page
  Then User is in the Hot operations page 
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles 
  And  list of cases are displayed for the Users
  And  User has opened any case id and fetched the tasks
  And  User is in Match and Reconcile page by click on Match and Reconcile tab 
  
@smoke1 @SearchforReceiver @AP_OpenReceiving_TC007  
  Scenario Outline: Verify the Search for Receiver in the match and reconcile page
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles 
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  User click on Search for Receiver button
  And  User has input data into all mandatory fields"<Store>","<FromDate>","<ToDate>","<VendorNumber>" and search results are displaying
  And  User select a Receipts detail and click on Add as Additional Receiver button
  And  User verify Receipts detail should get added and displayed in Recon Header of Match & Reconcile page
  
  Examples:
  
  |Store |FromDate  |ToDate    |VendorNumber|
  |5494  |11/05/2020|12/05/2020|382953      |
  
@smoke1 @IElookup @AP_OpenReceiving_TC008  
  Scenario Outline: Verify the IE lookup search in Tools Page 
  Then User is in the Hot operations page 
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  Tools dropdown is displayed for User
  And  User has clicked on Tools Dropdown and different options are displayed for user
  And  User has selected IE lookup option from dopdown list
  And  User Verify Input data in all mandatory Search Fields"<Store>","<FromDate>","<ToDate>"by click on search button
  And  User Verify the Search Results
  And  User is in IE lookup popup window
  
  Examples:
  
  |Store |FromDate |ToDate    |
  |5494  |9/25/2020|2/18/2021 |
  
@smoke1 @ORlookup @AP_OpenReceiving_TC009  
  Scenario Outline: Verify the OR lookup search in Tools Page 
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles 
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  Tools dropdown is displayed for User
  And  User has clicked on Tools Dropdown and different options are displayed for user
  And  User has selected OR lookup option from dopdown list
  And  User Verify Input data in all mandatory Search Field"<Store>","<FromDate>","<ToDate>"by click on search button
  And  User verify the ORlookup search Results
  And  User is in OR lookup popup window 
  
  Examples:
  
  |Store |FromDate  |ToDate    |
  |5214  |10/15/2020|3/31/2021 |
   
@smoke1 @SearchItem @AP_OpenReceiving_TC010  
  Scenario Outline: Verify the Search Item in Tools Page 
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles 
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  Tools dropdown is displayed for User
  And  User has clicked on Tools Dropdown and different options are displayed for user
  And  User has selected Search Item option from dopdown list
  And  User is in search Item popup window 
  And  User Verify Input data in all mandatory Search Field"<ItemNumber>","<UPC>"by click on search button
  And  User verify the search Results  
  
 Examples:
  
  |ItemNumber |UPC          |
  |9419733    |0000000004958|
    
@smoke1 @RetailCorrection @AP_OpenReceiving_TC011                                 
  Scenario Outline: Verify the Retail Correction Lookup in Tools Page 
  Then User is in the Hot operations page 
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  Tools dropdown is displayed for User
  And  User has clicked on Tools Dropdown and different options are displayed for user
  And  User has selected Retail Correction option from dopdown list
  And  User Verify Input data in all mandatory search fields"<Store>","<FromDate>","<ToDate>","<InvoiceNumber>" by click on search button
  And  User verify the Search results
  And  User is in Retail Correction popup window
  
  Examples:
  
  |Store |FromDate  |ToDate    |InvoiceNumber|
  |63    |6/1/2018  |8/1/2018  |000000000225541|
  
@smoke1 @PaymentHistory @AP_OpenReceiving_TC012                                 
  Scenario Outline: Verify the Payment History Lookup in Tools Page  
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  Tools dropdown is displayed for User
  And  User has clicked on Tools Dropdown and different options are displayed for user
  And  User has selected Payment History option from dopdown list
  And  User verify Input data in all mandatory search field"<Store>","<FromDate>","<ToDate>","<VendorNumber>" by click on search button
  And  User verify the search results
  And  User is in Payment History popup window 
  
  Examples:
  
  |Store |FromDate  |ToDate    |VendorNumber|
  |8011  |7/1/2020  |8/1/2020  |419005|
  
    
@smoke2 @updateReceipt @AP_OpenReceiving_TC013                                  
  Scenario Outline: Verify the update Receipt details 
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  User has added invoice"<Store>","<FromDate>","<ToDate>","<VendorNumber>" using search for invoice option 
  And  User has clicked on edit icon displayed in Receipt detail at REcon header
  And  User has clicked update type dropdown and selected Update Receipt option
  And  User has edited any of the values and click on update button
  And  User verify Update receipt details should be displayed in Shopping cart
  
  Examples:
  
  |Store |FromDate  |ToDate    |VendorNumber|
  |5494  |11/05/2020|12/05/2020|382953      | 
  
@smoke2 @MemoOut @AP_OpenReceiving_TC014                                  
  Scenario: Verify the Memo Out details 
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab 
  And  User has clicked on edit icon displayed in Receipt detail at REcon header
  And  User has Clicked update type dropdown and selected Memo Out option
  And  User Select appropriate reason from Memo Out Reason and input comments Click on Submit
  And  User click on Shopping Cart and verify for Memo out Receipt details 
  
@smoke1 @OpenReceivingsreport @AP_OpenReceiving_TC015                                   
  Scenario: Verify the Open Receivings reports 
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  User has click on Digi under reports column for receipt
  And  User selecting on Open Receivings report and Report should open in window 
  
@smoke1 @SearchforInvoice @AP_OpenReceiving_TC016                          
  Scenario Outline: Verify the Search for Invoice details in the match and reconcile page 
  Then User is in the Hot operations page 
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  User click on Search for Invoice tab
  And  User Verify Input Data in all Mandatory search field "<Store>","<FromDate>","<ToDate>","<VendorNumber>" by click on search button
  And  User Select a invoice detail and click on Add invoice button
  And  User verify the display of added invoice in recon header of match and reconcile page 
  
  Examples:
  
  |Store |FromDate  |ToDate    |VendorNumber|
  |5494  |11/05/2020|12/05/2020|382953      |
    
@smoke1 @RemoveAddedInvoices @AP_OpenReceiving_TC017                          
  Scenario Outline: Verify the Remove Added Invoices in the match and reconcile page 
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  User has added invoice"<Store>","<FromDate>","<ToDate>","<VendorNumber>"using search for Invoice option
  And  User has click on Remove Added Invoices tab
  And  User Verify the All added invoices should get deleted from the recon header grid 
  
  Examples:
  
  |Store |FromDate  |ToDate    |VendorNumber|
  |5494  |11/05/2020|12/05/2020|382953      |
     
@smoke2 @Addclaims @AP_OpenReceiving_TC018                            
  Scenario Outline: Verify the Add claims deatils in the shopping cart page
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  User has added Invoice"<Store>","<FromDate>","<ToDate>","<VendorNumber>"using search for invoice option
  And  User click on Action button for any of the recon lines in recon details grid
  And  User Select any of the claims in Add claim section and data will be prepopulated click on Insert button
  And  User click on done button in Add item transaction popover
  And  User Verify Added claims should be displayed in claims section in the shopping cart page
  
  Examples:
  
  |Store |FromDate  |ToDate    |VendorNumber|
  |5494  |11/05/2020|12/05/2020|382953      |
  
@smoke2 @Shoppingcart @AP_OpenReceiving_TC019                              
  Scenario Outline: Verify the UI contents displayed in the shopping cart page 
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  User has added Invoice"<Store>","<FromDate>","<ToDate>","<VendorNumber>"using Search for invoice option
  And  User has added any Claims or Update receipt or Create receipt or Memo out
  And  User has clicked on Shopping cart tab and user is in shopping cart page
  
  Examples:
  
  |Store |FromDate  |ToDate    |VendorNumber|
  |5494  |11/05/2020|12/05/2020|382953      |
   
@smoke2 @ShoppingCartReview @AP_OpenReceiving_TC020                        
  Scenario Outline: Verify the Shopping Cart_Review 
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  User has added Invoice"<Store>","<FromDate>","<ToDate>","<VendorNumber>"Using Search for Invoice option
  And  User has added any claims and Update receipt and Create receipt and Memo out
  And  User is in Shopping Cart and Open to Pay is zero by click on Review button
  And  User select Appropriate action type and disposition code and click on submit button
  And  Reconcile popover should be displayed for the user
  
  Examples:
  
  |Store |FromDate  |ToDate    |VendorNumber|
  |5494  |11/05/2020|12/05/2020|382953      |
  
@smoke2 @Startover @AP_OpenReceiving_TC021                                 
  Scenario Outline: Verify the Start over button in the match and reconcile page
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles 
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  User has added Invoice"<Store>","<FromDate>","<ToDate>","<VendorNumber>"Using search for invoice options
  And  User has added any claims or Update receipt or Create receipt or Memo out
  And  User has click on Start over button
  And  User Verify the All added invoices and receipts should get deleted from the recon header grids
  
  Examples:
  
  |Store |FromDate  |ToDate    |VendorNumber|
  |5494  |11/05/2020|12/05/2020|382953      |
  
@smoke1 @DocumentsTab @AP_OpenReceiving_TC022                          
  Scenario Outline: Verify the UI contents displayed in the Documents page 
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles
  And  User has opened any case and fetched the task
  And  User has click on Match & Reconcile tab
  And  User has added Invoice"<Store>","<FromDate>","<ToDate>","<VendorNumber>"using search for invoice Options
  And  User has clicked on Documents tab and user is in Documents page 
  And  User verify the UI Contents in Documents page
  
  Examples:
  
  |Store |FromDate  |ToDate    |VendorNumber|
  |5494  |11/05/2020|12/05/2020|382953      | 
  
@smoke1 @ReportsTab @AP_OpenReceiving_TC023                        
  Scenario Outline: Verify the Reports tab deatils
  Then User is in the Hot operations page
  And  User has selected AP Open receiving from Solution dropdown and selected Team Leader roles
  And  User has click on any case ID
  And  user has clicked on Reports tab and user is in Reports page
  And  User verify input data in all mandatory search fields by click on search Button "<Stores>","<ReportName>","<FolderName>"
  And  Reports should be displayed for the user based on search criteria
  
  Examples:
  
  |Stores|ReportName|FolderName|
  |1194  |Shipper   |Office    |
  
@smoke2 @CorrectionsClaimPayback @AP_OpenReceiving_TC024  
  Scenario Outline: verify the Claim Payback details
  Given User Navigate to application URL
  Then User is in the Hot operations page 
  When User has clicked on New process in the Hot operations page
  Then User has searched for AP IE Corrections master workflow by clicked on Start button of AP IE Corrections master 
  And  User is in Corrections page and user has selected the Claim payback Payback Reversal option from Correction Type dropdown 
  And  User has searched for the invoices in Search for invoice section "<Country>","<Store>","<FromDate>","<ToDate>","<VendorNumber>","<InvoiceNumber>"         
  And  Searched invoices are displayed for the user based on the search criteria
  And  User has selected an invoice and user has selected any claim line in claim payback grid
  And  User click on checkbox displayed against any claim line in claim lines to reverse grid and click on Submit button
  
  
  Examples:
  
  |Country|Store|FromDate |ToDate  |VendorNumber|InvoiceNumber|
  |US     |5214 |2/10/2020|4/1/2020|175000960|000000001555474 |
  
@smoke1 @DepartmentCorrection @AP_OpenReceiving_TC025  
  Scenario Outline: verify the Department Correction details
  Given User Navigate to application URL
  Then User is in the Hot operations page 
  When User has clicked on New process in the Hot operations page
  Then User has searched for AP IE Corrections master workflow by clicked on Start button of AP IE Corrections master 
  And  User is in Corrections page and user has selected the Department Correction option from Correction Type dropdown 
  And  User has searched for the invoices in Search for invoice Section "<Country>","<Store>","<FromDate>","<ToDate>","<VendorNumber>"
  And  Ensure searched invoices are displayed for the user based on the search criteria
  And User click on checkbox displayed against any invoice in Select invoice to Correct grid
  And User verify input data in all mandatory fields by click on Submit Button
  
  Examples:
  
  |Country|Store|FromDate|ToDate|VendorNumber|
  |US     |5214 |6/1/2020|7/1/2020|449541960 |
  
@smoke1 @Corrections_MemoOutReceipt @AP_OpenReceiving_TC026  
  Scenario Outline: verify the MemoOutReceipt details
  Given User Navigate to application URL
  Then User is in the Hot operations page 
  When User has clicked on New process in the Hot operations page
  Then User has searched for AP IE Corrections master workflow by clicked on Start button of AP IE Corrections master 
  And  User is in Corrections page and user has selected the Memo-Out Receipt option from Correction Type dropdown 
  And  User has searched for the Receipts in Search for Receipt by section "<Country>","<Store>","<FromDate>","<ToDate>","<VendorNumber>"
  And  User click on checkbox displayed against any receipt in Select receipt to Correct grid 
  And  user verify the memo control displayed is matching with the receipt control by click on Submit button
  
  Examples:
  
  |Country|Store|FromDate|ToDate|VendorNumber|
  |US     |5214 |6/1/2020|7/1/2020|449541 |
  
@smoke1 @Corrections_RetailCorrection @AP_OpenReceiving_TC027 
  Scenario Outline: verify the Retail Correction details
  Given User Navigate to application URL
  Then User is in the Hot operations page 
  When User has clicked on New process in the Hot operations page
  Then User has searched for AP IE Corrections master workflow by clicked on Start button of AP IE Corrections master 
  And  User is in Corrections page and user has selected the Retail Correction option from Correction Type dropdown 
  And  User has searched for the invoices in Search for Invoice section "<Country>","<Store>","<FromDate>","<ToDate>","<VendorNumber>"
  And User click on checkbox displayed against any invoice in Select invoice to Correct grids
  And User verify input data in all mandatory fields by click on Submit Buttons
  
  Examples:
  
  |Country|Store|FromDate|ToDate|VendorNumber|
  |US     |5214 |6/1/2020|7/1/2020|449541960 |
  
@smoke1 @Corrections_Createclaims @AP_OpenReceiving_TC028  
  Scenario Outline: verify the Create claims details
  Given User Navigate to application URL
  Then User is in the Hot operations page 
  When User has clicked on New process in the Hot operations page
  Then User has searched for AP IE Corrections master workflow by clicked on Start button of AP IE Corrections master 
  And User is in Corrections page and user has selected the Create claims option from Correction Type dropdown 
  And User has searched for the Invoices in Search for invoice section "<Country>","<Store>","<FromDate>","<ToDate>","<VendorNumber>"
  And User click on checkbox displayed against any invoice in Select invoice to Correct Grid
  And User Select a invoice detail to create claim with Input data in to all mandatory by click on Submit buttons 
  
   Examples:
  
  |Country|Store|FromDate|ToDate|VendorNumber|
  |US     |5214 |6/1/2020|7/1/2020|449541960 |
  
@smoke2 @Corrections_CreateReceiptbyReceiver @AP_OpenReceiving_TC029  
  Scenario Outline: verify the CreateReceiptbyReceiver details
  Given User Navigate to application URL
  Then User is in the Hot operations page 
  When User has clicked on New process in the Hot operations page
  Then User has searched for AP IE Corrections master workflow by clicked on Start button of AP IE Corrections master 
  And  User is in Corrections page and user has selected the Create receipt by receiver option from Correction Type dropdown 
  And  User has searched for the Receipt in search for Receipt by Section "<Country>","<Store>","<FromDate>","<ToDate>","<VendorNumber>"
  And  User click on checkbox displayed against any Receipt in Select receipt to correct grid 
  And  User Select a receipt detail to create receipt with Input data in to all mandatory by click on Submit buttons 
  
  Examples:
  
  |Country|Store|FromDate|ToDate|VendorNumber|
  |US     |5214 |6/1/2020|7/1/2020|449541    |
  
@smoke2 @VendorCompliance @AP_OpenReceiving_TC030
  Scenario Outline: verify the Vendor Compliance in Open Receiving 
  When User has clicked on New process button in the Hot operations page
  Then User has searched for Vendor Compliance and clicked on Start button
  And  User has click on Create issue plus button
  And  User verify create issue popup window is displayed with all fields 
  And  User verify Input data into all mandatory fields and click on submit button "<IssueTitle>","<Description>","<FromDate>","<ToDate>","<Department>","<Vendor>"        
  And  User verify Vendor compliance issue should get created and displayed in Vendor Compliance page
  
  Examples:
  
  |IssueTitle   |Description|FromDate|ToDate   |Department|Vendor|
  |Create Issue |Test       |3/2/2021|31/3/2021|  50      |547082| 
  
  
  
  
  
  
  
  