//测试点：市场
package MarketKey;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//全球
public class Market_Global extends StockActivity {
	// 海外股指数指标数据刷新校验
	public void testCase001() throws Exception {
		CaseName = "全球_海外股指数指标数据刷新校验";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("全球");// 点击全球TAB
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// 列表前五行的第一个指标数据刷新校验
		System.out.println(CaseCheck);
	}

	// 进入海外股指数分时页面
	public void testCase002() throws Exception {
		CaseName = "全球_进入海外股指数分时页面";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("全球");// 点击全球TAB

		String index_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);
		System.out.println(index_name);
		solo.clickOnText(index_name);
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(index_name));// 校验分时页面标题
		System.out.println(CaseCheck);
	}

	// 连续切换海外股指数
	public void testCase003() throws Exception {
		CaseName = "全球_连续切换海外股指数";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("全球");// 点击全球TAB

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

	

	// 海外股指标数据刷新校验
	public void testCase004() throws Exception {
		CaseName = "海外股指标数据刷新校验";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("全球");// 点击全球TAB
		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// 点击【+】，展开列表
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// 列表前五行的第一个指标数据刷新校验
		System.out.println(CaseCheck);
		new MarketStockActivity().clickOnMarketListMinus("markTitleList");// 点击点击【-】，收起列表
	}

	// 进入海外股分时页面
	public void testCase005() throws Exception {
		CaseName = "全球_进入海外股分时页面";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("全球");// 点击全球TAB
		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// 点击【+】，展开列表

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);
		System.out.println(stock_name);
		solo.clickOnText(stock_name);
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name));// 校验分时页面标题
		System.out.println(CaseCheck);

	}

	// 加载下一个个股
	public void testCase006() throws Exception {
		CaseName = "全球_加载下一个个股";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("全球");// 点击全球TAB
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

	// 加载上一个个股
	public void testCase007() throws Exception {
		CaseName = "全球_加载上一个个股";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("全球");// 点击全球TAB
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
