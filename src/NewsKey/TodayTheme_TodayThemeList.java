package NewsKey;

import android.util.Log;
import android.view.View;
import StockMasterBase.NewsStockActivity;

public class TodayTheme_TodayThemeList extends NewsStockActivity{

	public void testCase001() throws Exception
	{
		CaseName="题材列表页面校验";
		
		this.windBottomTool("新闻");	
		this.windClickNewsItem("题材");
		
		View time=this.getViewById("textview_time");
		View title=this.getViewById("textview_title");
		View toptitle=this.getViewById("textview_toptitle");
		View averagetitle=this.getViewById("textview_averagetitle");
		CaseCheck=this.EqualsChecked(time!=null&&title!=null&&toptitle!=null&&averagetitle!=null);
	}
	
	public void testCase002() throws Exception
	{
		CaseName="在题材列表点击小喇叭";
		this.windBottomTool("新闻");	
		this.windClickNewsItem("题材");
		Log.v("WindTest",solo.getCurrentActivity()+"");
		View play=this.getViewById("newsDetilBottomView_read");
		solo.clickOnView(play);
		CaseCheck=this.EqualsChecked(!this.windAPPisError());
		
	}

}
