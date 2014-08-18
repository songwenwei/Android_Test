//测试点：市场
package Market;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//期货
public class Market_Futures extends StockActivity {
	// 进入期货模块
	public void testCase001() throws Exception {
		CaseName = "进入期货模块";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("期货");// 点击期货TAB

		TextView title = (TextView) this.getViewById("titleView");
		String TAB_title = title.getText().toString();

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);
		String stock_data = new MarketStockActivity().getMarketListData(
				"markFixedView", 0, 0);

		CaseCheck = this.EqualsChecked(TAB_title.equalsIgnoreCase("国内商品")
				&& !stock_name.equalsIgnoreCase("--")
				&& !stock_data.equalsIgnoreCase("--"));// 检验标题正确性，名称，现价数据不等于--
		System.out.println(CaseCheck);
	}

	// 进入期货分时页面
	public void testCase002() throws Exception {
		CaseName = "进入期货分时页面";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("期货");// 点击期货TAB

		String index_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);
		solo.clickOnText(index_name);
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(index_name));// 校验分时页面标题
		System.out.println(CaseCheck);

	}

	// 向右滑动切换期货分时页面
	public void testCase003() throws Exception {
		CaseName = "向右滑动切换期货分时页面";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("期货");// 点击期货TAB

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

	// 向左滑动切换期货分时页面
	public void testCase004() throws Exception {
		CaseName = "向左滑动切换期货分时页面";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("期货");// 点击期货TAB

		String index_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);// 获取第一行列表成分名称

		String index_name1 = new MarketStockActivity().getMarketListName(
				"markFixedView", 1, 1);// 获取第二行列表成分名称

		String index_name2 = new MarketStockActivity().getMarketListName(
				"markFixedView", 2, 1);// 获取第三行列表成分名称

		solo.clickOnText(index_name2);// 点击成分，进入分时页面
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

		CaseCheck = this.EqualsChecked(F5_title.contains(index_name)
				&& F5_title1.contains(index_name1)
				&& F5_title2.contains(index_name2));// 校验分时页面标题
		System.out.println(CaseCheck);
	}

	// 点击【+】，展开期货成分列表
	public void testCase005() throws Exception {
		CaseName = "点击【+】，展开期货成分列表";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("期货");// 点击期货TAB

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

	// 向右滑动切换期货成分分时页面
	public void testCase006() throws Exception {
		CaseName = "向右滑动切换期货成分分时页面";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("期货");// 点击期货TAB

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

	// 向左滑动切换期货成分分时页面
	public void testCase007() throws Exception {
		CaseName = "向左滑动切换期货成分分时页面";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("期货");// 点击期货TAB

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

}
