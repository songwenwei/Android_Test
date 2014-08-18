package InterConnection;

import android.util.Log;
import android.widget.TextView;
import StockMasterBase.StockActivity;

public class SoftWareVersion extends StockActivity  {
	
	
	public void testCase001() throws Exception {
		CaseName="点击关于";
		this.windBottomTool("互联");
		solo.clickOnView(this.getViewById("aboutSetting"));
		solo.scrollToBottom();
		solo.clickOnView(this.getViewById("version"));
		
		String titlename=((TextView)this.getViewById("titleView")).getText()+"";
		String productname=((TextView)this.getViewById("textview_productname")).getText()+"";
		CaseCheck=this.EqualsChecked(titlename.equals("软件版本")&&productname.equals("万得股票"));
		//Log.v("WindTest",CaseCheck);
		
				
		
	}

}
