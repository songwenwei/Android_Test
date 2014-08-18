package NewsKey;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.NewsStockActivity;

public class SharesNews_SharesNewsList extends NewsStockActivity{

	public void testCase001() throws Exception
	{
		CaseName="进入个股新闻列表";
		String windcode="600000.SH";
		this.windEnterTimeShare(windcode);
		
		//滑动到新闻
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
		
		//调整位置
		tabBar.getLocationOnScreen(tabBar_location1);
		tabBar_size[0]=tabBar.getWidth();
		tabBar_size[1]=tabBar.getHeight();
		solo.clickOnScreen(tabBar_location1[0]+5, tabBar_location1[1]+tabBar_size[1]/2);
		solo.sleep(2000);
		tabBar.getLocationOnScreen(tabBar_location2);
		speed_main_scroll.scrollBy(0, tabBar_location2[1]-tabBar_location1[1]);
		solo.sleep(1000);
		String newstitle=((TextView)this.getViewById("newstitle_text")).getText()+"";
		CaseCheck=this.EqualsChecked(newstitle!=null);
		//Log.v("WindTest",newstitle+":"+CaseCheck);
		
	}
	
	
	
	
	public void testCase002() throws Exception
	{
		CaseName="点击【查看下10条】";
		String windcode="600000.SH";
		this.windEnterTimeShare(windcode);
		solo.scrollToBottom();
		int newsitemcount1=((ViewGroup)this.getViewById("newstitle_linear").getParent()).getChildCount();
		Log.v("WindTest",newsitemcount1+":"+CaseCheck);
		solo.clickOnText("查看下10条");
		solo.sleep(1500);
		int newsitemcount2=((ViewGroup)this.getViewById("newstitle_linear").getParent()).getChildCount();
		CaseCheck=this.EqualsChecked(newsitemcount1!=newsitemcount2&&newsitemcount1!=0);
		
		
	}

}
