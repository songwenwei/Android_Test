package iWind;


import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.StockActivity;
import StockMasterBase.iWindStockActivity;



public class iWind_TalkMessage_MultiFriends extends StockActivity{
	//禁止把iwindm6@163.com加入多人会话组
	@SuppressLint("SimpleDateFormat")
	public void testCase001() throws Exception 
	{
		CaseName = "验证消息页面出现该多人会话组";
		this.Login("iwindm05@163.com", "123456");
			
		this.windBottomTool("iWind");
		new iWindStockActivity().iWindListChoose("消息");//进入消息列表使用 ”消息“
		solo.sleep(3000);
		
		View List_v =((ViewGroup)solo.getView("iwind_content_left")).getChildAt(0);	
		
		solo.clickOnView(((ViewGroup) ((ViewGroup)List_v).getChildAt(0)).getChildAt(0));
		solo.sleep(3000);
		
		List_v=solo.getView("wordSortListView");
		solo.clickOnView(((ViewGroup)List_v).getChildAt(0).findViewById(this.getSourceID("select_btn")));
		solo.sleep(1000);
		solo.clickOnView(((ViewGroup)List_v).getChildAt(1).findViewById(this.getSourceID("select_btn")));
		
		solo.clickOnView(solo.getView("selectedButton"));
		solo.sleep(10000);
		
		String CaseCheckedTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		String entercontent=CaseCheckedTime+"testA";
		solo.enterText(0, entercontent);
		solo.clickOnView(solo.getView("wmSendButton"));
		solo.sleep(5000);
		
		String content1=((TextView)((ViewGroup)solo.getView("wmChatContent")).getChildAt(0)).getText().toString();
		content1=content1+((TextView)((ViewGroup)solo.getView("wmChatContent")).getChildAt(1)).getText().toString();
		//Log.v("WindTest",content1+"::Content1");
		
		solo.clickOnView(solo.getView("leftViewLine"));
		solo.sleep(3000);
		
		View List_v1 =((ViewGroup)solo.getView("iwind_content_left")).getChildAt(0);	
		solo.clickOnView(((ViewGroup)((ViewGroup)List_v1).getChildAt(3)).getChildAt(0));
		solo.sleep(10000);
		String content2=((TextView)((ViewGroup)solo.getView("wmChatContent")).getChildAt(0)).getText().toString();
		content2=content2+((TextView)((ViewGroup)solo.getView("wmChatContent")).getChildAt(1)).getText().toString();
		//Log.v("WindTest",content2+"::Content2");
		//Log.v("WindTest",this.EqualsChecked(content2.contains(content1)));
		
		CaseCheck=this.EqualsChecked(content2.contains(content1));
	}
	
	

}
