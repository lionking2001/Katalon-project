import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:4200/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('UC-30/Page_Registration/a_Lecturer'))

WebUI.setText(findTestObject('UC-30/Page_Registration/input_username_lec'), 'lecturer')

WebUI.setText(findTestObject('UC-30/Page_Registration/input_password_lec'), 'lecturer')

WebUI.click(findTestObject('UC-30/Page_Registration/input_loginbtn_l'))

WebUI.click(findTestObject('UC-30/Page_Registration/span_Courses'))

WebUI.verifyElementPresent(findTestObject('UC-30/Page_Registration/span_Courses'), 0)

WebUI.click(findTestObject('UC-30/Page_Registration/a_Detail'))

WebUI.click(findTestObject('UC-30/Page_Registration/span_953323 SOFWARE CONS TESTM'))

WebUI.verifyElementPresent(findTestObject('UC-30/Page_Registration/span_953323 SOFWARE CONS TESTM'), 0)

WebUI.click(findTestObject('UC-30/Page_Registration/button_Assign Grade'))

WebUI.setText(findTestObject('UC-30/Page_Registration/input_val_grade'), 'A')

WebUI.click(findTestObject('UC-30/Page_Registration/button_Save'))

WebUI.verifyTextPresent('A', false)

WebUI.closeBrowser()

