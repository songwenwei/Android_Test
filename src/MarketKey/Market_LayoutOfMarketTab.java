//测试点：市场
package MarketKey;

import StockMasterBase.MarketStockActivity;
import android.widget.Button;
import StockMasterBase.StockActivity;

//市场TAB布局
public class Market_LayoutOfMarketTab extends StockActivity {

	// 游客登录点击市场，市场TAB栏校验
	public void testCase001() throws Exception {
		CaseName = "手机账号登录点击市场，市场TAB栏校验";
		Login("15651610158", "666666");
		windBottomTool("市场");// 点击市场

		int TAB_count = new MarketStockActivity().getMarketTABCount();
		System.out.println(TAB_count); // 输出TAB按钮数目

		String TAB_name = new MarketStockActivity().getMarketTABName();
		System.out.println(TAB_name);// 输出TAB按钮名称及顺序

		CaseCheck = this.EqualsChecked(TAB_name
				.equalsIgnoreCase("沪深|港股|全球|中概|商品|利率|外汇|期指|期债|期货|基金||"));
		System.out.println(CaseCheck);
	}
}
