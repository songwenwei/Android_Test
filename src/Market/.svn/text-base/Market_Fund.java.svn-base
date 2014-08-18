//测试点：市场
package Market;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//基金
public class Market_Fund extends StockActivity {
	// 进入基金模块
	public void testCase001() throws Exception {
		CaseName = "进入基金模块";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("基金");// 点击基金TAB

		TextView title = (TextView) this.getViewById("titleView");
		String TAB_title = title.getText().toString();

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);

		String stock_data = new MarketStockActivity().getMarketListData(
				"markFixedView", 0, 0);

		CaseCheck = this.EqualsChecked(TAB_title.equalsIgnoreCase("基金指数")
				&& !stock_name.equalsIgnoreCase("--")
				&& !stock_data.equalsIgnoreCase("--"));// 检验标题正确性，名称，现价数据不等于--
		System.out.println(CaseCheck);
	}

	// 进入基金指数分时页面
	public void testCase002() throws Exception {
		CaseName = "进入基金指数分时页面";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("基金");// 点击基金TAB

		String index_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);
		solo.clickOnText(index_name);
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(index_name));// 校验分时页面标题
		System.out.println(CaseCheck);

	}

}
