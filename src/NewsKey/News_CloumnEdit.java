package NewsKey;

import StockMasterBase.NewsStockActivity;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

//����-����ģ��-��Ŀ�༭
public class News_CloumnEdit extends NewsStockActivity {


	public void testCase001() throws Exception {
		CaseName = "��¼�ֻ��˺�ʱ���������Ŀ�༭ҳ��������Ŀ";
		String username, pwd;
		username = "windlevel2test5";
		pwd = "123456";
		this.Login(username, pwd);
		solo.sleep(6000);
		solo.clickOnView(((ViewGroup) this.getViewById("toolLayout")).getChildAt(1));

		ViewGroup v1 = (ViewGroup) ((ViewGroup) ((ViewGroup) getViewById("newstitlelist_tabbar")).getChildAt(0)).getChildAt(0);

		// ������Ŀ�༭
		this.clickOnNewsEditButton();

		String newstab[] = {"���","�ȵ�","Ҫ��","����","����","�б�","���","�¹�","����","�۹�","����","�и�","����",
							"ծȯ","����","����","���","��Ʒ","����","���","¥��","�ƽ�","����"};
		
		int check, count;
		count = 0;
		for (check = 0; check < newstab.length; check++) {
			if (solo.searchText(newstab[check]))
				count++;
		}
		CaseCheck = this.EqualsChecked(count == newstab.length);
		
	}


	public void testCase002() throws Exception {
		CaseName = "����������Ŀ�󣬵�����ģ��У����Ŀ";

		this.windBottomTool("����");
		// ������Ŀ�༭
		this.clickOnNewsEditButton();
		
		ViewGroup TitleItems_ForChoose,TitleItems_delete;
		String itemname1,itemname2;
		itemname1=null;itemname2=null;
		
		// ��ѡ��Ŀ������0ʱ�����޳�
		TitleItems_ForChoose=(ViewGroup) this.getViewById("src_grid");
		TitleItems_delete = (ViewGroup) this.getViewById("drag_grid");
		if (TitleItems_ForChoose.getChildCount() == 0) 
		{
			solo.clickOnView(TitleItems_delete.getChildAt(0));
			solo.sleep(1000);
		}
		
		
		itemname1=((TextView)TitleItems_ForChoose.getChildAt(0).findViewById(this.getSource("drag_grid_item_text"))).getText().toString();
		solo.clickOnView(TitleItems_ForChoose.getChildAt(0));
		
		solo.clickOnView(((ViewGroup)this.getViewById("leftViewLine")).getChildAt(0));
		solo.sleep(1000);
		
		int newstitlelist_tabbar_count;
		ViewGroup items =(ViewGroup) ((ViewGroup) getViewById("newstitlelist_tabbar")).getChildAt(0);
		ViewGroup newsitems	=(ViewGroup) items.getChildAt(0);
		
		newstitlelist_tabbar_count = newsitems.getChildCount();
		TextView itemnameview=(TextView) ((ViewGroup)newsitems.getChildAt(newstitlelist_tabbar_count-2)).getChildAt(0);
		itemname2=itemnameview.getText().toString();
		Log.v("WindTest",itemname1);
		Log.v("WindTest",itemname2);
		CaseCheck=this.EqualsChecked(itemname1, itemname2);
	}
	
	
	public void testCase003() throws Exception {
		CaseName = "ɾ��������Ŀ������ģ����У��������Ŀ";

		this.windBottomTool("����");
		// ������Ŀ�༭
		this.clickOnNewsEditButton();
		ViewGroup TitleItems_ForChoose,TitleItems_delete;
		String itemname1,itemname2;
		itemname1=null;itemname2=null;
		
		// ��ѡ��Ŀ������0ʱ�����޳�
		TitleItems_delete = (ViewGroup) this.getViewById("drag_grid");
		TitleItems_ForChoose=(ViewGroup) this.getViewById("src_grid");
		if (TitleItems_delete.getChildCount()< 6) 
		{
			solo.clickOnView(TitleItems_ForChoose.getChildAt(0));
			solo.sleep(1000);
		}
		
		solo.clickOnView(TitleItems_delete.getChildAt(0));
		solo.sleep(1000);
		
		itemname1=((TextView)TitleItems_ForChoose.getChildAt(0).findViewById(this.getSource("drag_grid_item_text"))).getText().toString();
		
		solo.clickOnView(((ViewGroup)this.getViewById("leftViewLine")).getChildAt(0));
		solo.sleep(1000);
		
		int newstitlelist_tabbar_count;
		ViewGroup items =(ViewGroup) ((ViewGroup) getViewById("newstitlelist_tabbar")).getChildAt(0);
		ViewGroup newsitems	=(ViewGroup) items.getChildAt(0);
		
		newstitlelist_tabbar_count = newsitems.getChildCount();
		TextView itemnameview;
		for(int i=0;i<newstitlelist_tabbar_count-1;i++)
		{
			itemnameview=(TextView) ((ViewGroup)newsitems.getChildAt(i)).getChildAt(0);
			itemname2=itemname2+"|"+itemnameview.getText().toString();			
		}
		CaseCheck=this.EqualsChecked(!itemname2.contains(itemname1));
		
	}
	
	public void testCase004() throws Exception {
		CaseName = "����������Ŀ������ģ��У����Ŀ˳��";
		this.windBottomTool("����");
		// ������Ŀ�༭
		this.clickOnNewsEditButton();
		ViewGroup TitleItems_delete;
		String itemname1,itemname2,itemname3,itemname4;
		itemname1=null;itemname2=null;itemname3=null;itemname4=null;
		
		TitleItems_delete = (ViewGroup) this.getViewById("drag_grid");
		itemname1=((TextView)TitleItems_delete.getChildAt(0).findViewById(this.getSource("drag_grid_item_text"))).getText().toString();
		itemname2=((TextView)TitleItems_delete.getChildAt(1).findViewById(this.getSource("drag_grid_item_text"))).getText().toString();
		Log.v("WindTest",itemname1+"|"+itemname2);
		this.windSwitchPosition(TitleItems_delete.getChildAt(0), TitleItems_delete.getChildAt(1));
		
		solo.clickOnView(((ViewGroup)this.getViewById("leftViewLine")).getChildAt(0));
		solo.sleep(1000);
		
		ViewGroup items =(ViewGroup) ((ViewGroup) getViewById("newstitlelist_tabbar")).getChildAt(0);
		ViewGroup newsitems	=(ViewGroup) items.getChildAt(0);
		TextView itemnameview;
		itemnameview=(TextView) ((ViewGroup)newsitems.getChildAt(0)).getChildAt(0);
		itemname3=itemnameview.getText().toString();
		itemnameview=(TextView) ((ViewGroup)newsitems.getChildAt(1)).getChildAt(0);
		itemname4=itemnameview.getText().toString();
//		Log.v("WindTest",itemname3+"|"+itemname4);
		CaseCheck=this.EqualsChecked(itemname1.equalsIgnoreCase(itemname4)&&itemname2.equalsIgnoreCase(itemname3));
	}
	
}

	