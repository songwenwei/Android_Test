//测试点：市场
package Market;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//全球
public class Market_Global extends StockActivity {
	// 进入全球模块
	public void testCase001() throws Exception {
		CaseName = "进入全球模块";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("全球");// 点击全球TAB

		TextView title = (TextView) this.getViewById("titleView");
		String TAB_title = title.getText().toString();

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);

		String stock_data = new MarketStockActivity().getMarketListData(
				"markFixedView", 0, 0);

		CaseCheck = this.EqualsChecked(TAB_title.equalsIgnoreCase("全球股指")
				&& !stock_name.equalsIgnoreCase("--")
				&& !stock_data.equalsIgnoreCase("--"));// 检验标题正确性，名称，现价数据不等于--
		System.out.println(CaseCheck);
	}

	// 点击【+】，展开海外股列表
	public void testCase002() throws Exception {
		CaseName = "点击【+】，展开海外股列表";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("全球");// 点击全球TAB

		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// 点击【+】，展开列表

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);

		String stock_data = new MarketStockActivity().getMarketListData(
				"markFixedView", 0, 0);

		CaseCheck = this.EqualsChecked(!stock_name.equalsIgnoreCase("--")
				&& !stock_data.equalsIgnoreCase("--"));// 检验名称，名称，现价数据不等于--
		System.out.println(CaseCheck);

		new MarketStockActivity().clickOnMarketListMinus("markTitleList");// 点击点击【-】，收起列表

	}

}
