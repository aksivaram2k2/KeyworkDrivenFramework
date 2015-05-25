//http://www.toolsqa.com/selenium-webdriver/keyword-driven-framework/steps-set-framework/
package executionEngine;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;

import utility.ExcelUtils;
import config.ActionKeywords;
public class DriverScript
{
	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception
	{
		String sPath = "D:\\Demoworkspace\\KeyworkDrivenFramework\\src\\dataEngine\\DataEngine.xlsx";
		ExcelUtils.setExcelFile(sPath, "Test Steps");
		for(int iRow = 1; iRow <=9; iRow++)
		{
			String sActionKeyword = ExcelUtils.getCellData(iRow,3);
			if(sActionKeyword.equalsIgnoreCase("openBrowser"))
			{
				ActionKeywords.openBrowser();
			}
			else if(sActionKeyword.equalsIgnoreCase("navigate"))
			{
				ActionKeywords.navigate();
			}
			else if(sActionKeyword.equalsIgnoreCase("click_MyAccount"))
			{
				ActionKeywords.click_MyAccount();
			}
			else if(sActionKeyword.equalsIgnoreCase("input_Username"))
			{
				ActionKeywords.input_Username();
			}
			else if(sActionKeyword.equalsIgnoreCase("input_Password"))
			{
				ActionKeywords.input_Password();
			}
			else if(sActionKeyword.equalsIgnoreCase("click_Login"))
			{
				ActionKeywords.click_Login();
			}
			else if(sActionKeyword.equalsIgnoreCase("waitFor"))
			{
				ActionKeywords.wsitFor();
			}
			else if(sActionKeyword.equalsIgnoreCase("click_Logout"))
			{
				ActionKeywords.click_Logout();
			}
			else if(sActionKeyword.equalsIgnoreCase("closeBrowser"))
			{
				ActionKeywords.closeBrowser();
			}
		}
	}
}
