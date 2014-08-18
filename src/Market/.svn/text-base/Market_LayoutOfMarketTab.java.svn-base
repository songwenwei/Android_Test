//测试点：市场
package Market;

import StockMasterBase.MarketStockActivity;
import android.widget.Button;
import StockMasterBase.StockActivity;

//市场TAB布局
public class Market_LayoutOfMarketTab extends StockActivity {

	// 游客登录点击市场，市场TAB栏校验
	public void testCase001() throws Exception {
		CaseName = "游客登录点击市场，市场TAB栏校验";
		Logout();
		windBottomTool("市场");// 点击市场

		int TAB_count = new MarketStockActivity().getMarketTABCount();

		String TAB_name = new MarketStockActivity().getMarketTABName();

		CaseCheck = this.EqualsChecked(TAB_name
				.equalsIgnoreCase("沪深|港股|全球|中概|商品|利率|外汇|期指|期债|期货|基金||"));
		System.out.println(CaseCheck);
	}

	// iwind账号登录点击市场，市场TAB栏校验
	public void testCase002() throws Exception {
		CaseName = "iwind账号登录点击市场，市场TAB栏校验";
		Login("iwindm1@163.com", "123456");
		windBottomTool("市场");// 点击市场

		int TAB_count = new MarketStockActivity().getMarketTABCount();

		String TAB_name = new MarketStockActivity().getMarketTABName();

		CaseCheck = this.EqualsChecked(TAB_name
				.equalsIgnoreCase("沪深|港股|全球|中概|商品|利率|外汇|期指|期债|期货|基金||"));
		System.out.println(CaseCheck);

	}
}
