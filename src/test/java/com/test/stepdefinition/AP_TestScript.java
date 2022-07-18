package com.test.stepdefinition;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.automation.AutomationLibrary.ui.BrowserLibrary;
import com.automation.AutomationLibrary.ui.ElementLibrary;
import com.automation.AutomationLibrary.ui.PageLibrary;
import com.automation.AutomationLibrary.ui.WebdriverService;
import com.automation.AutomationLibrary.ui.config.IdentifyBy;
import com.automation.AutomationLibrary.ui.config.UIElement;
import com.genpact.util.EnvironmentConfig;
import com.test.runner.BaseRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AP_TestScript extends BaseRunner {
	
	
	
	
	
	
/*-------------------------------------------Start of Login Elements-----------------------------------------------*/
	
	private UIElement hotOperations = new UIElement("HotOperations", IdentifyBy.XPATH, "//*[@title='Hot Operations']");
	private UIElement solution_Links = new UIElement("Solution_Links", IdentifyBy.XPATH, "//span[@class='k-icon k-i-arrow-s']");
	private UIElement selectAllItems = new UIElement("SelectAllItems", IdentifyBy.XPATH, "//*[@id='selectAllItems']");
	private UIElement teamLeaderLink = new UIElement("TeamLeaderLink", IdentifyBy.XPATH, "//*[@id='ctl00_Content_TeamLeaderLink']");
	private UIElement filterbtn = new UIElement("Filterbtn", IdentifyBy.XPATH, "//button[@class='k-button k-primary'][contains(.,'Filter')]");
	private UIElement matchandReconciletab = new UIElement("MatchandReconciletab", IdentifyBy.XPATH, "//span[@class='rtsTxt'][contains(.,'Match and Reconcile')]");
	private UIElement newProcess_tab = new UIElement("NewProcess_tab", IdentifyBy.XPATH, "//*[@title='New Process']");
	private UIElement find_newProcess = new UIElement("Find_newProcess", IdentifyBy.XPATH, "//*[@id='searchProcessInput']");
	private UIElement start_newProcess = new UIElement("Start_newProcess", IdentifyBy.XPATH, "//span[contains(text(),'Start')]");
	/*-------------------------------------------Start of AP OR Elements-------------------------------------------------*/
	private UIElement roleAllocationDashboard = new UIElement("RoleAllocationDashboard", IdentifyBy.XPATH, "//h2[text()='Role Allocation Dashboard']");
	private UIElement selectTask_Group = new UIElement("SelectTask_Group", IdentifyBy.XPATH, "//*[contains(@id,'cbSOEADGroups_Arrow')][text()='select']");
	private UIElement addnewrecord = new UIElement("Addnewrecord", IdentifyBy.XPATH, "//*[@title='Add new record']");
	private UIElement addNewRecord_DropdownBtn = new UIElement("AddNewRecord_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'cbAllocationGroups_Arrow')][text()='select']");
	private UIElement user = new UIElement("User", IdentifyBy.XPATH, "//*[contains(@id,'cbEmployeesDelta_Arrow')][text()='select']");
	private UIElement submit_RoleAllocation = new UIElement("Submit_RoleAllocation", IdentifyBy.XPATH, "//*[@id='ctl00_ctl05_fvlc_Form1_ctl05'][contains(.,'Submit')]");
	private UIElement taskAllocationDashboard = new UIElement("TaskAllocationDashboard", IdentifyBy.XPATH, "//h2[text()='Task Allocation Dashboard ']");
	private UIElement processType = new UIElement("ProcessType", IdentifyBy.XPATH, "//*[contains(@id,'cboTask_Arrow')][text()='select']");
	private UIElement addRecord_Task = new UIElement("AddRecord_Task", IdentifyBy.XPATH, "//*[contains(@id,'btnAddNewRecordOR')][@value='+ Add Record']");
	private UIElement select_Country = new UIElement("Select_Country", IdentifyBy.XPATH, "//*[contains(@id,'cboCountries_Arrow')][text()='select']");
	private UIElement select_Division = new UIElement("Select_Division", IdentifyBy.XPATH, "//*[contains(@id,'cboDivisions_Arrow')][text()='select']");
	private UIElement select_StoreNumber = new UIElement("Select_StoreNumber", IdentifyBy.XPATH, "//*[contains(@id,'locationNumberTextBox')][@class='riTextBox riEnabled']");
	private UIElement select_Associate = new UIElement("Select_Associate", IdentifyBy.XPATH, "//*[contains(@id,'cboStoreAssociates_Arrow')][text()='select']");
	private UIElement add_TaskBtn = new UIElement("add_TaskBtn", IdentifyBy.XPATH, "//*[contains(@id,'btnUpdateGridItemVisible')][@value='Add']");
	private UIElement isUserWritable= new UIElement("IsUserWritable", IdentifyBy.XPATH, "//*[@id='ctl00_ctl05_fvlc_fvsvStoresOR_grdORStores_ctl00_ctl02_ctl04_chkIsUserWritableForStores']");
	private UIElement requiresReview = new UIElement("RequiresReview", IdentifyBy.XPATH, "//*[@id='ctl00_ctl05_fvlc_fvsvStoresOR_grdORStores_ctl00_ctl02_ctl04_chkReconReviewForSotres']");
	private UIElement aPOpenReceiving = new UIElement("APOpenReceiving", IdentifyBy.XPATH, "//*[@title='AP Open Receiving']");
	private UIElement reassignTaskToEmployee = new UIElement("ReassignTaskToEmployee", IdentifyBy.XPATH, "//*[@id='ReassignTaskToEmployee']");
	private UIElement returnTask_Btn = new UIElement("ReturnTask_Btn", IdentifyBy.XPATH, "//*[@id='ReturnActivityInstance']");
	private UIElement select_reassignTaskToEmployee = new UIElement("Select_reassignTaskToEmployee", IdentifyBy.XPATH, "//select[@id='reassignSelect']");
	private UIElement save_reassignTaskToEmployee = new UIElement("Save_reassignTaskToEmployee", IdentifyBy.XPATH, "//button[@id='actionButton']");
	private UIElement openCaseID1 = new UIElement("OpenCaseID1", IdentifyBy.XPATH, "//table[@role='grid']/tbody/tr[4]/td[2]");
	private UIElement openCaseID = new UIElement("OpenCaseID", IdentifyBy.XPATH, "//table[@role='grid']/tbody/tr[4]/td[2]");
	private UIElement returnTask = new UIElement("ReturnTask", IdentifyBy.XPATH, "//*[@title='Return Task']");
	private UIElement fetchTask = new UIElement("FetchTask", IdentifyBy.XPATH, "//*[@title='Fetch Task']");
	private UIElement showMoreDetails = new UIElement("ShowMoreDetails", IdentifyBy.XPATH, "//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEHomeTab_fv_frmIEHome_lblWHShowHide'][contains(.,'Show More Details')]");
	private UIElement tools = new UIElement("Tools", IdentifyBy.XPATH, "//ul[@class='rmRootGroup rmToggleHandles rmHorizontal']/li/a/span[1]");
	private UIElement IELookup = new UIElement("Tools", IdentifyBy.XPATH, "//button[@value='IE LookUp']");
	private UIElement invoiceNumber = new UIElement("InvoiceNumber", IdentifyBy.XPATH, "//input[@class='riTextBox riEnabled'][@value='0']");
	private UIElement pO_Number = new UIElement("PO_Number", IdentifyBy.XPATH, "//*[contains(@id,'Form1_txtPONumber')][@class='riTextBox riEnabled']");
	private UIElement vender_Number = new UIElement("Vender_Number", IdentifyBy.XPATH, "//*[contains(@id,'Form1_txtVendorNumber')][@class='riTextBox riEnabled']");
	private UIElement division_Number = new UIElement("Division_Number", IdentifyBy.XPATH, "//*[contains(@id,'Form1_txtDivision')][@class='riTextBox riEnabled']");
	private UIElement department_Number = new UIElement("Department_Number", IdentifyBy.XPATH, "//*[contains(@id,'Form1_txtDept')][@class='riTextBox riEnabled']");
	private UIElement vendorName = new UIElement("VendorName", IdentifyBy.XPATH, "//*[@id='ctl00_ctl05_fvlc_fvStorePaidReceipt_Form1_txtVendorName']");
	private UIElement iE_btnSearch = new UIElement("IE_btnSearch", IdentifyBy.XPATH, "//*[contains(@id,'Form1_btnORLookUpSearch')][@value='Search']");
	private UIElement iElookup_fromDate = new UIElement("Orlookup_fromDate", IdentifyBy.XPATH, "//*[contains(@id,'Form1_dtFrom_dateInput')][@class='riTextBox riEnabled']");
	private UIElement iElookup_ToDate = new UIElement("Orlookup_ToDate", IdentifyBy.XPATH, "//*[contains(@id,'Form1_dtTo_dateInput')][@class='riTextBox riEnabled']");
	private UIElement iElookup_Store = new UIElement("Orlookup_Store", IdentifyBy.XPATH, "//*[contains(@id,'Form1_txtStoreNumber')][@class='riTextBox riEnabled']");
	//a[contains(text(),'2374')]
	/*-------------------------------------------Start of ORLookup Elements-------------------------------------------------*/
	private UIElement oRLookup = new UIElement("ORLookup", IdentifyBy.XPATH, "//button[@value='OR LookUp']");
	private UIElement orlookup_fromDate = new UIElement("Orlookup_fromDate", IdentifyBy.XPATH, "//*[contains(@id,'Form1_dtFrom_dateInput')][@class='riTextBox riEnabled']");
	private UIElement orlookup_ToDate = new UIElement("Orlookup_ToDate", IdentifyBy.XPATH, "//*[contains(@id,'Form1_dtTo_dateInput')][@class='riTextBox riEnabled']");
	private UIElement orlookup_Store = new UIElement("Orlookup_Store", IdentifyBy.XPATH, "//*[contains(@id,'Form1_txtStoreNumber')][@class='riTextBox riEnabled']");
	private UIElement oR_invoiceNumber = new UIElement("OR_invoiceNumber", IdentifyBy.XPATH, "//*[@id='ctl00_ctl05_fvlc_fvStorePaidReceipt_Form1_txtInvoiceNumber']");
	private UIElement or_PONumber = new UIElement("Or_PONumber", IdentifyBy.XPATH, "//*[@id='ctl00_ctl05_fvlc_fvStorePaidReceipt_Form1_txtPONumber']");
	private UIElement or_venderNumber = new UIElement("Or_venderNumber", IdentifyBy.XPATH, "//*[contains(@id,'Form1_txtVendorNumber')][@class='riTextBox riEnabled']");
	private UIElement or_Dept = new UIElement("Or_Dept", IdentifyBy.XPATH, "//*[@id='ctl00_ctl05_fvlc_fvStorePaidReceipt_Form1_txtDept']");
	private UIElement or_ReceiptNumber = new UIElement("Or_ReceiptNumber", IdentifyBy.XPATH, "//*[@id='ctl00_ctl05_fvlc_fvStorePaidReceipt_Form1_txtReceivers']");
	private UIElement or_vendorName = new UIElement("or_vendorName", IdentifyBy.XPATH, "//*[@id='ctl00_ctl05_fvlc_fvStorePaidReceipt_Form1_txtVendorName']");
	private UIElement or_LookupbtnSearch = new UIElement("or_LookupbtnSearch", IdentifyBy.XPATH, "//*[contains(@id,'Form1_btnORLookUpSearch')][@value='Search']");
	
	/*-------------------------------------------Start of ItemSearch Elements-------------------------------------------------*/
	private UIElement or_searchItem = new UIElement("Or_searchItem", IdentifyBy.XPATH, "//button[@value='Search Item']");
	private UIElement Btn_item = new UIElement("btn_item", IdentifyBy.XPATH, "//*[contains(@id,'fvCreateReceipt_frmCreateReceipt_txtItemNumber')][@class='riTextBox riEnabled']");
	private UIElement ItembtnSearch = new UIElement("ItemBtnSearch", IdentifyBy.XPATH, "//*[contains(@id,'frmCreateReceipt_btnSearchItem')][@value='Search']");
	private UIElement uPC_Number = new UIElement("UPC_Number", IdentifyBy.XPATH, "//*[contains(@id,'txtItemUpc')][@class='riTextBox riEnabled']");
	/*-------------------------------------------Start of ItemSearch Elements-------------------------------------------------*/
	private UIElement retailCorrection = new UIElement("RetailCorrection", IdentifyBy.XPATH, "//button[@value='Retail Correction']");
	private UIElement country_RetailDropdownBtn = new UIElement("Country_RetailDropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'Form1_txtCountry_Arrow')][text()='select']");
	private UIElement retail_Search = new UIElement("Retail_Search", IdentifyBy.XPATH, "//*[contains(@id,'btnRetailCorrectionSearch')][@value='Search']");
	private UIElement paymentHistory = new UIElement("PaymentHistory", IdentifyBy.XPATH, "//button[@value='Payment History']");
	private UIElement payment_SearchBtn = new UIElement("Payment_SearchBtn", IdentifyBy.XPATH, "//*[contains(@id,'btnPaymentHistorySearch')][@value='Search']");
	private UIElement payment_DropdownBtn = new UIElement("Payment_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'Form1_txtCountry_Arrow')][text()='select']");
	/*-------------------------------------------Start of searchforInvoice Elements-------------------------------------------------*/
	private UIElement searchforInvoice = new UIElement("SearchforInvoice", IdentifyBy.XPATH, "//button[@value='Search for Invoice']");
	private UIElement searchforInvoice_Div = new UIElement("SearchforInvoice_Div", IdentifyBy.XPATH, "//*[contains(@id,'txtDivInvoice')][@class='riTextBox riEnabled']");
	private UIElement searchforInvoice_Dept = new UIElement("SearchforInvoice_Dept", IdentifyBy.XPATH, "//*[contains(@id,'txtDeptInvoice')][@class='riTextBox riEnabled']");
	private UIElement searchforInvoice_SearchBtn = new UIElement("SearchforInvoice_SearchBtn", IdentifyBy.XPATH, "//*[contains(@id,'btnInvoiceSearch')][@value='Search']");
	private UIElement searchforReciver_SearchBtn = new UIElement("SearchforInvoice_SearchBtn", IdentifyBy.XPATH, "//*[contains(@id,'btnReceiptsSearch')][@value='Search']");
	private UIElement addInvoiceBtn = new UIElement("AddInvoiceBtn", IdentifyBy.XPATH, "//*[contains(@id,'btnCustomSearchAddInvoice')][@value='+  Add Invoice']");
	private UIElement searchforInvoice_PONumber = new UIElement("SearchforInvoice_PONumber", IdentifyBy.XPATH, "//*[contains(@id,'txtPONumberInvoice')][@class='riTextBox riEnabled']");
	/*-------------------------------------------Start of searchforRecvier Elements-------------------------------------------------*/
	private UIElement searchforReceiver_StoreNumber = new UIElement("SearchforReceiver_StoreNumber", IdentifyBy.XPATH, "//*[contains(@id,'txtStoreNumber')][@class='riTextBox riEnabled']");
	private UIElement searchforReceiver_FromDate = new UIElement("SearchforReceiver_FromDate", IdentifyBy.XPATH, "//*[contains(@id,'dtFrom_dateInput')][@class='riTextBox riEnabled']");
	private UIElement searchforReceiver_ToDate = new UIElement("SearchforReceiver_ToDate", IdentifyBy.XPATH, "//*[contains(@id,'Form1_dtTo_dateInput')][@class='riTextBox riEnabled']");
	private UIElement searchforReceiver_PONumber = new UIElement("SearchforReceiver_PONumber", IdentifyBy.XPATH, "//*[contains(@id,'Form1_txtPONumber')][@class='riTextBox riEnabled']");
	private UIElement searchforReceiver_VendorNumber = new UIElement("SearchforReceiver_VendorNumber", IdentifyBy.XPATH, "//*[contains(@id,'Form1_txtVendorNumber')][@class='riTextBox riEnabled']");
	/*-------------------------------------------Start of DigiReport Elements-------------------------------------------------*/
	//private UIElement edit_Recipt2 = new UIElement("Edit_Recipt2", IdentifyBy.XPATH, "//input[contains(@id,'gbcEditReceipt')]//preceding-sibling::tr[contains(@id,'frmCreateReceipt_fvsbReconView_frmRecon_grd_Recon')]/td");
	//ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEMRTab_fvSubView1_frmCreateReceipt_fvsbReconView_frmRecon_grd_Recon_ctl00__0
	private UIElement edit_Recipt2 = new UIElement("Edit_Recipt2", IdentifyBy.XPATH, ".//preceding-sibling::div[@class='RadGrid RadGrid_Cora sq8w_grdReconciliation']/table/tbody/tr[1]/td[10]/input");
	private UIElement update_DropdownBtn = new UIElement("Update_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'cbUpdateType_Arrow')][text()='select']");
	private UIElement txtRetail = new UIElement("TxtRetail", IdentifyBy.XPATH, "//input[contains(@id,'fvUpdateReceipt_frmReceipt_txtRetail')][@class='riTextBox riNegative']");
	
	private UIElement updateRecipt_btn = new UIElement("UpdateRecipt_btn", IdentifyBy.XPATH, "//*[contains(@id,'SubmitButton1')][@value='Update']");
	private UIElement shoppingCart = new UIElement("ShoppingCart", IdentifyBy.XPATH, "//span[@class='rtsTxt'][contains(.,'Shopping Cart')]");
	private UIElement memoOut_DropdownBtn = new UIElement("MemoOut_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'cbUpdateType_Arrow')][text()='select']");
	private UIElement submit_memoOutBtn = new UIElement("Submit_memoOutBtn", IdentifyBy.XPATH, "//*[contains(@id,'btnSubmitmemo')][@value='Submit']");
	private UIElement memooutReason_DropdownBtn = new UIElement("MemooutReason_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'cboReason_Arrow')][text()='select']");
	private UIElement yes_memoout = new UIElement("Yes_memoout", IdentifyBy.XPATH, "//span[text()='Yes']");
	private UIElement digiReports_hyperlinks = new UIElement("DigiReports_hyperlinks", IdentifyBy.XPATH, "//*[@id='digireports']");
	private UIElement shopingcart_Claims = new UIElement("Shopingcart_Claims", IdentifyBy.XPATH, "//h2[text()='Claims']");
	private UIElement shopingcart_Receipts = new UIElement("Shopingcart_Receipts", IdentifyBy.XPATH, "//h2[text()='Receipts']");
	private UIElement shopingcart_Correction = new UIElement("Shopingcart_Correction", IdentifyBy.XPATH, "//h2[text()='Correction']");
	private UIElement removeAddedInvoices = new UIElement("RemoveAddedInvoices", IdentifyBy.XPATH, "//span[@class='rbText'][contains(.,'Remove Added Invoices')]");
	private UIElement yes_removeAddedInvoices = new UIElement("Yes_removeAddedInvoices", IdentifyBy.XPATH, "//span[text()='OK']");
	private UIElement startOver = new UIElement("StartOver", IdentifyBy.XPATH, "//span[@class='rbText'][contains(.,'Start Over')]");
	private UIElement yes_ClickStarover = new UIElement("Yes_ClickStarover", IdentifyBy.XPATH, "//span[text()='OK']");
	private UIElement reason_AddClaims = new UIElement("Reason_AddClaims", IdentifyBy.XPATH, "//*[contains(@id,'rblClaimTypeCode_Arrow')][text()='select']");
	private UIElement insert_AddClaims = new UIElement("insert_AddClaims", IdentifyBy.XPATH, "//span[text()='Insert']");
	private UIElement done_AddClaims = new UIElement("Done_AddClaims", IdentifyBy.XPATH, "//*[contains(@id,'btnDone')][@value='Done']");
	private UIElement substOverage_Highlight = new UIElement("SubstOverage_Highlight", IdentifyBy.XPATH, "//table//*[contains(@id,'fvlc_frmInvoiceException_fvsvIETabs_fvsvIEShoppingCartTab_fvsvShoppingCart_fv_grdShoppingCartHeader')]/tbody/tr[1]/td[2]");
	private UIElement claims_DropdownBtn = new UIElement("Claims_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'GECBtnExpandColumn')][@class='rgExpand']");
	private UIElement searchforReceiver_Btn = new UIElement("SearchforReceiver_Btn", IdentifyBy.XPATH, "//*[contains(@id,'btnSearchReceipt')][@value='Search for Receiver']");
	private UIElement additionalReceiverBtn = new UIElement("AdditionalReceiverBtn", IdentifyBy.XPATH, "//*[contains(@id,'btnAddAdditionalReceiverCustom')][@value='Add as Additional Receiver']");
	private UIElement documents = new UIElement("Documents", IdentifyBy.XPATH, "//span[@class='rtsTxt'][contains(.,'Documents')]");
	private UIElement usefulLinks = new UIElement("usefulLinks", IdentifyBy.XPATH, "//h2[text()='Useful Links']");
	private UIElement reports_Store = new UIElement("reports_Store", IdentifyBy.XPATH, "//*[contains(@id,'txtDigiStore')][@class='riTextBox riEnabled']");
	private UIElement reports_Fromdate = new UIElement("Reports_Fromdate", IdentifyBy.XPATH, "//*[contains(@id,'dtFromDigiReport_dateInput')][@class='riTextBox riEnabled']");
	private UIElement reports = new UIElement("Reports", IdentifyBy.XPATH, "//span[@class='rtsTxt'][contains(.,'Reports')]");
	private UIElement reports_Todate = new UIElement("Reports_Todate", IdentifyBy.XPATH, "//*[contains(@id,'dtToDigiReport_dateInput')][@class='riTextBox riEnabled']");
	private UIElement reports_ReportName = new UIElement("reports_ReportName", IdentifyBy.XPATH, "//*[contains(@id,'txtReportNameDigi')][@class='riTextBox riEnabled']");
	private UIElement reports_FolderDropdownBtn = new UIElement("Reports_FolderDropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'ddlFolderDigi_Arrow')][text()='select']");
	private UIElement reports_SearchBtn = new UIElement("Reports_SearchBtn", IdentifyBy.XPATH, "//*[contains(@id,'digiSearchDetailsForm_btnSearchApTracking')][@value='Search']");
	private UIElement oR_Corrections_DropdownBtn = new UIElement("OR_Corrections_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'ddlCorrection_Arrow')][text()='select']");
	private UIElement oR_USNumber = new UIElement("OR_USNumber", IdentifyBy.XPATH, "//*[contains(@id,'InvoiceSearch_txtCountry')][@class='riTextBox riEnabled']");
	private UIElement oR_StoreNumber = new UIElement("OR_StoreNumber", IdentifyBy.XPATH, "//*[contains(@id,'txtInvoiceStore')][@class='riTextBox riEnabled']");
	private UIElement oR_FromDate = new UIElement("OR_FromDate", IdentifyBy.XPATH, "//*[contains(@id,'dtFromInvoice_dateInput')][@class='riTextBox riEnabled']");
	private UIElement oR_ToDate = new UIElement("OR_ToDate", IdentifyBy.XPATH, "//*[contains(@id,'dtToInvoice_dateInput')][@class='riTextBox riEnabled']");
	private UIElement oR_VendorNumber = new UIElement("OR_VendorNumber", IdentifyBy.XPATH, "//*[contains(@id,'txtVendorNumberInvoice')][@class='riTextBox riEnabled']");
	private UIElement oR_CorrectionsSearchBtn = new UIElement("OR_CorrectionsSearchBtn", IdentifyBy.XPATH, "//*[contains(@id,'btnInvoiceSearch')][@value='Search']");
	private UIElement oR_CorrectionsSubmitBtn = new UIElement("OR_CorrectionsSubmitBtn", IdentifyBy.XPATH, "//*[contains(@id,'btnSubmitDepartment')][@value='Submit']");
	private UIElement oR_FromCost = new UIElement("OR_FromCost", IdentifyBy.XPATH, "//*[contains(@id,'DepartmentCorrection_Form1_txt_FromCost')][@class='riTextBox riEnabled']");
	private UIElement oK_Retail = new UIElement("OK_Retail", IdentifyBy.XPATH, "//span[text()='OK']");
	private UIElement createClaim_DropdownBtn = new UIElement("CreateClaim_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'claimTypeCode_Arrow')][text()='select']");
	private UIElement createClaimSubmitBtn = new UIElement("CreateClaimSubmitBtn", IdentifyBy.XPATH, "//*[contains(@id,'btnCreateClaim')][@class='RadButton rbPrimaryButton RadButton_Cora rbButton rbRounded rbIconButton']");
	private UIElement memoOutReceipt_USNumber = new UIElement("MemoOutReceipt_USNumber", IdentifyBy.XPATH, "//*[contains(@id,'txtCountry_ReceiptSearch')][@class='riTextBox riEnabled']");
	private UIElement memoOutReceipt_StoreNumber = new UIElement("MemoOutReceipt_StoreNumber", IdentifyBy.XPATH, "//*[contains(@id,'ReceiptSearch_txtStoreNumber')][@class='riTextBox riEnabled']");
	private UIElement memoOutReceipt_FromDate = new UIElement("MemoOutReceipt_FromDate", IdentifyBy.XPATH, "//*[contains(@id,'ReceiptSearch_dtFrom_dateInput')][@class='riTextBox riEnabled']");
	private UIElement memoOutReceipt_ToDate = new UIElement("MemoOutReceipt_ToDate", IdentifyBy.XPATH, "//*[contains(@id,'ReceiptSearch_dtTo_dateInput')][@class='riTextBox riEnabled']");
	private UIElement memoOut_VendorNumber = new UIElement("MemoOut_VendorNumber", IdentifyBy.XPATH, "//*[contains(@id,'ReceiptSearch_txtVendorNumber')][@class='riTextBox riEnabled']");
	private UIElement memoOut_searchforReceiver_Btn = new UIElement("SearchforReceiver_Btn", IdentifyBy.XPATH, "//*[contains(@id,'ReceiptSearch_btnReceiptsSearch')][@value='Search']");
	private UIElement controlNbr_memoOut = new UIElement("ControlNbr_memoOut", IdentifyBy.XPATH, "//*[contains(@id,'MemoOutCorrectionConfirm_txt_memoNew')][@class='riTextBox riEnabled']");
	private UIElement createReceipt_SubmitBtn = new UIElement("CreateReceipt_SubmitBtn", IdentifyBy.XPATH, "//*[contains(@id,'CreateReceiptReceiver_btnSubmit')][@value='Submit']");
	private UIElement insertAddClaim_Quantity = new UIElement("InsertAddClaim_text", IdentifyBy.XPATH, "//*[contains(@id,'claimQuantity')][@inputtype='Number']");
	private UIElement insertAddClaim_ReceiptCost = new UIElement("InsertAddClaim_ReceiptCost", IdentifyBy.XPATH, "//*[contains(@id,'invoiceCost')][@class='riTextBox riEnabled']");
	private UIElement claimRetailAmount = new UIElement("ClaimRetailAmount", IdentifyBy.XPATH, "//*[contains(@id,'claimRetailAmount')][@class='riTextBox riDisabled']");
	private UIElement openToReceive = new UIElement("OpenToReceive", IdentifyBy.XPATH, "//*[contains(@id,'lblTotalCostName')][text()='Open To Receive']");
	private UIElement reviewActionTaken_DropdownBtn = new UIElement("ReviewActionTaken_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'ddlactionType_Arrow')][text()='select']");
	private UIElement reviewDispositionCode_DropdownBtn = new UIElement("ReviewDispositionCode_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'dldispositionCode_Arrow')][text()='select']");
	private UIElement review_SubmitBtn = new UIElement("Review_SubmitBtn", IdentifyBy.XPATH, "//*[contains(@id,'btnSubmitReconcileInvoice')][@value='Submit']");
	private UIElement claimPayback_InvoiceNbrr = new UIElement("ClaimPayback_InvoiceNbrr", IdentifyBy.XPATH, "//*[contains(@id,'txtInvoiceNumberFromInvSearch')][@class='riTextBox riEnabled']");
	private UIElement claimPayback_Submit = new UIElement("ClaimPayback_Submit", IdentifyBy.XPATH, "//button[contains(@id,'_fvlc_ctl')][@value='Submit']");
	private UIElement payback_Submit = new UIElement("Payback_Submit", IdentifyBy.XPATH, "//*[contains(@id,'ClaimPayback_PaybackReversal_btnSubmit')][@value='Submit']");
	private UIElement reconHeaderImg = new UIElement("ReconHeaderImg", IdentifyBy.XPATH, "//*[contains(@id,'frmRecon_grd_Recon_')][@class='rgMasterTable']");
	/*-------------------------------------------Start of Vendor Compliance Elements-------------------------------------------------*/
	private UIElement vendorCompli_IssueTitle = new UIElement("VendorCompli_IssueTitle", IdentifyBy.XPATH, "//*[contains(@id,'txtIssueTitle')][@class='riTextBox riEnabled']");
	private UIElement vendorCompli_Description = new UIElement("VendorCompli_Description", IdentifyBy.XPATH, "//*[contains(@id,'CreateCompliance_txtDescription')][@class='riTextBox riEnabled']");
	private UIElement vendorCompli_FromDate = new UIElement("VendorCompli_FromDate", IdentifyBy.XPATH, "//*[contains(@id,'CreateCompliance_dtFrom_dateInput')][@class='riTextBox riEnabled']");
	private UIElement vendorCompli_ToDate = new UIElement("VendorCompli_ToDate", IdentifyBy.XPATH, "//*[contains(@id,'CreateCompliance_dpTo_dateInput')][@class='riTextBox riEnabled']");
	private UIElement vendorCompli_Department = new UIElement("VendorCompli_Department", IdentifyBy.XPATH, "//*[contains(@id,'CreateCompliance_txtDepartment')][@class='riTextBox riEnabled']");
	private UIElement vendorCompli_Vendor = new UIElement("VendorCompli_Vendor", IdentifyBy.XPATH, "//*[contains(@id,'CreateCompliance_ntxtVendorNumber')][@class='riTextBox riEnabled']");
	private UIElement issueType_DropdownBtn = new UIElement("IssueType_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'CreateCompliance_cmbIssueType_Arrow')][text()='select']");
	private UIElement countryCode_DropdownBtn = new UIElement("CountryCode_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'CreateCompliance_cmbCountryCode_Arrow')][text()='select']");
	private UIElement status_DropdownBtn = new UIElement("status_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'CreateCompliance_cmbStatus_Arrow')][text()='select']");
	private UIElement processCode_DropdownBtn = new UIElement("ProcessCode_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'CreateCompliance_cmbProcessCode_Arrow')][text()='select']");
	private UIElement division_DropdownBtn = new UIElement("Division_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'CreateCompliance_cmbDivision_Arrow')][text()='select']");
	private UIElement instruction_DropdownBtn = new UIElement("Instruction_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'CreateCompliance_cmbInstruction_Arrow')][text()='select']");
	private UIElement restriction_DropdownBtn = new UIElement("Restriction_DropdownBtn", IdentifyBy.XPATH, "//*[contains(@id,'cmbRestriction_Arrow')][text()='select']");
	private UIElement vendorCompli_findByBtn = new UIElement("vendorCompli_FindByBtn", IdentifyBy.XPATH, "//*[contains(@id,'CreateCompliance_btnFindVendor')][@value='Find']");
	private UIElement issueCreate_SubmitBtn = new UIElement("IssueCreate_SubmitBtn", IdentifyBy.XPATH, "//*[contains(@id,'CreateCompliance_btnCustomSearchAddInvoice')][@value='Submit']");
	private UIElement oK_issueCreate = new UIElement("OK_issueCreate", IdentifyBy.XPATH, "//span[text()='OK']");
	
	private UIElement SearchforInvoice_StoreNumberLabel = new UIElement("OK_issueCreate", IdentifyBy.XPATH, "//span[contains(@id,'frmCreateReceipt_txtInvoiceStore_wrapper')]");
	

	
	
	/*-------------------------------------------End of CT1 R2R Elements-------------------------------------------------*/
	public static String title = null;
	

	/*-------------------------------------------Start of other important declarations---------------------------------*/
	private BrowserLibrary browserLibrary = getBrowserLibrary();
	private PageLibrary pageLibrary = getPageLibrary();
	private ElementLibrary elementLibrary = getElementLibrary();
	private WebdriverService WebdriverServiceLibrary = getWebDriverService(); 
	WebDriver driver=getWebDriverService().getWebDriver();
	/*-------------------------------------------End of other important declarations-----------------------------------*/
	
	private final static Logger log = Logger.getLogger(AP_TestScript.class.getName());
	
	
	
	/*-------------------------------------------End of other important declarations-----------------------------------*/
	
    @Given("User has launched the application")
    public void User_has_launched_the_application() throws IOException, InterruptedException {
	
    String browserName = System.getProperty("browser");
	System.out.println("Browser Name "+browserName);
	String implicitWait = System.getProperty("implicitWait");
	System.out.println("implicitWait "+implicitWait);
	String appURL = EnvironmentConfig.getURL();
	Assert.assertNotNull(appURL, "Application URL should not be null");
	getBrowserLibrary().navigate(appURL);
	log.info("Navigated to the URL: " +appURL);
	Thread.sleep(10000);
}
    
    /*
	 * Description 	Verify the Role Allocation in Open Receiving
	 * TestcaseID- @RoleAllocation
	*/
   
    @When("User has clicked on New process in the Hot operations page")
    public void user_has_clicked_on_New_process_in_the_Hot_operations_page() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(newProcess_tab);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	elementLibrary.click(newProcess_tab);
		Thread.sleep(5000);
		System.out.println("User verify the New process in the Hot operations page");
       
    }

    @Then("User has searched for AP IE Role Allocation Dashboard by clicked on Start button")
    public void user_has_searched_for_AP_IE_Role_Allocation_Dashboard_by_clicked_on_Start_button() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.enterText(find_newProcess, "Role");
		Thread.sleep(4000);
		elementLibrary.click(start_newProcess);
		byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
		Thread.sleep(6000);
		elementLibrary.switchToMainWindow();
    	Thread.sleep(3000);
    }
        
 

    @Then("User is in Role Allocation Dashboard page")
    public void user_is_in_Role_Allocation_Dashboard_page() throws IOException, InterruptedException {
    	
    	Thread.sleep(5000);
    	String Actualtext=elementLibrary.getText(roleAllocationDashboard);
    	String Exceptedtext="Role Allocation Dashboard";
    	Assert.assertEquals(Actualtext, Exceptedtext);
    	byte[] screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot3, "image/png");
    	System.out.println("Role Allocation Dashboard page verify.");
    	
        
    }

    @Then("User has selected the appropriate From group by clicked on Add New Record button")
    public void user_has_selected_the_appropriate_From_group_by_clicked_on_Add_New_Record_button() throws Exception {
    	
    	Thread.sleep(5000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,550)", "");
    	Thread.sleep(5000);
    	elementLibrary.click(selectTask_Group);
    	WebElement GroupName=driver.findElement(By.xpath("//ul[@class='rcbList']//li[15]"));
    	elementLibrary.hilightElement(GroupName);
    	byte[] screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot3, "image/png");
        GroupName.click();
        Thread.sleep(6000);
    	byte[] screenshot2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	Thread.sleep(2000);
    	elementLibrary.click(addnewrecord);
    	Thread.sleep(5000);
    	
    }

    @Then("User has Add to Division and userID by click on Submit button")
    public void user_has_Add_to_Division_and_userID_by_click_on_Submit_button() throws Exception {
    	
    	Thread.sleep(4000);
    	elementLibrary.click(addNewRecord_DropdownBtn);
    	Thread.sleep(4000);
    	WebElement AddDivitions=driver.findElement(By.xpath("//div[@id='ctl00_ctl05_fvlc_Form1_fvsvAddView_Grid1_ctl00_ctl02_ctl03_cbAllocationGroups_DropDown']/div/ul/li[2]"));
    	elementLibrary.hilightElement(AddDivitions);
    	elementLibrary.click(AddDivitions);
    	Thread.sleep(2000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(4000);
        elementLibrary.click(user);
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,850)", "");
    	Thread.sleep(5000);
        WebElement Select_User=driver.findElement(By.xpath("//ul[@class='rcbList']//li[1]"));
        elementLibrary.hilightElement(Select_User);
        byte[] screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot3, "image/png");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
    	js1.executeScript("window.scrollBy(0,550)", "");
        Select_User.click();
        byte[] screenshot4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot4, "image/png");
        Thread.sleep(6000);
        elementLibrary.click(submit_RoleAllocation);
        byte[] screenshot5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot5, "image/png");
        Thread.sleep(4000);
        System.out.println("Role Allocation Submitted");
        
    }
     
    /*
	 * Description 	Verify the Task Allocation in Open Receiving
	 * TestcaseID- @TaskAllocation
	*/

    @Then("User has searched for AP IE Task Allocation Dashboard by clicked on Start button")
    public void user_has_searched_for_AP_IE_Task_Allocation_Dashboard_by_clicked_on_Start_button() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.enterText(find_newProcess, "Task");
    	Thread.sleep(2);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
		Thread.sleep(4000);
		elementLibrary.waitForElementToDisplay(start_newProcess);
		elementLibrary.click(start_newProcess);
		byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
		Thread.sleep(6000);
		elementLibrary.switchToMainWindow();
    	Thread.sleep(3000);
    }
        
  

    @Then("User is in Task Allocation Dashboard page")
    public void user_is_in_Task_Allocation_Dashboard_page() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(taskAllocationDashboard);
    	String Actualtext=elementLibrary.getText(taskAllocationDashboard);
    	String Exceptedtext="Task Allocation Dashboard";
    	Assert.assertEquals(Actualtext, Exceptedtext);
    	byte[] screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot3, "image/png");
    	System.out.println("Role Allocation Dashboard page verify.");
    	
        
    }

    @Then("User has selected the appropriate From Process Type click on Add New Record button")
    public void user_has_selected_the_appropriate_From_Process_Type_click_on_Add_New_Record_button() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.click(processType);
    	Thread.sleep(2000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(5000);
    	WebElement Select_ProcessType=driver.findElement(By.xpath("//ul[@class='rcbList']//li[2]"));
    	elementLibrary.hilightElement(Select_ProcessType);
    	Thread.sleep(5000);
    	byte[] screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot3, "image/png");
        Select_ProcessType.click();
    	byte[] screenshot2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        Thread.sleep(8000);
    	System.out.println("User has selected the appropriate From Process Type click on Add New Record button");
    	
    }

    @Then("Record add{string} and Task allocated to the selected user by click on Add button")
    public void record_add_and_Task_allocated_to_the_selected_user_by_click_on_Add_button(String StoreNumber) throws Exception {
    	
    	SoftAssert softAssert = new SoftAssert();
    	Thread.sleep(4000);
    	elementLibrary.hilightElement(addRecord_Task);
    	elementLibrary.click(addRecord_Task);
    	Thread.sleep(4000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnUpdateGridItemVisible')][@value='Update']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
        Thread.sleep(4000);
    	elementLibrary.click(select_Country);
    	Thread.sleep(4000);
    	List<WebElement> AllList3 = driver.findElements(By.xpath("//div[contains(@id,'cboCountries_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList3) {
           if (List.getText().equals("US")) {
        	   List.click(); 
               break;
                          }
       }
    	Thread.sleep(3000);
    	elementLibrary.click(select_Division);
    	Thread.sleep(3000);
    	List<WebElement> AllList1 = driver.findElements(By.xpath("//div[contains(@id,'cboDivisions')]/div/ul/li"));
		
   	 for (WebElement List : AllList1) {
          if (List.getText().equals("Division A")) {
       	   List.click(); 
              break;
                         }
      }
    	Thread.sleep(3000);
    	elementLibrary.hilightElement(select_StoreNumber);
    	elementLibrary.enterText(select_StoreNumber, StoreNumber);
    	Thread.sleep(4000);
    	elementLibrary.click(select_Associate);
    	Thread.sleep(4000);
    	List<WebElement> AllList2 = driver.findElements(By.xpath("//div[contains(@id,'cboStoreAssociates_DropDown')]/div/ul/li"));
		
      	 for (WebElement List : AllList2) {
             if (List.getText().equals("Avanish Singh - vn51s44")) {
          	   List.click(); 
                 break;
             }
             }
    	Thread.sleep(2000);
    	elementLibrary.click(isUserWritable);
    	Thread.sleep(4000);
    	elementLibrary.click(requiresReview);
    	Thread.sleep(4000);
    	byte[] screenshot21= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot21, "image/png");
        elementLibrary.hilightElement(add_TaskBtn);
    	elementLibrary.click(add_TaskBtn);
    	byte[] screenshot22= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
    	js1.executeScript("window.scrollBy(0,550)", "");
    	Thread.sleep(4000);
    	System.out.println("Added RecoedTask allocated to the selected ");
    	softAssert.assertAll();
        
    }
    
    
    /*
   	 * Description 	Verify the FlowTime in Open Receiving
   	 * TestcaseID- @FlowTime
   	*/  

    @Then("User is in the Hot operations page")
    public void user_is_in_the_Hot_operations_page() throws InterruptedException, IOException {
    	Thread.sleep(5000);
		elementLibrary.click(hotOperations);
		Thread.sleep(4000);
		
        
    }

    @Then("User has selected AP Open receiving from Solution dropdown and selected Team Leader roles")
    public void user_has_selected_AP_Open_receiving_from_Solution_dropdown_and_selected_Team_Leader_roles() throws Exception {
    	
		Thread.sleep(4000);
		elementLibrary.click(solution_Links);
		Thread.sleep(4000);
		elementLibrary.hilightElement(aPOpenReceiving);
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
		elementLibrary.click(aPOpenReceiving);
		Thread.sleep(6000);
		elementLibrary.click(teamLeaderLink);
		Thread.sleep(7000);
		byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(4000);
        
       
    }

    @Then("User has selected all Divisions from team dropdown")
    public void user_has_selected_all_Divisions_from_team_dropdown() throws IOException, InterruptedException {
    	
    	Thread.sleep(3000);
    	WebElement SelectItemDropDownBtn=driver.findElement(By.xpath("//span[contains(@class,'k-select')]"));
		SelectItemDropDownBtn.click();
    	Thread.sleep(3000);
		byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        elementLibrary.click(selectAllItems);
        byte[] screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot3, "image/png");
        Thread.sleep(8000);
        elementLibrary.click(filterbtn);
        byte[] screenshot4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot4, "image/png");
        Thread.sleep(4000);
        
    }

    @Then("User verify the columns displayed in the Hot Operations page")
    public void user_verify_the_columns_displayed_in_the_Hot_Operations_page() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.body.style.zoom = '55%';");
		byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
		Thread.sleep(5000);
    	WebDriverWait wait1 = new WebDriverWait(driver, 1500);
		WebElement element = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@role='grid']/thead/tr")));
		List<WebElement> AllList = element.findElements(By.tagName("th"));
		for (int i = 0; i < AllList.size(); i++) 
		{
		String ColumnName = AllList.get(i).getText();
        System.out.println(ColumnName);
		Thread.sleep(5000);
       
		}  
		 System.out.println("User verify the columns displayed in the Hot Operations page");
    }
    

    /*
   	 * Description verify the Case Assignment in Open Receiving
   	 * TestcaseID- @CaseAssignment @AP_OpenReceiving_TC004
   	*/ 
    
    @Then("User Select the three dots for any case ID and select an Associate name from the dropdown list by click on Save button")
    public void user_Select_the_three_dots_for_any_case_ID_and_select_an_Associate_name_from_the_dropdown_list_by_click_on_Save_button() throws Exception {
        
    	Thread.sleep(3000);
    	WebElement VerifyCaseID=driver.findElement(By.xpath("//*[@id='grid']/div[4]/table/tbody/tr[5]/td[2]/div/div[2]"));
    	Thread.sleep(2000);
    	elementLibrary.hilightElement(VerifyCaseID);
    	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    	Thread.sleep(2000);
    	VerifyCaseID.click();
    	Thread.sleep(2000);
    	byte[] screenshot91 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot91, "image/png");
        Thread.sleep(2000);
        try {
        	elementLibrary.click(returnTask_Btn);
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
        Thread.sleep(10000);
        try {
        	WebElement VerifyCaseID1=driver.findElement(By.xpath("//*[@id='grid']/div[4]/table/tbody/tr[5]/td[2]/div/div[2]"));
        	Thread.sleep(2000);
        	elementLibrary.hilightElement(VerifyCaseID1);
        	VerifyCaseID1.click();
        	Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
        Thread.sleep(10000);
        elementLibrary.click(reassignTaskToEmployee);
        byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(5000);
		elementLibrary.click(select_reassignTaskToEmployee);
		Thread.sleep(10000);
		elementLibrary.selectDropdownBasedOnText(select_reassignTaskToEmployee, "Avanish Singh");
		Thread.sleep(10000);
		byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
		elementLibrary.click(save_reassignTaskToEmployee);
		byte[] screenshot21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot21, "image/png");
		Thread.sleep(5000);
		WebElement DownScroll=driver.findElement(By.xpath("//*[@id='grid']/div[4]/table/tbody/tr[1]/td[18]/span"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
        Thread.sleep(4000);
        elementLibrary.hilightElement(DownScroll);
        Thread.sleep(4000);
		byte[] screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot3, "image/png");
		System.out.println("User Verify the Case Assignment");
		Thread.sleep(2000);
				
    }
    
    /*
   	 * Description verify the Home Tab in Open Receiving 
   	 * TestcaseID- @HomeTab @AP_OpenReceiving_TC005
   	*/ 
    
    @When("list of cases are displayed for the User")
    public void list_of_cases_are_displayed_for_the_User() throws InterruptedException {
    	
       String ActualTitle=driver.getTitle();
       String ExceptedTitle="Task List";
       Thread.sleep(5000);
   	   Assert.assertEquals(ActualTitle, ExceptedTitle);
   	   byte[] screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
       scenario.embed(screenshot3, "image/png");
   	   System.out.println("User Verify Task List in Hot Operation Page.");
    }

    @When("User has opened any case and fetched the task button")
    public void user_has_opened_any_case_and_fetched_the_task_button() throws Exception {
        
    	Thread.sleep(5000);
    	elementLibrary.click(openCaseID);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(5000);
    	elementLibrary.switchToMainWindow();
    	Thread.sleep(3000);
    	byte[] screenshot111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot111, "image/png");
    	driver.manage().window().maximize();
    	Thread.sleep(5000);
    	try {
    		elementLibrary.hilightElement(returnTask);
        	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot2, "image/png");
        	elementLibrary.click(returnTask);
        	Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	try {
    		elementLibrary.hilightElement(fetchTask);
            elementLibrary.click(fetchTask);
            Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	elementLibrary.hilightElement(showMoreDetails);
    	byte[] screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot3, "image/png");
    	elementLibrary.click(showMoreDetails);
    	byte[] screenshot5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot5, "image/png");
    	Thread.sleep(10000);
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.body.style.zoom = '55%';");
		Thread.sleep(10000);
    	System.out.println("Verify the UI contents displayed in the Home page");
    	
    }

    
    /*
   	 * Description Verify the contents displayed in the match and reconcile page
   	 * TestcaseID- @MatchandReconcile @AP_OpenReceiving_TC006
   	*/    
    
    @Then("list of cases are displayed for the Users")
    public void list_of_cases_are_displayed_for_the_Users() throws InterruptedException {
    	
    	 String ActualTitle=driver.getTitle();
         String ExceptedTitle="Task List";
         Thread.sleep(5000);
     	 Assert.assertEquals(ActualTitle, ExceptedTitle);
     	 byte[] screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
         scenario.embed(screenshot3, "image/png");
     	 System.out.println("User Verify Task List in Hot Operation Page.");
    	
        
    }
    
    
    @Then("User has opened any case id and fetched the tasks")
    public void User_has_opened_any_case_id_and_fetched_the_tasks() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.click(openCaseID);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(7000);
    	elementLibrary.switchToMainWindow();
    	Thread.sleep(3000);
    	byte[] screenshot122 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot122, "image/png");
    	driver.manage().window().maximize();
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(returnTask);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(returnTask);
    	Thread.sleep(5000);
    	System.out.println("User Verify Open Any case ID and Fetched Task.");
    	
        
    }
    
    /*
   	 * Description Verify the contents displayed in the match and reconcile page
   	 * TestcaseID- @Match_Reconcile @AP_OpenReceiving_TC006
   	*/ 

    @Then("User is in Match and Reconcile page by click on Match and Reconcile tab")
    public void user_is_in_Match_and_Reconcile_page_by_click_on_Match_and_Reconcile_tab() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	elementLibrary.click(matchandReconciletab);
    	Thread.sleep(10000);
    	byte[] screenshot22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        elementLibrary.hilightElement(fetchTask);
        elementLibrary.click(fetchTask);
		Thread.sleep(15000);
        System.out.println("User verify the Match and Reconcile tab");
        log.info("User verify the Match and Reconcile tab");
        Thread.sleep(5000);
    	
     
    }

    
    /*
   	 * Description Verify the Search for Receiver in the match and reconcile page
   	 * TestcaseID- @SearchforReceiver @AP_OpenReceiving_TC007
   	*/ 
    
    @Then("User has opened any case and fetched the task")
    public void user_has_opened_any_case_and_fetched_the_task() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.click(openCaseID);
    	elementLibrary.switchToMainWindow();
    	Thread.sleep(10000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	elementLibrary.hilightElement(returnTask);
    	Thread.sleep(10000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(returnTask);
    	Thread.sleep(10000);
    	System.out.println("User Verify Open Any case ID and Fetched Task.");
        
    }

    @Then("User has click on Match & Reconcile tab")
    public void user_has_click_on_Match_Reconcile_tab() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	Thread.sleep(3000);
    	elementLibrary.click(matchandReconciletab);
    	Thread.sleep(10000);
    	byte[] screenshot22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        elementLibrary.hilightElement(fetchTask);
        elementLibrary.click(fetchTask);
		Thread.sleep(20000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,350)", "");
    	Thread.sleep(2000);
        byte[] screenshot10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot10, "image/png");
        System.out.println("User verify the Match and Reconcile tab");
        log.info("User verify the Match and Reconcile tab");
        Thread.sleep(4000);
    	
    }

    @Then("User click on Search for Receiver button")
    public void user_click_on_Search_for_Receiver_button() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(searchforReceiver_Btn);
    	byte[] screenshot212 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot212, "image/png");
        Thread.sleep(2000);
    	elementLibrary.click(searchforReceiver_Btn);
    	Thread.sleep(5000);
        System.out.println("User click on Search for Receiver Button");
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
        
    }
    
    @Then("User has input data into all mandatory fields{string},{string},{string},{string} and search results are displaying")
    public void user_has_input_data_into_all_mandatory_fields_and_search_results_are_displaying(String Store, String FromDate, String ToDate, String VendorNumber) throws InterruptedException, IOException {
      
    	Thread.sleep(5000);
    	SoftAssert softAssert = new SoftAssert();
    	Thread.sleep(2000);
    	driver.switchTo().frame("SearchReceiptPopUp");
    	Thread.sleep(6000);
    	elementLibrary.clearText(searchforReceiver_StoreNumber);
    	Thread.sleep(6000);
    	elementLibrary.enterText(searchforReceiver_StoreNumber,Store);
    	Thread.sleep(6000);
    	elementLibrary.clearText(searchforReceiver_FromDate);
    	Thread.sleep(6000);
    	elementLibrary.enterText(searchforReceiver_FromDate,FromDate);
    	Thread.sleep(6000);
    	elementLibrary.clearText(searchforReceiver_ToDate );
    	Thread.sleep(6000);
    	elementLibrary.enterText(searchforReceiver_ToDate,ToDate);
    	Thread.sleep(6000);
    	elementLibrary.clearText(searchforReceiver_VendorNumber );
    	Thread.sleep(6000);
    	elementLibrary.enterText(searchforReceiver_VendorNumber,VendorNumber);
    	Thread.sleep(6000);
    	elementLibrary.clearText(searchforReceiver_PONumber);
     	byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot222, "image/png");
        Thread.sleep(5000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnReceiptsSearch')][@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
    	Thread.sleep(5000);
    	elementLibrary.click(searchforReciver_SearchBtn);
    	Thread.sleep(10000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        Thread.sleep(5000);
        System.out.println("User select a Invoice item and click on Add Invoice button");
        softAssert.assertAll();
    	
    	
    	
    	
    }
    


    @Then("User select a Receipts detail and click on Add as Additional Receiver button")
    public void user_select_a_Receipts_detail_and_click_on_Add_as_Additional_Receiver_button() throws Exception {
    	
    	Thread.sleep(5000);
    	WebElement ReceiverBtn=driver.findElement(By.xpath("//table[@class='rgMasterTable rgClipCells']/tbody/tr[1]/td[2]"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", ReceiverBtn);
        Thread.sleep(5000);
        WebElement checkBtn=driver.findElement(By.xpath("//table[@class='rgMasterTable rgClipCells']/tbody/tr[1]/td[2]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", checkBtn);
    	Thread.sleep(5000);
    	driver.manage().window().maximize();
    	byte[] screenshot21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot21, "image/png");
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(additionalReceiverBtn);
    	byte[] screenshot20 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot20, "image/png");
        Thread.sleep(3000);
    	elementLibrary.click(additionalReceiverBtn);
    	Thread.sleep(5000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        Thread.sleep(5000);
        WebElement Submit_Ok=driver.findElement(By.xpath("//span[text()='OK']"));
    	if(Submit_Ok.isEnabled()){
    		
    		Submit_Ok.click();
    	}
    	System.out.println("User Additional Receiver button");
    	Thread.sleep(5000);
        
    }
    
    @Then("User verify Receipts detail should get added and displayed in Recon Header of Match & Reconcile page")//updated code
    public void user_verify_Receipts_detail_should_get_added_and_displayed_in_Recon_Header_of_Match_Reconcile_page() throws Exception {
        
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(matchandReconciletab);
    	driver.manage().window().maximize();
        Thread.sleep(10000);
		WebElement SubScrollDown=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEMRTab_fvSubView1_frmCreateReceipt_fvsbReconView_frmRecon_grd_Recon_ctl00__0']/td[1]"));
        JavascriptExecutor js11 = (JavascriptExecutor)driver; 
        js11.executeScript("arguments[0].scrollIntoView(true);", SubScrollDown);
        Thread.sleep(10000);
        elementLibrary.hilightElement(reconHeaderImg);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
        Thread.sleep(4000);
        System.out.println("User verify Receipts detail should get added and displayed in Recon Header of Match & Reconcile page");
        Thread.sleep(2000);
        
    }
    
    
    /*
   	 * Description Verify the IE lookup search in Tools Page
   	 * TestcaseID- @IElookup @AP_OpenReceiving_TC008
   	*/
    
    @Then("Tools dropdown is displayed for User")
    public void tools_dropdown_is_displayed_for_User() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(tools);
    	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    	Thread.sleep(5000);
    	System.out.println("User tools dropdown is displayed");
        
    }

    @Then("User has clicked on Tools Dropdown and different options are displayed for user")
    public void user_has_clicked_on_Tools_Dropdown_and_different_options_are_displayed_for_user() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.click(tools);
    	Thread.sleep(7000);
    	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    	Thread.sleep(2000);
    	
    }

    @Then("User has selected IE lookup option from dopdown list")
    public void user_has_selected_IE_lookup_option_from_dopdown_list() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(IELookup);
    	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
        Thread.sleep(5000);
    	elementLibrary.click(IELookup);
		Thread.sleep(5000);
		System.out.println("user has selected IE lookup option from dopdown list");
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
		}
    	
    @Then("User Verify Input data in all mandatory Search Fields{string},{string},{string}by click on search button")
    public void user_Verify_Input_data_in_all_mandatory_Search_Fields_by_click_on_search_button(String Store, String FromDate, String ToDate) throws Exception {
        
    	Thread.sleep(4000);
    	driver.switchTo().frame("rwIELookUpWindow");
    	Thread.sleep(5000);
    	elementLibrary.clearText(invoiceNumber);
    	Thread.sleep(8000);
    	elementLibrary.clearText(pO_Number);
    	Thread.sleep(8000);
    	elementLibrary.clearText(vender_Number);
    	Thread.sleep(8000);
    	elementLibrary.clearText(division_Number);
    	Thread.sleep(8000);
    	elementLibrary.clearText(department_Number);
    	Thread.sleep(8000);
    	elementLibrary.clearText(vendorName);
    	Thread.sleep(8000);
    	elementLibrary.clearText(iElookup_Store);
    	Thread.sleep(8000);
    	elementLibrary.enterText(iElookup_Store, Store);
    	Thread.sleep(4000);
    	elementLibrary.clearText(iElookup_fromDate);
    	Thread.sleep(8000);
    	elementLibrary.enterText(iElookup_fromDate, FromDate);
    	Thread.sleep(8000);
    	elementLibrary.clearText(iElookup_ToDate);
    	Thread.sleep(8000);
    	elementLibrary.enterText(iElookup_ToDate, ToDate);
    	Thread.sleep(8000);
    	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    	elementLibrary.click(iE_btnSearch);
    	Thread.sleep(3000);
        driver.manage().window().maximize();
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(8000);
        System.out.println("User Verify Input data in all mandatory field");
    	
    }
    
    @Then("User Verify the Search Results")
    public void user_Verify_the_Search_Results() throws Exception {
    	
    	Thread.sleep(8000);
    	WebElement IE_Store=driver.findElement(By.xpath("//*[contains(@id,'Form1_txtStoreNumber')][@class='riTextBox riEnabled']"));
    	elementLibrary.hilightElement(IE_Store);
    	byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
    	Thread.sleep(5000);
    	String Actualvalue_IE_Store=IE_Store.getAttribute("value");
    	System.out.println("Value of type attribute: "+Actualvalue_IE_Store);
    	Thread.sleep(8000);
    	driver.manage().window().maximize();
    	Thread.sleep(8000);
        WebElement AllSearchList=driver.findElement(By.xpath(".//preceding-sibling::div[@class='RadGrid RadGrid_Cora']/table/tbody/tr[1]"));
    	List<WebElement>AllList=AllSearchList.findElements(By.tagName("td"));
    	for(int i=0;i<AllList.size();i++){
    	WebElement FieldName= AllList.get(i);
    	String FieldTxt=FieldName.getText();
    	System.out.println(FieldTxt);
    		
    	if(FieldTxt.equals(Actualvalue_IE_Store)){
        	elementLibrary.hilightElement(FieldName);
        	System.out.println("Field name-- StoreNumber verify-- " + FieldName);
    	}
    	Thread.sleep(4000);
    	}
    	
    }
    
   
    @Then("User is in IE lookup popup window")
    public void user_is_in_IE_lookup_popup_window() throws Exception {
    	
    	Thread.sleep(8000);
        byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
        System.out.println("User is in IE lookup popup window");
        Thread.sleep(10000);
    }
    
    /*
   	 * Description Verify the OR lookup search in Tools Page
   	 * TestcaseID- @ORlookup @AP_OpenReceiving_TC009
   	*/
    
    @Then("User has selected OR lookup option from dopdown list")
    public void user_has_selected_OR_lookup_option_from_dopdown_list() throws Exception {
        
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(oRLookup);
    	elementLibrary.click(oRLookup);
        System.out.println("user has selected IE lookup option from dopdown list");
		Thread.sleep(5000);
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	
    }

    @Then("User Verify Input data in all mandatory Search Field{string},{string},{string}by click on search button")
    public void user_Verify_Input_data_in_all_mandatory_Search_Field_by_click_on_search_button(String Store, String FromDate, String ToDate) throws InterruptedException, IOException {
       
    	Thread.sleep(4000);
    	driver.switchTo().frame("rwORLookUpWindow");
    	Thread.sleep(5000);
    	elementLibrary.clearText(oR_invoiceNumber);
    	Thread.sleep(8000);
    	elementLibrary.clearText(or_PONumber );
    	Thread.sleep(8000);
    	elementLibrary.clearText(or_venderNumber );
    	Thread.sleep(8000);
    	elementLibrary.clearText(or_Dept);
    	Thread.sleep(8000);
    	elementLibrary.clearText(or_ReceiptNumber);
    	Thread.sleep(8000);
    	elementLibrary.clearText(or_vendorName );
    	Thread.sleep(8000);
    	elementLibrary.clearText(orlookup_Store);
    	Thread.sleep(8000);
    	elementLibrary.enterText(orlookup_Store, Store);
    	Thread.sleep(4000);
    	elementLibrary.clearText(orlookup_fromDate);
    	Thread.sleep(8000);
    	elementLibrary.enterText(orlookup_fromDate, FromDate);
    	Thread.sleep(8000);
    	elementLibrary.clearText(orlookup_ToDate);
    	Thread.sleep(8000);
    	elementLibrary.enterText(orlookup_ToDate, ToDate);
    	Thread.sleep(8000);
    	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    	elementLibrary.click(or_LookupbtnSearch);
    	Thread.sleep(3000);
        driver.manage().window().maximize();
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(8000);
        System.out.println("User Verify Input data in all mandatory field");
    }
    
    @Then("User verify the ORlookup search Results")
    public void user_verify_the_ORlookup_search_Results() throws Exception {

    	Thread.sleep(8000);
    	WebElement OR_Store=driver.findElement(By.xpath("//*[contains(@id,'Form1_txtStoreNumber')][@class='riTextBox riEnabled']"));
    	elementLibrary.hilightElement(OR_Store);
    	byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
    	Thread.sleep(5000);
    	String Actualvalue_OR_Store=OR_Store.getAttribute("value");
    	System.out.println("Value of type attribute: "+Actualvalue_OR_Store);
    	Thread.sleep(8000);
    	driver.manage().window().maximize();
    	Thread.sleep(8000);
        WebElement AllSearchList=driver.findElement(By.xpath(".//preceding-sibling::div[@class='RadGrid RadGrid_Cora']/table/tbody/tr[1]"));
    	List<WebElement>AllList=AllSearchList.findElements(By.tagName("td"));
    	for(int i=0;i<AllList.size();i++){
    	WebElement FieldName= AllList.get(i);
    	String FieldTxt=FieldName.getText();
    	System.out.println(FieldTxt);
    		
    	if(FieldTxt.equals(Actualvalue_OR_Store)){
        	elementLibrary.hilightElement(FieldName);
        	System.out.println("Field name-- StoreNumber verify-- " + FieldName);
    	}
    	Thread.sleep(4000);
    	}
    	
    }
    
    
    @Then("User is in OR lookup popup window")
    public void user_is_in_OR_lookup_popup_window() throws Exception {
    	
    	Thread.sleep(8000);
    	WebElement DownScroll=driver.findElement(By.xpath(".//preceding-sibling::div[@class='RadGrid RadGrid_Cora']/table/tbody/tr[1]/td"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
        byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        Thread.sleep(8000);
        System.out.println("User is in OR lookup popup window");
        Thread.sleep(5000);
    }
    
    
    
    /*
   	 * Description Verify the Search Item in Tools Page 
   	 * TestcaseID- @SearchItem @AP_OpenReceiving_TC010
   	 * 
   	*/
    
    @Then("User has selected Search Item option from dopdown list")
    public void user_has_selected_Search_Item_option_from_dopdown_list() throws Exception {
    
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(or_searchItem);
    	elementLibrary.click(or_searchItem);
        System.out.println("user has selected Search Item option from dopdown list");
		Thread.sleep(5000);
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	
    }
    
    @Then("User is in search Item popup window")
    public void user_is_in_search_Item_popup_window() throws InterruptedException {
    	
    	Thread.sleep(8000);
        byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        Thread.sleep(8000);
        
    }

    @Then("User Verify Input data in all mandatory Search Field{string},{string}by click on search button")
    public void user_Verify_Input_data_in_all_mandatory_Search_Field_by_click_on_search_button(String ItemNumber, String UPC) throws IOException, InterruptedException {
    	
    	Thread.sleep(2000);
    	driver.switchTo().frame("rwORItemSearch");
    	Thread.sleep(5000);
    	elementLibrary.enterText(Btn_item, ItemNumber);
    	Thread.sleep(8000);
    	elementLibrary.enterText(uPC_Number, UPC);
    	Thread.sleep(8000);
    	byte[] screenshot20 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot20, "image/png");
    	elementLibrary.click(ItembtnSearch);
    	Thread.sleep(5000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        System.out.println("User Verify Input data in all mandatory Search Field");
        Thread.sleep(5000);
    }

    @Then("User verify the search Results")
    public void user_verify_the_search_Results() throws Exception {
    	
    	Thread.sleep(5000);
    	WebElement SearchItem_UPC=driver.findElement(By.xpath("//*[contains(@id,'ItemUpc')][@class='riTextBox riEnabled']"));
    	elementLibrary.hilightElement(SearchItem_UPC);
    	byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
    	Thread.sleep(5000);
    	String Actualvalue_UPC=SearchItem_UPC.getAttribute("value");
    	System.out.println("Value of type attribute: "+Actualvalue_UPC);
    	Thread.sleep(8000);
    	driver.manage().window().maximize();
    	Thread.sleep(8000);
        WebElement SearchList_UPC=driver.findElement(By.xpath("//*[contains(@id,'upcNumber')][@class='riTextBox riDisabled']"));
        elementLibrary.hilightElement(SearchList_UPC);
        String FieldTxt=SearchList_UPC.getText();
    	System.out.println(FieldTxt);
        Thread.sleep(5000);
        WebElement SearchList_Item=driver.findElement(By.xpath("//*[contains(@id,'itemNumber')][@class='riTextBox riDisabled']"));
        elementLibrary.hilightElement(SearchList_Item);
    	byte[] screenshot122 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot122, "image/png");
        String FieldTxt1=SearchList_Item.getText();
	    System.out.println(FieldTxt);
	    Thread.sleep(4000);
	
      }
   	

    /*
   	 * Description Verify the Search Item in Tools Page
   	 * TestcaseID- @RetailCorrection @AP_OpenReceiving_TC011
   	 * 
   	*/
    

    @Then("User has selected Retail Correction option from dopdown list")
    public void user_has_selected_Retail_Correction_option_from_dopdown_list() throws Exception {
       
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(retailCorrection);
    	elementLibrary.click(retailCorrection);
        System.out.println("user has selected Search Item option from dopdown list");
		Thread.sleep(5000);
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    }
    
    @Then("User Verify Input data in all mandatory search fields{string},{string},{string},{string} by click on search button")
    public void user_Verify_Input_data_in_all_mandatory_search_fields_by_click_on_search_button(String Store, String FromDate, String ToDate, String InvoiceNumber) throws Exception {
        
    	Thread.sleep(5000);
    	SoftAssert softAssert = new SoftAssert();
    	Thread.sleep(2000);
    	driver.switchTo().frame("rwIERetailCorrectionPopup");
    	Thread.sleep(5000);
    	elementLibrary.click(country_RetailDropdownBtn);
    	Thread.sleep(5000);
    	List<WebElement> AllList = driver.findElements(By.xpath("//div[contains(@id,'Form1_txtCountry_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList) {
           if (List.getText().equals("US")) {
        	   List.click(); 
               break;
                          }
       }
    	
    	Thread.sleep(5000);
    	WebElement txtStoreNumber=driver.findElement(By.xpath("//*[contains(@id,'Form1_txtStoreNumber')][@class='riTextBox riEnabled']"));
    	txtStoreNumber.clear();
    	Thread.sleep(3000);
    	txtStoreNumber.sendKeys(Store);
     	elementLibrary.hilightElement(txtStoreNumber);
        Thread.sleep(5000);
        WebElement From_dateInput=driver.findElement(By.xpath("//*[contains(@id,'Form1_dtFrom_dateInput')][@class='riTextBox riEnabled']"));
        From_dateInput.clear();
    	Thread.sleep(3000);
    	From_dateInput.sendKeys(FromDate);
     	elementLibrary.hilightElement(From_dateInput);
        Thread.sleep(5000);
        WebElement dtTo_dateInput=driver.findElement(By.xpath("//*[contains(@id,'Form1_dtTo_dateInput')][@class='riTextBox riEnabled']"));
        dtTo_dateInput.clear();
    	Thread.sleep(3000);
    	dtTo_dateInput.sendKeys(ToDate);
     	elementLibrary.hilightElement(dtTo_dateInput);
        Thread.sleep(5000);
        WebElement Form1_txtInvoiceNumber=driver.findElement(By.xpath("//*[contains(@id,'Form1_txtInvoiceNumber')][@class='riTextBox riEnabled']"));
        Form1_txtInvoiceNumber.clear();
    	Thread.sleep(3000);
    	Form1_txtInvoiceNumber.sendKeys(InvoiceNumber);
     	elementLibrary.hilightElement(Form1_txtInvoiceNumber);
        Thread.sleep(5000);
        WebElement Form1_txtVendorNumber=driver.findElement(By.xpath("//*[contains(@id,'Form1_txtVendorNumber')][@class='riTextBox riEnabled']"));
        Thread.sleep(3000);
        Form1_txtVendorNumber.clear();
        Thread.sleep(5000);
        elementLibrary.click(retail_Search);
    	Thread.sleep(5000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        System.out.println("User is in Search Item popup window");
        softAssert.assertAll();
    	
    }
    
    @Then("User verify the Search results")
    public void user_verify_the_Search_results() throws Exception {
        
    	Thread.sleep(8000);
    	WebElement Reatil_Store=driver.findElement(By.xpath("//*[contains(@id,'Form1_txtStoreNumber')][@class='riTextBox riEnabled']"));
    	elementLibrary.hilightElement(Reatil_Store);
    	byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
    	Thread.sleep(5000);
    	String Actualvalue_Reatil_Store_Store=Reatil_Store.getAttribute("value");
    	System.out.println("Value of type attribute: "+Actualvalue_Reatil_Store_Store);
    	Thread.sleep(8000);
    	WebElement Reatil_InvoiceNumber=driver.findElement(By.xpath("//*[contains(@id,'Form1_txtInvoiceNumber')][@class='riTextBox riEnabled']"));
    	elementLibrary.hilightElement(Reatil_InvoiceNumber);
    	byte[] screenshot123 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot123, "image/png");
    	Thread.sleep(5000);
    	String Actualvalue_Reatil_InvoiceNumber=Reatil_InvoiceNumber.getAttribute("value");
    	System.out.println("Value of type attribute: "+Actualvalue_Reatil_InvoiceNumber);
    	Thread.sleep(8000);
    	driver.manage().window().maximize();
    	Thread.sleep(8000);
        WebElement AllSearchList=driver.findElement(By.xpath(".//preceding-sibling::div[@class='RadGrid RadGrid_Cora']/table/tbody/tr[1]"));
    	List<WebElement>AllList=AllSearchList.findElements(By.tagName("td"));
    	for(int i=0;i<AllList.size();i++){
    	WebElement FieldName= AllList.get(i);
    	String FieldTxt=FieldName.getText();
    	System.out.println(FieldTxt);
    		
    	if(FieldTxt.equals(Actualvalue_Reatil_Store_Store)){
        	elementLibrary.hilightElement(FieldName);
        	System.out.println("Field name-- StoreNumber verify-- " + FieldName);
    	}
    	Thread.sleep(5000);
    	if(FieldTxt.equals(Actualvalue_Reatil_InvoiceNumber)){
        	elementLibrary.hilightElement(FieldName);
        	System.out.println("Field name-- StoreNumber verify-- " + FieldName);
    	}
    	Thread.sleep(5000);
    	}
    	
    }


    @Then("User is in Retail Correction popup window")
    public void user_is_in_Retail_Correction_popup_window() throws InterruptedException, IOException {
    	
    	Thread.sleep(5000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        System.out.println("User is in Search Item popup window");
        
    }
    
    /*
   	 * Description Verify the Payment History in Tools Page
   	 * TestcaseID- @PaymentHistory @AP_OpenReceiving_TC012 
   	 * 
   	*/
    
    @Then("User has selected Payment History option from dopdown list")
    public void user_has_selected_Payment_History_option_from_dopdown_list() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(paymentHistory);
    	elementLibrary.click(paymentHistory);
        System.out.println("user has selected Search Item option from dopdown list");
		Thread.sleep(5000);
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    }

    
    @Then("User verify Input data in all mandatory search field{string},{string},{string},{string} by click on search button")
    public void user_verify_Input_data_in_all_mandatory_search_field_by_click_on_search_button(String Store, String FromDate, String ToDate, String VendorNumber) throws Exception {
        
    	SoftAssert softAssert = new SoftAssert();
    	Thread.sleep(2000);
    	driver.switchTo().frame("rwIEPaymentHistoryPopup");
    	Thread.sleep(5000);
    	elementLibrary.click(payment_DropdownBtn);
    	Thread.sleep(5000);
    	List<WebElement> AllList = driver.findElements(By.xpath("//div[contains(@id,'Form1_txtCountry_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList) {
           if (List.getText().equals("US")) {
        	   List.click(); 
               break;
                          }
       }
    	
    	Thread.sleep(5000);
    	WebElement txtStoreNumber=driver.findElement(By.xpath("//*[contains(@id,'Form1_txtStoreNumber')][@class='riTextBox riEnabled']"));
    	txtStoreNumber.clear();
    	Thread.sleep(3000);
    	txtStoreNumber.sendKeys(Store);
     	elementLibrary.hilightElement(txtStoreNumber);
        Thread.sleep(5000);
        WebElement From_dateInput=driver.findElement(By.xpath("//*[contains(@id,'Form1_dtFrom_dateInput')][@class='riTextBox riEnabled']"));
        From_dateInput.clear();
    	Thread.sleep(3000);
    	From_dateInput.sendKeys(FromDate);
     	elementLibrary.hilightElement(From_dateInput);
        Thread.sleep(5000);
        WebElement dtTo_dateInput=driver.findElement(By.xpath("//*[contains(@id,'Form1_dtTo_dateInput')][@class='riTextBox riEnabled']"));
        dtTo_dateInput.clear();
    	Thread.sleep(3000);
    	dtTo_dateInput.sendKeys(ToDate);
     	elementLibrary.hilightElement(dtTo_dateInput);
        Thread.sleep(5000);
        WebElement Form1_txtVendorNumber=driver.findElement(By.xpath("//*[contains(@id,'Form1_txtVendorNumber')][@class='riTextBox riEnabled']"));
        Form1_txtVendorNumber.clear();
    	Thread.sleep(3000);
    	Form1_txtVendorNumber.sendKeys(VendorNumber);
     	elementLibrary.hilightElement(Form1_txtVendorNumber);
        Thread.sleep(5000);
        WebElement Form1_txtInvoiceNumber=driver.findElement(By.xpath("//*[contains(@id,'Form1_txtInvoiceNumber')][@class='riTextBox riEnabled']"));
        Thread.sleep(3000);
        Form1_txtInvoiceNumber.clear();
        Thread.sleep(5000);
        WebElement Form1_txtPONumber=driver.findElement(By.xpath("//*[contains(@id,'Form1_txtPONumber')][@class='riTextBox riEnabled']"));
        Thread.sleep(3000);
        Form1_txtPONumber.clear();
        Thread.sleep(5000);
        elementLibrary.click(payment_SearchBtn);
    	Thread.sleep(5000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        System.out.println("User is in Search Item popup window");
        softAssert.assertAll();
    	
    }
    
    @Then("User verify the search results")
    public void user_verify_the_search_results() throws Exception {
        
    	Thread.sleep(8000);
    	WebElement PaymentHistory_Store=driver.findElement(By.xpath("//*[contains(@id,'Form1_txtStoreNumber')][@class='riTextBox riEnabled']"));
    	elementLibrary.hilightElement(PaymentHistory_Store);
    	byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
    	Thread.sleep(5000);
    	String Actualvalue_PaymentHistory=PaymentHistory_Store.getAttribute("value");
    	System.out.println("Value of type attribute: "+ Actualvalue_PaymentHistory);
    	Thread.sleep(8000);
    	WebElement PaymentHistory_VendorNumber=driver.findElement(By.xpath("//*[contains(@id,'Form1_txtVendorNumber')][@class='riTextBox riEnabled']"));
    	elementLibrary.hilightElement(PaymentHistory_VendorNumber);
    	byte[] screenshot123 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot123, "image/png");
    	Thread.sleep(5000);
    	String Actualvalue_PaymentHistory_VendorNumber=PaymentHistory_VendorNumber.getAttribute("value");
    	System.out.println("Value of type attribute: "+Actualvalue_PaymentHistory_VendorNumber);
    	Thread.sleep(8000);
    	driver.manage().window().maximize();
    	Thread.sleep(8000);
        WebElement AllSearchList=driver.findElement(By.xpath(".//preceding-sibling::div[@class='RadGrid RadGrid_Cora']/table/tbody/tr[1]"));
    	List<WebElement>AllList=AllSearchList.findElements(By.tagName("td"));
    	for(int i=0;i<AllList.size();i++){
    	WebElement FieldName= AllList.get(i);
    	String FieldTxt=FieldName.getText();
    	System.out.println(FieldTxt);
    		
    	if(FieldTxt.equals(Actualvalue_PaymentHistory)){
        	elementLibrary.hilightElement(FieldName);
        	System.out.println("Field name-- StoreNumber verify-- " + FieldName);
    	}
    	Thread.sleep(5000);
    	if(FieldTxt.equals(Actualvalue_PaymentHistory_VendorNumber)){
        	elementLibrary.hilightElement(FieldName);
        	System.out.println("Field name-- StoreNumber verify-- " + FieldName);
    	}
    	Thread.sleep(5000);
    	}
    	
    }

    
    
    @Then("User is in Payment History popup window")
    public void user_is_in_Payment_History_popup_window() throws InterruptedException, IOException {
       
    	Thread.sleep(5000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        System.out.println("User is in Search Item popup window");
    	
    }
    
    
    /*
   	 * Description Verify the update Receipt details
   	 * TestcaseID- @updateReceipt @AP_OpenReceiving_TC013
   	 * 
   	*/
    
    @Then("User has added invoice{string},{string},{string},{string} using search for invoice option")
    public void user_has_added_invoice_using_search_for_invoice_option(String Store, String FromDate, String ToDate, String VendorNumber) throws Exception {
        
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(searchforInvoice);
 	    byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot222, "image/png");
        Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice);
		Thread.sleep(5000);
		System.out.println("User click on SearchforInvoice Button");
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	driver.switchTo().frame("SearchInvoicePopUp");
    		
    	Thread.sleep(6000);
    	
    	//elementLibrary.click_JavaScript(SearchforInvoice_StoreNumberLabel);
    	//WebElement SearchforInvoice_StoreNumber=driver.findElement(By.xpath("//*[contains(@id,'frmCreateReceipt_txtInvoiceStore')][@class='riTextBox riEnabled']"));
    	
    	driver.switchTo().activeElement().click();
    	
    	
/*    	WebElement SearchforInvoiceLavel=driver.findElement(By.xpath("span[contains(@id,'fvinvoiceSearch_lbl_Search')]"));
    	
    	SearchforInvoiceLavel.click();
*/    	//span[contains(@id,'fvinvoiceSearch_lbl_Search')]
    	
    	WebElement SearchforInvoice_StoreNumber=driver.findElement(By.xpath("//input[contains(@id,'frmCreateReceipt_txtInvoiceStore')][@class='riTextBox riEnabled']"));
        
      	
    	SearchforInvoice_StoreNumber.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_StoreNumber.sendKeys(Store);
        Thread.sleep(6000);
        WebElement SearchforInvoice_Fromdate=driver.findElement(By.xpath("//*[contains(@id,'dtFromInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_Fromdate.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_Fromdate.sendKeys(FromDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_date=driver.findElement(By.xpath("//*[contains(@id,'dtToInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_date.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_date.sendKeys(ToDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_txtVendorNumber=driver.findElement(By.xpath("//*[contains(@id,'txtVendorNumberInvoice')][@class='riTextBox riEnabled']"));
        SearchforInvoice_txtVendorNumber.clear();
    	Thread.sleep(6000);
    	SearchforInvoice_txtVendorNumber.sendKeys(VendorNumber);
     	byte[] screenshot225 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot225, "image/png");
        Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_PONumber);
    	Thread.sleep(8000);
    	elementLibrary.clearText(searchforInvoice_Div);
    	Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_Dept);
    	Thread.sleep(5000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnInvoiceSearch')][@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
    	Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice_SearchBtn);
    	Thread.sleep(10000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        System.out.println("User select a Invoice item and click on Add Invoice button");
    	Thread.sleep(5000);
    	WebElement DownScroll1=driver.findElement(By.xpath("//*[contains(@id,'btnCustomSearchAddInvoice')][@value='+  Add Invoice']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", DownScroll1);
        Thread.sleep(5000);
        WebElement checkBtn=driver.findElement(By.xpath("//div[@class='RadGrid RadGrid_Cora']/table/tbody/tr[1]/td[2]/input"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", checkBtn);
    	Thread.sleep(2000);
    	byte[] screenshot21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot21, "image/png");
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(addInvoiceBtn);
    	byte[] screenshot23 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot23, "image/png");
        Thread.sleep(3000);
    	elementLibrary.click(addInvoiceBtn);
        Thread.sleep(10000);
        elementLibrary.switchToMainWindow();
    	Thread.sleep(10000);
    	
    }
    
    @Then("User has clicked on edit icon displayed in Receipt detail at REcon header")
    public void user_has_clicked_on_edit_icon_displayed_in_Receipt_detail_at_REcon_header() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(matchandReconciletab);
    	driver.manage().window().maximize();
        Thread.sleep(10000);
		WebElement SubScrollDown=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEMRTab_fvSubView1_frmCreateReceipt_fvsbReconView_frmRecon_grd_Recon_ctl00__0']/td[1]"));
        JavascriptExecutor js11 = (JavascriptExecutor)driver; 
        js11.executeScript("arguments[0].scrollIntoView(true);", SubScrollDown);
        Thread.sleep(10000);
        elementLibrary.hilightElement(reconHeaderImg);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
        Thread.sleep(10000);
    	elementLibrary.hilightElement(edit_Recipt2);
    	byte[] screenshot22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
        Thread.sleep(2000);
    	//elementLibrary.click_JavaScript(edit_Recipt2);///need to change
    	Thread.sleep(2000);
    	System.out.println("User has clicked on edit icon displayed in Receipt detail at REcon header");
    	elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	
    }

    @Then("User has clicked update type dropdown and selected Update Receipt option")
    public void user_has_clicked_update_type_dropdown_and_selected_Update_Receipt_option() throws InterruptedException, IOException {
    	
    	Thread.sleep(6000);
    	driver.switchTo().frame("rwMemoReceipt");
    	Thread.sleep(5000);
    	elementLibrary.click(update_DropdownBtn);
    	Thread.sleep(2000);
    	byte[] screenshot22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
    	Thread.sleep(6000);
    	
    }
    
    @Then("User has edited any of the values and click on update button")
    public void user_has_edited_any_of_the_values_and_click_on_update_button() throws InterruptedException, IOException, AWTException {
        
    	Thread.sleep(2000);
    	List<WebElement> AllList = driver.findElements(By.xpath("//div[contains(@id,'cbUpdateType_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList) {
           if (List.getText().equals("Update Receipt")) {
        	   List.click(); 
        	   Thread.sleep(2000);
        	   byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
               scenario.embed(screenshot222, "image/png");
               break;
                          }
         
       }
    	Thread.sleep(10000);
    	WebElement SubScroll=driver.findElement(By.xpath("//*[contains(@id,'SubmitButton1')][@value='Update']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", SubScroll);
        Thread.sleep(5000);
        
        
       // driver.switchTo().activeElement().click();

       // elementLibrary.click_JavaScript(txtRetail);
        elementLibrary.clearText(txtRetail);
        Thread.sleep(5000);
        elementLibrary.enterText(txtRetail, "161");
        byte[] screenshot2233 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2233, "image/png");
        Thread.sleep(5000);
        elementLibrary.click(updateRecipt_btn);
        Thread.sleep(10000);
        byte[] screenshot223 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot223, "image/png");
        elementLibrary.click(updateRecipt_btn);
        Thread.sleep(5000);
        System.out.println("User has clicked update type dropdown and selected Update Receipt option");
        Thread.sleep(3000);//
    	
    }

    @Then("User verify Update receipt details should be displayed in Shopping cart")
    public void user_verify_Update_receipt_details_should_be_displayed_in_Shopping_cart() throws Exception {
    	
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(matchandReconciletab);
        driver.manage().window().maximize();
        Thread.sleep(10000);
		elementLibrary.hilightElement(shoppingCart);
		byte[] screenshot22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
        Thread.sleep(2000);
    	elementLibrary.click(shoppingCart);
    	Thread.sleep(5000);
    	WebElement SubScroll=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEShoppingCartTab_fvsvShoppingCart_fvsvSCCreateReceiptGrid_refDataModelSCart_ReceiptHeaderGridView_ctl00__0']/td[1]"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", SubScroll);
        Thread.sleep(5000);
		byte[] screenshot223 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot223, "image/png");
        Thread.sleep(2000);
		System.out.println("User verify invoice detail should get added and displayed in Recon Header of Match & Reconcile page");
		
    	
    }
    
    /*
   	 * Description Verify the Memo Out details
   	 * TestcaseID- @MemoOut @AP_OpenReceiving_TC014
   	 * 
   	*/
    
    @Then("User has Clicked update type dropdown and selected Memo Out option")
    public void user_has_Clicked_update_type_dropdown_and_selected_Memo_Out_option() throws Exception {
    	
    	Thread.sleep(6000);
    	driver.switchTo().frame("rwMemoReceipt");
    	Thread.sleep(5000);
    	elementLibrary.click(memoOut_DropdownBtn);
    	byte[] screenshot10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot10, "image/png");
    	Thread.sleep(2000);
    	List<WebElement> AllList = driver.findElements(By.xpath("//div[contains(@id,'cbUpdateType_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList) {
           if (List.getText().equals("Memo Out")) {
        	   List.click();
        	   Thread.sleep(2000);
        	   byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
               scenario.embed(screenshot222, "image/png");
               break;
                          }
       }
    	
    	System.out.println("User has Clicked update type dropdown and selected Memo Out option");
        
        
    }

    @Then("User Select appropriate reason from Memo Out Reason and input comments Click on Submit")
    public void user_Select_appropriate_reason_from_Memo_Out_Reason_and_input_comments_Click_on_Submit() throws Exception {
    	
    	
    	WebElement SubScroll=driver.findElement(By.xpath("//*[contains(@id,'btnSubmitmemo')][@value='Submit']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", SubScroll);
        Thread.sleep(5000);
        elementLibrary.click(memooutReason_DropdownBtn);
        byte[] screenshot10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot10, "image/png");
        Thread.sleep(6000);
    	List<WebElement> AllList = driver.findElements(By.xpath("//div[contains(@id,'cboReason_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList) {
           if (List.getText().equals("Payment Error")) {
        	   List.click(); 
               break;
                          }
       }
    	Thread.sleep(10000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(5000);
        elementLibrary.hilightElement(submit_memoOutBtn);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
		elementLibrary.click(submit_memoOutBtn);
		Thread.sleep(5000);
		elementLibrary.hilightElement(yes_memoout);
		byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
		elementLibrary.click(yes_memoout);
		Thread.sleep(10000);
		System.out.println("User Select appropriate reason from Memo Out Reason and input comments Click on Submit");
		Thread.sleep(2000);
    }

    @Then("User click on Shopping Cart and verify for Memo out Receipt details")
    public void user_click_on_Shopping_Cart_and_verify_for_Memo_out_Receipt_details() throws Exception {
    	
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(matchandReconciletab);
        driver.manage().window().maximize();
        Thread.sleep(10000);
		elementLibrary.hilightElement(shoppingCart);
		byte[] screenshot22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
        Thread.sleep(2000);
    	elementLibrary.click(shoppingCart);
    	Thread.sleep(5000);
    	WebElement SubScroll=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEShoppingCartTab_fvsvShoppingCart_fvsvSCCreateReceiptGrid_refDataModelSCart_ReceiptHeaderGridView_ctl00__0']/td[1]"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", SubScroll);
        Thread.sleep(5000);
		byte[] screenshot223 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot223, "image/png");
        Thread.sleep(2000);
		System.out.println("User click on Shopping Cart and verify for Memo out Receipt details");
		 
    }
    
    /*
   	 * Description Verify the Open Receivings reports 
   	 * TestcaseID- @OpenReceivingsreport @AP_OpenReceiving_TC015
   	 * 
   	*/
    
    @Then("User has click on Digi under reports column for receipt")
    public void user_has_click_on_Digi_under_reports_column_for_receipt() throws InterruptedException, IOException {
    	
    	 Thread.sleep(5000);
    	 //elementLibrary.click(DigiReports_DropdownBtn);
    	 byte[] screenshot223 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
         scenario.embed(screenshot223, "image/png");
    	 Thread.sleep(5000);
         System.out.println("User has click on Digi under reports column for receipt");
         Thread.sleep(2000);
    }

    @Then("User selecting on Open Receivings report and Report should open in window")
    public void user_selecting_on_Open_Receivings_report_and_Report_should_open_in_window() throws Exception {
    	
    	Thread.sleep(6000);
    	//List<WebElement> AllList = driver.findElements(By.xpath("//div[contains(@id,'InvProg1_DropDown')]/div/ul/li"));
    			
    	 //for (WebElement List : AllList) {
           //if (List.getText().equals("Open Receivings")) {
        	   //List.click();
        	   //Thread.sleep(2000);
        	   //byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
              // scenario.embed(screenshot222, "image/png");
               //break;
                         // }
      // }
    	elementLibrary.hilightElement(digiReports_hyperlinks);
    	Thread.sleep(2000);
    	elementLibrary.click(digiReports_hyperlinks);
    	Thread.sleep(8000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(5000);
        System.out.println("User selecting on Open Receivings report and Report should open in window");
    }
    
    /*
   	 * Description Verify the Search for Invoice details in the match and reconcile page
   	 * TestcaseID- @SearchforInvoice @AP_OpenReceiving_TC016  
   	 * 
   	*/

    @Then("User click on Search for Invoice tab")
    public void user_click_on_Search_for_Invoice_tab() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(searchforInvoice);
 	    byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot222, "image/png");
        Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice);
		Thread.sleep(5000);
		System.out.println("User click on SearchforInvoice Button");
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	
        
    }
    
    @Then("User Verify Input Data in all Mandatory search field {string},{string},{string},{string} by click on search button")
    public void user_Verify_Input_Data_in_all_Mandatory_search_field_by_click_on_search_button(String Store, String FromDate, String ToDate, String VendorNumber) throws Exception {
       
    	SoftAssert softAssert = new SoftAssert();
    	Thread.sleep(2000);
    	driver.switchTo().frame("SearchInvoicePopUp");
    	Thread.sleep(6000);
    	driver.switchTo().activeElement().click();
    	
    	WebElement SearchforInvoice_StoreNumber=driver.findElement(By.xpath("//*[contains(@id,'frmCreateReceipt_txtInvoiceStore')][@class='riTextBox riEnabled']"));
    	SearchforInvoice_StoreNumber.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_StoreNumber.sendKeys(Store);
        Thread.sleep(6000);
        WebElement SearchforInvoice_Fromdate=driver.findElement(By.xpath("//*[contains(@id,'dtFromInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_Fromdate.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_Fromdate.sendKeys(FromDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_date=driver.findElement(By.xpath("//*[contains(@id,'dtToInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_date.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_date.sendKeys(ToDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_txtVendorNumber=driver.findElement(By.xpath("//*[contains(@id,'txtVendorNumberInvoice')][@class='riTextBox riEnabled']"));
        SearchforInvoice_txtVendorNumber.clear();
    	Thread.sleep(6000);
    	SearchforInvoice_txtVendorNumber.sendKeys(VendorNumber);
     	byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot222, "image/png");
        Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_PONumber);
    	Thread.sleep(8000);
    	elementLibrary.clearText(searchforInvoice_Div);
    	Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_Dept);
    	Thread.sleep(5000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnInvoiceSearch')][@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
    	Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice_SearchBtn);
    	Thread.sleep(10000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        System.out.println("User select a Invoice item and click on Add Invoice button");
        softAssert.assertAll();
    	
    	
    }

    @Then("User Select a invoice detail and click on Add invoice button")
    public void user_Select_a_invoice_detail_and_click_on_Add_invoice_button() throws Exception {
       
    	Thread.sleep(5000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnCustomSearchAddInvoice')][@value='+  Add Invoice']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
        Thread.sleep(5000);
        WebElement checkBtn=driver.findElement(By.xpath("//div[@class='RadGrid RadGrid_Cora']/table/tbody/tr[1]/td[2]/input"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", checkBtn);
    	Thread.sleep(4000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(addInvoiceBtn);
    	byte[] screenshot23 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot23, "image/png");
        Thread.sleep(3000);
    	elementLibrary.click(addInvoiceBtn);
        Thread.sleep(10000);
    	System.out.println("User Select a invoice detail and click on Add invoice button");
		elementLibrary.switchToMainWindow();
		Thread.sleep(10000);;
    }
    
    @Then("User verify the display of added invoice in recon header of match and reconcile page")
    public void user_verify_the_display_of_added_invoice_in_recon_header_of_match_and_reconcile_page() throws Exception {
        
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(matchandReconciletab);
    	driver.manage().window().maximize();
        Thread.sleep(10000);
		WebElement SubScrollDown=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEMRTab_fvSubView1_frmCreateReceipt_fvsbReconView_frmRecon_grd_Recon_ctl00__0']/td[1]"));
        JavascriptExecutor js11 = (JavascriptExecutor)driver; 
        js11.executeScript("arguments[0].scrollIntoView(true);", SubScrollDown);
        Thread.sleep(10000);
        elementLibrary.hilightElement(reconHeaderImg);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
        Thread.sleep(5000);
    	System.out.println("User verify the display of added invoice in recon header of match and reconcile page");
    	
    }
    
    /*
   	 * Description Verify the Remove Added Invoices in the match and reconcile page
   	 * TestcaseID- @RemoveAddedInvoices @AP_OpenReceiving_TC017
   	 * 
   	*/
    
    @Then("User has added invoice{string},{string},{string},{string}using search for Invoice option")
    public void user_has_added_invoice_using_search_for_Invoice_option(String Store, String FromDate, String ToDate, String VendorNumber) throws Exception {
        
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(searchforInvoice);
 	    byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot222, "image/png");
        Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice);
		Thread.sleep(5000);
		System.out.println("User click on SearchforInvoice Button");
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	driver.switchTo().frame("SearchInvoicePopUp");
    	Thread.sleep(6000);
    	driver.switchTo().activeElement().click();
    	WebElement SearchforInvoice_StoreNumber=driver.findElement(By.xpath("//*[contains(@id,'frmCreateReceipt_txtInvoiceStore')][@class='riTextBox riEnabled']"));
    	SearchforInvoice_StoreNumber.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_StoreNumber.sendKeys(Store);
        Thread.sleep(6000);
        WebElement SearchforInvoice_Fromdate=driver.findElement(By.xpath("//*[contains(@id,'dtFromInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_Fromdate.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_Fromdate.sendKeys(FromDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_date=driver.findElement(By.xpath("//*[contains(@id,'dtToInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_date.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_date.sendKeys(ToDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_txtVendorNumber=driver.findElement(By.xpath("//*[contains(@id,'txtVendorNumberInvoice')][@class='riTextBox riEnabled']"));
        SearchforInvoice_txtVendorNumber.clear();
    	Thread.sleep(6000);
    	SearchforInvoice_txtVendorNumber.sendKeys(VendorNumber);
     	byte[] screenshot225 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot225, "image/png");
        Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_PONumber);
    	Thread.sleep(8000);
    	elementLibrary.clearText(searchforInvoice_Div);
    	Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_Dept);
    	Thread.sleep(5000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnInvoiceSearch')][@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
    	Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice_SearchBtn);
    	Thread.sleep(10000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        System.out.println("User select a Invoice item and click on Add Invoice button");
    	Thread.sleep(5000);
    	WebElement DownScroll1=driver.findElement(By.xpath("//*[contains(@id,'btnCustomSearchAddInvoice')][@value='+  Add Invoice']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", DownScroll1);
        Thread.sleep(5000);
        WebElement checkBtn=driver.findElement(By.xpath("//div[@class='RadGrid RadGrid_Cora']/table/tbody/tr[1]/td[2]/input"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", checkBtn);
    	Thread.sleep(2000);
    	byte[] screenshot21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot21, "image/png");
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(addInvoiceBtn);
    	byte[] screenshot23 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot23, "image/png");
        Thread.sleep(3000);
    	elementLibrary.click(addInvoiceBtn);
        Thread.sleep(10000);
        elementLibrary.switchToMainWindow();
    	Thread.sleep(10000);
    	
    }
   
    @Then("User has click on Remove Added Invoices tab")
    public void user_has_click_on_Remove_Added_Invoices_tab() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(matchandReconciletab);
    	driver.manage().window().maximize();
    	Thread.sleep(6000);
    	WebElement SubScrollDown=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEMRTab_fvSubView1_frmCreateReceipt_fvsbReconView_frmRecon_grd_Recon_ctl00__0']/td[1]"));
        JavascriptExecutor js11 = (JavascriptExecutor)driver; 
        js11.executeScript("arguments[0].scrollIntoView(true);", SubScrollDown);
        Thread.sleep(2000);
        byte[] screenshot10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot10, "image/png");
        Thread.sleep(6000);
    	WebElement SubScroll=driver.findElement(By.xpath("//span[@class='rbText'][contains(.,'Remove Added Invoices')]"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", SubScroll);
        Thread.sleep(6000);
    	elementLibrary.hilightElement(removeAddedInvoices);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(2000);
    	elementLibrary.click(removeAddedInvoices);
    	byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
    	Thread.sleep(4000);
    	if(driver.findElement(By.xpath("//span[text()='OK']")).isDisplayed());
    	{
 
    		elementLibrary.hilightElement(removeAddedInvoices);
    		elementLibrary.click(yes_removeAddedInvoices);
    		Thread.sleep(4000);
    	}		
    	
    	System.out.println("User verify and click on Remove Added Invoices tab");
    	Thread.sleep(4000);
       
    }

    @Then("User Verify the All added invoices should get deleted from the recon header grid")
    public void user_Verify_the_All_added_invoices_should_get_deleted_from_the_recon_header_grid() throws Exception {
    	
        Thread.sleep(10000);
		WebElement SubScrollDown=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEMRTab_fvSubView1_frmCreateReceipt_fvsbReconView_frmRecon_grd_Recon_ctl00__0']/td[1]"));
        JavascriptExecutor js11 = (JavascriptExecutor)driver; 
        js11.executeScript("arguments[0].scrollIntoView(true);", SubScrollDown);
        Thread.sleep(10000);
        elementLibrary.hilightElement(reconHeaderImg);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
        Thread.sleep(4000);
        System.out.println("User Verify the All added invoices and receipts should get deleted from the recon header grid");
        Thread.sleep(2000);
        
        
    }
    
    
    /*
   	 * DescriptionVerify the Add claims deatils in the shopping cart page
   	 * TestcaseID- @Addclaims @AP_OpenReceiving_TC018
   	 * 
   	*/
    
    @Then("User has added Invoice{string},{string},{string},{string}using search for invoice option")
    public void user_has_added_Invoice_using_search_for_invoice_option(String Store, String FromDate, String ToDate, String VendorNumber) throws Exception {
        
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(searchforInvoice);
 	    byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot222, "image/png");
        Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice);
		Thread.sleep(5000);
		System.out.println("User click on SearchforInvoice Button");
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	driver.switchTo().frame("SearchInvoicePopUp");
    	Thread.sleep(6000);
    	driver.switchTo().activeElement().click();
    	WebElement SearchforInvoice_StoreNumber=driver.findElement(By.xpath("//*[contains(@id,'frmCreateReceipt_txtInvoiceStore')][@class='riTextBox riEnabled']"));
    	SearchforInvoice_StoreNumber.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_StoreNumber.sendKeys(Store);
        Thread.sleep(6000);
        WebElement SearchforInvoice_Fromdate=driver.findElement(By.xpath("//*[contains(@id,'dtFromInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_Fromdate.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_Fromdate.sendKeys(FromDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_date=driver.findElement(By.xpath("//*[contains(@id,'dtToInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_date.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_date.sendKeys(ToDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_txtVendorNumber=driver.findElement(By.xpath("//*[contains(@id,'txtVendorNumberInvoice')][@class='riTextBox riEnabled']"));
        SearchforInvoice_txtVendorNumber.clear();
    	Thread.sleep(6000);
    	SearchforInvoice_txtVendorNumber.sendKeys(VendorNumber);
     	byte[] screenshot225 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot225, "image/png");
        Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_PONumber);
    	Thread.sleep(8000);
    	elementLibrary.clearText(searchforInvoice_Div);
    	Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_Dept);
    	Thread.sleep(5000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnInvoiceSearch')][@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
    	Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice_SearchBtn);
    	Thread.sleep(10000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        System.out.println("User select a Invoice item and click on Add Invoice button");
    	Thread.sleep(5000);
    	WebElement DownScroll1=driver.findElement(By.xpath("//*[contains(@id,'btnCustomSearchAddInvoice')][@value='+  Add Invoice']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", DownScroll1);
        Thread.sleep(10000);
        WebElement checkBtn=driver.findElement(By.xpath("//div[@class='RadGrid RadGrid_Cora']/table/tbody/tr[1]/td[2]/input']"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", checkBtn);
    	Thread.sleep(2000);
    	byte[] screenshot21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot21, "image/png");
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(addInvoiceBtn);
    	byte[] screenshot23 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot23, "image/png");
        Thread.sleep(3000);
    	elementLibrary.click(addInvoiceBtn);
        Thread.sleep(10000);
        elementLibrary.switchToMainWindow();
    	Thread.sleep(10000);
    }
    
    @Then("User click on Action button for any of the recon lines in recon details grid")
    public void user_click_on_Action_button_for_any_of_the_recon_lines_in_recon_details_grid() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(matchandReconciletab);
    	driver.manage().window().maximize();
    	Thread.sleep(6000);
    	WebElement SubScrollDown=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEMRTab_fvSubView1_frmCreateReceipt_fvsbReconView_frmRecon_grd_Recon_ctl00__0']/td[1]"));
        JavascriptExecutor js11 = (JavascriptExecutor)driver; 
        js11.executeScript("arguments[0].scrollIntoView(true);", SubScrollDown);
        Thread.sleep(10000);
        elementLibrary.hilightElement(reconHeaderImg);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
        Thread.sleep(4000);
    	WebElement ActionBtn=driver.findElement(By.xpath("//*[contains(@id,'btnSub')][@value='Sub']"));
        JavascriptExecutor js2 = (JavascriptExecutor)driver; 
        js2.executeScript("arguments[0].scrollIntoView(true);", ActionBtn);
        byte[] screenshot13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot13, "image/png");
        Thread.sleep(6000);
        List<WebElement>AllActionList=driver.findElements(By.xpath("//*[@class='sq8w_actionBtn'][contains(.,'Action')]"));
        for(WebElement link: AllActionList) {
        	if (link.getText().equals("Action")) {
        		link.click(); 
                     break;
                        }
            
         }
        Thread.sleep(6000);
        elementLibrary.switchToMainWindow();
    	Thread.sleep(3000);
    }

    @Then("User Select any of the claims in Add claim section and data will be prepopulated click on Insert button")
    public void user_Select_any_of_the_claims_in_Add_claim_section_and_data_will_be_prepopulated_click_on_Insert_button() throws Exception {
    	
    	SoftAssert softAssert = new SoftAssert();
    	Thread.sleep(2000);
    	driver.switchTo().frame("ManualClaimTransactionPopUp");
    	Thread.sleep(10000);
    	WebElement addClaimBtn=driver.findElement(By.xpath("//*[contains(@id,'btnAddNewClaim')][@value='+ Add Claim']"));
    	addClaimBtn.click();
    	Thread.sleep(10000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'fvmanualClaimTransaction_Form1_btnDone')][@value='Done']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
    	elementLibrary.click(reason_AddClaims);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(4000);
    	List<WebElement> AllList = driver.findElements(By.xpath("//div[contains(@id,'rblClaimTypeCode_DropDown')]/div/ul/li"));
		
   	        for (WebElement List : AllList) {
                if (List.getText().equals("Subst. Overage (13)")) {
       	         List.click(); 
                      break;
                         }
            }
   	   Thread.sleep(8000);
   	   byte[] screenshot10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
       scenario.embed(screenshot10, "image/png");
       Thread.sleep(5000);
       elementLibrary.clearText(insertAddClaim_Quantity);
       Thread.sleep(5000);
       elementLibrary.enterText(insertAddClaim_Quantity,"90");
       Thread.sleep(8000);
       elementLibrary.clearText(insertAddClaim_ReceiptCost);
       Thread.sleep(8000);
       elementLibrary.enterText(insertAddClaim_ReceiptCost,"80");
       Thread.sleep(8000);
       elementLibrary.click(claimRetailAmount);
       Thread.sleep(8000);
       byte[] screenshot101 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
       scenario.embed(screenshot101, "image/png");
       Thread.sleep(5000);
       elementLibrary.click(insert_AddClaims);
       Thread.sleep(2000);
       byte[] screenshot102 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
       scenario.embed(screenshot102, "image/png");
       Thread.sleep(5000);
       System.out.println("User Select any of the claims in Add claim section and click on Insert button");
       softAssert.assertAll();
    }
    
    @Then("User click on done button in Add item transaction popover")
    public void user_click_on_done_button_in_Add_item_transaction_popover() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(done_AddClaims);
    	byte[] screenshot21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot21, "image/png");
    	Thread.sleep(5000);
    	elementLibrary.click(done_AddClaims);
        Thread.sleep(5000);
        elementLibrary.switchToMainWindow();
    	Thread.sleep(4000);
        elementLibrary.hilightElement(returnTask);
        byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(returnTask);
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(fetchTask);
        elementLibrary.click(fetchTask);
        System.out.println("User click on done button in Add item transaction popover");
       
    }

    @Then("User Verify Added claims should be displayed in claims section in the shopping cart page")
    public void user_Verify_Added_claims_should_be_displayed_in_claims_section_in_the_shopping_cart_page() throws Exception {
        
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    	elementLibrary.click(matchandReconciletab);
        driver.manage().window().maximize();
        Thread.sleep(10000);
		elementLibrary.hilightElement(shoppingCart);
		byte[] screenshot22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
        Thread.sleep(2000);
    	elementLibrary.click(shoppingCart);
    	Thread.sleep(5000);
		byte[] screenshot223 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot223, "image/png");
    	Thread.sleep(5000);
    	WebElement SubScroll=driver.findElement(By.xpath("//h2[text()='Claims']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", SubScroll);
        Thread.sleep(6000);
        elementLibrary.hilightElement(shopingcart_Claims);
        Thread.sleep(4000);
        elementLibrary.hilightElement(substOverage_Highlight);
        Thread.sleep(5000);
		byte[] screenshot44 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot44, "image/png");
        Thread.sleep(5000);
        elementLibrary.click(claims_DropdownBtn);
        byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(5000);
		System.out.println("User Verify Added claims should be displayed in claims section in the shopping cart page");
		
    	
    	
    }
    
    /*
   	 * Description Verify the UI contents displayed in the shopping cart page
   	 * TestcaseID- @Shoppingcart @AP_OpenReceiving_TC019
   	 * 
   	*/
    
    @Then("User has added Invoice{string},{string},{string},{string}using Search for invoice option")
    public void user_has_added_Invoice_using_Search_for_invoice_option(String Store, String FromDate, String ToDate, String VendorNumber) throws Exception {
        
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(searchforInvoice);
 	    byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot222, "image/png");
        Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice);
		Thread.sleep(5000);
		System.out.println("User click on SearchforInvoice Button");
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	driver.switchTo().frame("SearchInvoicePopUp");
    	Thread.sleep(6000);
    	driver.switchTo().activeElement().click();
    	WebElement SearchforInvoice_StoreNumber=driver.findElement(By.xpath("//*[contains(@id,'frmCreateReceipt_txtInvoiceStore')][@class='riTextBox riEnabled']"));
    	SearchforInvoice_StoreNumber.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_StoreNumber.sendKeys(Store);
        Thread.sleep(6000);
        WebElement SearchforInvoice_Fromdate=driver.findElement(By.xpath("//*[contains(@id,'dtFromInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_Fromdate.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_Fromdate.sendKeys(FromDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_date=driver.findElement(By.xpath("//*[contains(@id,'dtToInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_date.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_date.sendKeys(ToDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_txtVendorNumber=driver.findElement(By.xpath("//*[contains(@id,'txtVendorNumberInvoice')][@class='riTextBox riEnabled']"));
        SearchforInvoice_txtVendorNumber.clear();
    	Thread.sleep(6000);
    	SearchforInvoice_txtVendorNumber.sendKeys(VendorNumber);
     	byte[] screenshot225 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot225, "image/png");
        Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_PONumber);
    	Thread.sleep(8000);
    	elementLibrary.clearText(searchforInvoice_Div);
    	Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_Dept);
    	Thread.sleep(5000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnInvoiceSearch')][@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
    	Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice_SearchBtn);
    	Thread.sleep(10000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        System.out.println("User select a Invoice item and click on Add Invoice button");
    	Thread.sleep(5000);
    	WebElement DownScroll1=driver.findElement(By.xpath("//*[contains(@id,'btnCustomSearchAddInvoice')][@value='+  Add Invoice']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", DownScroll1);
        Thread.sleep(5000);
        WebElement checkBtn=driver.findElement(By.xpath("//div[@class='RadGrid RadGrid_Cora']/table/tbody/tr[1]/td[2]/input']"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", checkBtn);
    	Thread.sleep(2000);
    	byte[] screenshot21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot21, "image/png");
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(addInvoiceBtn);
    	byte[] screenshot23 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot23, "image/png");
        Thread.sleep(3000);
    	elementLibrary.click(addInvoiceBtn);
        Thread.sleep(10000);
        elementLibrary.switchToMainWindow();
    	Thread.sleep(10000);
   
    }
    
    @Then("User has added any Claims or Update receipt or Create receipt or Memo out")
    public void user_has_added_any_Claims_or_Update_receipt_or_Create_receipt_or_Memo_out() throws Exception {
        
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(matchandReconciletab);
    	driver.manage().window().maximize();
        Thread.sleep(10000);
		WebElement SubScrollDown=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEMRTab_fvSubView1_frmCreateReceipt_fvsbReconView_frmRecon_grd_Recon_ctl00__0']/td[1]"));
        JavascriptExecutor js11 = (JavascriptExecutor)driver; 
        js11.executeScript("arguments[0].scrollIntoView(true);", SubScrollDown);
        Thread.sleep(10000);
        elementLibrary.hilightElement(reconHeaderImg);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
        Thread.sleep(4000);
    	elementLibrary.hilightElement(edit_Recipt2);
    	byte[] screenshot22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
        Thread.sleep(2000);
    	elementLibrary.click(edit_Recipt2);
    	Thread.sleep(2000);
    	System.out.println("User has clicked on edit icon displayed in Receipt detail at REcon header");
    	elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	driver.switchTo().frame("rwMemoReceipt");
    	Thread.sleep(5000);
    	elementLibrary.click(memoOut_DropdownBtn);
    	byte[] screenshot10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot10, "image/png");
    	Thread.sleep(2000);
    	List<WebElement> AllList = driver.findElements(By.xpath("//div[contains(@id,'cbUpdateType_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList) {
           if (List.getText().equals("Memo Out")) {
        	   List.click(); 
               break;
                          }
       }
    	
    	System.out.println("User has Clicked update type dropdown and selected Memo Out option");
    	WebElement SubScroll=driver.findElement(By.xpath("//*[contains(@id,'btnSubmitmemo')][@value='Submit']"));
        JavascriptExecutor js12 = (JavascriptExecutor)driver; 
        js12.executeScript("arguments[0].scrollIntoView(true);", SubScroll);
        Thread.sleep(5000);
        elementLibrary.click(memooutReason_DropdownBtn);
        byte[] screenshot101 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot101, "image/png");
        Thread.sleep(6000);
    	List<WebElement> AllLists = driver.findElements(By.xpath("//div[contains(@id,'cboReason_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllLists) {
           if (List.getText().equals("Payment Error")) {
        	   List.click(); 
               break;
                          }
       }
    	Thread.sleep(8000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(5000);
        elementLibrary.hilightElement(submit_memoOutBtn);
        byte[] screenshot110 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot110, "image/png");
		elementLibrary.click(submit_memoOutBtn);
		Thread.sleep(5000);
		elementLibrary.hilightElement(yes_memoout);
		byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
		elementLibrary.click(yes_memoout);
		Thread.sleep(10000);
		elementLibrary.switchToMainWindow();
	   	Thread.sleep(10000);
        System.out.println("User has added any claims and Update receipt and Create receipt and Memo out");
        
    	
    }
   
    @Then("User has clicked on Shopping cart tab and user is in shopping cart page")
    public void user_has_clicked_on_Shopping_cart_tab_and_user_is_in_shopping_cart_page() throws Exception {
    	
    	Thread.sleep(4000);
    	elementLibrary.hilightElement(shoppingCart);
    	Thread.sleep(2000);
    	elementLibrary.click(shoppingCart);
    	Thread.sleep(10000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(2000);
    	WebElement SubScroll=driver.findElement(By.xpath("//h2[text()='Claims']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", SubScroll);
        Thread.sleep(6000);
        elementLibrary.hilightElement(shopingcart_Claims);
        String Status_shopingcartClaims=elementLibrary.getText(shopingcart_Claims);
    	System.out.println(Status_shopingcartClaims);
        Thread.sleep(5000);
        elementLibrary.hilightElement(shopingcart_Receipts);
        String Status_shopingcartReceipts=elementLibrary.getText(shopingcart_Receipts);
    	System.out.println(Status_shopingcartReceipts);
        Thread.sleep(5000);
        elementLibrary.hilightElement(shopingcart_Correction);
        String Status_shopingcartCorrection=elementLibrary.getText(shopingcart_Correction);
    	System.out.println(Status_shopingcartCorrection);
        Thread.sleep(5000);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
        System.out.println("Verify the UI contents displayed in the shopping cart page");
        Thread.sleep(3000);
        
    }
    
    /*
   	 * Description Verify the Shopping Cart_Review
   	 * TestcaseID- @ShoppingCartReview @AP_OpenReceiving_TC020
   	 * 
   	*/
    
    @Then("User has added Invoice{string},{string},{string},{string}Using Search for Invoice option")
    public void user_has_added_Invoice_Using_Search_for_Invoice_option(String Store, String FromDate, String ToDate, String VendorNumber) throws Exception {
        
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(searchforInvoice);
 	    byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot222, "image/png");
        Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice);
		Thread.sleep(5000);
		System.out.println("User click on SearchforInvoice Button");
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	driver.switchTo().frame("SearchInvoicePopUp");
    	Thread.sleep(6000);
    	driver.switchTo().activeElement().click();
    	WebElement SearchforInvoice_StoreNumber=driver.findElement(By.xpath("//*[contains(@id,'frmCreateReceipt_txtInvoiceStore')][@class='riTextBox riEnabled']"));
    	SearchforInvoice_StoreNumber.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_StoreNumber.sendKeys(Store);
        Thread.sleep(6000);
        WebElement SearchforInvoice_Fromdate=driver.findElement(By.xpath("//*[contains(@id,'dtFromInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_Fromdate.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_Fromdate.sendKeys(FromDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_date=driver.findElement(By.xpath("//*[contains(@id,'dtToInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_date.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_date.sendKeys(ToDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_txtVendorNumber=driver.findElement(By.xpath("//*[contains(@id,'txtVendorNumberInvoice')][@class='riTextBox riEnabled']"));
        SearchforInvoice_txtVendorNumber.clear();
    	Thread.sleep(6000);
    	SearchforInvoice_txtVendorNumber.sendKeys(VendorNumber);
     	byte[] screenshot225 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot225, "image/png");
        Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_PONumber);
    	Thread.sleep(8000);
    	elementLibrary.clearText(searchforInvoice_Div);
    	Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_Dept);
    	Thread.sleep(5000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnInvoiceSearch')][@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
    	Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice_SearchBtn);
    	Thread.sleep(10000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        System.out.println("User select a Invoice item and click on Add Invoice button");
    	Thread.sleep(5000);
    	WebElement DownScroll1=driver.findElement(By.xpath("//*[contains(@id,'btnCustomSearchAddInvoice')][@value='+  Add Invoice']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", DownScroll1);
        Thread.sleep(5000);
        WebElement checkBtn=driver.findElement(By.xpath("///div[@class='RadGrid RadGrid_Cora']/table/tbody/tr[1]/td[2]/input']"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", checkBtn);
    	Thread.sleep(2000);
    	byte[] screenshot21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot21, "image/png");
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(addInvoiceBtn);
    	byte[] screenshot23 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot23, "image/png");
        Thread.sleep(3000);
    	elementLibrary.click(addInvoiceBtn);
        Thread.sleep(10000);
        elementLibrary.switchToMainWindow();
    	Thread.sleep(10000);
    	
    	
    }
    
    @Then("User has added any claims and Update receipt and Create receipt and Memo out")
    public void user_has_added_any_claims_and_Update_receipt_and_Create_receipt_and_Memo_out() throws Exception {
    	
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(matchandReconciletab);
    	driver.manage().window().maximize();
        Thread.sleep(10000);
		WebElement SubScrollDown=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEMRTab_fvSubView1_frmCreateReceipt_fvsbReconView_frmRecon_grd_Recon_ctl00__0']/td[1]"));
        JavascriptExecutor js11 = (JavascriptExecutor)driver; 
        js11.executeScript("arguments[0].scrollIntoView(true);", SubScrollDown);
        Thread.sleep(10000);
        elementLibrary.hilightElement(reconHeaderImg);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
        Thread.sleep(4000);
    	elementLibrary.hilightElement(edit_Recipt2);
    	byte[] screenshot22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
        Thread.sleep(2000);
    	elementLibrary.click(edit_Recipt2);
    	Thread.sleep(2000);
    	System.out.println("User has clicked on edit icon displayed in Receipt detail at REcon header");
    	elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	driver.switchTo().frame("rwMemoReceipt");
    	Thread.sleep(5000);
    	elementLibrary.click(memoOut_DropdownBtn);
    	byte[] screenshot10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot10, "image/png");
    	Thread.sleep(2000);
    	List<WebElement> AllList = driver.findElements(By.xpath("//div[contains(@id,'cbUpdateType_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList) {
           if (List.getText().equals("Memo Out")) {
        	   List.click(); 
               break;
                          }
       }
    	
    	System.out.println("User has Clicked update type dropdown and selected Memo Out option");
    	WebElement SubScroll=driver.findElement(By.xpath("//*[contains(@id,'btnSubmitmemo')][@value='Submit']"));
        JavascriptExecutor js12 = (JavascriptExecutor)driver; 
        js12.executeScript("arguments[0].scrollIntoView(true);", SubScroll);
        Thread.sleep(5000);
        elementLibrary.click(memooutReason_DropdownBtn);
        byte[] screenshot101 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot101, "image/png");
        Thread.sleep(6000);
    	List<WebElement> AllLists = driver.findElements(By.xpath("//div[contains(@id,'cboReason_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllLists) {
           if (List.getText().equals("Payment Error")) {
        	   List.click(); 
               break;
                          }
       }
    	Thread.sleep(8000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(5000);
        elementLibrary.hilightElement(submit_memoOutBtn);
        byte[] screenshot110 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot110, "image/png");
		elementLibrary.click(submit_memoOutBtn);
		Thread.sleep(5000);
		elementLibrary.hilightElement(yes_memoout);
		byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
		elementLibrary.click(yes_memoout);
		Thread.sleep(10000);
		elementLibrary.switchToMainWindow();
	   	Thread.sleep(10000);
        System.out.println("User has added any claims and Update receipt and Create receipt and Memo out");
    }
    	
   

    @Then("User is in Shopping Cart and Open to Pay is zero by click on Review button")
    public void user_is_in_Shopping_Cart_and_Open_to_Pay_is_zero_by_click_on_Review_button() throws Exception {
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    	elementLibrary.click(matchandReconciletab);
        driver.manage().window().maximize();
        Thread.sleep(10000);
		elementLibrary.hilightElement(shoppingCart);
		byte[] screenshot22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
        Thread.sleep(2000);
    	elementLibrary.click(shoppingCart);
    	Thread.sleep(10000);
		byte[] screenshot223 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot223, "image/png");
    	Thread.sleep(10000);
    	WebElement OpenToReceive_Scroll=driver.findElement(By.xpath("//*[contains(@id,'lblTotalCostName')][text()='Open To Receive']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", OpenToReceive_Scroll);
        Thread.sleep(10000);
        elementLibrary.hilightElement(openToReceive);
        Thread.sleep(10000);
		byte[] screenshot33 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot33, "image/png");
        Thread.sleep(10000);
    	elementLibrary.click(returnTask);
    	Thread.sleep(5000);
        elementLibrary.click(fetchTask);
        WebElement ReviewScroll=driver.findElement(By.xpath(".//preceding-sibling::button[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvHeader_btnCheckReconcile']/span"));
        JavascriptExecutor js11 = (JavascriptExecutor)driver; 
        js11.executeScript("arguments[0].scrollIntoView(true);", ReviewScroll);
        Thread.sleep(10000);
        elementLibrary.click(ReviewScroll);
        Thread.sleep(10000);
    	
    }

    @Then("User select Appropriate action type and disposition code and click on submit button")
    public void user_select_Appropriate_action_type_and_disposition_code_and_click_on_submit_button() throws InterruptedException, IOException {
        
    	Thread.sleep(7000);
    	elementLibrary.click(reviewActionTaken_DropdownBtn);
        byte[] screenshot101 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot101, "image/png");
        Thread.sleep(10000);
    	List<WebElement> AllLists = driver.findElements(By.xpath("//div[contains(@id,'ddlactionType_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllLists) {
           if (List.getText().equals("Memo")) {
        	   List.click(); 
               break;
                          }
       }
    	Thread.sleep(10000);
    	elementLibrary.click(reviewDispositionCode_DropdownBtn);
        byte[] screenshot16 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot16, "image/png");
        Thread.sleep(10000);
    	List<WebElement> AllListss = driver.findElements(By.xpath("//div[contains(@id,'ddldispositionCode_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllListss) {
           if (List.getText().equals("Payment Error")) {
        	   List.click(); 
               break;
                          }
       }
    	Thread.sleep(10000);
    	WebElement txtComments=driver.findElement(By.xpath("//textarea[contains(@id,'ReconcileInvoice_Form1_txtComments')][@class='riTextBox riEnabled']"));
        if(txtComments.isEnabled()){
        	txtComments.click();
        	txtComments.sendKeys("Testing");
        	
        }
        Thread.sleep(10000);
        txtComments.click();
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(4000);
        elementLibrary.click(review_SubmitBtn);
        Thread.sleep(2000);
        byte[] screenshot14 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot14, "image/png");
        try {
            TimeUnit.MINUTES.sleep(1);
     } catch (InterruptedException e) {
            // Handle exception
     }
        byte[] screenshot144 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot144, "image/png");
        Thread.sleep(10000);
        
        
    }
    
    @Then("Reconcile popover should be displayed for the user")
    public void reconcile_popover_should_be_displayed_for_the_user() throws InterruptedException {
    	
    	Thread.sleep(10000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(6000);
    	
    }
    
    
    /*
   	 * Description Verify the Start over button in the match and reconcile page
   	 * TestcaseID- @Startover @AP_OpenReceiving_TC021  @AP_Regression
   	 * 
   	*/
    
    
    @Then("User has added Invoice{string},{string},{string},{string}Using search for invoice options")
    public void user_has_added_Invoice_Using_search_for_invoice_options(String Store, String FromDate, String ToDate, String VendorNumber) throws Exception {
        
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(searchforInvoice);
 	    byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot222, "image/png");
        Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice);
		Thread.sleep(5000);
		System.out.println("User click on SearchforInvoice Button");
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	driver.switchTo().frame("SearchInvoicePopUp");
    	Thread.sleep(6000);
    	driver.switchTo().activeElement().click();
    	WebElement SearchforInvoice_StoreNumber=driver.findElement(By.xpath("//*[contains(@id,'frmCreateReceipt_txtInvoiceStore')][@class='riTextBox riEnabled']"));
    	SearchforInvoice_StoreNumber.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_StoreNumber.sendKeys(Store);
        Thread.sleep(6000);
        WebElement SearchforInvoice_Fromdate=driver.findElement(By.xpath("//*[contains(@id,'dtFromInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_Fromdate.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_Fromdate.sendKeys(FromDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_date=driver.findElement(By.xpath("//*[contains(@id,'dtToInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_date.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_date.sendKeys(ToDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_txtVendorNumber=driver.findElement(By.xpath("//*[contains(@id,'txtVendorNumberInvoice')][@class='riTextBox riEnabled']"));
        SearchforInvoice_txtVendorNumber.clear();
    	Thread.sleep(6000);
    	SearchforInvoice_txtVendorNumber.sendKeys(VendorNumber);
     	byte[] screenshot225 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot225, "image/png");
        Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_PONumber);
    	Thread.sleep(8000);
    	elementLibrary.clearText(searchforInvoice_Div);
    	Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_Dept);
    	Thread.sleep(5000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnInvoiceSearch')][@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
    	Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice_SearchBtn);
    	Thread.sleep(10000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        System.out.println("User select a Invoice item and click on Add Invoice button");
    	Thread.sleep(5000);
    	WebElement DownScroll1=driver.findElement(By.xpath("//*[contains(@id,'btnCustomSearchAddInvoice')][@value='+  Add Invoice']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", DownScroll1);
        Thread.sleep(5000);
        WebElement checkBtn=driver.findElement(By.xpath("//div[@class='RadGrid RadGrid_Cora']/table/tbody/tr[1]/td[2]/input"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", checkBtn);
    	Thread.sleep(2000);
    	byte[] screenshot21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot21, "image/png");
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(addInvoiceBtn);
    	byte[] screenshot23 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot23, "image/png");
        Thread.sleep(3000);
    	elementLibrary.click(addInvoiceBtn);
        Thread.sleep(10000);
        elementLibrary.switchToMainWindow();
    	Thread.sleep(10000);
    	
    }
    
    @Then("User has added any claims or Update receipt or Create receipt or Memo out")
    public void user_has_added_any_claims_or_Update_receipt_or_Create_receipt_or_Memo_out() throws Exception {
        
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(matchandReconciletab);
    	driver.manage().window().maximize();
        Thread.sleep(10000);
		WebElement SubScrollDown=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEMRTab_fvSubView1_frmCreateReceipt_fvsbReconView_frmRecon_grd_Recon_ctl00__0']/td[1]"));
        JavascriptExecutor js11 = (JavascriptExecutor)driver; 
        js11.executeScript("arguments[0].scrollIntoView(true);", SubScrollDown);
        Thread.sleep(10000);
        elementLibrary.hilightElement(reconHeaderImg);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
        Thread.sleep(4000);
    	elementLibrary.hilightElement(edit_Recipt2);
    	byte[] screenshot22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
        Thread.sleep(2000);
    	elementLibrary.click(edit_Recipt2);
    	Thread.sleep(2000);
    	System.out.println("User has clicked on edit icon displayed in Receipt detail at REcon header");
    	elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	driver.switchTo().frame("rwMemoReceipt");
    	Thread.sleep(5000);
    	elementLibrary.click(memoOut_DropdownBtn);
    	byte[] screenshot10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot10, "image/png");
    	Thread.sleep(2000);
    	List<WebElement> AllList = driver.findElements(By.xpath("//div[contains(@id,'cbUpdateType_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList) {
           if (List.getText().equals("Memo Out")) {
        	   List.click(); 
               break;
                          }
       }
    	
    	System.out.println("User has Clicked update type dropdown and selected Memo Out option");
    	WebElement SubScroll=driver.findElement(By.xpath("//*[contains(@id,'btnSubmitmemo')][@value='Submit']"));
        JavascriptExecutor js12 = (JavascriptExecutor)driver; 
        js12.executeScript("arguments[0].scrollIntoView(true);", SubScroll);
        Thread.sleep(5000);
        elementLibrary.click(memooutReason_DropdownBtn);
        byte[] screenshot101 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot101, "image/png");
        Thread.sleep(6000);
    	List<WebElement> AllLists = driver.findElements(By.xpath("//div[contains(@id,'cboReason_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllLists) {
           if (List.getText().equals("Payment Error")) {
        	   List.click(); 
               break;
                          }
       }
    	Thread.sleep(8000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(5000);
        elementLibrary.hilightElement(submit_memoOutBtn);
        byte[] screenshot110 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot110, "image/png");
		elementLibrary.click(submit_memoOutBtn);
		Thread.sleep(5000);
		elementLibrary.hilightElement(yes_memoout);
		byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
		elementLibrary.click(yes_memoout);
		Thread.sleep(10000);
	
        System.out.println("User has added any claims and Update receipt and Create receipt and Memo out");
    }
    
    
    @Then("User has click on Start over button")
    public void user_has_click_on_Start_over_button() throws Exception {
    	
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(matchandReconciletab);
    	driver.manage().window().maximize();
        byte[] screenshot10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot10, "image/png");
        Thread.sleep(6000);
    	WebElement SubScrollDown1=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEMRTab_fvSubView1_frmCreateReceipt_fvsbReconView_frmRecon_grd_Recon_ctl00__0']/td[1]"));
        JavascriptExecutor js111 = (JavascriptExecutor)driver; 
        js111.executeScript("arguments[0].scrollIntoView(true);", SubScrollDown1);
        Thread.sleep(6000);
    	WebElement SubScrolls=driver.findElement(By.xpath("//span[@class='rbText'][contains(.,'Remove Added Invoices')]"));
        JavascriptExecutor js16 = (JavascriptExecutor)driver; 
        js16.executeScript("arguments[0].scrollIntoView(true);", SubScrolls);
        Thread.sleep(6000);
    	elementLibrary.hilightElement(startOver);
    	byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
    	Thread.sleep(2000);
    	elementLibrary.click(startOver);
    	byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
    	Thread.sleep(4000);
    	if(driver.findElement(By.xpath("//span[text()='OK']")).isDisplayed());
    	{
 
    		elementLibrary.hilightElement(yes_ClickStarover);
    		byte[] screenshot111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot111, "image/png");
    		elementLibrary.click(yes_ClickStarover);
    		Thread.sleep(7000);
    	}		
         
    	elementLibrary.switchToMainWindow();
	   	Thread.sleep(10000);
	   
    }

    @Then("User Verify the All added invoices and receipts should get deleted from the recon header grids")
    public void user_Verify_the_All_added_invoices_and_receipts_should_get_deleted_from_the_recon_header_grids() throws Exception {
    	
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    	elementLibrary.click(matchandReconciletab);
        driver.manage().window().maximize();
        Thread.sleep(10000);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
        Thread.sleep(4000);
    	elementLibrary.hilightElement(shoppingCart);
    	Thread.sleep(2000);
    	elementLibrary.click(shoppingCart);
    	Thread.sleep(10000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(2000);
    	WebElement SubScroll=driver.findElement(By.xpath("//h2[text()='Claims']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", SubScroll);
        Thread.sleep(6000);
        elementLibrary.hilightElement(shopingcart_Claims);
        String Status_shopingcartClaims=elementLibrary.getText(shopingcart_Claims);
    	System.out.println(Status_shopingcartClaims);
        Thread.sleep(5000);
        elementLibrary.hilightElement(shopingcart_Receipts);
        String Status_shopingcartReceipts=elementLibrary.getText(shopingcart_Receipts);
    	System.out.println(Status_shopingcartReceipts);
        Thread.sleep(5000);
        elementLibrary.hilightElement(shopingcart_Correction);
        String Status_shopingcartCorrection=elementLibrary.getText(shopingcart_Correction);
    	System.out.println(Status_shopingcartCorrection);
        Thread.sleep(5000);
        byte[] screenshot113 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot113, "image/png");
        System.out.println("Verify the UI contents displayed in the shopping cart page");
        Thread.sleep(3000);
        System.out.println("User Verify the All added invoices and receipts should get deleted from the recon header grids");
        Thread.sleep(2000);
        
        
    }
    
    /*
   	 * Description Verify the UI contents displayed in the Documents page
   	 * TestcaseID- @DocumentsTab @AP_OpenReceiving_TC022
   	 * 
   	*/
    
    @Then("User has added Invoice{string},{string},{string},{string}using search for invoice Options")
    public void user_has_added_Invoice_using_search_for_invoice_Options(String Store, String FromDate, String ToDate, String VendorNumber) throws Exception {
       
    	Thread.sleep(5000);
    	elementLibrary.hilightElement(searchforInvoice);
 	    byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot222, "image/png");
        Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice);
		Thread.sleep(5000);
		System.out.println("User click on SearchforInvoice Button");
		elementLibrary.switchToMainWindow();
    	Thread.sleep(2000);
    	driver.switchTo().frame("SearchInvoicePopUp");
    	Thread.sleep(6000);
    	driver.switchTo().activeElement().click();
    	WebElement SearchforInvoice_StoreNumber=driver.findElement(By.xpath("//*[contains(@id,'frmCreateReceipt_txtInvoiceStore')][@class='riTextBox riEnabled']"));
    	SearchforInvoice_StoreNumber.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_StoreNumber.sendKeys(Store);
        Thread.sleep(6000);
        WebElement SearchforInvoice_Fromdate=driver.findElement(By.xpath("//*[contains(@id,'dtFromInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_Fromdate.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_Fromdate.sendKeys(FromDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_date=driver.findElement(By.xpath("//*[contains(@id,'dtToInvoice_dateInput')][@class='riTextBox riEnabled']"));
        SearchforInvoice_date.clear();
    	Thread.sleep(3000);
    	SearchforInvoice_date.sendKeys(ToDate);
        Thread.sleep(6000);
        WebElement SearchforInvoice_txtVendorNumber=driver.findElement(By.xpath("//*[contains(@id,'txtVendorNumberInvoice')][@class='riTextBox riEnabled']"));
        SearchforInvoice_txtVendorNumber.clear();
    	Thread.sleep(6000);
    	SearchforInvoice_txtVendorNumber.sendKeys(VendorNumber);
     	byte[] screenshot225 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot225, "image/png");
        Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_PONumber);
    	Thread.sleep(8000);
    	elementLibrary.clearText(searchforInvoice_Div);
    	Thread.sleep(5000);
    	elementLibrary.clearText(searchforInvoice_Dept);
    	Thread.sleep(5000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnInvoiceSearch')][@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
    	Thread.sleep(5000);
    	elementLibrary.click(searchforInvoice_SearchBtn);
    	Thread.sleep(10000);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
        System.out.println("User select a Invoice item and click on Add Invoice button");
    	Thread.sleep(5000);
    	WebElement DownScroll1=driver.findElement(By.xpath("//*[contains(@id,'btnCustomSearchAddInvoice')][@value='+  Add Invoice']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", DownScroll1);
        Thread.sleep(5000);
        WebElement checkBtn=driver.findElement(By.xpath("//div[@class='RadGrid RadGrid_Cora']/table/tbody/tr[1]/td[2]/input"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", checkBtn);
    	Thread.sleep(2000);
    	byte[] screenshot21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot21, "image/png");
    	Thread.sleep(10000);
    	elementLibrary.hilightElement(addInvoiceBtn);
    	byte[] screenshot23 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot23, "image/png");
        Thread.sleep(3000);
    	elementLibrary.click(addInvoiceBtn);
        Thread.sleep(10000);
        elementLibrary.switchToMainWindow();
    	Thread.sleep(10000);
    	
    }
    
    
    @Then("User has clicked on Documents tab and user is in Documents page")
    public void user_has_clicked_on_Documents_tab_and_user_is_in_Documents_page() throws Exception {
    	
    	
    	Thread.sleep(4000);
    	elementLibrary.hilightElement(matchandReconciletab);
    	byte[] screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot2, "image/png");
    	elementLibrary.click(matchandReconciletab);
    	driver.manage().window().maximize();
        Thread.sleep(10000);
		WebElement SubScrollDown=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEMRTab_fvSubView1_frmCreateReceipt_fvsbReconView_frmRecon_grd_Recon_ctl00__0']/td[1]"));
        JavascriptExecutor js11 = (JavascriptExecutor)driver; 
        js11.executeScript("arguments[0].scrollIntoView(true);", SubScrollDown);
        Thread.sleep(10000);
        elementLibrary.hilightElement(reconHeaderImg);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
    	Thread.sleep(3000);
    	elementLibrary.hilightElement(documents);
    	byte[] screenshot22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
    	elementLibrary.click(documents);
    	Thread.sleep(6000);
    	byte[] screenshot21 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot21, "image/png");
        System.out.println("Verify the UI contents displayed in the Documents page");
       
         }
    
    
    @Then("User verify the UI Contents in Documents page")
    public void user_verify_the_UI_Contents_in_Documents_page() throws Exception {
        
    	Thread.sleep(6000);
    	WebElement RDFRReport=driver.findElement(By.xpath("//h2[text()='RDFR Report']"));
    	JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", RDFRReport);
        elementLibrary.hilightElement(RDFRReport);
        byte[] screenshot33 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot33, "image/png");
        Thread.sleep(8000);
    	WebElement usefulLinks=driver.findElement(By.xpath("//h2[text()='Useful Links']"));
    	JavascriptExecutor js11 = (JavascriptExecutor)driver; 
        js11.executeScript("arguments[0].scrollIntoView(true);", usefulLinks);
        Thread.sleep(4000);
        elementLibrary.hilightElement(usefulLinks);
        byte[] screenshot332 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot332, "image/png");
        Thread.sleep(4000);
        List<WebElement> ListData=driver.findElements(By.xpath("//table[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvORDocTab_fvSubView1_Grid1_ctl00']/tbody/tr/td"));
        //List<WebElement>AllList=ListData.findElements(By.tagName("td"));
        for(int i=0;i<ListData.size();i++){
        	WebElement Filename=ListData.get(i);
        	String Filetxt=Filename.getText();
        	System.out.println(Filetxt);
        	if(Filetxt.contains("Retail Link")){
        	elementLibrary.hilightElement(Filename);	
        	}
        Thread.sleep(1000);
        if(Filetxt.contains("GIS")){
        	elementLibrary.hilightElement(Filename);	
        	}
        Thread.sleep(1000);
        if(Filetxt.contains("DCI")){
        	elementLibrary.hilightElement(Filename);	
        	}
        Thread.sleep(1000);
        if(Filetxt.contains("Store Active Directory")){
    	elementLibrary.hilightElement(Filename);	
    	}
       Thread.sleep(1000);
       if(Filetxt.contains("Oracle Service clod")){
       	elementLibrary.hilightElement(Filename);	
       	}
       Thread.sleep(1000);
       if(Filetxt.contains("Ameri gas")){
       	elementLibrary.hilightElement(Filename);	
       	}
       Thread.sleep(1000);
       if(Filetxt.contains("Ferrel Gas")){
       	elementLibrary.hilightElement(Filename);	
       	}
       Thread.sleep(1000);
       if(Filetxt.contains("ATD")){
       	elementLibrary.hilightElement(Filename);	
       	}
       Thread.sleep(1000);
       if(Filetxt.contains("McKesson")){
       	elementLibrary.hilightElement(Filename);	
       	}
       Thread.sleep(1000);
       if(Filetxt.contains("Item File (IINQ)")){
       	elementLibrary.hilightElement(Filename);	
       	}
       byte[] screenshot32 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
       scenario.embed(screenshot32, "image/png");
       Thread.sleep(6000);
       }
        System.out.println("User verify the UI Contents in Documents page");
       }
    
 
    /*
   	 * Description Verify the Reports tab deatils
   	 * TestcaseID- @ReportsTab @AP_OpenReceiving_TC023
   	 * 
   	*/
    
    @Then("User has click on any case ID")
    public void user_has_click_on_any_case_ID() throws Exception {
       
    	Thread.sleep(6000);
    	elementLibrary.click(openCaseID1);
    	elementLibrary.switchToMainWindow();
    	Thread.sleep(3000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	
    	
    }
    
    
    @Then("user has clicked on Reports tab and user is in Reports page")
    public void user_has_clicked_on_Reports_tab_and_user_is_in_Reports_page() throws Exception {
    	  
    	Thread.sleep(6000);
    	elementLibrary.hilightElement(reports);
    	byte[] screenshot22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot22, "image/png");
    	elementLibrary.click(reports);
    	Thread.sleep(8000);
    	String Statustxt=elementLibrary.getText(reports);
    	System.out.println(Statustxt);
    	Thread.sleep(3000);
    }

    @Then("User verify input data in all mandatory search fields by click on search Button {string},{string},{string}")
    public void user_verify_input_data_in_all_mandatory_search_fields_by_click_on_search_Button(String Stores,String ReportName,String FolderName ) throws Exception {
    	
    	Thread.sleep(3000);
    	SoftAssert softAssert = new SoftAssert();
    	Thread.sleep(6000);
    	WebElement reports_Store1=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_frmInvoiceException_fvsvIETabs_fvsvIEReportsTab_fvsvReportsTab_digiSearchDetailsForm_txtDigiStore']"));
    	reports_Store1.clear();
    	Thread.sleep(5000);
    	reports_Store1.sendKeys(Stores);
    	elementLibrary.hilightElement(reports_Store1);
    	Thread.sleep(5000);
    	 elementLibrary.click(reports_FolderDropdownBtn );
         Thread.sleep(5000);
         byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
         scenario.embed(screenshot, "image/png");
     	Thread.sleep(6000);
     	//List<WebElement> AllList = driver.findElements(By.xpath("//div[contains(@id,'ddlFolderDigi_DropDown')]/div/ul/li"));
     			
     	 //for (WebElement List : AllList) {
           // if (List.getText().equals("Operations")) {
         	  // List.click(); 
                //break;
                           //}
        //}
     	WebElement Foldername=driver.findElement(By.xpath("//*[contains(@id,'ddlFolderDigi_Input')][@value='--Select--']"));
     	Foldername.sendKeys(FolderName);
     	Thread.sleep(10000);
        WebElement reports_ReportName=driver.findElement(By.xpath("//*[contains(@id,'digiSearchDetailsForm_txtReportNameDigi')][@class='riTextBox riEnabled']"));
        reports_ReportName.clear();
        Thread.sleep(3000);
        reports_ReportName.sendKeys(ReportName);
        byte[] screenshot10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot10, "image/png");
     	Thread.sleep(6000);
     	elementLibrary.click(reports_SearchBtn);
     	try {
            TimeUnit.MINUTES.sleep(1);
     } catch (InterruptedException e) {
            
     }
     	byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
        System.out.println("User verify Reports tab deatils");
        softAssert.assertAll();
    	
    }
    
    @Then("Reports should be displayed for the user based on search criteria")
    public void reports_should_be_displayed_for_the_user_based_on_search_criteria() throws Exception {
    	
    	Thread.sleep(5000);
    	WebElement SearchReports=driver.findElement(By.xpath("//*[contains(@id,'digiSearchDetailsForm_btnSearchApTracking')][@value='Search']"));
    	JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", SearchReports);
    	byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
        Thread.sleep(5000);
        System.out.println("Reports should be displayed for the user based on search criteria");
        
        
    }

     /*
	 * Description verify the Corrections_ClaimPayback details
	 * TestcaseID- @Corrections_ClaimPayback @AP_OpenReceiving_TC024
	 * 
	*/
    @Given("User Navigate to application URL")
    public void user_Navigate_to_application_URL() throws IOException, InterruptedException {
        
    	Properties file=new Properties();
    	FileInputStream fis=new FileInputStream("OR_Corrections.properties");
    	file.load(fis);
    	driver.get(file.getProperty("URL"));
    	System.out.println("Open Browser");
    	Thread.sleep(6000);
    }
    

    @Then("User has searched for AP IE Corrections master workflow by clicked on Start button of AP IE Corrections master")
     public void user_has_searched_for_AP_IE_Corrections_master_workflow_by_clicked_on_Start_button_of_AP_IE_Corrections_master() throws Exception {
    	Thread.sleep(5000);
		elementLibrary.hilightElement(newProcess_tab);
		Thread.sleep(5000);
		elementLibrary.click(newProcess_tab);
		Thread.sleep(10000);
		System.out.println("User verify the NewProcess tab");
		Thread.sleep(5000);
    	elementLibrary.enterText(find_newProcess, "AP IE Corrections Master");
    	byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
		Thread.sleep(4000);
		elementLibrary.click(start_newProcess);
		byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
		Thread.sleep(10000);
		elementLibrary.switchToMainWindow();
    	Thread.sleep(10000);
		
    	
        }

    @Then("User is in Corrections page and user has selected the Claim payback Payback Reversal option from Correction Type dropdown")
    public void user_is_in_Corrections_page_and_user_has_selected_the_Claim_payback_Payback_Reversal_option_from_Correction_Type_dropdown() throws Exception {
    	
    	Thread.sleep(10000);
    	elementLibrary.click(oR_Corrections_DropdownBtn);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(4000);
    	Thread.sleep(4000);
    	List<WebElement> AllList1 = driver.findElements(By.xpath("//div[contains(@id,'ddlCorrection_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList1) {
           if (List.getText().equals("Claim Payback / Payback Reversal")) {
        	   List.click(); 
               break;
                          }
       }
    	
    	Thread.sleep(3000);
    	System.out.println("User verify the corrections type deatils");
    	
       }

    @Then("User has searched for the invoices in Search for invoice section {string},{string},{string},{string},{string},{string}")
    public void user_has_searched_for_the_invoices_in_Search_for_invoice_section(String Country, String Store, String FromDate, String ToDate,String VendorNumber,String InvoiceNumber) throws Exception {
    
    	Thread.sleep(3000);
    	elementLibrary.enterText(oR_USNumber, Country);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_StoreNumber, Store);
    	Thread.sleep(4000);
    	elementLibrary.clearText(oR_FromDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_FromDate, FromDate);
    	Thread.sleep(4000);
    	elementLibrary.clearText(oR_ToDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_ToDate, ToDate);
    	Thread.sleep(5000);
    	elementLibrary.enterText(oR_VendorNumber, VendorNumber);
    	Thread.sleep(5000);
    	elementLibrary.enterText(claimPayback_InvoiceNbrr, InvoiceNumber);
    	byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
    	Thread.sleep(5000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnInvoiceSearch')][@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
        Thread.sleep(4000);
    	elementLibrary.click(oR_CorrectionsSearchBtn);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(8000);
    	
    	
    }

    @Then("Searched invoices are displayed for the user based on the search criteria")
    public void searched_invoices_are_displayed_for_the_user_based_on_the_search_criteria() throws InterruptedException {
    
    	Thread.sleep(7000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(8000);
    	
    	
    } 
    
    
    @Then("User has selected an invoice and user has selected any claim line in claim payback grid")
    public void user_has_selected_an_invoice_and_user_has_selected_any_claim_line_in_claim_payback_grid() throws Exception {
   
    	Thread.sleep(7000);
    	WebElement ReceiverBtn=driver.findElement(By.xpath("//*[contains(@id,'SelectColumnSelectCheckBox')][@type='checkbox']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", ReceiverBtn);
        Thread.sleep(5000);
        WebElement CheckInvoices=driver.findElement(By.xpath("//table[@class='rgMasterTable']/tbody/tr[1]/td[2]/input"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", CheckInvoices);
        byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(6000);
        System.out.println("User verify select Invoice to correct");
        Thread.sleep(6000);
    	WebElement ScrollDown=driver.findElement(By.xpath("//*[contains(@id,'ClaimPayback_PaybackReversal_btnSubmit')][@value='Submit']"));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; 
        js1.executeScript("arguments[0].scrollIntoView(true);", ScrollDown);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
        Thread.sleep(2000);
        WebElement ClaimPayBack_chkbox=driver.findElement(By.xpath("//table[@class='rgMasterTable']/tbody/tr[7]/td[1]/input"));
        if(ClaimPayBack_chkbox.isEnabled()){
        	
        	ClaimPayBack_chkbox.click();
        	
        }
        byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
        Thread.sleep(6000);
        System.out.println("User has selected an invoice and user has selected any claim line in claim payback grid");
        Thread.sleep(6000);
    }
  
    
    @Then("User click on checkbox displayed against any claim line in claim lines to reverse grid and click on Submit button")
    public void user_click_on_checkbox_displayed_against_any_claim_line_in_claim_lines_to_reverse_grid_and_click_on_Submit_button() throws Exception {
    	
        Thread.sleep(6000);
        //WebElement selectClaimLinesReverse_chkbox=driver.findElement(By.xpath("//table[@id='ctl00_ctl05_fvlc_fvsv_ClaimPayback_PaybackReversal_fvsv_claimLine_gridClaimLines_ctl00']/tbody/tr[1]/td[1]//input"));
        WebElement selectClaimLinesReverse_chkbox=driver.findElement(By.xpath("//preceding-sibling::tr[contains(@id,'ClaimPayback_PaybackReversal_fvsv_claimLine_gridClaimLines_')]//input"));
        if(selectClaimLinesReverse_chkbox.isEnabled()){
        	
        	selectClaimLinesReverse_chkbox.click();
        	
        }
        byte[] screenshot111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot111, "image/png");
        Thread.sleep(6000);
        elementLibrary.click(payback_Submit);
        Thread.sleep(5000);
        elementLibrary.switchToMainWindow();
    	Thread.sleep(3000);
        driver.switchTo().frame("rwClaimDueDate");
    	Thread.sleep(5000);
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(5000);
        elementLibrary.click(claimPayback_Submit);
        byte[] screenshot112 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot112, "image/png");
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        WebElement YesButton11=driver.findElement(By.xpath("//span[text()='Yes']"));
        if(YesButton11.isEnabled()){
        	YesButton11.click();
        }
        Thread.sleep(15000);
        byte[] screenshot101 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot101, "image/png");
        Thread.sleep(10000);
        System.out.println("User Select a receipt detail to create receipt with Input data in to all mandatory by click on Submit buttons");
        Thread.sleep(5000);
        
    }
    
    
    
    /*
   	 * Description verify the DepartmentCorrection details
   	 * TestcaseID- @DepartmentCorrection @AP_OpenReceiving_TC025
   	 * 
   	*/
    
    @Then("User is in Corrections page and user has selected the Department Correction option from Correction Type dropdown")
    public void user_is_in_Corrections_page_and_user_has_selected_the_Department_Correction_option_from_Correction_Type_dropdown() throws IOException, InterruptedException {
    	
    	Thread.sleep(8000);
    	elementLibrary.click(oR_Corrections_DropdownBtn);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(4000);
    	List<WebElement> AllList1 = driver.findElements(By.xpath("//div[contains(@id,'ddlCorrection_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList1) {
           if (List.getText().equals("Department Correction")) {
        	   List.click(); 
               break;
                          }
       }
    	
    	Thread.sleep(3000);
    	System.out.println("User verify the corrections type deatils");
    	
       }
    

    @Then("User has searched for the invoices in Search for invoice Section {string},{string},{string},{string},{string}")
    public void user_has_searched_for_the_invoices_in_Search_for_invoice_Section(String Country, String Store, String FromDate, String ToDate, String VendorNumber) throws IOException, InterruptedException {
        
    	Thread.sleep(3000);
    	elementLibrary.enterText(oR_USNumber, Country);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_StoreNumber, Store);
    	Thread.sleep(4000);
    	elementLibrary.clearText(oR_FromDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_FromDate, FromDate);
    	Thread.sleep(4000);
    	elementLibrary.clearText(oR_ToDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_ToDate, ToDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_VendorNumber, VendorNumber);
    	byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
    	Thread.sleep(4000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnInvoiceSearch')][@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
        Thread.sleep(4000);
    	elementLibrary.click(oR_CorrectionsSearchBtn);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(8000);
    }

    @Then("Ensure searched invoices are displayed for the user based on the search criteria")
    public void ensure_searched_invoices_are_displayed_for_the_user_based_on_the_search_criteria() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(8000);
        
    }

    @Then("User click on checkbox displayed against any invoice in Select invoice to Correct grid")
    public void user_click_on_checkbox_displayed_against_any_invoice_in_Select_invoice_to_Correct_grid() throws InterruptedException {
        
    	Thread.sleep(3000);
    	WebElement ReceiverBtn=driver.findElement(By.xpath("//*[contains(@id,'SelectColumnSelectCheckBox')][@type='checkbox']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", ReceiverBtn);
        Thread.sleep(5000);
        WebElement CheckInvoices=driver.findElement(By.xpath("//table[@class='rgMasterTable']/tbody/tr[1]/td[2]/input"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", CheckInvoices);
        byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(6000);
        System.out.println("User click on checkbox displayed against any invoice in Select invoice to Correct grid");
    }

    @Then("User verify input data in all mandatory fields by click on Submit Button")
    public void user_verify_input_data_in_all_mandatory_fields_by_click_on_Submit_Button() throws InterruptedException, IOException {
    	
    	Thread.sleep(5000);
    	WebElement ScrollDown=driver.findElement(By.xpath("//*[contains(@id,'btnSubmitDepartment')][@value='Submit']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", ScrollDown);
        Thread.sleep(8000);
        elementLibrary.enterText(oR_FromCost, "100");
        Thread.sleep(10000);
        WebElement FromRetail_Text=driver.findElement(By.xpath("//*[contains(@id,'Form1_txt_FromRetail')][@class='riTextBox riEnabled']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='99';", FromRetail_Text);
        FromRetail_Text.click();
        Thread.sleep(5000);  
		//WebElement ToDepartment=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_fvsv_DepartmentCorrection_Form1_txt_ToDepartment']"));
        WebElement ToDepartment=driver.findElement(By.xpath("//*[contains(@id,'ToDepartment')][@class='riTextBox riEnabled']"));
        if(ToDepartment.isEnabled()){
        	ToDepartment.click();
        	ToDepartment.sendKeys("008");
        	
        }
        Thread.sleep(6000);
        ToDepartment.click();
        byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(5000);
        elementLibrary.click(oR_CorrectionsSubmitBtn);
        byte[] screenshot10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot10, "image/png");
        Thread.sleep(8000);
        elementLibrary.click(oK_Retail);
        Thread.sleep(20000);
        byte[] screenshot101 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot101, "image/png");
        Thread.sleep(6000);
        System.out.println("User verify input data in all mandatory fields by click on Submit Button");
    	
    }
    
    
    /*
   	 * Description verify the MemoOutReceipt details
   	 * TestcaseID- @Corrections_MemoOutReceipt @AP_OpenReceiving_TC026
   	 * 
   	*/
    
    @Then("User is in Corrections page and user has selected the Memo-Out Receipt option from Correction Type dropdown")
    public void user_is_in_Corrections_page_and_user_has_selected_the_Memo_Out_Receipt_option_from_Correction_Type_dropdown() throws IOException, InterruptedException {
    	
    	Thread.sleep(8000);
    	elementLibrary.click(oR_Corrections_DropdownBtn);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(4000);
    	List<WebElement> AllList1 = driver.findElements(By.xpath("//div[contains(@id,'ddlCorrection_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList1) {
           if (List.getText().equals("Memo-Out Receipt")) {
        	   List.click(); 
               break;
                          }
       }
    	
    	Thread.sleep(3000);
    	System.out.println("User verify the corrections type deatils");
    	
       }
        
   

    @Then("User has searched for the Receipts in Search for Receipt by section {string},{string},{string},{string},{string}")
    public void user_has_searched_for_the_Receipts_in_Search_for_Receipt_by_section(String Country, String Store, String FromDate, String ToDate, String VendorNumber) throws IOException, InterruptedException {
    	
    	Thread.sleep(3000);
    	elementLibrary.enterText(memoOutReceipt_USNumber, Country);
    	Thread.sleep(4000);
    	elementLibrary.enterText(memoOutReceipt_StoreNumber, Store);
    	Thread.sleep(4000);
    	elementLibrary.clearText(memoOutReceipt_FromDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(memoOutReceipt_FromDate, FromDate);
    	Thread.sleep(4000);
    	elementLibrary.clearText(memoOutReceipt_ToDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(memoOutReceipt_ToDate, ToDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(memoOut_VendorNumber, VendorNumber);
    	byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
    	Thread.sleep(8000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_fvsv_ReceiptSearch_btnReceiptsSearch']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
        Thread.sleep(4000);
    	elementLibrary.click(memoOut_searchforReceiver_Btn);
    	Thread.sleep(8000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(8000);
    	
    	
    }
    
    @Then("User click on checkbox displayed against any receipt in Select receipt to Correct grid")
    public void user_click_on_checkbox_displayed_against_any_receipt_in_Select_receipt_to_Correct_grid() throws InterruptedException {
       
    	Thread.sleep(3000);
    	WebElement Selectreceipt=driver.findElement(By.xpath("//*[contains(@id,'SelectColumnSelectCheckBox')][@type='checkbox']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", Selectreceipt);
        Thread.sleep(5000);
        WebElement CheckInvoices=driver.findElement(By.xpath("//table[@class='rgMasterTable']/tbody/tr[3]/td[2]/input"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", CheckInvoices);
        byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(6000);
        System.out.println("User click on checkbox displayed against any receipt in Select receipt to Correct grid");
    	
    }

    @Then("user verify the memo control displayed is matching with the receipt control by click on Submit button")
    public void user_verify_the_memo_control_displayed_is_matching_with_the_receipt_control_by_click_on_Submit_button() throws Exception {
    	
    	Thread.sleep(5000);
    	WebElement ScrollDown=driver.findElement(By.xpath("//*[contains(@id,'fvsvMemoReceiptCorrection_ctl03')][@value='Submit']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", ScrollDown);
        Thread.sleep(8000);
        elementLibrary.hilightElement(controlNbr_memoOut);
        byte[] screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot3, "image/png");
        Thread.sleep(2000);
    	String controlNbr=elementLibrary.getText(controlNbr_memoOut);
    	Thread.sleep(2000);
    	String control_memoOut=elementLibrary.getText(controlNbr_memoOut);
    	Assert.assertEquals(controlNbr, control_memoOut);
    	System.out.println("User Verify controlNbr and control_memoOut are Matched Data");
    	byte[] screenshot31 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot31, "image/png");
        Thread.sleep(8000);
        ScrollDown.click();
        byte[] screenshot34 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot34, "image/png");
        Thread.sleep(6000);
        //elementLibrary.click(memoOut_SubmitBtn);
        WebElement SubmitBtn2=driver.findElement(By.xpath("//*[contains(@id,'_fvlc_fvsvMemoReceiptCorrection_ctl03')][@value='Submit']"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", SubmitBtn2);
        Thread.sleep(5000);
        WebElement YesButton1=driver.findElement(By.xpath("//span[text()='Yes']"));
        if(YesButton1.isEnabled()){
        	YesButton1.click();
        }
        //elementLibrary.click(yes_memoOutCorrections);
        Thread.sleep(20000);
        byte[] screenshot101 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot101, "image/png");
        Thread.sleep(2000);
        System.out.println("User verify the memo control displayed is matching with the receipt control by click on Submit button");
        Thread.sleep(5000);
    
    }
    
    
    
    /*
   	 * Description verify the Retail Correction details
   	 * TestcaseID-@Corrections_RetailCorrection @AP_OpenReceiving_TC027
   	 * 
   	*/
    
    @Then("User is in Corrections page and user has selected the Retail Correction option from Correction Type dropdown")
    public void user_is_in_Corrections_page_and_user_has_selected_the_Retail_Correction_option_from_Correction_Type_dropdown() throws IOException, InterruptedException {
        
    	Thread.sleep(8000);
    	elementLibrary.click(oR_Corrections_DropdownBtn);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(4000);
    	List<WebElement> AllList1 = driver.findElements(By.xpath("//div[contains(@id,'ddlCorrection_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList1) {
           if (List.getText().equals("Retail Correction")) {
        	   List.click(); 
               break;
                          }
       }
    	
    	Thread.sleep(3000);
    	System.out.println("User verify the corrections type deatils");
    	
       }
    

    @Then("User has searched for the invoices in Search for Invoice section {string},{string},{string},{string},{string}")
    public void user_has_searched_for_the_invoices_in_Search_for_Invoice_section(String Country, String Store, String FromDate, String ToDate, String VendorNumber) throws IOException, InterruptedException {
       
    	Thread.sleep(3000);
    	elementLibrary.enterText(oR_USNumber, Country);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_StoreNumber, Store);
    	Thread.sleep(4000);
    	elementLibrary.clearText(oR_FromDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_FromDate, FromDate);
    	Thread.sleep(4000);
    	elementLibrary.clearText(oR_ToDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_ToDate, ToDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_VendorNumber, VendorNumber);
    	byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
    	Thread.sleep(4000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnInvoiceSearch')][@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
        Thread.sleep(8000);
    	elementLibrary.click(oR_CorrectionsSearchBtn);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(8000);
    }

    @Then("User click on checkbox displayed against any invoice in Select invoice to Correct grids")
    public void user_click_on_checkbox_displayed_against_any_invoice_in_Select_invoice_to_Correct_grids() throws InterruptedException {
        
    	Thread.sleep(3000);
    	WebElement ReceiverBtn=driver.findElement(By.xpath("//*[contains(@id,'SelectColumnSelectCheckBox')][@type='checkbox']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", ReceiverBtn);
        Thread.sleep(5000);
        WebElement CheckInvoices=driver.findElement(By.xpath("//table[@class='rgMasterTable']/tbody/tr[3]/td[2]/input"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", CheckInvoices);
        byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(6000);
        System.out.println("User click on checkbox displayed against any invoice in Select invoice to Correct grid");
    }

    @Then("User verify input data in all mandatory fields by click on Submit Buttons")
    public void user_verify_input_data_in_all_mandatory_fields_by_click_on_Submit_Buttons() throws IOException, InterruptedException {
    	
    	Thread.sleep(5000);
    	WebElement ScrollDown=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_fvsv_RetailCorrection_btnSubmitRetailCorrection']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", ScrollDown);
        Thread.sleep(8000);
        driver.switchTo().activeElement().click();
        WebElement RetailText=driver.findElement(By.xpath("//*[contains(@id,'FormRetail_txt_ToRetail')][@class='riTextBox riEnabled']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='70';", RetailText);
        byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(5000);
        RetailText.click();
        byte[] screenshot10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot10, "image/png");
        Thread.sleep(6000);
        try {
        WebElement SubmitBtn1=driver.findElement(By.xpath("//*[contains(@id,'btnSubmitRetailCorrection')][@value='Submit']"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", SubmitBtn1);
        } catch (UnhandledAlertException f) {
    	    try {
    	        Alert alert = driver.switchTo().alert();
    	        String alertText = alert.getText();
    	        System.out.println("Alert data: " + alertText);
    	        alert.accept();
    	    } catch (NoAlertPresentException e) {
    	        e.printStackTrace();
    	    }
        }
		
    	Thread.sleep(8000);
    	try {
    	WebElement Submit_Ok=driver.findElement(By.xpath("//span[text()='OK']"));
        JavascriptExecutor executor11 = (JavascriptExecutor)driver;
    	executor11.executeScript("arguments[0].click();", Submit_Ok);
    	} catch (UnhandledAlertException f) {
    	    try {
    	        Alert alert = driver.switchTo().alert();
    	        String alertText = alert.getText();
    	        System.out.println("Alert data: " + alertText);
    	        alert.accept();
    	    } catch (NoAlertPresentException e) {
    	        e.printStackTrace();
    	    }
    	}
    	byte[] screenshot101 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot101, "image/png");
        Thread.sleep(4000);
        System.out.println("User verify input data in all mandatory fields by click on Submit Button");
        Thread.sleep(2000);
    
    }
    /*
   	 * Description verify the Create claims details
   	 * TestcaseID- @Corrections_Createclaims @AP_OpenReceiving_TC028
   	 * 
   	*/
    
    @Then("User is in Corrections page and user has selected the Create claims option from Correction Type dropdown")
    public void user_is_in_Corrections_page_and_user_has_selected_the_Create_claims_option_from_Correction_Type_dropdown() throws IOException, InterruptedException {
    	
    	Thread.sleep(8000);
    	elementLibrary.click(oR_Corrections_DropdownBtn);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(4000);
    	List<WebElement> AllList1 = driver.findElements(By.xpath("//div[contains(@id,'ddlCorrection_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList1) {
           if (List.getText().equals("Create Claim")) {
        	   List.click(); 
               break;
                          }
       }
    	
    	Thread.sleep(3000);
    	System.out.println("User verify the corrections type deatils");
    	
       }
    

    @Then("User has searched for the Invoices in Search for invoice section {string},{string},{string},{string},{string}")
    public void user_has_searched_for_the_Invoices_in_Search_for_invoice_section(String Country, String Store, String FromDate, String ToDate, String VendorNumber) throws IOException, InterruptedException {
        
    	Thread.sleep(3000);
    	elementLibrary.enterText(oR_USNumber, Country);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_StoreNumber, Store);
    	Thread.sleep(4000);
    	elementLibrary.clearText(oR_FromDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_FromDate, FromDate);
    	Thread.sleep(4000);
    	elementLibrary.clearText(oR_ToDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_ToDate, ToDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(oR_VendorNumber, VendorNumber);
    	byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
    	Thread.sleep(4000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'btnInvoiceSearch')][@value='Search']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
        Thread.sleep(4000);
    	elementLibrary.click(oR_CorrectionsSearchBtn);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(8000);
    }

    @Then("User click on checkbox displayed against any invoice in Select invoice to Correct Grid")
    public void user_click_on_checkbox_displayed_against_any_invoice_in_Select_invoice_to_Correct_Grid() throws InterruptedException {
        
    	Thread.sleep(3000);
    	WebElement ReceiverBtn=driver.findElement(By.xpath("//*[contains(@id,'SelectColumnSelectCheckBox')][@type='checkbox']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", ReceiverBtn);
        Thread.sleep(5000);
        WebElement CheckInvoices=driver.findElement(By.xpath("//table[@class='rgMasterTable']/tbody/tr[1]/td[2]/input"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", CheckInvoices);
        byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(6000);
        System.out.println("User click on checkbox displayed against any invoice in Select invoice to Correct grid");
    }

    @Then("User Select a invoice detail to create claim with Input data in to all mandatory by click on Submit buttons")
    public void user_Select_a_invoice_detail_to_create_claim_with_Input_data_in_to_all_mandatory_by_click_on_Submit_buttons() throws InterruptedException, IOException {
    	
    	Thread.sleep(5000);
    	WebElement ScrollDown=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_fvsv_CreateClaim_btnCreateClaim']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", ScrollDown);
        Thread.sleep(5000);
    	elementLibrary.click(createClaim_DropdownBtn);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(4000);
    	List<WebElement> AllList1 = driver.findElements(By.xpath("//div[contains(@id,'claimTypeCode_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList1) {
           if (List.getText().equals("Concealed Shortage")) {
        	   List.click(); 
               break;
                          }
       }
        Thread.sleep(5000);
        byte[] screenshot10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot10, "image/png");
        Thread.sleep(4000);
        elementLibrary.click(createClaimSubmitBtn);
        Thread.sleep(6000);
        byte[] screenshot77 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot77, "image/png");
        elementLibrary.click(oK_Retail);
        Thread.sleep(10000);
        byte[] screenshot101 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot101, "image/png");
        System.out.println("User Select a invoice detail to create claim with Input data in to all mandatory by click on Submit buttons");
        Thread.sleep(6000);
        
   
    }
    
    
    /*
   	 * Description verify the CreateReceiptbyReceiver details
   	 * TestcaseID- @Corrections_CreateReceiptbyReceiver @AP_OpenReceiving_TC029
   	 * 
   	*/
    
    @Then("User is in Corrections page and user has selected the Create receipt by receiver option from Correction Type dropdown")
    public void user_is_in_Corrections_page_and_user_has_selected_the_Create_receipt_by_receiver_option_from_Correction_Type_dropdown() throws IOException, InterruptedException {
        
    	Thread.sleep(8000);
    	elementLibrary.click(oR_Corrections_DropdownBtn);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(4000);
    	List<WebElement> AllList1 = driver.findElements(By.xpath("//div[contains(@id,'ddlCorrection_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : AllList1) {
           if (List.getText().equals("Create Receipt by Receiver")) {
        	   List.click(); 
               break;
                          }
       }
    	
    	Thread.sleep(3000);
    	System.out.println("User verify the corrections type deatils");
    	
       }
    

    @Then("User has searched for the Receipt in search for Receipt by Section {string},{string},{string},{string},{string}")
    public void user_has_searched_for_the_Receipt_in_search_for_Receipt_by_Section(String Country, String Store, String FromDate, String ToDate, String VendorNumber) throws IOException, InterruptedException {
       
    	Thread.sleep(3000);
    	elementLibrary.enterText(memoOutReceipt_USNumber, Country);
    	Thread.sleep(4000);
    	elementLibrary.enterText(memoOutReceipt_StoreNumber, Store);
    	Thread.sleep(4000);
    	elementLibrary.clearText(memoOutReceipt_FromDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(memoOutReceipt_FromDate, FromDate);
    	Thread.sleep(4000);
    	elementLibrary.clearText(memoOutReceipt_ToDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(memoOutReceipt_ToDate, ToDate);
    	Thread.sleep(4000);
    	elementLibrary.enterText(memoOut_VendorNumber, VendorNumber);
    	byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
    	Thread.sleep(8000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_fvsv_ReceiptSearch_btnReceiptsSearch']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
        Thread.sleep(4000);
    	elementLibrary.click(memoOut_searchforReceiver_Btn);
    	Thread.sleep(8000);
    	byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
    	Thread.sleep(8000);
    	
    }

    @Then("User click on checkbox displayed against any Receipt in Select receipt to correct grid")
    public void user_click_on_checkbox_displayed_against_any_Receipt_in_Select_receipt_to_correct_grid() throws InterruptedException {
       
    	Thread.sleep(3000);
    	WebElement Selectreceipt=driver.findElement(By.xpath("//*[contains(@id,'SelectColumnSelectCheckBox')][@type='checkbox']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", Selectreceipt);
        Thread.sleep(5000);
        WebElement CheckInvoices=driver.findElement(By.xpath("//table[@class='rgMasterTable']/tbody/tr[3]/td[2]/input"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", CheckInvoices);
        byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(6000);
        System.out.println("User click on checkbox displayed against any Receipt in Select receipt to correct grid");
    	
    }

    @Then("User Select a receipt detail to create receipt with Input data in to all mandatory by click on Submit buttons")
    public void user_Select_a_receipt_detail_to_create_receipt_with_Input_data_in_to_all_mandatory_by_click_on_Submit_buttons() throws Exception {
    	
    	Thread.sleep(5000);
    	WebElement ScrollDown=driver.findElement(By.xpath("//*[contains(@id,'CreateReceiptReceiver_btnSubmit')][@value='Submit']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", ScrollDown);
        Thread.sleep(8000);
        WebElement CostText=driver.findElement(By.xpath("//*[contains(@id,'ctl00_ctl05_fvlc_fvsv_CreateReceiptReceiver_frmCreateReceipt_txtCost')][@class='riTextBox riEnabled']"));
        elementLibrary.hilightElement(CostText);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='100';", CostText);
        Thread.sleep(5000);
        WebElement RetailText=driver.findElement(By.xpath("//*[contains(@id,'ctl00_ctl05_fvlc_fvsv_CreateReceiptReceiver_frmCreateReceipt_txtRetail')][@class='riTextBox riEnabled']"));
        elementLibrary.hilightElement(RetailText);
        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
        jse1.executeScript("arguments[0].value='99';", RetailText);
        Thread.sleep(5000);
        WebElement Description=driver.findElement(By.xpath("//*[contains(@id,'txtDescriptionCR')][@class='riTextBox riEnabled']"));
        elementLibrary.hilightElement(Description);
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].value='Test';", Description);
        Thread.sleep(5000);
        byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
        Thread.sleep(5000);
        elementLibrary.click(createReceipt_SubmitBtn);
        Thread.sleep(2000);
        byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
        elementLibrary.click(oK_Retail);
        Thread.sleep(10000);
        byte[] screenshot101 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot101, "image/png");
        Thread.sleep(2000);
        System.out.println("User Select a receipt detail to create receipt with Input data in to all mandatory by click on Submit buttons");
        Thread.sleep(5000);
        
        
        
    }
    
    /*
   	 * Description verify the CreateReceiptbyReceiver details
   	 * TestcaseID- @Corrections_CreateReceiptbyReceiver @AP_OpenReceiving_TC030
   	 * 
   	*/
    
    
    @When("User has clicked on New process button in the Hot operations page")
    public void user_has_clicked_on_New_process_button_in_the_Hot_operations_page() throws Exception {
        
    	Thread.sleep(5000);
		elementLibrary.click(newProcess_tab);
		Thread.sleep(10000);
		elementLibrary.hilightElement(newProcess_tab);
		byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
        System.out.println("User verify the NewProcess tab");
    	Thread.sleep(3000);
    }

    @Then("User has searched for Vendor Compliance and clicked on Start button")
    public void user_has_searched_for_Vendor_Compliance_and_clicked_on_Start_button() throws Exception {
    	
		Thread.sleep(5000);
    	elementLibrary.enterText(find_newProcess, "Vendor Compliance");
    	byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
		Thread.sleep(4000);
		elementLibrary.click(start_newProcess);
		byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
		Thread.sleep(10000);
		elementLibrary.switchToMainWindow();
    	Thread.sleep(3000);
        
    }

    @Then("User has click on Create issue plus button")
    public void user_has_click_on_Create_issue_plus_button() throws Exception {
    	
    	Thread.sleep(8000);
    	WebElement createIssueBtn=driver.findElement(By.xpath("//*[contains(@id,'btnCreateIssue')][@value='+ Create Issue']"));
    	elementLibrary.hilightElement(createIssueBtn);
    	byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
        createIssueBtn.click();
    	Thread.sleep(5000);
    	
    }

    @Then("User verify create issue popup window is displayed with all fields")
    public void user_verify_create_issue_popup_window_is_displayed_with_all_fields() throws InterruptedException {
    	
    	Thread.sleep(2000);
    	byte[] screenshot12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot12, "image/png");
		Thread.sleep(5000);
    }

    @Then("User verify Input data into all mandatory fields and click on submit button {string},{string},{string},{string},{string},{string}")
    public void user_verify_Input_data_into_all_mandatory_fields_and_click_on_submit_button(String IssueTitle, String Description, String FromDate, String ToDate, String Department, String Vendor) throws InterruptedException, IOException {
      
    	Thread.sleep(5000);
    	driver.switchTo().frame("AddComplianceView");
    	Thread.sleep(5000);
    	elementLibrary.enterText(vendorCompli_IssueTitle , IssueTitle);
    	Thread.sleep(4000);
    	elementLibrary.click(issueType_DropdownBtn);
    	Thread.sleep(6000);
    	List<WebElement> Item = driver.findElements(By.xpath("//div[contains(@id,'cmbIssueType_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : Item) {
           if (List.getText().equals("Others")) {
        	   List.click();
        	   Thread.sleep(2000);
        	   byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
               scenario.embed(screenshot222, "image/png");
               break;
                          }
       }
    	Thread.sleep(8000);
    	elementLibrary.click(countryCode_DropdownBtn);
    	Thread.sleep(6000);
    	List<WebElement> Item1 = driver.findElements(By.xpath("//div[contains(@id,'cmbCountryCode_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : Item1) {
           if (List.getText().equals("US")) {
        	   List.click();
        	   Thread.sleep(2000);
        	   byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
               scenario.embed(screenshot222, "image/png");
               break;
                          }
       }
    	byte[] screenshot233 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot233, "image/png");
    	Thread.sleep(8000);
    	elementLibrary.enterText(vendorCompli_Description , Description);
    	Thread.sleep(5000);
    	elementLibrary.click(status_DropdownBtn);
    	Thread.sleep(6000);
    	List<WebElement> Item2 = driver.findElements(By.xpath("//div[contains(@id,'cmbStatus_DropDown')]/div/ul/li"));
    			
    	 for (WebElement List : Item2) {
           if (List.getText().equals("Open")) {
        	   List.click();
        	   Thread.sleep(2000);
        	   byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
               scenario.embed(screenshot222, "image/png");
               break;
                          }
       }
    	 
    	Thread.sleep(5000);
     	elementLibrary.click(processCode_DropdownBtn);
     	Thread.sleep(6000);
     	List<WebElement> Item3 = driver.findElements(By.xpath("//div[contains(@id,'cmbProcessCode_DropDown')]/div/ul/li"));
     			
     	 for (WebElement List : Item3) {
            if (List.getText().equals("Open Receiving")) {
         	   List.click();
         	   Thread.sleep(2000);
         	   byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot222, "image/png");
                break;
                           }
        }
     	 
     	Thread.sleep(5000);
     	elementLibrary.click(division_DropdownBtn );
     	Thread.sleep(6000);
     	byte[] screenshot222 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot222, "image/png");
     	Thread.sleep(6000);
     	WebElement CheckBoxBtn= driver.findElement(By.xpath("//*[@id='ctl00_ctl05_fvlc_CreateCompliance_cmbDivision_DropDown']/div/ul/li[1]/label/input"));
     	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
     	executor1.executeScript("arguments[0].click();", CheckBoxBtn);
     	byte[] screenshot44 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot44, "image/png");
     	Thread.sleep(6000);
     	elementLibrary.click(vendorCompli_FromDate );
     	Thread.sleep(6000);
     	elementLibrary.clearText(vendorCompli_FromDate);
    	Thread.sleep(6000);
    	elementLibrary.enterText(vendorCompli_FromDate, FromDate);
    	Thread.sleep(6000);
    	elementLibrary.clearText(vendorCompli_ToDate);
    	Thread.sleep(6000);
    	elementLibrary.enterText(vendorCompli_ToDate, ToDate);
    	byte[] screenshot11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot11, "image/png");
    	Thread.sleep(6000);
    	elementLibrary.enterText(vendorCompli_Department, Department);
    	Thread.sleep(6000);
    	elementLibrary.enterText(vendorCompli_Vendor, Vendor);
    	Thread.sleep(6000);
    	elementLibrary.click(vendorCompli_findByBtn );
    	Thread.sleep(10000);
     	elementLibrary.click(instruction_DropdownBtn );
     	byte[] screenshot445 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot445, "image/png");
     	Thread.sleep(6000);
     	List<WebElement> Item5 = driver.findElements(By.xpath("//*[contains(@id,'cmbInstruction_DropDown')]/div/ul/li/label/input"));
     	for(int i=0;i<Item5.size();i++){
     		Item5.get(i).click();
     		Thread.sleep(6000);
     		byte[] screenshot444 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot444, "image/png");
     	}
     	
     	Thread.sleep(6000);
     	elementLibrary.click(restriction_DropdownBtn);
     	Thread.sleep(6000);
     	WebElement restriction_CheckBoxBtn1= driver.findElement(By.xpath("//*[contains(@id,'CreateCompliance_cmbRestriction_DropDown')]/div/ul/li[1]/label/input"));
     	JavascriptExecutor executor11 = (JavascriptExecutor)driver;
     	executor11.executeScript("arguments[0].click();", restriction_CheckBoxBtn1);
     	byte[] screenshot45 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot45, "image/png");
     	Thread.sleep(6000);
    	WebElement DownScroll=driver.findElement(By.xpath("//*[contains(@id,'CreateCompliance_btnCustomSearchAddInvoice')][@value='Submit']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        js.executeScript("arguments[0].scrollIntoView(true);", DownScroll);
        byte[] screenshot446 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot446, "image/png");
        Thread.sleep(6000);
        elementLibrary.click(issueCreate_SubmitBtn);
        Thread.sleep(6000);
        byte[] screenshot447 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot447, "image/png");
        Thread.sleep(10000);
        elementLibrary.click(oK_issueCreate);
        byte[] screenshot448 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot448, "image/png");
        Thread.sleep(10000);
     	System.out.println("User verify Input data into all mandatory fields");
     	Thread.sleep(2000);
    	
    }

    @Then("User verify Vendor compliance issue should get created and displayed in Vendor Compliance page")
    public void user_verify_Vendor_compliance_issue_should_get_created_and_displayed_in_Vendor_Compliance_page() throws Exception {
    	
    	Thread.sleep(6000);
    	WebElement TextStatus=driver.findElement(By.xpath("//table[@class='rgMasterTable']/tbody/tr[1]/td[5]"));
    	if(TextStatus.isDisplayed()){
    		
    		elementLibrary.hilightElement(TextStatus);
    	}
    	byte[] screenshot45 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot45, "image/png");
        System.out.println("User verify Vendor compliance issue should get created and displayed in Vendor Compliance page");
     	Thread.sleep(6000);
    }
	
	
	

}
