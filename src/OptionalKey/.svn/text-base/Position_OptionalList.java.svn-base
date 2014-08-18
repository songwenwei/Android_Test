package OptionalKey;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.StockActivity;

public class Position_OptionalList extends StockActivity{


	public void testCase001() throws Exception
	{
		CaseName="在编辑持仓页添加一只股票";
		String username="QYS01302 ";
		String pwd="456123";
		this.Login(username, pwd);
		this.windDeleteAllShares();
		
		solo.sleep(1500);
		View optionaledit=this.getViewById("rightViewLine");
		solo.clickOnView(optionaledit);
		solo.sleep(500);		
		solo.clickOnText("添加");	
		String windcode="6000";
		solo.clearEditText(0);
		solo.typeText(0,windcode);
		solo.sleep(1500);
		
		String stock_name1=null;String stock_name2=null;
		View search_result_list=this.getViewById("search_result_list");
		for(int i=0;i<3;i++)
		{
			View add_button=((ViewGroup)search_result_list).getChildAt(i).findViewById(this.getSourceID("add_button"));
			//Log.v("WindTest",add_button[])
			solo.clickOnView(add_button);					
		}
		View stock_name_view1=((ViewGroup)search_result_list).getChildAt(2).findViewById(this.getSourceID("stock_name"));
		stock_name1=((TextView)stock_name_view1).getText()+"";
		//Log.v("WindTest",stock_name1+"stock_name1");
		solo.clickOnView(this.getViewById("leftView"));
		solo.sleep(500);
		solo.clickOnText("完成");
		
		ViewGroup optional_info_tabbar=(ViewGroup)this.getViewById("optional_info_tabbar");
		solo.clickOnView(optional_info_tabbar.getChildAt(0));
		
		solo.sleep(1500);
		ViewGroup optional_speed_list=(ViewGroup)this.getViewById("optional_speed_list");
		View stock_name_view2=optional_speed_list.getChildAt(optional_speed_list.getChildCount()-1);
		stock_name2=((TextView)stock_name_view2.findViewById(this.getSourceID("stock_name"))).getText()+"";
		//Log.v("WindTest",stock_name2+"stock_name2");
		CaseCheck=this.EqualsChecked(stock_name1.contains(stock_name2));
		//Log.v("WindTest",CaseCheck);
		//Log.v("WindTest",this.moudulepath);	
	}
	
	public void testCase002() throws Exception
	{
		CaseName="删除全部自选股";
		this.windDeleteAllShares();
		ViewGroup optional_info_tabbar=(ViewGroup)this.getViewById("optional_info_tabbar");
		solo.clickOnView(optional_info_tabbar.getChildAt(0));
		int optional_speed_list_count=((ViewGroup)this.getViewById("optional_speed_list")).getChildCount();
		CaseCheck=this.EqualsChecked(optional_speed_list_count==0);
		//Log.v("WindTest",CaseCheck);	
		//Log.v("WindTest",this.moudulepath+"");
	}
	
}
