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

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Home Page/span__fas fa-stream'))

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Home Page/a_Indicadores'))

WebUI.setText(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_Formato 0.00_value'), 
    '10')

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_Formato 0.00_btn-submit'))

WebUI.setText(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_Formato 0.00_value'), 
    '20')

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_Formato 0.00_btn-submit'))

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/button_Deletar'))

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/button_Sim, apagar assim mesmo'))

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/button_OK'))

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/button_Deletar'))

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/button_Sim, apagar assim mesmo'))

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/button_OK'))

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/span_-Selecione-'))

WebUI.setText(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , Report_ProcessNumber, ,_d64bb1'), 
    'AC')

WebUI.sendKeys(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , Report_ProcessNumber, ,_d64bb1'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_Nmero do Processo_Report.ProcessNumber'), 
    '1')

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/span_-Selecione-_1'))

WebUI.setText(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , Report_ProcessNumber, ,_d64bb1'), 
    '2020')

WebUI.sendKeys(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , Report_ProcessNumber, ,_d64bb1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/span_-Selecione-_1_2'))

WebUI.setText(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , Report_ProcessNumber, ,_d64bb1'), 
    'jAN')

WebUI.sendKeys(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , Report_ProcessNumber, ,_d64bb1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/span_-Selecione-_1_2_3'))

WebUI.setText(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , Report_ProcessNumber, ,_d64bb1'), 
    '2024')

WebUI.sendKeys(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , Report_ProcessNumber, ,_d64bb1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/span_-Selecione-_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , Report_ProcessNumber, ,_d64bb1'), 
    'Maio')

WebUI.sendKeys(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/input_concat(id(, , Report_ProcessNumber, ,_d64bb1'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Relatrio Grfico/button_Exibir'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Grfico de Variao dos I_d57613/h4_AAC - AramesdeAoaoCarbono'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Indicadores/Page_Frmulas COGE  - Grfico de Variao dos I_d57613/canvas_Grfico de Tendncia_canvas'), 
    0)

