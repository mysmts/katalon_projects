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

WebUI.click(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Home Page/span__fas fa-stream'))

WebUI.click(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Home Page/a_Variaes'))

WebUI.navigateToUrl('https://formulascoge.org.br/exportacoes/variacoes')

WebUI.click(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/h4_Exportao - Variaes'))

WebUI.click(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/label_Tipos de Exportao'))

WebUI.click(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/span_-Selecione-_1'))

WebUI.setText(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/input_concat(id(, , select2-StartYear-conta_c1e7f1'), 
    'janeiro')

WebUI.sendKeys(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/input_concat(id(, , select2-StartYear-conta_c1e7f1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/span_2024'))

WebUI.setText(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/input_concat(id(, , select2-StartYear-conta_c1e7f1'), 
    '2020')

WebUI.sendKeys(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/input_concat(id(, , select2-StartYear-conta_c1e7f1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/span_-Selecione-_1_2'))

WebUI.setText(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/input_concat(id(, , select2-StartYear-conta_c1e7f1'), 
    '2024')

WebUI.sendKeys(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/input_concat(id(, , select2-StartYear-conta_c1e7f1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/span_-Selecione-_1_2_3'))

WebUI.setText(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/input_concat(id(, , select2-StartYear-conta_c1e7f1'), 
    'maio')

WebUI.sendKeys(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/input_concat(id(, , select2-StartYear-conta_c1e7f1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes/button_Exportar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes por_cd9072/h4_Exportao - Variaes por Perodo das Frmulas COGE'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes por_cd9072/h2_Frmulas MateriaisServios.  Perodo 010120_1d151c'), 
    0)

WebUI.click(findTestObject('Object Repository/Variacoes por periodo/Page_Frmulas COGE  - Exportao - Variaes por_cd9072/span_Exportao - Variaes por Perodo das Frmu_b7bcd4'), 
    FailureHandling.STOP_ON_FAILURE)

