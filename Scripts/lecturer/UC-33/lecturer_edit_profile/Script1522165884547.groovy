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

WebUI.click(findTestObject('UC-33/a_Lecturer (2)'))

WebUI.setText(findTestObject('UC-33/input_username_lec (2)'), 'lecturer')

WebUI.setText(findTestObject('UC-33/input_password_lec (2)'), 'lecturer')

WebUI.click(findTestObject('UC-33/input_loginbtn_l (2)'))

WebUI.click(findTestObject('UC-33/a_Profile (2)'))

WebUI.click(findTestObject('UC-33/a_Edit Profile (2)'))

WebUI.setText(findTestObject('UC-33/input_name (2)'), 'Mary ')

WebUI.setText(findTestObject('UC-33/input_surname (2)'), 'Cruz ')

WebUI.setText(findTestObject('UC-33/input_email (2)'), 'mary_d@cmu.ac.th')

WebUI.setText(findTestObject('UC-33/input_date (2)'), '4/5/1994 ')

WebUI.setText(findTestObject('UC-33/input_address (2)'), '1953 Maud Street Philadelphia DE 19103 ')

WebUI.click(findTestObject('UC-33/input_select-dropdown'))

WebUI.click(findTestObject('UC-33/span_College of Art Media And (2)'))

WebUI.setText(findTestObject('UC-33/input_phone (2)'), '099-7596578 ')

WebUI.click(findTestObject('UC-33/a_Save (2)'))

WebUI.click(findTestObject('UC-33/span_Profile'))

WebUI.verifyElementPresent(findTestObject('UC-33/span_Profile'), 0)

WebUI.closeBrowser()

