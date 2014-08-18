//测试点：市场
package Market;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//期指
public class Market_FuturesOfIndex extends StockActivity {
	// 进入期指模块
	public void testCase001() throws Exception {
		CaseName = "进入期指模块";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("期指");// 点击期指TAB

		TextView title = (TextView) this.getViewById("titleView");
		String TAB_title = title.getText().toString();

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 1, 0);

		String stock_data = new MarketStockActivity().getMarketListData(
				"markFixedView", 1, 0);

		CaseCheck = this.EqualsChecked(TAB_title.equalsIgnoreCase("股指期货")
				&& !stock_name.equalsIgnoreCase("--")
				&& !stock_data.equalsIgnoreCase("--"));// 检验标题正确性，名称，现价数据不等于--
		System.out.println(CaseCheck);
	}

	// 向右滑动切换期指分时页面
	public void testCase002() throws Exception {
		CaseName = "向右滑动切换期指分时页面";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("期指");// 点击期指TAB

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 0);// 获取第一行列表成分名称

		String stock_name1 = new MarketStockActivity().getMarketListName(
				"markFixedView", 1, 0);// 获取第二行列表成分名称

		String stock_name2 = new MarketStockActivity().getMarketListName(
				"markFixedView", 2, 0);// 获取第三行列表成分名称

		solo.clickOnText(stock_name);// 点击成分，进入分时页面
		solo.sleep(2000);
		TextView title = (TextView) this.getViewById("book_name");// 获取分时页面标题
		String F5_title = title.getText().toString();

		solo.scrollToSide(Solo.RIGHT);// 切换到下一个分时页面
		solo.sleep(5000);
		TextView title1 = (TextView) this.getViewById("book_name");// 获取分时页面标题
		String F5_title1 = title1.getText().toString();

		solo.scrollToSide(Solo.RIGHT);// 切换到下一个分时页面
		solo.sleep(5000);
		TextView title2 = (TextView) this.getViewById("book_name");// 获取分时页面标题
		String F5_title2 = title2.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name)
				&& F5_title1.contains(stock_name1)
				&& F5_title2.contains(stock_name2));// 校验分时页面标题
		System.out.println(CaseCheck);
	}

	// 向左滑动切换期指分时页面
	public void testCase003() throws Exception {
		CaseName = "向左滑动切换期指分时页面";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("期指");// 点击期指TAB

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 0);// 获取第一行列表成分名称

		String stock_name1 = new MarketStockActivity().getMarketListName(
				"markFixedView", 1, 0);// 获取第二行列表成分名称

		String stock_name2 = new MarketStockActivity().getMarketListName(
				"markFixedView", 2, 0);// 获取第三行列表成分名称

		solo.clickOnText(stock_name2);// 点击成分，进入分时页面
		solo.sleep(2000);
		TextView title2 = (TextView) this.getViewById("book_name");// 获取分时页面标题
		String F5_title2 = title2.getText().toString();

		solo.scrollToSide(Solo.LEFT);// 切换到上一个分时页面
		solo.sleep(5000);
		TextView title1 = (TextView) this.getViewById("book_name");// 获取分时页面标题
		String F5_title1 = title1.getText().toString();

		solo.scrollToSide(Solo.LEFT);// 切换到上一个分时页面
		solo.sleep(5000);
		TextView title = (TextView) this.getViewById("book_name");// 获取分时页面标题
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name)
				&& F5_title1.contains(stock_name1)
				&& F5_title2.contains(stock_name2));// 校验分时页面标题
		System.out.println(CaseCheck);
	}

}
