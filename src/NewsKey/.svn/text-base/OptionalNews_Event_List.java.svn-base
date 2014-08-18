package NewsKey;

import StockMasterBase.NewsStockActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;


//新闻-自选股新闻-大事
public class OptionalNews_Event_List extends NewsStockActivity{

	public void testCase001() throws Exception
	{
		CaseName="添加单支A股后查看自选大事列表";
		
		this.windDeleteAllShares();
		
		this.windBottomTool("市场");
		String windcode="130018.IB";
		this.windEnterTimeShare(windcode);
		
		//确认添加自选
		View add_self_button=this.getViewById("add_self_button");
		String add_self_name=((TextView)this.getViewById("speed_text_view")).getText()+"";
		if(!add_self_name.equals("更多操作"))
			{
				solo.clickOnView(add_self_button);
				solo.sleep(1000);
			}
		String book_name=((TextView)this.getViewById("book_name")).getText()+"";
		
		View speed_main_scroll=this.getViewById("speed_main_scroll");
		int []speed_main_location={0,0};//solo.scrollDown();
		speed_main_scroll.getLocationOnScreen(speed_main_location);
		View tabBar=this.getViewById("tabBar");
		int[] tabBar_location1={0,0};
		int[] tabBar_location2={0,0};
		int[] tabBar_size={0,0};
		tabBar.getLocationOnScreen(tabBar_location1);
		
		speed_main_scroll.scrollBy(0, tabBar_location1[1]-speed_main_location[1]);
		//Log.v("WindTest",tabBar_location1[0]+":"+tabBar_location1[1]);
		tabBar.getLocationOnScreen(tabBar_location1);
		tabBar_size[0]=tabBar.getWidth();
		tabBar_size[1]=tabBar.getHeight();
		solo.clickOnScreen(tabBar_location1[0]+tabBar_size[0]/3*1+5, tabBar_location1[1]+tabBar_size[1]/2);
		windDataReq();
		tabBar.getLocationOnScreen(tabBar_location2);
		speed_main_scroll.scrollBy(0, tabBar_location2[1]-tabBar_location1[1]);
		
		View eventid=this.getViewById("view_news_event").findViewById(this.getSourceID("newstitle_text"));
		String eventtitle1=null;
		if(eventid!=null)
		{
			eventtitle1=((TextView )eventid).getText()+"";
			//Log.v("WindTest",eventtitle1+":nullll");
		}
		
		else
		{
			eventtitle1="近期无信息";
			//Log.v("WindTest",eventtitle1+":nullll");
		}	
		
		this.windBottomTool("自选");
		ViewGroup optional_info_tabbar=(ViewGroup)this.getViewById("optional_info_tabbar");
		solo.clickOnView(optional_info_tabbar.getChildAt(2));
		solo.sleep(1500);
		View eventitem=this.getViewById("newstitle_text");
		String eventtile2=null;
		if(eventitem!=null)
			{
				eventtile2=((TextView)eventitem).getText()+"";
				//Log.v("WindTest",eventtile2+":nullll");
			
			}	
		else
			{
				eventtile2="近期无信息";
				//Log.v("WindTest",eventtile2+":nullll");
			}
		
		CaseCheck=this.EqualsChecked(eventtile2.contentEquals(book_name+"："+eventtitle1));
		//Log.v("WindTest",CaseCheck+":");
		//Log.v("WindTest",CaseCheck+":");
	}


	public void testCase002() throws Exception
	{
		CaseName="向上拖动加载下一版大事";
		
		this.windBottomTool("市场");
		String windcode="130018.IB";
		this.windEnterTimeShare(windcode);
		
		//确认是否已经添加自选
		View add_self_button=this.getViewById("add_self_button");
		String add_self_name=((TextView)this.getViewById("speed_text_view")).getText()+"";
		if(!add_self_name.equals("更多操作"))
			{
				solo.clickOnView(add_self_button);
				solo.sleep(1000);
			}
		
		this.windBottomTool("自选");
		ViewGroup optional_info_tabbar=(ViewGroup)this.getViewById("optional_info_tabbar");
		solo.clickOnView(optional_info_tabbar.getChildAt(2));
		windDataReq();
		String newstitle1=((TextView)this.getViewById("newstitle_text")).getText()+"";
		String newstitletime1=((TextView)this.getViewById("newstitle_time")).getText()+"";
		
		ListView pull_to_refresh_list=(ListView) this.getViewById("pull_to_refresh_list");
		solo.scrollListToBottom(pull_to_refresh_list);
		windDataReq();
		solo.scrollListToBottom(pull_to_refresh_list);
		windDataReq();
		solo.scrollListToBottom(pull_to_refresh_list);
		windDataReq();

		String newstitle2=((TextView)this.getViewById("newstitle_text")).getText()+"";
		String newstitletime2=((TextView)this.getViewById("newstitle_time")).getText()+"";
		CaseCheck=this.EqualsChecked(!newstitle1.equals(newstitle2)||!newstitletime1.equals(newstitletime2));
		//Log.v("WindTest",newstitle1+":"+newstitle2);
		//Log.v("WindTest",CaseCheck+":");
		//Log.v("WindTest",newstitletime1+":"+newstitletime2);
		
	}
}
