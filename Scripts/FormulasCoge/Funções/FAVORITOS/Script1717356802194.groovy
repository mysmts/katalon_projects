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

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Home Page/span__fas fa-stream'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Home Page/a_Todos'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/button_Deletar'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/button_Sim, apagar assim mesmo'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/button_OK'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/button_Deletar'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/button_Cancel'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/h4_Gerenciar Favoritos'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/span_Total de 4 favoritos_fas fa-redo-alt'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/span_Total de 4 favoritos_fas fa-bars'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/a_Registrar Favorito'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Registrar Favorito/span_FCM0001 - Acessrios de Cabo de Cobre (_2d1641'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Registrar Favorito/button_Salvar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/select_102550100'), 
    '25', true)

WebUI.setText(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/input_search'), 'FCM')

WebUI.sendKeys(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/input_search'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/input_search'), 'FCM0003')

WebUI.sendKeys(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/input_search'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/input_search'), '')

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/span_Total de 4 favoritos_fas fa-bars'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Gerenciar Favoritos/a_Meu Perfil'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/a_jordinofuncoge.org.br (Jordino Pereira)'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/p_E-mail jordinofuncoge.org.br'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/div_Dados de Perfil                        _1d813d'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/p_Inativo                                    NO'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/em_NO'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/label_Aceita Divulgaes'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/label_E-mail Secundrio'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/label_E-mail Secundrio'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/p_E-mail Secundrio jordinofuncoge.org.br'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/h4_Meus Acessos'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/span_Os seus dados de perfil podem ser modi_9d7f7c'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/span_Os seus dados de perfil podem ser modi_9d7f7c'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/span_Os seus dados de perfil podem ser modi_e1e9e4'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/a_Autorizaes'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Autorizaes/i'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Autorizaes/button_Salvar'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Autorizaes/span_Tela de formulrio de edio das suas aut_e0de8b'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/span_Os seus dados de perfil podem ser modi_e1e9e4'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/a_Alterar Senha'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Alterar Senha/span_caracteres especiais_fas fa-arrow-left'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/span_Os seus dados de perfil podem ser modi_e1e9e4'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/a_Alterar Dados de Perfil'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Editar Dados de Perfil_db63c8/span_Tela de formulrio de edio de cidade_fa_a2a941'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/div_jordinofuncoge.org.br (Jordino Pereira)_1f0fac'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/a_jordinofuncoge.org.br (Jordino Pereira)'))

WebUI.click(findTestObject('Object Repository/FAVORITOS/Page_Frmulas COGE  - Meus Dados/span_(Jordino Pereira)'))

