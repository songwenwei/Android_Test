//测试点：市场
package MarketKey;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//期债
public class Market_FuturesOfBond extends StockActivity {
	// 期债指标数据刷新校验
	public void testCase001() throws Exception {
		CaseName = "期债_期债指标数据刷新校验";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("期债");// 点击期债TAB
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// 列表前五行的第一个指标数据刷新校验
		System.out.println(CaseCheck);
	}

	// 进入期债分时页面
	public void testCase002() throws Exception {
		CaseName = "期债_进入期债分时页面";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("期债");// 点击期债TAB

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 0);
		System.out.println(stock_name);
		solo.clickOnText(stock_name);
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name));// 校验分时页面标题
		System.out.println(CaseCheck);
	}
}
