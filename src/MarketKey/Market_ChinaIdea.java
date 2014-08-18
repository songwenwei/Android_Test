//测试点：市场
package MarketKey;

import com.robotium.solo.Solo;
import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.Button;
import android.widget.TextView;

//中概
public class Market_ChinaIdea extends StockActivity {
	// 中概指标数据刷新校验
	public void testCase001() throws Exception {
		CaseName = "中概_中概指标数据刷新校验";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("中概");// 点击中概TAB
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// 列表前五行的第一个指标数据刷新校验
		System.out.println(CaseCheck);
	}

}
