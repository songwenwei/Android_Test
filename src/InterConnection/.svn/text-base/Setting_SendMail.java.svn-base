package InterConnection;

import android.util.Log;
import android.widget.TextView;
import StockMasterBase.StockActivity;

public class Setting_SendMail extends StockActivity  {
	
	
	public void testCase001() throws Exception {
		CaseName="发邮件";
		this.windBottomTool("互联");
		//solo.sleep(5000);
		solo.clickOnView(this.getViewById("aboutSetting"));
		solo.clickOnView(this.getViewById("sendMail"));
		solo.clickOnText("发邮件");
        CaseCheck=this.EqualsChecked(solo.searchText("请选择邮件发送软件"));
		
	}
}
