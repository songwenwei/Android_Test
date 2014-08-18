package NewsKey;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import StockMasterBase.NewsStockActivity;

public class SharesNews_SharesAnnouncementAndEvent_EventDetails extends NewsStockActivity {

	public void testCase001() throws Exception
	{
		CaseName="进入个股大事详情";
	
		String windcode="130018.IB";
		this.windEnterTimeShare(windcode);
		
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
		solo.sleep(1000);
		tabBar.getLocationOnScreen(tabBar_location2);
		speed_main_scroll.scrollBy(0, tabBar_location2[1]-tabBar_location1[1]);
		
		String 	newstitle=((TextView)this.getViewById("newstitle_text")).getText()+"";
		solo.clickOnText(newstitle);
		solo.sleep(1000);
		CaseCheck=this.EqualsChecked(solo.searchText(newstitle));
		//Log.v("WindTest",CaseCheck+":");
	}
	
	public void testCase002() throws Exception
	{
		CaseName="点击大事详情的【返回】按钮";
		
		String windcode="130018.IB";
		this.windEnterTimeShare(windcode);
		
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
		solo.sleep(1000);
		tabBar.getLocationOnScreen(tabBar_location2);
		speed_main_scroll.scrollBy(0, tabBar_location2[1]-tabBar_location1[1]);
		
		String 	newstitle=((TextView)this.getViewById("newstitle_text")).getText()+"";
		solo.clickOnText(newstitle);
		solo.sleep(1000);
		View back=this.getViewById("leftView");
		solo.clickOnView(back);
		solo.sleep(500);
		CaseCheck=this.EqualsChecked(getViewById("view_news_event")!=null);
		//Log.v("WindTest",CaseCheck+":");
		
	}
	

}
