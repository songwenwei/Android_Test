package NewsKey;

import com.robotium.solo.Solo;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import StockMasterBase.NewsStockActivity;

//新闻-新闻模块-新闻详情
public class News_Details extends NewsStockActivity{

	public void testCase001() throws Exception
	{
		CaseName = "进入新闻详情";
		windBottomTool("新闻");
		this.windClickNewsItem("滚动");
		ViewGroup pull_to_refresh_list=(ViewGroup)getViewById("pull_to_refresh_list");
		ViewGroup newstitle1=(ViewGroup)pull_to_refresh_list.getChildAt(2);
		//View newstitle_time1=newstitle1.findViewById(getSourceID("newstitle_time"));
		View newstitle_text1=newstitle1.findViewById(getSourceID("newstitle_text"));
		//String newstitletime1=((TextView)newstitle_time1).getText().toString();
		String newstitletext1=((TextView)newstitle_text1).getText().toString();
		
		solo.clickOnView(newstitle1);
		String news_detil_newstitle=((TextView)getViewById("news_detil_newstitle")).getText()+"";
		
		CaseCheck=EqualsChecked(newstitletext1.contains(news_detil_newstitle));
		Log.v("WindTest",CaseCheck);
	}

	public void testCase002() throws Exception
	{
		//预加载机制，首次进入详情，上、下一页也显示了，只是被隐藏。需要多切一次
		CaseName = "点击【->】进入下一条新闻";
		this.windBottomTool("新闻");
		this.windClickNewsItem("滚动");
		ViewGroup pull_to_refresh_list=(ViewGroup)this.getViewById("pull_to_refresh_list");
		ViewGroup newstitle1=(ViewGroup)pull_to_refresh_list.getChildAt(2);

		ViewGroup newstitle2=(ViewGroup)pull_to_refresh_list.getChildAt(5);
		View newstitle_text1=newstitle2.findViewById(this.getSourceID("newstitle_text"));
		String newstitletime1=((TextView)newstitle_text1).getText().toString();
		
		solo.clickOnView(newstitle1);
		View newsDetilBottomView_next=getViewById("newsDetilBottomView_next").findViewById(getSourceID("buttonLabel"));

		solo.clickOnView(newsDetilBottomView_next);
		solo.clickOnView(newsDetilBottomView_next);
		solo.clickOnView(newsDetilBottomView_next);
		String news_detil_newstitle=((TextView)getViewById("news_detil_newstitle")).getText()+"";
		//Log.v("WindTest","news_detil_newstitle2:"+news_detil_newstitle);
		//Log.v("WindTest","newstitletime1:"+newstitletime1);		
		CaseCheck=EqualsChecked(news_detil_newstitle.contains(newstitletime1));
	}
	
	public void testCase003() throws Exception
	{
		//预加载机制，首次进入详情，上、下一页也显示了，只是被隐藏。需要多切一次
		CaseName = "点击【<-】进入上一条新闻";
		this.windBottomTool("新闻");
		this.windClickNewsItem("滚动");
		ViewGroup pull_to_refresh_list=(ViewGroup)this.getViewById("pull_to_refresh_list");
		ViewGroup newstitle1=(ViewGroup)pull_to_refresh_list.getChildAt(5);

		ViewGroup newstitle2=(ViewGroup)pull_to_refresh_list.getChildAt(2);
		View newstitle_text1=newstitle2.findViewById(this.getSourceID("newstitle_text"));
		String newstitletext1=((TextView)newstitle_text1).getText().toString();
		
		solo.clickOnView(newstitle1);
		View newsDetilBottomView_next=getViewById("newsDetilBottomView_forward").findViewById(getSourceID("buttonLabel"));

		solo.clickOnView(newsDetilBottomView_next);
		solo.clickOnView(newsDetilBottomView_next);
		solo.clickOnView(newsDetilBottomView_next);
		String news_detil_newstitle=((TextView)getViewById("news_detil_newstitle")).getText()+"";
		//Log.v("WindTest","news_detil_newstitle2:"+news_detil_newstitle);
		//Log.v("WindTest","newstitletime1:"+newstitletext1);		
		CaseCheck=EqualsChecked(news_detil_newstitle.contains(newstitletext1));
	}
	
	public void testCase004() throws Exception
	{
		//银行文本无法获取，指定新闻，确定windcode值
		CaseName = "新闻详情中跳转到个股界面";
		windBottomTool("新闻");
		solo.clickOnView(getViewById("rightViewLine"));
		
		String s = "6月4日在售高收益银行理财产品一览";
		solo.clearEditText(0);
		solo.enterText(0, s);
		
		solo.sendKey(Solo.ENTER);
		solo.clickOnText(s, 2);
		View relative_windcodes=this.getViewById("relative_windcodes");
		int [] location={0,0};
		int [] size= {0,0};
		relative_windcodes.getLocationOnScreen(location);
		size[0]=relative_windcodes.getWidth();
		size[1]=relative_windcodes.getHeight();
		solo.clickOnScreen(location[0]+size[0]*3/7, location[1]+size[1]/2);
		
		String book_name=((TextView)getViewById("book_name")).getText()+"";
		//Log.v("WindTest",book_name);		
		CaseCheck=EqualsChecked(book_name.contains("南京银行"));
		
	}
	
	public void testCase005() throws Exception
	{
		//银行文本无法获取，指定新闻，确定windcode值
		CaseName = "新闻详情里朗读新闻";
		
		windBottomTool("新闻");
		ViewGroup pull_to_refresh_list=(ViewGroup)getViewById("pull_to_refresh_list");
		ViewGroup newstitle1=(ViewGroup)pull_to_refresh_list.getChildAt(2);
		solo.clickOnView(newstitle1);
		View newsDetilBottomView_read=getViewById("newsDetilBottomView_read").findViewById(getSourceID("buttonLabel"));
		solo.clickOnView(newsDetilBottomView_read);
		CaseCheck=this.EqualsChecked(solo.waitForActivity("NewsDetailActivity",1000));			

	}
	


	
	
	public void testCase009() throws Exception
	{
		CaseName = "新闻列表中搜索新闻";
		windBottomTool("新闻");
		solo.clickOnView(getViewById("rightViewLine"));
		
		String s = "6月4日在售高收益银行理财产品一览";
		solo.clearEditText(0);
		solo.enterText(0, s);
		solo.sendKey(Solo.ENTER);
		CaseCheck=this.EqualsChecked(solo.searchText(s,2));
	}
	
	public void testCase010() throws Exception
	{
		CaseName = "从搜索结果界面返回";
		windBottomTool("新闻");
		solo.clickOnView(getViewById("rightViewLine"));
		
		String title=((TextView)this.getViewById("titleView")).getText()+"";
		if(title.contains("新闻搜索"))
			solo.clickOnView(getViewById("leftView"));
		title=((TextView)this.getViewById("titleView")).getText()+"";
		
		CaseCheck=this.EqualsChecked(!title.contains("新闻搜索"));
	}
	
	public void testCase011() throws Exception
	{
		CaseName = "从搜索结果进入详情";
		
		windBottomTool("新闻");
		solo.clickOnView(getViewById("rightViewLine"));
		
		String s = "6月4日在售高收益银行理财产品一览";
		solo.clearEditText(0);
		solo.sleep(5000);
		solo.enterText(0, s);
		
		solo.sendKey(Solo.ENTER);
		solo.clickOnText(s, 2);
		String title=((TextView)this.getViewById("titleView")).getText()+"";
		CaseCheck=this.EqualsChecked(!title.contains(s));
	}
}
