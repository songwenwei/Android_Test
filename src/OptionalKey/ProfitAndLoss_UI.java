package OptionalKey;

import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.StockActivity;

public class ProfitAndLoss_UI  extends StockActivity{

	public void testCase001() throws Exception
	{
		CaseName="������ѡ��ӯ������";
		this.windBottomTool("��ѡ");
		
		ViewGroup optional_info_tabbar=(ViewGroup)this.getViewById("optional_info_tabbar");
		solo.clickOnView(optional_info_tabbar.getChildAt(4));
		
		String tipcontent="����ӯ�����ݣ�������������ͷ��";
		if(solo.searchText(tipcontent))
			solo.clickOnText("ȷ��");
		solo.clickOnText("���");
		
		ViewGroup layout_top=(ViewGroup) ((ViewGroup)this.getViewById("layout_top")).getChildAt(0);
		TextView totalvalueView=((TextView)((ViewGroup)layout_top.getChildAt(0)).getChildAt(0));
		String totalvalue=totalvalueView.getText()+"";
		CaseCheck=this.EqualsChecked(totalvalue.equals("����ֵ"));
		
	}
}
