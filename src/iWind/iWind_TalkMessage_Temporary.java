package iWind;



import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.StockActivity;
import StockMasterBase.iWindStockActivity;

public class iWind_TalkMessage_Temporary  extends StockActivity
{
	@SuppressLint("SimpleDateFormat")
	public void testCase001() throws Exception 
	{//δ��ɣ��˺Ŵ�����
		CaseName = "��ʱ�Ự���շ�������Ϣ";
		this.Login("iwindm6@163.com", "123456");
		
		this.windBottomTool("iWind");
		new iWindStockActivity().iWindListChoose("����");// ������Ϣ�б�ʹ�� ����Ϣ��
		
		solo.clickOnView(solo.getView("search_edit_text"));
		solo.enterText(0, "iwind�Զ���Ⱥ001");
		solo.sleep(3000);
		solo.clickOnView(solo.getView("groupIcon"));
		solo.sleep(3000);
		solo.clickOnView(solo.getView("roundRectItem"));
		solo.enterText(0, "������");
		solo.clickOnView(solo.getView("search_btn"));
		solo.sleep(3000);
		solo.clickOnView(((ViewGroup)solo.getView("iwind_userlist")).getChildAt(0));
		solo.sleep(3000);
		solo.clickOnView(solo.getView("send_message"));
		
		solo.sleep(50000);
		String CaseCheckedTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		String entercontent=CaseCheckedTime+"testA";
		solo.enterText(0, entercontent);
		solo.clickOnView(solo.getView("wmSendButton"));
		solo.clickOnView(solo.getView("leftViewLine"));
		solo.sleep(3000);

		this.Login("iwindm05@163.com", "123456");
		this.windBottomTool("iWind");
		new iWindStockActivity().iWindListChoose("��Ϣ");
		solo.sleep(3000);
		View List_v =((ViewGroup)solo.getView("iwind_content_left")).getChildAt(0);	
		solo.clickOnView(((ViewGroup)((ViewGroup)List_v).getChildAt(3)).getChildAt(0));
		solo.sleep(10000);
		ViewGroup msglist=(ViewGroup)solo.getView("wmChatContent");
		
		String content= ((TextView)msglist.getChildAt(msglist.getChildCount()-1)).getText().toString();
		CaseCheck=this.EqualsChecked(content.contains(entercontent));
		
		solo.sleep(50000);
		
	}
}
