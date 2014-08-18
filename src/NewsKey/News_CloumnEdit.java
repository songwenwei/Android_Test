package NewsKey;

import StockMasterBase.NewsStockActivity;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

//新闻-新闻模块-栏目编辑
public class News_CloumnEdit extends NewsStockActivity {


	public void testCase001() throws Exception {
		CaseName = "登录手机账号时检查新闻栏目编辑页的新闻栏目";
		String username, pwd;
		username = "windlevel2test5";
		pwd = "123456";
		this.Login(username, pwd);
		solo.sleep(6000);
		solo.clickOnView(((ViewGroup) this.getViewById("toolLayout")).getChildAt(1));

		ViewGroup v1 = (ViewGroup) ((ViewGroup) ((ViewGroup) getViewById("newstitlelist_tabbar")).getChildAt(0)).getChildAt(0);

		// 进入栏目编辑
		this.clickOnNewsEditButton();

		String newstab[] = {"题材","热点","要闻","沪深","滚动","研报","宏观","新股","负面","港股","海外","中概","并购",
							"债券","央行","政策","外汇","商品","基金","理财","楼市","黄金","信托"};
		
		int check, count;
		count = 0;
		for (check = 0; check < newstab.length; check++) {
			if (solo.searchText(newstab[check]))
				count++;
		}
		CaseCheck = this.EqualsChecked(count == newstab.length);
		
	}


	public void testCase002() throws Exception {
		CaseName = "增加新闻栏目后，到新闻模块校验栏目";

		this.windBottomTool("新闻");
		// 进入栏目编辑
		this.clickOnNewsEditButton();
		
		ViewGroup TitleItems_ForChoose,TitleItems_delete;
		String itemname1,itemname2;
		itemname1=null;itemname2=null;
		
		// 待选栏目数等于0时，先剔除
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
		CaseName = "删除新闻栏目后到新闻模块中校验新闻栏目";

		this.windBottomTool("新闻");
		// 进入栏目编辑
		this.clickOnNewsEditButton();
		ViewGroup TitleItems_ForChoose,TitleItems_delete;
		String itemname1,itemname2;
		itemname1=null;itemname2=null;
		
		// 已选栏目数等于0时，先剔除
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
		CaseName = "排序新闻栏目后到新闻模块校验栏目顺序";
		this.windBottomTool("新闻");
		// 进入栏目编辑
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

	