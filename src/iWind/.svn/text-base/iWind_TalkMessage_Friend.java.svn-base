package iWind;



import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.StockActivity;
import StockMasterBase.iWindStockActivity;

public class iWind_TalkMessage_Friend  extends StockActivity
{
		
		
	public void testCase001() throws Exception {
		CaseName = "分享新闻内容验证";
		this.Login("iwindm6@163.com", "123456");
		this.windBottomTool("新闻");

		solo.sleep(3000);
		solo.clickOnView( ((ViewGroup)this.getViewById("pull_to_refresh_list")).getChildAt(1));
		solo.sleep(6000);// 进入详情等待
		
		ViewGroup v1 = (ViewGroup) ((ViewGroup) this.getViewById("news_detil_view")).getChildAt(0);
		ViewGroup v2 = (ViewGroup) ((ViewGroup) ((ViewGroup) v1.getChildAt(0)).getChildAt(0)).getChildAt(0);
		// 新闻标题
		TextView t1 = (TextView) v2.findViewById(getSourceID("news_detil_newstitle"));
		String newsTitle1 = t1.getText().toString();
		solo.clickOnView(solo.getView("newsDetilBottomView_deliver"));
		//分享新闻内容验证
		solo.clickOnView(((ViewGroup)solo.getView("line1")).getChildAt(0));
		solo.sleep(5000);
		solo.enterText(0, "iwindm05@163.com");
		solo.sleep(5000);
		solo.clickOnView(((ViewGroup)solo.getView("contact_list")).getChildAt(0));
		solo.sleep(3000);
		solo.clickOnView(solo.getView("button2"));
		solo.sleep(6000);
		solo.clickOnView(solo.getView("leftViewLine"));
		solo.sleep(3000);
		
		this.Login("iwindm05@163.com", "123456");
		this.windBottomTool("iWind");
		new iWindStockActivity().iWindListChoose("消息");
		solo.sleep(3000);
		View List_v =((ViewGroup)solo.getView("iwind_content_left")).getChildAt(0);	
		solo.clickOnView(((ViewGroup)((ViewGroup)List_v).getChildAt(3)).getChildAt(0));
		solo.sleep(10000);
		ViewGroup msglist=(ViewGroup)solo.getView("wmChatContent");
		solo.clickOnView(msglist.getChildAt(msglist.getChildCount()-1));
		solo.sleep(6000);
		
		v1 = (ViewGroup) ((ViewGroup) this.getViewById("news_detil_view")).getChildAt(0);
		v2 = (ViewGroup) ((ViewGroup) ((ViewGroup) v1.getChildAt(0)).getChildAt(0)).getChildAt(0);
		// 新闻标题
		String newsTitle2 = t1.getText().toString();
		CaseCheck=this.EqualsChecked(newsTitle1, newsTitle2);
	}
	
	public void testCase002() throws Exception {
		
		CaseName = "分享股票正确性验证";
		this.Login("iwindm6@163.com", "123456");
		
		this.windBottomTool("iWind");
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		
		solo.clickOnView(solo.getView("search_edit_text"));
		solo.enterText(0, "iwindm05@163.com");
		solo.sleep(3000);
		
		solo.clickOnView(((ViewGroup)solo.getView("search_friend_list")).getChildAt(0));
		
		solo.sleep(3000);
		solo.clickOnView(solo.getView("wmEmoticonButton"));
		solo.clickOnView(solo.getView("stockButton"));
		solo.sleep(3000);
		
		solo.enterText(0, "600600.SH");
		solo.sleep(3000);		
		solo.clickOnView(((ViewGroup)solo.getView("search_result_list")).getChildAt(0));
		solo.sleep(10000);	
		solo.clickOnView(solo.getView("leftViewLine"));
		solo.sleep(10000);
		
		
		this.Login("iwindm05@163.com", "123456");
		this.windBottomTool("iWind");
		new iWindStockActivity().iWindListChoose("消息");
		solo.sleep(3000);
		View List_v =((ViewGroup)solo.getView("iwind_content_left")).getChildAt(0);	
		solo.clickOnView(((ViewGroup)((ViewGroup)List_v).getChildAt(3)).getChildAt(0));
		solo.sleep(10000);
		ViewGroup msglist=(ViewGroup)solo.getView("wmChatContent");
		solo.clickOnView(msglist.getChildAt(msglist.getChildCount()-1));
		solo.sleep(5000);
		String stockcode=((TextView)solo.getView("stock_name")).getText().toString();
		CaseCheck=this.EqualsChecked(stockcode.equalsIgnoreCase("600600.SH"));
		
	}
	
	
	public void testCase003() throws Exception 
	{
		CaseName = "接收端点击【好友卡片】进入好友”个人资料“";
		this.Login("iwindm6@163.com", "123456");
		
		this.windBottomTool("iWind");
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		
		solo.clickOnView(solo.getView("search_edit_text"));
		solo.enterText(0, "iwindm05@163.com");
		solo.sleep(3000);
		
		solo.clickOnView(((ViewGroup)solo.getView("search_friend_list")).getChildAt(0));
		
		solo.sleep(3000);
		solo.clickOnView(solo.getView("wmEmoticonButton"));
		solo.clickOnView(solo.getView("friendButton"));
		
		solo.sleep(5000);
		solo.enterText(0, "耿宜龙");
		solo.sleep(5000);
		solo.clickOnView(((ViewGroup)solo.getView("contact_list")).getChildAt(0));
		solo.sleep(3000);
		solo.clickOnView(solo.getView("button2"));
		solo.sleep(5000);
		solo.clickOnView(solo.getView("leftViewLine"));
		solo.sleep(3000);

		this.Login("iwindm05@163.com", "123456");
		this.windBottomTool("iWind");
		new iWindStockActivity().iWindListChoose("消息");
		solo.sleep(3000);
		View List_v =((ViewGroup)solo.getView("iwind_content_left")).getChildAt(0);	
		solo.clickOnView(((ViewGroup)((ViewGroup)List_v).getChildAt(3)).getChildAt(0));
		solo.sleep(5000);
		ViewGroup msglist=(ViewGroup)solo.getView("wmChatContent");
		solo.clickOnView(msglist.getChildAt(msglist.getChildCount()-1));
		
		solo.sleep(5000);
		String user_name = ((TextView) solo.getView("userinfo_username")).getText().toString();
		CaseCheck=this.EqualsChecked(user_name, "耿宜龙");

	}
	
	@SuppressLint("SimpleDateFormat")
	public void testCase004() throws Exception 
	{
		CaseName = "验证消息接收";
		this.Login("iwindm6@163.com", "123456");
		
		this.windBottomTool("iWind");
		new iWindStockActivity().iWindListChoose("好友");// 进入消息列表使用 ”消息“
		
		solo.clickOnView(solo.getView("search_edit_text"));
		solo.enterText(0, "iwindm05@163.com");
		solo.sleep(3000);
		
		solo.clickOnView(((ViewGroup)solo.getView("search_friend_list")).getChildAt(0));
		
		solo.sleep(3000);
		String CaseCheckedTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		String entercontent=CaseCheckedTime+"testA";
	
		solo.enterText(0, entercontent);
		solo.clickOnView(solo.getView("wmSendButton"));
		
		solo.clickOnView(solo.getView("leftViewLine"));
		solo.sleep(3000);

		this.Login("iwindm05@163.com", "123456");
		this.windBottomTool("iWind");
		new iWindStockActivity().iWindListChoose("消息");
		solo.sleep(3000);
		View List_v =((ViewGroup)solo.getView("iwind_content_left")).getChildAt(0);	
		solo.clickOnView(((ViewGroup)((ViewGroup)List_v).getChildAt(3)).getChildAt(0));
		
		solo.sleep(10000);
		ViewGroup msglist=(ViewGroup)solo.getView("wmChatContent");
			
		String content= ((TextView)msglist.getChildAt(msglist.getChildCount()-1)).getText().toString();
		CaseCheck=this.EqualsChecked(content.contains(entercontent));
	}
}