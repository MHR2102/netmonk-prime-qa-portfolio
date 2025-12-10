WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.baseUrl + '/login')

WebUI.setText(findTestObject('Login/txt_username'), GlobalVariable.username)
WebUI.setEncryptedText(findTestObject('Login/txt_password'), GlobalVariable.password)
WebUI.click(findTestObject('Login/btn_login'))

WebUI.click(findTestObject('Menu/API Monitoring'))
WebUI.click(findTestObject('API/btn_add'))

WebUI.setText(findTestObject('API/txt_name'), 'User API Monitor')
WebUI.setText(findTestObject('API/txt_url'), 'https://api.company.com/user')
WebUI.selectOptionByValue(findTestObject('API/select_method'), 'GET', false)
WebUI.setText(findTestObject('API/txt_interval'), '60')
WebUI.setText(findTestObject('API/txt_sla'), '99')

WebUI.click(findTestObject('API/btn_save'))
WebUI.verifyElementVisible(findTestObject('API/toast_success'))
WebUI.verifyElementText(findTestObject('API/row_status'), 'ACTIVE')

WebUI.closeBrowser()
