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

WebUI.navigateToUrl('http://localhost:4200/course-crud')

WebUI.click(findTestObject('UC3/i_add'))

WebUI.setText(findTestObject('UC3/input_name'), 'Software Quality Assurance')

WebUI.setText(findTestObject('UC3/input_courseNum'), '953422')

WebUI.setText(findTestObject('UC3/input_courseRoom'), 'CAMT114')

WebUI.setText(findTestObject('UC3/input_courseDate'), 'Friday 9:30-12:30')

WebUI.setText(findTestObject('UC3/input_description'), 'Introduction to quality assurance. Code of ethics')

WebUI.setText(findTestObject('UC3/input_seat'), '50')

WebUI.click(findTestObject('UC3/span_Select Option'))

WebUI.click(findTestObject('UC3/span_Mr.Phudinun Singkhamfu'))

WebUI.sendKeys(findTestObject('UC3/span_Select Option'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('UC3/span_160'))

WebUI.sendKeys(findTestObject('UC3/span_Select Option1'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('UC3/span_College of Art Media And'))

WebUI.closeBrowser()

