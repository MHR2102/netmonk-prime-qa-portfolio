import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.baseUrl + '/login')

WebUI.setText(findTestObject('Login/txt_username'), GlobalVariable.username)
WebUI.setEncryptedText(findTestObject('Login/txt_password'), GlobalVariable.password)
WebUI.click(findTestObject('Login/btn_login'))

WebUI.click(findTestObject('Menu/btn_apiMonitoring'))
WebUI.click(findTestObject('API/btn_addMonitor'))

WebUI.setText(findTestObject('API/txt_name'), 'User API Monitor')
WebUI.setText(findTestObject('API/txt_url'), 'https://api.company.com/user')
WebUI.selectOptionByValue(findTestObject('API/select_method'), 'GET', false)
WebUI.setText(findTestObject('API/txt_interval'), '60')
WebUI.setText(findTestObject('API/txt_slaTarget'), '99')

WebUI.click(findTestObject('API/btn_save'))

WebUI.verifyElementVisible(findTestObject('API/toast_success'))
WebUI.verifyElementText(findTestObject('API/row_status'), 'ACTIVE')

WebUI.closeBrowser()
