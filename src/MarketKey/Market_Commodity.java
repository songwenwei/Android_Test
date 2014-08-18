//测试点：市场
package MarketKey;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//商品
public class Market_Commodity extends StockActivity {
	// 商品指标数据刷新校验
	public void testCase001() throws Exception {
		CaseName = "商品_商品指标数据刷新校验";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("商品");// 点击商品TAB
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// 列表前五行的第一个指标数据刷新校验
		System.out.println(CaseCheck);
	}
}
