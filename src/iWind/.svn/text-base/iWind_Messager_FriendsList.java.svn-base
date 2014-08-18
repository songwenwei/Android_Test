package iWind;



import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.StockActivity;
import StockMasterBase.iWindStockActivity;

//核心基础用例

public class iWind_Messager_FriendsList extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "进入好友列表";
		this.Login("iwindm6@163.com", "123456");
		this.windBottomTool("iWind"); // 入参：自选、新闻、市场、iWind、更多
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		String title = ((TextView) solo.getView("titleView")).getText()
				.toString();
		if (title.equalsIgnoreCase("好友")&& solo.waitForView(solo.getView("leftViewLine")))
			CaseCheck = this.EqualsChecked(true);

	}

	public void testCase002() throws Exception 
	{
		CaseName = "移动端登陆时好友与PC一致";
		// 好友分组l;ktab
		this.Login("iwindm6@163.com", "123456");
		this.windBottomTool("iWind");
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“

		//获取控件
		View MyFriendsGroup = ((ViewGroup) ((ViewGroup) this.getViewById("home_expandableListView")).getChildAt(4)).getChildAt(0);
		solo.clickOnView(MyFriendsGroup); //点击控件
		solo.sleep(2000);
		
		int [] ListPosition=this.windViewPosition(solo.getView("home_expandableListView"));
		int List_Width,List_Height;
		List_Width=solo.getView("home_expandableListView").getWidth();
		List_Height =solo.getView("home_expandableListView").getHeight();
		//列表上拉置顶
		solo.drag(List_Width/2+ListPosition[0],List_Width/2+ListPosition[0],(List_Height*1/5)+ListPosition[1],(List_Height*4/5)+ListPosition[1],5);
		
		String Grouponline_info = ((TextView) MyFriendsGroup.findViewById(this.getSourceID("group_online_info"))).getText().toString();
		View MyFriend001 = ((ViewGroup) ((ViewGroup) solo.getView("home_expandableListView")).getChildAt(5)).getChildAt(0);
		View MyFriend002 = ((ViewGroup) ((ViewGroup) solo.getView("home_expandableListView")).getChildAt(6)).getChildAt(0);
		String FriendName1= ((TextView) MyFriend001.findViewById(this.getSourceID("child_name"))).getText().toString();
		FriendName1=FriendName1+((TextView) MyFriend002.findViewById(this.getSourceID("child_name"))).getText().toString();
		CaseCheck=this.EqualsChecked((Grouponline_info.contains("2")&&
				                      FriendName1.contains("耿宜龙")
				                      &&FriendName1.contains("测试（个人）")));
	}

	public void testCase003() throws Exception {
		CaseName = "好友分组同步";
		this.Login("iwindm6@163.com", "123456");
		this.windBottomTool("iWind");
		solo.sleep(5000);
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		String myFriendsGroupName = "";
		View myFriendsGroup;
		// MyFriendsGroupName=((TextView)MyFriendsGroup.findViewById(this.getSourceID("group_name"))).getText().toString();
		int i = 0;
		for (i = 0; i < 5; i++) {
			myFriendsGroup = ((ViewGroup) ((ViewGroup) this.getViewById("home_expandableListView")).getChildAt(i + 4));
			myFriendsGroupName = myFriendsGroupName+ "|"+ ((TextView) myFriendsGroup.findViewById(this.getSourceID("group_name"))).getText().toString();
		}
		String[] definedGroup = new String[] { "我的好友", "测试2部", "mobiletest001","黑名单" };
		for (i = definedGroup.length; i > 0; i--) {
			if (myFriendsGroupName.contains(definedGroup[i - 1]))
				CaseCheck = this.EqualsChecked(true);
			//Log.v("WindTest", definedGroup[i - 1]);
		}

	}

	public void testCase004() throws Exception {
		CaseName = "群组数量正确";
		this.Login("iwindm6@163.com", "123456");
		solo.sleep(3000);
		this.windBottomTool("iWind");
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“

		View Group = ((ViewGroup) ((ViewGroup) this.getViewById("home_expandableListView")).getChildAt(1)).getChildAt(0);
		// String
		// group_count_info=((TextView)Group.findViewById(this.getSourceID("group_online_info"))).getText().toString();
		solo.clickOnView(Group);
		solo.sleep(2000);
		
		int [] ListPosition=this.windViewPosition(solo.getView("home_expandableListView"));
		int List_Width,List_Height;
		List_Width=solo.getView("home_expandableListView").getWidth();
		List_Height =solo.getView("home_expandableListView").getHeight();
		//列表上拉置顶
		solo.drag(List_Width/2+ListPosition[0],List_Width/2+ListPosition[0],(List_Height*1/5)+ListPosition[1],(List_Height*4/5)+ListPosition[1],5);
		
		View Group1 = ((ViewGroup) ((ViewGroup) this.getViewById("home_expandableListView")).getChildAt(1)).getChildAt(0);// .findViewById(this.getSourceID("group_name"));
		String GroupName = ((TextView) Group1.findViewById(this.getSourceID("group_name"))).getText().toString();
		String group_count_info = ((TextView) Group1.findViewById(this.getSourceID("group_online_info"))).getText().toString();

		if (GroupName.equalsIgnoreCase("群")) 
		{
			for (int i = 1; i < 3; i++) 
			{
				Group1 = ((ViewGroup) ((ViewGroup) this.getViewById("home_expandableListView")).getChildAt(i + 1)).getChildAt(0).findViewById(this.getSourceID("child_name"));
				Log.v("WindTest", Group1 + ":::::");
				GroupName = GroupName + "|"+ ((TextView) Group1).getText().toString();
			}
			CaseCheck = this.EqualsChecked(GroupName.contains("iwind自动化群001")&& GroupName.contains("test1")&& (group_count_info.equalsIgnoreCase("2")));
		}

		Log.v("WindTest", CaseCheck + ":::" + GroupName + ":::::"+ group_count_info);
	}

	public void testCase005() throws Exception {
		CaseName = "多人聊天组数量正确";
		this.Login("iwindm6@163.com", "123456");
		solo.sleep(3000);
		this.windBottomTool("iWind");
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“

		View TalkGroup = ((ViewGroup) ((ViewGroup) this	.getViewById("home_expandableListView")).getChildAt(2)).getChildAt(0);
		// String
		// group_count_info=((TextView)Group.findViewById(this.getSourceID("group_online_info"))).getText().toString();
		solo.clickOnView(TalkGroup);
		solo.sleep(3000);

		int [] ListPosition=this.windViewPosition(solo.getView("home_expandableListView"));
		int List_Width,List_Height;
		List_Width=solo.getView("home_expandableListView").getWidth();
		List_Height =solo.getView("home_expandableListView").getHeight();
		//列表上拉置顶
		solo.drag(List_Width/2+ListPosition[0],List_Width/2+ListPosition[0],(List_Height*1/5)+ListPosition[1],(List_Height*4/5)+ListPosition[1],5);
				
		View TalkGroup1 = ((ViewGroup) ((ViewGroup) this.getViewById("home_expandableListView")).getChildAt(2)).getChildAt(0);// .findViewById(this.getSourceID("group_name"));
		String GroupName = ((TextView) TalkGroup1.findViewById(this.getSourceID("group_name"))).getText().toString();
		String group_count_info = ((TextView) TalkGroup1.findViewById(this.getSourceID("group_online_info"))).getText().toString();
		Log.v("WindTest", GroupName + ":::::GroupName");
		if (GroupName.equalsIgnoreCase("多人聊天组")) 
		{
			for (int i = 2; i < 5; i++) 
			{
				TalkGroup1 = ((ViewGroup) ((ViewGroup) this.getViewById("home_expandableListView")).getChildAt(i + 1)).getChildAt(0).findViewById(this.getSourceID("child_name"));
				Log.v("WindTest", TalkGroup1 + ":::::TalkGroup1");
				GroupName = GroupName + "|"	+ ((TextView) TalkGroup1).getText().toString();
			}
			Log.v("WindTest", GroupName + ":::::GroupName");
			CaseCheck = this.EqualsChecked(GroupName.contains("误删误推出iWind自动化001")&& GroupName.contains("误删误退出iwind自动化002")
					&& GroupName.contains("移动测试多人会话001")&& (group_count_info.equalsIgnoreCase("3")));	
			Log.v("WindTest", CaseCheck + ":::::CaseCheck");
		}
		
	}

	public void testCase006() throws Exception {
		CaseName = "我的资料入口";
		this.Login("iwindm6@163.com", "123456");
		solo.sleep(3000);
		this.windBottomTool("iWind");

		int[] user_info_position = new int[2];
		user_info_position = this.windViewPosition(solo.getView("leftViewLine"));
		// Log.v("WindTest", user_info[0]+"：："+user_info[1]);
		solo.clickOnScreen(user_info_position[0], user_info_position[1]);
		solo.sleep(3000);
		// Log.v("WindTest",solo.getView("leftViewLine")+"");
		String user_info = ((TextView) solo.getView("titleView")).getText().toString();
		String user_name = ((TextView) solo.getView("userinfo_username")).getText().toString();
		CaseCheck = this.EqualsChecked(user_info.equalsIgnoreCase("个人资料")&& user_name.equalsIgnoreCase("测试（个人）"));

	}

	public void testCase007() throws Exception {
		CaseName = "下一次登录时查看签名修改已保存";
		this.Login("iwindm6@163.com", "123456");
		solo.sleep(3000);
		this.windBottomTool("iWind");

		int[] user_info_position = new int[2];
		user_info_position = this
				.windViewPosition(solo.getView("leftViewLine"));
		// Log.v("WindTest", user_info[0]+"：："+user_info[1]);
		solo.clickOnScreen(user_info_position[0], user_info_position[1]);
		solo.sleep(3000);

		solo.clickOnView(solo.getView("introduceButton"));
		String entercontent = "test";
		solo.clearEditText(0);
		solo.enterText(0, entercontent);
		solo.sleep(3000);
		solo.clickOnView(solo.getView("rightViewLine"));
		solo.sleep(3000);
		solo.clickOnText("返回");
		solo.sleep(3000);
		this.Login("iwindm6@163.com", "123456");

		this.windBottomTool("iWind");

		solo.clickOnScreen(user_info_position[0], user_info_position[1]);
		solo.sleep(6000);
		
		TextView v = (TextView) solo.getView("introduce");
		String introduce_info = v.getText().toString();
		
		CaseCheck = this.EqualsChecked(introduce_info.equalsIgnoreCase(entercontent));

		solo.clickOnView(solo.getView("introduceButton"));
		solo.clearEditText(0);
		entercontent = "iwindm6@163.com ";
		solo.enterText(0, entercontent);
		solo.sleep(3000);
		solo.clickOnView(solo.getView("rightViewLine"));
		solo.sleep(2000);

		Log.v("WindTest", CaseCheck + "::::" + solo.getView("introduce") + "");

	}

	public void testCase008() throws Exception {
		CaseName = "头像右侧切换状态";
		this.Login("iwindm6@163.com", "123456");
		solo.sleep(3000);
		this.windBottomTool("iWind");

		int[] user_info_position = new int[2];
		user_info_position = this.windViewPosition(solo.getView("leftViewLine"));
		int[] user_state_position = new int[2];
		user_state_position[0] = solo.getView("leftViewLine").getWidth();
		user_state_position[1] = solo.getView("leftViewLine").getHeight();
		//Log.v("WindTest", user_state_position[0] + "：："+ user_state_position[1]);
		//Log.v("WindTest", user_info_position[0] + "：：" + user_info_position[1]);
		solo.clickOnScreen(user_info_position[0] + user_state_position[0] - 15,
				user_info_position[1] + user_state_position[1] - 15);
		solo.sleep(3000);

		// solo.clickOnScreen(user_info_position[0]+user_state_position[0]-15,
		// user_info_position[1]+user_state_position[1]*2-15);
		solo.clickOnScreen(user_info_position[0] + user_state_position[0] - 15,
				(user_info_position[1] + user_state_position[1] * 2));
		// solo.clickOnScreen(162,187);

		solo.sleep(3000);

	}

	public void testCase009() throws Exception {
		CaseName = "好友资料数据校验";
		this.Login("iwindm6@163.com", "123456");
		this.windBottomTool("iWind");
		solo.sleep(3000);
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		solo.clickOnView(solo.getView("search_edit_text"));

		solo.enterText(0, "iwindm05@163.com");
		solo.sleep(5000);
		solo.clickOnView(solo.getView("groupIcon"));
		solo.sleep(5000);

		String userinf_username = ((TextView) solo.getView("userinfo_username"))
				.getText().toString();
		String introduce_info = ((TextView) solo.getView("introduce"))
				.getText().toString();
		String companyname = ((TextView) solo.getView("textView_value1"))
				.getText().toString();
		String companytype = ((TextView) solo.getView("textView_value2"))
				.getText().toString();
		String companyphone = ((TextView) solo.getView("textView_value3"))
				.getText().toString();
		String companymail = ((TextView) solo.getView("textView_value4"))
				.getText().toString();
		String userinfo = userinf_username + introduce_info + companyname
				+ companytype + companyphone + companymail;
		CaseCheck = this
				.EqualsChecked(userinfo
						.equalsIgnoreCase("测试（个人）iwindm05@163.com测试（个人）五大银行0259463iwindm05@163.com"));

	}

	

	
}
