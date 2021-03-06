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

WebUI.navigateToUrl('http://localhost:4200/admin')

WebUI.setText(findTestObject('UC12/UC12-NormalFlow/Page_Registration/input_username'), 'admin')

WebUI.setText(findTestObject('UC12/UC12-NormalFlow/Page_Registration/input_password'), 'admin')

WebUI.click(findTestObject('UC12/UC12-NormalFlow/Page_Registration/input_loginbtn'))

WebUI.navigateToUrl('http://localhost:4200/lecturer-crud')

WebUI.click(findTestObject('UC12/UC12-NormalFlow/Page_Registration/a_Edit'))

WebUI.click(findTestObject('UC12/UC12-NormalFlow/Page_Registration/div_Lecturer Information'))

WebUI.setText(findTestObject('UC12/UC12-NormalFlow/Page_Registration/input_name'), 'Allyn')

WebUI.setText(findTestObject('UC12/UC12-NormalFlow/Page_Registration/input_surname'), 'Trace')

WebUI.setText(findTestObject('UC12/UC12-NormalFlow/Page_Registration/input_email'), 'Allyn_t@abc.ac.th')

WebUI.setText(findTestObject('UC12/UC12-NormalFlow/Page_Registration/input_date'), '8/10/1987')

WebUI.click(findTestObject('UC12/UC12-NormalFlow/Page_Registration/div_Lecturer Information'))

WebUI.setText(findTestObject('UC12/UC12-NormalFlow/Page_Registration/input_address'), '137 Idahaho,Twin Fall')

WebUI.doubleClick(findTestObject('UC12/UC12-NormalFlow/Page_Registration/input_phone'))

WebUI.setText(findTestObject('UC12/UC12-NormalFlow/Page_Registration/input_phone'), '0653514526')

WebUI.click(findTestObject('UC12/UC12-NormalFlow/Page_Registration/button_Save'))

WebUI.closeBrowser()

