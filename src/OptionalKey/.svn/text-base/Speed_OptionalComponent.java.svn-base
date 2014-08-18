package OptionalKey;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.StockActivity;

public class Speed_OptionalComponent extends StockActivity {

	
	public void testCase001() throws Exception
	{
		CaseName="不登陆添加自选股";
		this.windDeleteAllShares();
		
		this.windBottomTool("市场");
		View search=this.getViewById("rightViewLine");
		solo.clickOnView(search);
		String windcode="600000.SH";
		//EditText textField_editText=(EditText)this.getViewById("textField_editText");
		solo.clearEditText(0);
		solo.typeText(0,windcode);
		solo.clickOnView(this.getViewById("add_button"));
		solo.clickOnView(this.getViewById("leftView"));
		
		this.windBottomTool("自选");
		CaseCheck=this.EqualsChecked(solo.searchText("600000"));
		Log.v("WindTest",CaseCheck);
	}
	
	public void testCase002() throws Exception
	{
		CaseName="不登陆删除自选股";
		this.windBottomTool("自选");
		String windcode=null;

		int optional_speed_list_count=((ViewGroup)this.getViewById("optional_speed_list")).getChildCount();
		//Log.v("WindTest",optional_speed_list_count+"1111");
		if(optional_speed_list_count==0)
		{
			View search=this.getViewById("rightViewLine");
			solo.clickOnView(search);
			windcode="600000.SH";
			//EditText textField_editText=(EditText)this.getViewById("textField_editText");
			solo.clearEditText(0);
			solo.typeText(0,windcode);
			solo.clickOnView(this.getViewById("add_button"));
			solo.clickOnView(this.getViewById("leftView"));
		}
		
		optional_speed_list_count=((ViewGroup)this.getViewById("optional_speed_list")).getChildCount();
		//Log.v("WindTest",optional_speed_list_count+"2222");
		String stockname=null;
		if(optional_speed_list_count!=0)
		{
			stockname=((TextView)this.getViewById("stock_name")).getText()+"";
			solo.clickOnView(this.getViewById("stock_name"));
			solo.sleep(1500);
			View add_self_button=this.getViewById("add_self_button");
			solo.clickOnView(add_self_button);
			solo.clickOnView(this.getViewById("text_view4"));
		}
		this.windBottomTool("自选");
		Log.v("WindTest",solo.searchText(stockname)+"");
		CaseCheck=this.EqualsChecked(!solo.searchText(stockname));
		
	}
	public void testCase003() throws Exception
	{
		CaseName="添加股票到我的自选股中";
		String username, pwd;
		username="18694974069";
		pwd="123456";
		this.Login(username, pwd);
		this.windBottomTool("自选");
		this.windDeleteAllShares();	
		this.windBottomTool("市场");
		View search=this.getViewById("rightViewLine");
		solo.clickOnView(search);
		String windcode="600000.SH";
		solo.clearEditText(0);
		solo.typeText(0,windcode);
		solo.clickOnView(this.getViewById("add_button"));
		solo.clickOnView(this.getViewById("leftView"));
		
		this.windBottomTool("自选");
		solo.clickOnView(this.getViewById("titleViewLine"));
		solo.clickOnText("我的自选");
		CaseCheck=this.EqualsChecked(solo.searchText("600000"));
		Log.v("WindTest",CaseCheck);
		
		
	}
	
	public void testCase004() throws Exception
	{
		CaseName="删除我的自选股中的股票";
		
		//this.WriteLog(CaseName, "程序有bug，无法编写");
		String username, pwd;
		username="18694974069";
		pwd="123456";
		this.Login(username, pwd);

		if(solo.searchText("是否需要把您的自选股保存在云端"))
			solo.clickOnText("取消");
		
		int optional_speed_list_count=((ViewGroup)this.getViewById("optional_speed_list")).getChildCount();
		String windcode=null;
		if(optional_speed_list_count==0)
		{
			
			this.windBottomTool("市场");
			View search=this.getViewById("rightViewLine");
			solo.clickOnView(search);
			windcode="600000.SH";
			//EditText textField_editText=(EditText)this.getViewById("textField_editText");
			solo.clearEditText(0);
			solo.enterText(0,windcode);
			solo.clickOnView(this.getViewById("add_button"));
			solo.clickOnView(this.getViewById("leftView"));
			solo.sleep(500);			
		}

		this.windBottomTool("自选");
		String stockname=null;
		optional_speed_list_count=((ViewGroup)this.getViewById("optional_speed_list")).getChildCount();
		if(optional_speed_list_count!=0)
		{
			stockname=((TextView)this.getViewById("stock_name")).getText()+"";
			solo.clickOnView(this.getViewById("stock_name"));
			solo.sleep(1500);
			View add_self_button=this.getViewById("add_self_button");
			solo.clickOnView(add_self_button);
			solo.clickOnView(this.getViewById("text_view4"));
			solo.clickOnView(this.getViewById("leftView"));
		}
		CaseCheck=this.EqualsChecked(!solo.searchText(stockname));
		//Log.v("WindTest",CaseCheck+"");
		
	}
	
	public void testCase005() throws Exception
	{
		CaseName="【数据】本地自选股——历史数据继承：无法跨应用操作";
		CaseCheck=this.EqualsChecked(false);
	}

	
}
