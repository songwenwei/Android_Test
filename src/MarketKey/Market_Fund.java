//测试点：市场
package MarketKey;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//基金
public class Market_Fund extends StockActivity {
	// 向右滑动切换基金指数分时页面
	public void testCase001() throws Exception {
		CaseName = "基金_连续切换基金指数";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("基金");// 点击基金TAB

		String index_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);// 获取第一行列表成分名称

		String index_name1 = new MarketStockActivity().getMarketListName(
				"markFixedView", 1, 1);// 获取第二行列表成分名称

		String index_name2 = new MarketStockActivity().getMarketListName(
				"markFixedView", 2, 1);// 获取第三行列表成分名称

		solo.clickOnText(index_name);// 点击成分，进入分时页面
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

		CaseCheck = this.EqualsChecked(F5_title.contains(index_name)
				&& F5_title1.contains(index_name1)
				&& F5_title2.contains(index_name2));// 校验分时页面标题
		System.out.println(CaseCheck);
	}

	

	// 进入基金分时页面
	public void testCase002() throws Exception {
		CaseName = "基金_进入基金分时页面";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("基金");// 点击基金TAB
		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// 点击【+】，展开列表

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);
		solo.clickOnText(stock_name);
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name));// 校验分时页面标题
		System.out.println(CaseCheck);
	}

	// 加载下一个基金
	public void testCase003() throws Exception {
		CaseName = "基金_加载下一个基金";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("基金");// 点击基金TAB
		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// 点击【+】，展开列表

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);// 获取第一行列表成分名称

		String stock_name1 = new MarketStockActivity().getMarketListName(
				"markFixedView", 1, 1);// 获取第二行列表成分名称

		String stock_name2 = new MarketStockActivity().getMarketListName(
				"markFixedView", 2, 1);// 获取第三行列表成分名称

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

	// 加载上一个基金
	public void testCase004() throws Exception {
		CaseName = "基金_加载上一个基金";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("基金");// 点击基金TAB
		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// 点击【+】，展开列表

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);// 获取第一行列表成分名称

		String stock_name1 = new MarketStockActivity().getMarketListName(
				"markFixedView", 1, 1);// 获取第二行列表成分名称

		String stock_name2 = new MarketStockActivity().getMarketListName(
				"markFixedView", 2, 1);// 获取第三行列表成分名称

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

	// 点击【+】，展开基金列表
	public void testCase005() throws Exception {
		CaseName = "基金_点击【+】，展开基金列表";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("基金");// 点击基金TAB
		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// 点击【+】，展开列表

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);
		System.out.println(stock_name);// 获取列表第一个成分的名称

		String stock_data = new MarketStockActivity().getMarketListData(
				"markFixedView", 0, 0);
		System.out.println(stock_data);

		CaseCheck = this.EqualsChecked(!stock_name.equalsIgnoreCase("--")
				&& !stock_data.equalsIgnoreCase("--"));// 检验名称，名称，现价数据不等于--
		System.out.println(CaseCheck);

		new MarketStockActivity().clickOnMarketListMinus("markTitleList");// 点击【-】，收起列表
	}

}
