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

WebUI.setText(findTestObject('UC12/UC12-AlternativeFlow_NotInputDOB/Page_Registration/input_username'), 'admin')

WebUI.setText(findTestObject('UC12/UC12-AlternativeFlow_NotInputDOB/Page_Registration/input_password'), 'admin')

WebUI.sendKeys(findTestObject('UC12/UC12-AlternativeFlow_NotInputDOB/Page_Registration/input_password'), Keys.chord(Keys.ENTER))

WebUI.navigateToUrl('http://localhost:4200/lecturer-crud')

WebUI.click(findTestObject('UC12/UC12-AlternativeFlow_NotInputDOB/Page_Registration/a_Edit'))

WebUI.setText(findTestObject('UC12/UC12-AlternativeFlow_NotInputDOB/Page_Registration/input_name'), 'praphusak')

WebUI.setText(findTestObject('UC12/UC12-AlternativeFlow_NotInputDOB/Page_Registration/input_surname'), 'Tre-Intong')

WebUI.setText(findTestObject('UC12/UC12-AlternativeFlow_NotInputDOB/Page_Registration/input_email'), 'parphusak_t@cmu.ac.th')

WebUI.setText(findTestObject('UC12/UC12-AlternativeFlow_NotInputDOB/Page_Registration/input_date'), 'a')

WebUI.click(findTestObject('UC12/UC12-AlternativeFlow_NotInputDOB/Page_Registration/input_name'))

WebUI.verifyElementPresent(findTestObject('UC12/UC12-AlternativeFlow_NotInputDOB/Page_Registration/div_card-panel red lighten-1'), 
    0)

