package NewsKey;

import com.robotium.solo.Solo;

import StockMasterBase.NewsStockActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


//新闻-新闻模块-新闻列表
public class News_NewsList extends NewsStockActivity {

	// 检查默认新闻入口界面
	public void testCase001() throws Exception {
		CaseName = "列表中阅读新闻";
		windBottomTool("新闻");
		this.windClickNewsItem("滚动");
		ViewGroup navigationBar=(ViewGroup)getViewById("navigationBar");
		//播放声音时，VirtualBox会报错误日志
		solo.clickOnView(navigationBar.getChildAt(1));
		CaseCheck = EqualsChecked(solo.waitForActivity("WiAndroidAppDelegate"));
	}

	
	public void testCase002() throws Exception {
		CaseName = "列表中点击【搜索】";
		windBottomTool("新闻");
		View searchButton=getViewById("mainRow").findViewById(getSourceID("rightViewLine"));
		solo.clickOnView(searchButton);
		solo.sleep(500);
		
		//Log.v("WindTest",solo.getCurrentActivity()+"");
		View title=getViewById("mainRow").findViewById(getSourceID("titleView"));
		String titlename=((TextView)title).getText().toString();
		
		//Log.v("WindTest",titlename+"");
		CaseCheck = EqualsChecked(titlename.equalsIgnoreCase("新闻搜索"));

	}

	
	public void testCase003() throws Exception {
		CaseName = "向下拖动新闻刷新新闻";
		windBottomTool("新闻");
		
		ViewGroup pull_to_refresh_list=(ViewGroup)getViewById("pull_to_refresh_list");
		ViewGroup newstitle1=(ViewGroup)pull_to_refresh_list.getChildAt(1);
		View newstitle_time1=newstitle1.findViewById(getSourceID("newstitle_time"));
		View newstitle_text1=newstitle1.findViewById(getSourceID("newstitle_text"));
		String newstitletime1=((TextView)newstitle_time1).getText().toString();
		String newstitletext1=((TextView)newstitle_text1).getText().toString();
		
		
		int [] posiont=new int[2];
		int [] size=new int[2];
		pull_to_refresh_list.getLocationOnScreen(posiont);
		size[0]=pull_to_refresh_list.getWidth();
		size[1]=pull_to_refresh_list.getHeight();
		boolean check=false;
		for(int i=0;i<5;i++)
		{
			solo.drag(posiont[0]+size[0]/2, posiont[0]+size[0]/2, posiont[1]+size[1]/10, posiont[1]+size[1]*9/10,50);
			ViewGroup newstitle2=(ViewGroup)pull_to_refresh_list.getChildAt(1);
			View newstitle_time2=newstitle2.findViewById(getSourceID("newstitle_time"));
			View newstitle_text2=newstitle2.findViewById(getSourceID("newstitle_text"));
			String newstitletime2=((TextView)newstitle_time2).getText().toString();
			String newstitletext2=((TextView)newstitle_text2).getText().toString();
			check=(!newstitletime1.equals(newstitletime2))||(!newstitletext1.equals(newstitletext2));
			if(check)
				break;
			else
				solo.sleep(60000);
		}
		
		CaseCheck=EqualsChecked(check);

	}

	
	public void testCase004() throws Exception {
		CaseName = "向上拖动加载下一版新闻";

		windBottomTool("新闻");
		ViewGroup pull_to_refresh_list=(ViewGroup)getViewById("pull_to_refresh_list");
		ViewGroup newstitle1=(ViewGroup)pull_to_refresh_list.getChildAt(1);
		View newstitle_time1=newstitle1.findViewById(getSourceID("newstitle_time"));
		View newstitle_text1=newstitle1.findViewById(getSourceID("newstitle_text"));
		String newstitletime1=((TextView)newstitle_time1).getText().toString();
		String newstitletext1=((TextView)newstitle_text1).getText().toString();
		
		int [] posiont=new int[2];
		int [] size=new int[2];
		pull_to_refresh_list.getLocationOnScreen(posiont);
		size[0]=pull_to_refresh_list.getWidth();
		size[1]=pull_to_refresh_list.getHeight();
		boolean check=false;
		for(int i=0;i<3;i++)
		{
			solo.drag(posiont[0]+size[0]/2, posiont[0]+size[0]/2, posiont[1]+size[1]*9/10, posiont[1]+size[1]*1/10,1);
			solo.sleep(1500);
		}
		ViewGroup newstitle2=(ViewGroup)pull_to_refresh_list.getChildAt(1);
		View newstitle_time2=newstitle2.findViewById(getSourceID("newstitle_time"));
		View newstitle_text2=newstitle2.findViewById(getSourceID("newstitle_text"));
		String newstitletime2=((TextView)newstitle_time2).getText().toString();
		String newstitletext2=((TextView)newstitle_text2).getText().toString();
		check=(!newstitletime1.equals(newstitletime2))||(!newstitletext1.equals(newstitletext2));
		CaseCheck=EqualsChecked(check);
		Log.v("WindTest",CaseCheck+"");
	}

}
