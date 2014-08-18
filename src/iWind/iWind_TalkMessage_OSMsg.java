package iWind;



import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import StockMasterBase.StockActivity;
import StockMasterBase.iWindStockActivity;

public class iWind_TalkMessage_OSMsg  extends StockActivity{
	
	public void testCase001() throws Exception {

		CaseName = "好友申请的验证信息校验";
		this.Login("iwindm2@163.com", "123456");
		this.windBottomTool("iWind");
		solo.sleep(3000);
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		solo.clickOnView(solo.getView("search_edit_text"));
		solo.enterText(0, "iwindm6@163.com");
		solo.sleep(5000);
		if(!solo.searchText("测试（个人）"))
			{	
				Log.v("WindTest",solo.searchText("好友未找到，在iWind中查找")+"");
				solo.clickOnText("好友未找到，在iWind中查找");
				solo.clickOnText("查找好友");
				solo.clickOnView(solo.getView("search_btn"));
				solo.sleep(2000);
				solo.clickOnView(solo.getView("add_btn"));
			}
		else
		{
			solo.clickOnView(solo.getView("groupIcon"));
			solo.sleep(4000);
			solo.clickOnView(solo.getView("dele_friend"));
			solo.clickOnView(solo.getView("button1"));
			solo.sleep(4000);
			solo.clickOnView(solo.getView("search_btn"));
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
		}

		solo.sleep(3000);
		solo.enterText(0, "测试001");
		solo.clickOnText("发送");
		solo.sleep(3000);
		solo.clickOnView(solo.getView("leftView"));
		solo.sleep(3000);
		this.Login("iwindm6@163.com", "123456");
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
		new iWindStockActivity().iWindListChoose("好友");
		
		View MyFriendsGroup = ((ViewGroup) ((ViewGroup) this.getViewById("home_expandableListView")).getChildAt(4)).getChildAt(0);
		solo.clickOnView(MyFriendsGroup);
		solo.sleep(2000);
		CaseCheck=this.EqualsChecked(solo.searchText("测试（个人）",4));		
		new iWindStockActivity().iWindFriendDelete("iwindm2@163.com");
	
	}
	
	
	public void testCase002() throws Exception {

		CaseName = "在好友列表中验证加入群";
		this.Login("iwindm2@163.com", "123456");
		this.windBottomTool("iWind");
		solo.sleep(3000);
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		solo.clickOnView(solo.getView("search_edit_text"));
		solo.enterText(0, "66353");  //群号
		solo.sleep(3000);
		if(!solo.searchText("MobileiWindTest008"))
			{	
				//Log.v("WindTest",solo.searchText("好友未找到，在iWind中查找")+"");
				solo.clickOnText("好友未找到，在iWind中查找");
				solo.clickOnText("查找群");
				solo.enterText(0, "66353");
				solo.clickOnView(solo.getView("search_btn"));
				solo.sleep(2000);
				solo.clickOnView(solo.getView("add_btn"));
			}
		else
		{
			solo.clickOnView(solo.getView("groupIcon"));
			solo.sleep(3000);
			solo.clickOnView(solo.getView("exit"));
			solo.sleep(3000);
			solo.clickOnView(solo.getView("button1"));
			solo.sleep(3000);
			
			for(int i=0;i<10;i++)
				{
					if(solo.searchText("好友未找到，在iWind中查找"))
					{	
						solo.clickOnView(solo.getView("search_btn"));
						solo.sleep(3000);
						break;
					}
					else
					{
						solo.sleep(2000);
					}
				}
			//solo.clickOnView(solo.getView("search_btn"));
			//solo.clickOnView(solo.getView("search_btn"));//必须点击两次，原因不明
			//solo.sleep(3000);
		
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
			solo.clickOnText("查找群");
			solo.enterText(0, "66353");
			solo.clickOnView(solo.getView("search_btn"));
			solo.sleep(2000);
			solo.clickOnView(solo.getView("add_btn"));
		}

		solo.sleep(3000);
		solo.enterText(0, "测试001");
		solo.clickOnText("发送");
		solo.sleep(3000);
		solo.clickOnView(solo.getView("leftView"));
		solo.sleep(3000);
		this.Login("iwindm6@163.com", "123456");
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
		solo.sleep(3000);
		new iWindStockActivity().iWindListChoose("好友");
		
		View MyFriendsGroup = ((ViewGroup) ((ViewGroup) this.getViewById("home_expandableListView")).getChildAt(1)).getChildAt(0);
		solo.clickOnView(MyFriendsGroup);
		solo.sleep(2000);
		CaseCheck=this.EqualsChecked(solo.searchText("MobileiWindTest008"));
		
	}
	
	public void testCase010() throws Exception {

		
		// "删除好友后进入好友列表查看";
		
	}

	public void testCase011() throws Exception {
		// 好友列表中验证退出群功能//
	}

	public void testCase012() throws Exception {
		// 申请成功后查看加入该群
	}
	
}