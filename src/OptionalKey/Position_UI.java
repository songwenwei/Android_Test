package OptionalKey;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.StockActivity;

public class Position_UI extends StockActivity{

	
	public void testCase001() throws Exception
	{
		CaseName="编辑持仓页面进入和返回";
		this.windBottomTool("自选");

		ViewGroup optional_info_tabbar=(ViewGroup)this.getViewById("optional_info_tabbar");
		solo.clickOnView(optional_info_tabbar.getChildAt(4));
		
		String tipcontent="暂无盈亏数据，请先设置您的头寸";
		if(solo.searchText(tipcontent))
			solo.clickOnText("确定");
		else
		{
			View edit=this.getViewById("rightViewLine");
			solo.clickOnView(edit);
		}
		
		if(this.getViewById("editView")!=null)
			solo.clickOnText("完成");
		ViewGroup layout_top=(ViewGroup) ((ViewGroup)this.getViewById("layout_top")).getChildAt(0);
		TextView totalvalueView=((TextView)((ViewGroup)layout_top.getChildAt(0)).getChildAt(0));
		String totalvalue=totalvalueView.getText()+"";
		CaseCheck=this.EqualsChecked(totalvalue.equals("总市值"));
	}
}
