//测试点：市场
package MarketKey;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//期指
public class Market_FuturesOfIndex extends StockActivity {
	// 期指指标数据刷新校验
	public void testCase001() throws Exception {
		CaseName = "期指_期指指标数据刷新校验";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("期指");// 点击期指TAB
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// 列表前五行的第一个指标数据刷新校验
		System.out.println(CaseCheck);
	}

	// 进入期指分时页面
	public void testCase002() throws Exception {
		CaseName = "期指_进入期指分时页面";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("期指");// 点击期指TAB

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 1, 0);
		System.out.println(stock_name);// 获取第二行列表成分名称
		solo.clickOnText(stock_name);
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name));// 校验分时页面标题
		System.out.println(CaseCheck);
	}
}
