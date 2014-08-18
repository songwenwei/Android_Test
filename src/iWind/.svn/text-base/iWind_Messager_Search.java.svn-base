package iWind;



import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import StockMasterBase.StockActivity;
import StockMasterBase.iWindStockActivity;

public class iWind_Messager_Search  extends StockActivity{

	public void testCase001() throws Exception {
		// 通过姓名进行查找-M

		CaseName = "本地搜索_通过姓名进行查找";
		this.Login("iwindm6@163.com", "123456");
		this.windBottomTool("iWind");
		solo.sleep(3000);
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		solo.clickOnView(solo.getView("search_edit_text"));
		solo.enterText(0, "耿宜龙");
		solo.sleep(2000);
		String friend_name=((TextView)solo.getView("child_name")).getText().toString();
		CaseCheck=this.EqualsChecked(friend_name, "耿宜龙");
		Log.v("WindTest",friend_name);
	}

	
	public void testCase002() throws Exception {
		
		CaseName = "本地搜索_通过群名称进行查找";
		this.Login("iwindm6@163.com", "123456");
		this.windBottomTool("iWind");
		solo.sleep(3000);
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		solo.clickOnView(solo.getView("search_edit_text"));
		solo.enterText(0, "iwind自动化群001");
		solo.sleep(2000);
		String friend_name=((TextView)solo.getView("child_name")).getText().toString();
		CaseCheck=this.EqualsChecked(friend_name,"iwind自动化群001");
		Log.v("WindTest",friend_name+"::"+CaseCheck);
	}
	
	public void testCase003() throws Exception {
		
		CaseName = "在线搜索_通过姓名进行查找";
		this.Login("iwindm6@163.com", "123456");
		this.windBottomTool("iWind");
		solo.sleep(3000);
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		solo.clickOnView(solo.getView("add_contact_btn"));
		solo.sleep(2000);
		solo.enterText(0, "耿宜龙");
		solo.clickOnView(solo.getView("search_btn"));
		solo.sleep(2000);
		View userlist=((ViewGroup)solo.getView("iwind_userlist")).getChildAt(0);
		String friend_name1=((TextView)userlist.findViewById(this.getSourceID("child_name"))).getText().toString();
		CaseCheck=this.EqualsChecked(friend_name1, "耿宜龙");
	}
	
	public void testCase004() throws Exception {
		
		CaseName = "点击“+”按钮，转到“添加好友/群”页面";
		this.Login("iwindm6@163.com", "123456");
		this.windBottomTool("iWind");
		solo.sleep(3000);
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		solo.clickOnView(solo.getView("add_contact_btn"));
		solo.sleep(2000);
		solo.enterText(0, "耿宜龙");
		solo.clickOnView(solo.getView("search_btn"));
		solo.sleep(2000);
		String searchtitle=((TextView)solo.getView("titleView")).getText().toString();
		String searchtype1=((TextView)((ViewGroup)((ViewGroup)solo.getView("iwind_tabbar")).getChildAt(0)).getChildAt(0)).getText().toString();
		String searchtype2=((TextView)((ViewGroup)((ViewGroup)solo.getView("iwind_tabbar")).getChildAt(1)).getChildAt(0)).getText().toString();
		
		CaseCheck=this.EqualsChecked(searchtitle.equalsIgnoreCase("搜索")&&searchtype1.equalsIgnoreCase("查找好友")&&searchtype2.equalsIgnoreCase("查找群"));
		
	}
	
	
	public void testCase005() throws Exception {
		
		CaseName = "进入搜索群页面";
		this.Login("iwindm6@163.com", "123456");
		this.windBottomTool("iWind");
		solo.sleep(3000);
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		solo.clickOnView(solo.getView("add_contact_btn"));
		solo.sleep(2000);
		solo.clickOnView(((ViewGroup)solo.getView("iwind_tabbar")).getChildAt(1));
		CaseCheck=this.EqualsChecked(solo.searchText("群号/群名称"));
				
	}
	
	
	public void testCase006() throws Exception {
		
		CaseName = "在线搜索_通过名称进行查找";
		//this.Login("iwindm6@163.com", "123456");
		this.windBottomTool("iWind");
		solo.sleep(3000);
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		solo.clickOnView(solo.getView("add_contact_btn"));
		solo.sleep(2000);
		solo.clickOnView(((ViewGroup)solo.getView("iwind_tabbar")).getChildAt(1));
		solo.enterText(0, "iwind自动化群001");
		solo.clickOnView(solo.getView("search_btn"));
		solo.sleep(2000);
		View userlist=((ViewGroup)solo.getView("iwind_userlist")).getChildAt(0);
		String groupname=((TextView)userlist.findViewById(this.getSourceID("child_name"))).getText().toString();
		CaseCheck=this.EqualsChecked(groupname, "iwind自动化群001");
		Log.v("WindTest",CaseCheck+":::"+groupname);
				
	}
	
}
