package InterConnection;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import StockMasterBase.StockActivity;

public class EditPassword extends StockActivity  {
	
	
	public void testCase001() throws Exception {
		CaseName="修改密码";
		String username="QYS01302";
		String pwd="123456";
		Login(username, pwd);
		windBottomTool("互联");
		View wm_login=getViewById("wm_login");
		View editpwd=((ViewGroup)wm_login.findViewById(getSourceID("roundRectRow"))).getChildAt(1);
		solo.clickOnView(editpwd);
		EditText oldpassword=(EditText)this.getViewById("oldpassword");
		EditText newpassword=(EditText)this.getViewById("newpassword");
		solo.typeText(oldpassword, pwd);
		pwd="456123";
		solo.typeText(newpassword, pwd);
		solo.clickOnButton("保存");
		for(int i=0;i<10;i++)
		{
			solo.sleep(1500);
			String title=((TextView)this.getViewById("titleView")).getText()+"";
			if(title.equals("互联"))
				break;
		}
		editpwd=((ViewGroup)wm_login.findViewById(getSourceID("roundRectRow"))).getChildAt(1);
		solo.clickOnView(editpwd);
		oldpassword=(EditText)this.getViewById("oldpassword");
		newpassword=(EditText)this.getViewById("newpassword");
		solo.typeText(oldpassword, "123456");
		solo.typeText(newpassword, pwd);
		solo.clickOnButton("保存");
		CaseCheck=this.EqualsChecked(solo.searchText("原密码错误，请重新输入!"));
		Log.v("WindTest",CaseCheck);
		
		if(solo.searchText("原密码错误，请重新输入!"))
		{
			solo.clickOnText("确定");
			solo.typeText(oldpassword, "456123");
			solo.clickOnButton("保存");
			for(int i=0;i<10;i++)
			{
				solo.sleep(1500);
				String title=((TextView)this.getViewById("titleView")).getText()+"";
				if(title.equals("互联"))
					break;
			}	
		}
		
		
		
		
		
	
		
	}
	

}
