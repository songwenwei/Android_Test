package StockMasterBase;


import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

public class NewsStockActivity extends StockActivity {

// 栏目"栏目","滚动", "要闻", "宏观", "沪深", "港股", "海外", "商品", "基金","理财", "债券", "外汇"
	public void windClickNewsItem(String name) throws Exception {
		
		String NewsItems=this.getNewsItems();
		if(!NewsItems.contains(name))
		{
			this.clickOnNewsEditButton();
			if(solo.searchText(name))
				solo.clickOnText(name);
			solo.clickOnView(((ViewGroup)this.getViewById("leftViewLine")).getChildAt(0));
		}
		
		int i,x,y,newstitlelist_tabbar_count;
		String itemname;
		ViewGroup items =(ViewGroup) ((ViewGroup) getViewById("newstitlelist_tabbar")).getChildAt(0);
		ViewGroup newsitems	=(ViewGroup) items.getChildAt(0);
		newstitlelist_tabbar_count = newsitems.getChildCount();
		for(i=0;i<newstitlelist_tabbar_count-1;i++)
		{
			TextView itemnameview=(TextView) ((ViewGroup)newsitems.getChildAt(i)).getChildAt(0);
			itemname=itemnameview.getText().toString();
			
			if(itemname.equalsIgnoreCase(name))
			{
				x=newsitems.getChildAt(i).getLeft();
				y=newsitems.getChildAt(i).getTop();
				items.scrollTo(x, y);
				solo.clickOnView(newsitems.getChildAt(i));
				break;
			}
		
		}
		solo.sleep(1500);

	}
	
	//点击 新闻彩虹条编辑按钮 +
	public void clickOnNewsEditButton() throws Exception {
		int x,y,newstitlelist_tabbar_count;
		ViewGroup items =(ViewGroup) ((ViewGroup) getViewById("newstitlelist_tabbar")).getChildAt(0);
		ViewGroup newsitems	=(ViewGroup) items.getChildAt(0);

		newstitlelist_tabbar_count = newsitems.getChildCount();
		x=newsitems.getChildAt(newstitlelist_tabbar_count-1).getLeft();
		y=newsitems.getChildAt(newstitlelist_tabbar_count-1).getTop();
		items.scrollTo(x, y);
		solo.clickOnView(newsitems.getChildAt(newstitlelist_tabbar_count-1));
		solo.sleep(1000);
	}

	public String getNewsItems() throws Exception
	{
		int i,newstitlelist_tabbar_count;
		String itemname="";
		ViewGroup items =(ViewGroup) ((ViewGroup) getViewById("newstitlelist_tabbar")).getChildAt(0);
		ViewGroup newsitems	=(ViewGroup) items.getChildAt(0);
		newstitlelist_tabbar_count = newsitems.getChildCount();
		
		for(i=0;i<newstitlelist_tabbar_count-1;i++)
		{
			TextView itemnameview=(TextView) ((ViewGroup)newsitems.getChildAt(i)).getChildAt(0);
			itemname=itemname+"|"+itemnameview.getText().toString();
					
		}
		//Log.v("WindTest",itemname);
		return itemname;
	}
}
