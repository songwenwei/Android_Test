package NewsKey;


import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import StockMasterBase.NewsStockActivity;

//新闻-自选股新闻-公告
public class OptionalNews_Announcement_List extends NewsStockActivity{

	public void testCase001() throws Exception
	{
		CaseName="添加单支A股后查看自选公告列表";
		
		String windcode="600000.SH";
		this.windEnterTimeShare(windcode);
		solo.sleep(1000);
		
		//确认是否已经添加自选
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
		//点击公告
		solo.clickOnScreen(tabBar_location1[0]+tabBar_size[0]/5*1+5, tabBar_location1[1]+tabBar_size[1]/2);
		windDataReq();
		tabBar.getLocationOnScreen(tabBar_location2);
		speed_main_scroll.scrollBy(0, tabBar_location2[1]-tabBar_location1[1]);
		
		String bulletin_title=((TextView)this.getViewById("view_news_child").findViewById(this.getSourceID("newstitle_text"))).getText()+"";
		//Log.v("WindTest",bulletin_title+":");
		
		this.windBottomTool("自选");
		ViewGroup optional_info_tabbar=(ViewGroup)this.getViewById("optional_info_tabbar");
		solo.clickOnView(optional_info_tabbar.getChildAt(3));
		windDataReq();
		CaseCheck=this.EqualsChecked(solo.searchText(book_name+":"+bulletin_title));
		//Log.v("WindTest",CaseCheck+":");
		
	}

	public void testCase002() throws Exception
	{
		CaseName="向上拖动加载下一版公告";
		String windcode="600000.SH";
		this.windEnterTimeShare(windcode);
		solo.sleep(1000);
		
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
		solo.clickOnView(optional_info_tabbar.getChildAt(3));
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
	}
}
