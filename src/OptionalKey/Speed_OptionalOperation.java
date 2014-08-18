package OptionalKey;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.StockActivity;

public class Speed_OptionalOperation  extends StockActivity {

	public void testCase001()throws Exception
	{
		CaseName="进入分时支持向左滑动";
		
		this.windBottomTool("自选");
		View search=this.getViewById("rightViewLine");
		solo.clickOnView(search);
		//ViewGroup search_result_list=(ViewGroup)this.getViewById("search_result_list");
		String windcode="6000";
		solo.clearEditText(0);
		solo.typeText(0,windcode);
		View word_line4=(View)((View)this.getViewById("buttonLine").getParent()).getParent();
		View v1=((ViewGroup)word_line4).getChildAt(4);
		int [] location={0,0};
		v1.getLocationOnScreen(location);
		solo.clickOnScreen(location[0]+5, location[1]+5);
		solo.sleep(500);
		View search_result_list=this.getViewById("search_result_list");
		for(int i=0;i<5;i++)
		{
			View add_button=((ViewGroup)search_result_list).getChildAt(i).findViewById(this.getSourceID("add_button"));
			//Log.v("WindTest",add_button[])
			solo.clickOnView(add_button);		
		}	
		solo.clickOnView(this.getViewById("leftView"));
		
		this.windBottomTool("自选");
		solo.clickOnView(this.getViewById("stock_name"));
		solo.sleep(1000);
		String stockname1=((TextView)this.getViewById("stock_name")).getText()+"";
		//Log.v("WindTest",stockname1);
		this.windF5DragToLeft();
		solo.sleep(1500);
		String stockname2=((TextView)this.getViewById("stock_name")).getText()+"";
		//Log.v("WindTest",stockname2);
		CaseCheck=this.EqualsChecked(!stockname2.equals(stockname1));
		Log.v("WindTest",CaseCheck);
	}

	public void testCase002()throws Exception
	{
		CaseName="进入分时支持向右滑动";
		
		this.windBottomTool("自选");
		View search=this.getViewById("rightViewLine");
		solo.clickOnView(search);
		//ViewGroup search_result_list=(ViewGroup)this.getViewById("search_result_list");
		String windcode="6000";
		solo.clearEditText(0);
		solo.typeText(0,windcode);
		View word_line4=(View)((View)this.getViewById("buttonLine").getParent()).getParent();
		View v1=((ViewGroup)word_line4).getChildAt(4);
		int [] location={0,0};
		v1.getLocationOnScreen(location);
		solo.clickOnScreen(location[0]+5, location[1]+5);
		solo.sleep(500);
		View search_result_list=this.getViewById("search_result_list");
		for(int i=0;i<5;i++)
		{
			View add_button=((ViewGroup)search_result_list).getChildAt(i).findViewById(this.getSourceID("add_button"));
			//Log.v("WindTest",add_button[])
			solo.clickOnView(add_button);		
		}	
		solo.clickOnView(this.getViewById("leftView"));
		
		this.windBottomTool("自选");
		View optional_speed_list=this.getViewById("optional_speed_list");
		View secStock=((ViewGroup)optional_speed_list).getChildAt(1).findViewById(this.getSourceID("stock_name"));
		solo.clickOnView(secStock);
		solo.sleep(1000);
		String stockname1=((TextView)this.getViewById("stock_name")).getText()+"";
		//Log.v("WindTest",stockname1);
		//this.windDragStockNext();
		this.windF5DragToRight();
		solo.sleep(1500);
		String stockname2=((TextView)this.getViewById("stock_name")).getText()+"";
		//Log.v("WindTest",stockname2);
		CaseCheck=this.EqualsChecked(!stockname2.equals(stockname1));
		Log.v("WindTest",CaseCheck);
	}
}
