//测试点：市场
package Market;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//港股
public class Market_HKstock extends StockActivity {
	// 进入港股模块
	public void testCase001() throws Exception {
		CaseName = "进入港股模块";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("港股");// 点击港股TAB

		TextView title = (TextView) this.getViewById("titleView");
		String TAB_title = title.getText().toString();

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);

		String stock_data = new MarketStockActivity().getMarketListData(
				"markFixedView", 0, 0);

		CaseCheck = this.EqualsChecked(TAB_title.equalsIgnoreCase("港股指数")
				&& !stock_name.equalsIgnoreCase("--")
				&& !stock_data.equalsIgnoreCase("--"));// 检验标题正确性，名称，现价数据不等于--
		System.out.println(CaseCheck);

	}

	// 点击【+】，展开港股列表
	public void testCase002() throws Exception {
		CaseName = "点击【+】，展开港股列表";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("港股");// 点击港股TAB
		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// 点击【+】，展开列表

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);

		String stock_data = new MarketStockActivity().getMarketListData(
				"markFixedView", 0, 0);

		CaseCheck = this.EqualsChecked(!stock_name.equalsIgnoreCase("--")
				&& !stock_data.equalsIgnoreCase("--"));// 检验标题正确性，名称，现价数据不等于--
		System.out.println(CaseCheck);

		new MarketStockActivity().clickOnMarketListMinus("markTitleList");// 点击【-】，收起列表

	}

}
