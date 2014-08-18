package StockMasterBase;


import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class iWindStockActivity extends StockActivity {
	// 选择进入 好友列表 或者 消息列表，入参：“好友"，"消息"
	public void iWindListChoose(String name) {
		String title = ((TextView) solo.getView("titleView")).getText()
				.toString();
		if (!title.equalsIgnoreCase(name))
			solo.clickOnView((solo.getView("rightViewLine")).findViewById(this
					.getSourceID("buttonLabel")));
		solo.sleep(2000);
	}

	public void iWindFriendDelete(String name) throws Exception
	{
		
		this.windBottomTool("iWind");
		solo.sleep(3000);
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		{	//列表上拉置顶
			int [] ListPosition=this.windViewPosition(solo.getView("home_expandableListView"));
			int List_Width,List_Height;
			List_Width=solo.getView("home_expandableListView").getWidth();
			List_Height =solo.getView("home_expandableListView").getHeight();
			//列表上拉置顶
			solo.drag(List_Width/2+ListPosition[0],List_Width/2+ListPosition[0],(List_Height*1/5)+ListPosition[1],(List_Height*4/5)+ListPosition[1],5);
		}
		solo.clickOnView(solo.getView("search_edit_text"));
		solo.enterText(0, name);
		solo.sleep(5000);
		solo.clickOnView(solo.getView("groupIcon"));
		solo.sleep(4000);
		solo.clickOnView(solo.getView("dele_friend"));
		solo.clickOnView(solo.getView("button1"));
		solo.sleep(5000);
	}
	
	public void iWindFriendAdd(String user,String pwd) throws Exception
	{
		
		this.windBottomTool("iWind");
		solo.sleep(3000);
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		{	//列表上拉置顶
			int [] ListPosition=this.windViewPosition(solo.getView("home_expandableListView"));
			int List_Width,List_Height;
			List_Width=solo.getView("home_expandableListView").getWidth();
			List_Height =solo.getView("home_expandableListView").getHeight();
			//列表上拉置顶
			solo.drag(List_Width/2+ListPosition[0],List_Width/2+ListPosition[0],(List_Height*1/5)+ListPosition[1],(List_Height*4/5)+ListPosition[1],5);
		}
		solo.clickOnView(solo.getView("add_contact_btn"));
		solo.sleep(2000);
		solo.enterText(0, "iwindm6@163.com");
		solo.clickOnView(solo.getView("search_btn"));
		solo.sleep(2000);
		solo.clickOnView(solo.getView("add_btn"));
		

		solo.sleep(3000);
		solo.clickOnText("发送");
		solo.sleep(3000);
		solo.clickOnView(solo.getView("leftView"));
		solo.sleep(3000);
		this.Login(user, pwd);
		this.windBottomTool("iWind");
		
		new iWindStockActivity().iWindListChoose("消息");
		solo.sleep(2000);
		View List_v =((ViewGroup)solo.getView("iwind_content_left")).getChildAt(0);	
		solo.clickOnView(((ViewGroup)((ViewGroup)List_v).getChildAt(3)).getChildAt(0));
		solo.sleep(3000);
		View OSMsg_list=solo.getView("systemMsgList");
		solo.clickOnView(((ViewGroup)OSMsg_list).getChildAt(0));
		solo.sleep(2000);
		solo.clickOnView(solo.getView("wind_add_agress"));
		solo.sleep(5000);
		solo.clickOnView(solo.getView("leftView"));
		solo.sleep(5000);
	}
	
}
