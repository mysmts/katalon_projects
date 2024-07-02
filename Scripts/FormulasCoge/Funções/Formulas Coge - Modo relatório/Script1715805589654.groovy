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

WebUI.click(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Home Page/a__nav-link'))

WebUI.click(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Home Page/a_Frmulas COGE'))

WebUI.setText(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/input_Formato 0.00_value'), 
    '10')

WebUI.click(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/input_Formato 0.00_btn-submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/span_()10.00'), 
    0)

WebUI.click(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/button_Deletar'))

WebUI.click(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/button_Sim, apagar assim mesmo'))

WebUI.click(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/button_OK'))

WebUI.click(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/span_-Selecione-'))

WebUI.setText(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , select2-Id-container, ,_84a2e7'), 
    'fcm001')

WebUI.sendKeys(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , select2-Id-container, ,_84a2e7'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/input_Nmero do Processo_Report.ProcessNumber'), 
    '1')

WebUI.click(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/span_-Selecione-_1'))

WebUI.setText(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , select2-Id-container, ,_84a2e7'), 
    '2020')

WebUI.sendKeys(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , select2-Id-container, ,_84a2e7'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/span_-Selecione-_1_2'))

WebUI.setText(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , select2-Id-container, ,_84a2e7'), 
    'janeiro')

WebUI.sendKeys(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , select2-Id-container, ,_84a2e7'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/span_-Selecione-_1_2_3'))

WebUI.setText(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , select2-Id-container, ,_84a2e7'), 
    '2024')

WebUI.sendKeys(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , select2-Id-container, ,_84a2e7'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/span_-Selecione-_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , select2-Id-container, ,_84a2e7'), 
    'maio')

WebUI.sendKeys(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , select2-Id-container, ,_84a2e7'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio Grfico/button_Exibir'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulas Coge/Page_Frmulas COGE  - Relatrio de Variao dos_5e0529/h4_FCM0001 - Acessrios de Cabo de Cobre (Ex_be869d'), 
    0)

