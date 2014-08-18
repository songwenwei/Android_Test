package OptionalKey;

import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.StockActivity;

public class ProfitAndLoss_UI  extends StockActivity{

	public void testCase001() throws Exception
	{
		CaseName="进入自选股盈亏界面";
		this.windBottomTool("自选");
		
		ViewGroup optional_info_tabbar=(ViewGroup)this.getViewById("optional_info_tabbar");
		solo.clickOnView(optional_info_tabbar.getChildAt(4));
		
		String tipcontent="暂无盈亏数据，请先设置您的头寸";
		if(solo.searchText(tipcontent))
			solo.clickOnText("确定");
		solo.clickOnText("完成");
		
		ViewGroup layout_top=(ViewGroup) ((ViewGroup)this.getViewById("layout_top")).getChildAt(0);
		TextView totalvalueView=((TextView)((ViewGroup)layout_top.getChildAt(0)).getChildAt(0));
		String totalvalue=totalvalueView.getText()+"";
		CaseCheck=this.EqualsChecked(totalvalue.equals("总市值"));
		
	}
}
