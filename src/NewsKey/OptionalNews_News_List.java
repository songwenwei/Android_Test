package NewsKey;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import StockMasterBase.NewsStockActivity;


//新闻-自选股新闻-新闻
public class OptionalNews_News_List extends NewsStockActivity {

	public void testCase001() throws Exception
	{
		CaseName="添加单支A股后查看自选新闻列表";
		
		this.windBottomTool("自选");
		solo.clickOnView(this.getViewById("titleViewLine"));
		if(this.windOptionalTip())
			solo.clickOnButton("取消");
		else
		{	
			View groupBgView=this.getViewById("groupBgView");
			ListView groupBgView_parent=(ListView) groupBgView.getParent().getParent();
			solo.scrollListToBottom(groupBgView_parent);
			solo.clickOnText("本地自选股");
		}
	
		
		String windcode="600000.SH";
		this.windEnterTimeShare(windcode);
		View add_self_button=this.getViewById("add_self_button");
		String add_self_name=((TextView)this.getViewById("speed_text_view")).getText()+"";
		
		//确认添加自选
		if(!add_self_name.equals("更多操作"))
			{
				solo.clickOnView(add_self_button);
				solo.sleep(1000);
			}
		
		solo.scrollDown();
		this.windDataReq();//加载数据
		String newstitle_text1=((TextView)this.getViewById("newstitle_text")).getText()+"";
		//Log.v("WindTest",newstitle_text1);
		Activity at=solo.getCurrentActivity();
		at.finish();
		solo.sleep(1000);
		this.windBottomTool("自选");
		
		ViewGroup optional_info_tabbar=(ViewGroup)this.getViewById("optional_info_tabbar");
		solo.clickOnView(optional_info_tabbar.getChildAt(1));
		solo.sleep(1500);//加载数据
		String newstitle_text2=((TextView)this.getViewById("newstitle_text")).getText()+"";
		
		//Log.v("WindTest",newstitle_text2);
		
		CaseCheck=this.EqualsChecked(newstitle_text1.equals(newstitle_text2));		
		//Log.v("WindTest",CaseCheck);
	}
	
	public void testCase002() throws Exception
	{
		CaseName="删除单个A股后查看自选新闻列表";
		
		this.windBottomTool("自选");
		
		solo.clickOnView(this.getViewById("titleViewLine"));
		if(this.windOptionalTip())
			solo.clickOnButton("取消");
		else
		{
			View groupBgView=this.getViewById("groupBgView");
			ListView groupBgView_parent=(ListView) groupBgView.getParent().getParent();
			solo.scrollListToBottom(groupBgView_parent);
			solo.clickOnText("本地自选股");
		}
	
		ViewGroup optional_info_tabbar=(ViewGroup)this.getViewById("optional_info_tabbar");
		solo.clickOnView(optional_info_tabbar.getChildAt(4));
		solo.sleep(1000);//加载数据
		
		String tipcontent="暂无盈亏数据，请先设置您的头寸";
		//跳过盈亏提示
		if(solo.searchText(tipcontent))
			solo.clickOnText("确定");
		else
		{
			View optionaledit=this.getViewById("rightViewLine");
			solo.clickOnView(optionaledit);
		}
				
		//清空自选股
		while(true)
		{
			ViewGroup editView=(ViewGroup)((ViewGroup)this.getViewById("editView")).getChildAt(1);
			int sharescount=0;View deletebutton=null;
			sharescount=editView.getChildCount();
			Log.v("WindTest",sharescount+"");
			if(sharescount!=0)
			{
				if(sharescount>5)
				{
					for(int i=0;i<5;i++)
					{
						deletebutton=editView.getChildAt(i).findViewById(this.getSourceID("deleteImage"));
						solo.clickOnView(deletebutton);
					}
					solo.clickOnText("删除自选");
				}
				else
				{
					for(int i=0;i<sharescount;i++)
					{
						deletebutton=editView.getChildAt(i).findViewById(this.getSourceID("deleteImage"));
						solo.clickOnView(deletebutton);
					}
					solo.clickOnText("删除自选");
				}
				
			}
			else
				break;
			
		}
		solo.clickOnText("完成");

		solo.clickOnView(optional_info_tabbar.getChildAt(1));
		solo.sleep(1000);
		CaseCheck=this.EqualsChecked(solo.searchText("最近无信息"));
		//	Log.v("WindTest",CaseCheck);
		
	}

	public void testCase003() throws Exception
	{
		CaseName="向上拖动加载下一版新闻";
		String windcode="600000.SH";
		this.windEnterTimeShare(windcode);
		
		//确认添加自选
		View add_self_button=this.getViewById("add_self_button");
		String add_self_name=((TextView)this.getViewById("speed_text_view")).getText()+"";
		if(!add_self_name.equals("更多操作"))
			{
				solo.clickOnView(add_self_button);
				solo.sleep(1000);
			}
		
		this.windBottomTool("自选");
		ViewGroup optional_info_tabbar=(ViewGroup)this.getViewById("optional_info_tabbar");
		solo.clickOnView(optional_info_tabbar.getChildAt(1));
		solo.sleep(1500);
		String newstitle1=((TextView)this.getViewById("newstitle_text")).getText()+"";
		ListView pull_to_refresh_list=(ListView) this.getViewById("pull_to_refresh_list");
		solo.scrollListToBottom(pull_to_refresh_list);
		solo.sleep(1000);
		solo.scrollListToBottom(pull_to_refresh_list);
		solo.sleep(1000);
		solo.scrollListToBottom(pull_to_refresh_list);
		solo.sleep(1000);
		String newstitle2=((TextView)this.getViewById("newstitle_text")).getText()+"";
		CaseCheck=this.EqualsChecked(!newstitle1.equals(newstitle2));
		
	}
	
}
