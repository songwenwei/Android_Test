package NewsKey;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ScrollView;
import android.widget.TextView;
import StockMasterBase.NewsStockActivity;

public class TodayTheme_TodayThemeDetails extends NewsStockActivity{

	public void testCase001() throws Exception
	{
		CaseName="进入题材详细页面";
		
		this.windBottomTool("新闻");	
		this.windClickNewsItem("题材");
		
		View titleview=this.getViewById("textview_title");
		String titlename=((TextView)titleview).getText()+"";
		solo.clickOnView(titleview);
		String title=((TextView)this.getViewById("titleView")).getText()+"";
		String detailtitle=((TextView)this.getViewById("news_detil_newstitle")).getText()+"";
		CaseCheck=this.EqualsChecked(titlename.equals(detailtitle)&&title.equals("题材"));
		//Log.v("WindTest",detailtitle+":"+title);
		//Log.v("WindTest",CaseCheck+":"+titlename);
	}

	
	public void testCase002() throws Exception
	{
		CaseName="在题材详情页面点击【返回】按钮";
		this.windBottomTool("新闻");	
		this.windClickNewsItem("题材");
		
		View titleview=this.getViewById("textview_title");
		//String titlename=((TextView)titleview).getText()+"";
		solo.clickOnView(titleview);
		solo.sleep(1500);
		View back=this.getViewById("leftView");
		solo.clickOnView(back);
		solo.sleep(1000);
		CaseCheck=this.EqualsChecked(this.getViewById("subjectListView")!=null);
		//Log.v("WindTest",CaseCheck+":");
		
	}
	
	
	public void testCase003() throws Exception
	{
		CaseName="点击相关影响个股名称";
		this.windBottomTool("新闻");	
		this.windClickNewsItem("题材");
		View titleview=this.getViewById("textview_title");
		solo.clickOnView(titleview);
		solo.sleep(1500);
		solo.scrollToBottom();
		
		String stock_name1=((TextView)this.getViewById("stock_name")).getText()+"";
		solo.clickOnView(this.getViewById("stock_name"));
		solo.sleep(1500);
		String stock_name2=((TextView)this.getViewById("book_name")).getText()+"";
		solo.sleep(1500);
		CaseCheck=this.EqualsChecked(stock_name1.equals(stock_name2));
		//Log.v("WindTest",CaseCheck+":"+stock_name1+":"+stock_name2);
	}
	
	public void testCase004() throws Exception
	{
		CaseName="点击下一页";
		this.windBottomTool("新闻");	
		this.windClickNewsItem("题材");
		ViewGroup listview=(ViewGroup) this.getViewById("speed_driverbg").getParent();
		View titleview=listview.getChildAt(5);
		String title=((TextView)titleview.findViewById(this.getSourceID("textview_title"))).getText()+"";
				
		solo.clickOnView(listview.getChildAt(2));
		solo.sleep(1500);
		String detil_newstitle=((TextView)this.getViewById("news_detil_newstitle")).getText()+"";
		solo.clickOnView(this.getViewById("newsDetilBottomView_next"));
		solo.sleep(1500);
		solo.clickOnView(this.getViewById("newsDetilBottomView_next"));
		solo.sleep(1500);
		solo.clickOnView(this.getViewById("newsDetilBottomView_next"));
		solo.sleep(1500);

		detil_newstitle=((TextView)this.getViewById("news_detil_newstitle")).getText()+"";
		CaseCheck=this.EqualsChecked(detil_newstitle.equals(title));
		//Log.v("WindTest",CaseCheck+":");
	}
	
	
	public void testCase005() throws Exception
	{
		CaseName="点击上一页";
		this.windBottomTool("新闻");	
		this.windClickNewsItem("题材");
		ViewGroup listview=(ViewGroup) this.getViewById("speed_driverbg").getParent();
		View titleview=listview.getChildAt(2);
		String title=((TextView)titleview.findViewById(this.getSourceID("textview_title"))).getText()+"";
				
		solo.clickOnView(listview.getChildAt(5));
		solo.sleep(1500);
		String detil_newstitle=((TextView)this.getViewById("news_detil_newstitle")).getText()+"";
		//Log.v("WindTest",detil_newstitle+":");
		solo.clickOnView(this.getViewById("newsDetilBottomView_forward"));
		solo.sleep(1500);
		solo.clickOnView(this.getViewById("newsDetilBottomView_forward"));
		solo.sleep(1500);
		solo.clickOnView(this.getViewById("newsDetilBottomView_forward"));
		solo.sleep(1500);

		detil_newstitle=((TextView)this.getViewById("news_detil_newstitle")).getText()+"";
		CaseCheck=this.EqualsChecked(detil_newstitle.equals(title));
		Log.v("WindTest",CaseCheck+":");
		
	}
	
	public void testCase010() throws Exception
	{
		CaseName="点击小喇叭";
		this.windBottomTool("新闻");	
		this.windClickNewsItem("题材");
		solo.clickOnView(this.getViewById("speed_driverbg"));
		solo.sleep(1500);	
		CaseCheck=this.EqualsChecked(!this.windAPPisError());
	}
}
