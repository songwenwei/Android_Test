package NewsKey;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import StockMasterBase.NewsStockActivity;

public class SharesNews_SharesNewsDetails extends NewsStockActivity {

	public void testCase001() throws Exception
	{
		CaseName="进入新闻详情";
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
		solo.sleep(1000);
		tabBar.getLocationOnScreen(tabBar_location2);
		speed_main_scroll.scrollBy(0, tabBar_location2[1]-tabBar_location1[1]);
		solo.sleep(1000);

		String newstitle1=((TextView)this.getViewById("newstitle_text")).getText()+"";
		solo.clickOnText(newstitle1);
		solo.sleep(1000);
		String newstitle2=((TextView)this.getViewById("news_detil_newstitle")).getText()+"";
		CaseCheck=this.EqualsChecked(newstitle2.equals(newstitle1));
		Log.v("WindTest",newstitle2+":"+CaseCheck);
	}
	

}
