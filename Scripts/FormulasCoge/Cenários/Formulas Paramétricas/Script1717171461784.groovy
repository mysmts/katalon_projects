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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('FormulasCoge/Funções/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Formulas paramétricas/Page_Frmulas COGE  - Home Page/span__fas fa-stream'))

WebUI.click(findTestObject('Object Repository/Formulas paramétricas/Page_Frmulas COGE  - Home Page/a_Frmulas Paramtricas'))

WebUI.click(findTestObject('Object Repository/Formulas paramétricas/Page_Frmulas COGE  - Exportao - Frmulas Par_45bfc9/h4_Exportao - Frmulas Paramtricas'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulas paramétricas/Page_Frmulas COGE  - Exportao - Frmulas Par_45bfc9/th_Nome'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulas paramétricas/Page_Frmulas COGE  - Exportao - Frmulas Par_45bfc9/th_Nome da Categoria'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulas paramétricas/Page_Frmulas COGE  - Exportao - Frmulas Par_45bfc9/th_Frmula Paramtrica'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulas paramétricas/Page_Frmulas COGE  - Exportao - Frmulas Par_45bfc9/th_Status'), 
    0)

def total = WebUI.verifyTextPresent('Total', true)

println(total)

if (!(total)) {
    KeywordUtil.markFailedAndStop('O texto "Total" não está presente na página.')
}

