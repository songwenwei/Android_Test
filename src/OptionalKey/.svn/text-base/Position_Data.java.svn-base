package OptionalKey;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import StockMasterBase.StockActivity;

public class Position_Data extends StockActivity{


	public void testCase001() throws Exception
	{
		CaseName="输入持仓和价格";
		this.windBottomTool("自选");
		//判断是否为空
		int optional_speed_list_count=((ViewGroup)this.getViewById("optional_speed_list")).getChildCount();
		if(optional_speed_list_count==0)
		{
			View search=this.getViewById("rightViewLine");
			solo.clickOnView(search);
			String windcode="600000.SH";
			//EditText textField_editText=(EditText)this.getViewById("textField_editText");
			solo.clearEditText(0);
			solo.enterText(0,windcode);
			solo.clickOnView(this.getViewById("add_button"));
			solo.clickOnView(this.getViewById("leftView"));
		}
		
		//进入盈亏
		ViewGroup optional_info_tabbar=(ViewGroup)this.getViewById("optional_info_tabbar");
		solo.clickOnView(optional_info_tabbar.getChildAt(4));
		
		String tipcontent="暂无盈亏数据，请先设置您的头寸";
		if(solo.searchText(tipcontent))
			solo.clickOnText("确定");
		else
		{
			View edit=this.getViewById("rightViewLine");
			solo.clickOnView(edit);
		}
		
		String price1="11";String hold_amount1="100";
		ViewGroup editSortLayout=(ViewGroup)this.getViewById("editSortLayout");
		EditText countText=(EditText) editSortLayout.getChildAt(0);
		EditText priceText=(EditText) editSortLayout.getChildAt(1);
		solo.clearEditText(countText);
		solo.clearEditText(priceText);
		solo.typeText(countText, hold_amount1);
		solo.typeText(priceText, price1);
		String stockname1=((TextView)this.getViewById("leftLabel")).getText()+"";
		View complete_button=((ViewGroup)this.getViewById("leftViewLine")).getChildAt(0);
		solo.clickOnView(complete_button);
		
		View gain_list=((ViewGroup)this.getViewById("gain_list")).getChildAt(0);
		String stock_name2=((TextView)gain_list.findViewById(this.getSourceID("stock_name"))).getText()+"";
		String price2=((TextView)gain_list.findViewById(this.getSourceID("price"))).getText()+"";
		String hold_amount2=((TextView)gain_list.findViewById(this.getSourceID("hold_amount"))).getText()+"";
		
		Log.v("WindTest",price1+":"+price2+":"+hold_amount1+":"+hold_amount2);
		CaseCheck=this.EqualsChecked(price2.equals(price1+".000")&&hold_amount2.equals(hold_amount1)
		 							&&stockname1.equalsIgnoreCase(stock_name2));
		Log.v("WindTest",CaseCheck);
		
	}

}
