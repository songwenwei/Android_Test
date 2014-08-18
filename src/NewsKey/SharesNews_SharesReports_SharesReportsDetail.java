package NewsKey;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import StockMasterBase.NewsStockActivity;

public class SharesNews_SharesReports_SharesReportsDetail extends NewsStockActivity {

	public void testCase001() throws Exception
	{
		CaseName="研报详情入口";
		
		String windcode="600000.SH";
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
		solo.clickOnScreen(tabBar_location1[0]+tabBar_size[0]/5*2+5, tabBar_location1[1]+tabBar_size[1]/2);
		solo.sleep(2000);
		tabBar.getLocationOnScreen(tabBar_location2);
		speed_main_scroll.scrollBy(0, tabBar_location2[1]-tabBar_location1[1]);
		solo.sleep(1000);
		
		String 	newstitle=((TextView)this.getViewById("newstitle_text")).getText()+"";
		solo.clickOnText(newstitle);
		solo.sleep(1000);
		
		
		String title=((TextView)this.getViewById("titleView")).getText()+"";
		Log.v("WindTest",this.getViewById("titleView")+":view");
		Log.v("WindTest",title+":title");
		CaseCheck=this.EqualsChecked(title.equals("研报"));
		Log.v("WindTest",CaseCheck+":");
	}
	
	
	public void testCase002() throws Exception
	{
		CaseName="点击【返回】返回到研报列表";
		
		String windcode="600000.SH";
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
		solo.clickOnScreen(tabBar_location1[0]+tabBar_size[0]/5*2+5, tabBar_location1[1]+tabBar_size[1]/2);
		solo.sleep(2000);
		tabBar.getLocationOnScreen(tabBar_location2);
		speed_main_scroll.scrollBy(0, tabBar_location2[1]-tabBar_location1[1]);
		solo.sleep(1500);
		
		String 	newstitle=((TextView)this.getViewById("newstitle_text")).getText()+"";
		solo.clickOnText(newstitle);
		solo.sleep(1500);
		String title=((TextView)this.getViewById("titleView")).getText()+"";
		if(title.equals("研报"))
		{
			View backButton=getViewById("mainRow").findViewById(getSourceID("leftView"));
			solo.clickOnView(backButton);
			speed_main_scroll=this.windGetView("speed_main_scroll");
			CaseCheck=this.EqualsChecked(speed_main_scroll!=null);
			Log.v("WindTest",CaseCheck+":");
		}
		
	}
}
