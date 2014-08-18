package OptionalKey;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import StockMasterBase.StockActivity;

public class ProfitAndLoss_Data extends StockActivity{

	public void testCase001() throws Exception
	{
		CaseName="持仓值-从无到有";
		this.Logout();
		
		this.windDeleteAllShares();
		solo.sleep(3000);
		View edit=this.getViewById("rightViewLine");
		solo.clickOnView(edit);
		solo.clickOnText("添加");	
		String windcode="000001.SH";
		//EditText textField_editText=(EditText)this.getViewById("textField_editText");
		solo.clearEditText(0);
		solo.typeText(0,windcode);
		solo.clickOnView(this.getViewById("add_button"));
		if(solo.searchText("温馨提示"))
			solo.clickOnText("取消");
		solo.clickOnView(this.getViewById("leftView"));
		
		solo.sleep(500);
		String price="11";String count="100";
		ViewGroup editSortLayout=(ViewGroup)this.getViewById("editSortLayout");
		EditText countText=(EditText) editSortLayout.getChildAt(0);
		EditText priceText=(EditText) editSortLayout.getChildAt(1);
		solo.typeText(countText, count);
		solo.typeText(priceText, price);
		View complete_button=((ViewGroup)this.getViewById("leftViewLine")).getChildAt(0);
		solo.clickOnView(complete_button);
	
		String total_markey_value=((TextView)this.getViewById("total_markey_value")).getText()+"";
		
		CaseCheck=this.EqualsChecked(!total_markey_value.equals("0"));
		Log.v("WindTest",CaseCheck+"");
		Log.v("WindTest",total_markey_value+"");
	
	}
	

}
