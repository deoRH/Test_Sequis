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

WebUI.openBrowser('https://sequis.co.id/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('dropdown_asuransi_jiwa'), 20)

WebUI.click(findTestObject('dropdown_asuransi_jiwa'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('dana_pensiun'), 0)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('dana_pensiun'))

WebUI.click(findTestObject('arrow_button'))

WebUI.waitForElementPresent(findTestObject('selanjutnya_button'), 10)

WebUI.click(findTestObject('selanjutnya_button'))

WebUI.waitForElementPresent(findTestObject('Jenis_Kelamin_Pria'), 10)

if (GlobalVariable.Jenis_Kelamin == 'Pria') {
    WebUI.click(findTestObject('Jenis_Kelamin_Pria'))
} else {
    WebUI.click(findTestObject('Jenis_Kelamin_Wanita'))
}

WebUI.click(findTestObject('usia_button'))

WebUI.waitForElementPresent(findTestObject('usia_range'), 10)

WebUI.click(findTestObject('usia_range'))

if (GlobalVariable.Marital_Status == 'Menikah') {
    WebUI.click(findTestObject('Marital_Status_Menikah'))

    WebUI.waitForElementPresent(findTestObject('tidak_button'), 10)

    WebUI.click(findTestObject('tidak_button'))
} else {
    WebUI.click(findTestObject('Marital_Status_Belum_Menikah'))
}

WebUI.scrollToElement(findTestObject('selanjutnya2_button'), 0)

WebUI.click(findTestObject('selanjutnya2_button'))

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementPresent(findTestObject('rata2_pengeluaran_ddl'), 0)

WebUI.click(findTestObject('rata2_pengeluaran_ddl'))

WebUI.click(findTestObject('rata2_5dan10'))

WebUI.click(findTestObject('tabungan_rutin_ddl'))

WebUI.click(findTestObject('tabungan_2dan5juta'))

WebUI.click(findTestObject('alokasi_dana_ddl'))

WebUI.click(findTestObject('kurang_1juta'))

WebUI.scrollToElement(findTestObject('selanjutnya3_button'), 0)

WebUI.click(findTestObject('selanjutnya3_button'))

WebUI.waitForElementVisible(findTestObject('dapatkan_hasil'), 15)

WebUI.click(findTestObject('dapatkan_hasil'))

WebUI.waitForElementVisible(findTestObject('dapatkan_sekarang'), 15)

WebUI.takeScreenshot()

WebUI.closeBrowser()

