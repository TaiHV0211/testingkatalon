import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://online.hcmue.edu.vn/')

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/a_ng nhp'))

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/td'))

WebUI.setText(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_Tn ng nhp_ctl00ContentPlaceHolder1ctl_537cb7'), 
    '__++___++__')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_Mt m_ctl00ContentPlaceHolder1ctl00ctl_4544f5'), 
    'sFQ/sJkzszM=')

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_S lng truy cp_ctl00ContentPlaceHolder_02f130'))

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/tr_Tn ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_Tn ng nhp_ctl00ContentPlaceHolder1ctl_537cb7'), 
    '    ===---____+++')

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_S lng truy cp_ctl00ContentPlaceHolder_02f130'))

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/td_ng nhp                                  _cb492c'))

WebUI.setText(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_Tn ng nhp_ctl00ContentPlaceHolder1ctl_537cb7'), 
    '_+_+__+++++___')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_Mt m_ctl00ContentPlaceHolder1ctl00ctl_4544f5'), 
    'gI2mlAjwl1k=')

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_S lng truy cp_ctl00ContentPlaceHolder_02f130'))

WebUI.setText(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_Tn ng nhp_ctl00ContentPlaceHolder1ctl_537cb7'), 
    '_+_+__+++++___ssd')

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_S lng truy cp_ctl00ContentPlaceHolder_02f130'))

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_Tn ng nhp_ctl00ContentPlaceHolder1ctl_537cb7'))

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_Ging vin_ctl00ContentPlaceHolder1ctl0_c79aee'))

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_S lng truy cp_ctl00ContentPlaceHolder_02f130'))

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/label_Sinh vin'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_Mt m_ctl00ContentPlaceHolder1ctl00ctl_4544f5'), 
    '2EqOJo3t0wI=')

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_S lng truy cp_ctl00ContentPlaceHolder_02f130'))

WebUI.closeBrowser()

