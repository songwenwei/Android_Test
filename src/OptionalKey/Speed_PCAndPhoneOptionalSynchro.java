package OptionalKey;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import StockMasterBase.StockActivity;

public class Speed_PCAndPhoneOptionalSynchro  extends StockActivity{

	public void testCase001()throws Exception
	{
		CaseName="手机登陆查看自选股板块";
		String username, pwd;
		username="18551648723";
		pwd="123456";
		this.Login(username, pwd);

		View titleView=this.getViewById("titleViewLine");
		solo.clickOnView(titleView);
		ViewGroup ListView=(ViewGroup)((View)this.getViewById("groupBgView").getParent()).getParent();
		int listcount=ListView.getChildCount();
		boolean groupcheck=false;
		for(int i=0;i<listcount;i++)
		{
			String [] optionalgroup={"我的自选股","我的自选股2","我的自选股3","本地自选股"};
			String groupname=((TextView)ListView.getChildAt(i).findViewById(this.getSourceID("group_name"))).getText()+"";
			groupcheck=groupname.equals(optionalgroup[i]);
			if(!groupcheck)
				break;
		}
		CaseCheck=this.EqualsChecked(groupcheck);
		//Log.v("WindTest",CaseCheck);
	}
	
	
	public void testCase002()throws Exception
	{
		CaseName="手机登陆，查看各板块成分和顺序";
		/*String username, pwd;
		username="18551648723";
		pwd="123456";
		this.Login(username, pwd);*/
		int checkcount=0;//校验三个自选股板块
		
		//1
		View titleView=this.getViewById("titleViewLine");
		solo.clickOnView(titleView);
		solo.clickOnText("我的自选");
		ViewGroup optional_speed_list=(ViewGroup)this.getViewById("optional_speed_list");
		int optional_speed_list_count=optional_speed_list.getChildCount();
		String optional_component=null;
		for(int i=0;i<optional_speed_list_count;i++)
		{
			String windcode=((TextView)optional_speed_list.getChildAt(i).findViewById(this.getSourceID("windcode"))).getText()+"";
			optional_component=optional_component+windcode+"|";
		}
		//Log.v("WindTest",optional_component);
		if(optional_component.contains("000001")&&optional_component.contains("399001"))
			checkcount++;
		solo.sleep(500);
		
		//2
		solo.clickOnView(titleView);
		solo.clickOnText("我的自选股2");
		optional_speed_list=(ViewGroup)this.getViewById("optional_speed_list");
		optional_speed_list_count=optional_speed_list.getChildCount();
		optional_component=null;
		for(int i=0;i<optional_speed_list_count;i++)
		{
			String windcode=((TextView)optional_speed_list.getChildAt(i).findViewById(this.getSourceID("windcode"))).getText()+"";
			optional_component=optional_component+windcode+"|";
		}
		//Log.v("WindTest",optional_component);
		if(optional_component.contains("000001")&&optional_component.contains("000002")&&optional_component.contains("000005"))
			checkcount++;
		solo.sleep(500);	
		
		//3
		solo.clickOnView(titleView);
		solo.clickOnText("我的自选股3");
		optional_speed_list=(ViewGroup)this.getViewById("optional_speed_list");
		optional_speed_list_count=optional_speed_list.getChildCount();
		optional_component=null;
		for(int i=0;i<optional_speed_list_count;i++)
		{
			String windcode=((TextView)optional_speed_list.getChildAt(i).findViewById(this.getSourceID("windcode"))).getText()+"";
			optional_component=optional_component+windcode+"|";
		}
		//Log.v("WindTest",optional_component);
		if(optional_component.contains("0001")&&optional_component.contains("AAPL")&&optional_component.contains("0762"))
			checkcount++;						
		solo.sleep(500);
		//Log.v("WindTest",checkcount+"");
		
		CaseCheck=this.EqualsChecked(checkcount==3);
		Log.v("WindTest",CaseCheck);
	}
	
	

}
