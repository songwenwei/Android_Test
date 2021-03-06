//测试点：市场
package MarketKey;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.view.ViewGroup;
import android.widget.TextView;

//沪深/行业涨跌
public class Market_HS_IndustryRiseAndFall extends StockActivity {

	// 行业指数指标数据刷新校验
	public void testCase001() throws Exception {
		CaseName = "行业涨跌_行业指数指标数据刷新校验";
		solo.sleep(6000);
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB
		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// 收起沪深
		ViewGroup image_more = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		image_more = (ViewGroup) image_more.getChildAt(0);
		image_more = (ViewGroup) image_more.getChildAt(2);
		solo.clickOnView(image_more);// 点击六宫格
		solo.clickOnView(this.getViewById("change_range_five_days"));
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("listview_father",0)
		/**/);// 列表前五行的第一个指标数据刷新校验
		System.out.println(CaseCheck);
	}

	// 进入行业指数分时页面
	public void testCase002() throws Exception {
		CaseName = "行业涨跌_进入行业指数分时页面";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB
		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// 收起沪深
		ViewGroup image_more = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		image_more = (ViewGroup) image_more.getChildAt(0);
		image_more = (ViewGroup) image_more.getChildAt(2);
		solo.clickOnView(image_more);// 点击六宫格
		String index_name = new MarketStockActivity().getMarketListName(
				"listview_father", 0, 1);
		System.out.println(index_name);// 获取第一个指数的名称
		solo.clickOnText(index_name);
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(index_name));// 校验分时页面标题
		System.out.println(CaseCheck);

	}

	//连续切换指数
	public void testCase003() throws Exception {
		CaseName = "行业涨跌_连续切换指数";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB
		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// 收起沪深
		ViewGroup image_more = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		image_more = (ViewGroup) image_more.getChildAt(0);
		image_more = (ViewGroup) image_more.getChildAt(2);
		solo.clickOnView(image_more);// 点击六宫格
		String stock_name = new MarketStockActivity().getMarketListName(
				"listview_father", 0, 1);// 获取第一行列表成分名称

		String stock_name1 = new MarketStockActivity().getMarketListName(
				"listview_father", 1, 1);// 获取第二行列表成分名称

		String stock_name2 = new MarketStockActivity().getMarketListName(
				"listview_father", 2, 1);// 获取第三行列表成分名称

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

	

	// 行业股指标数据刷新校验
	public void testCase004() throws Exception {
		CaseName = "行业涨跌_行业股指标数据刷新校验";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB
		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// 收起沪深
		ViewGroup image_more = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		image_more = (ViewGroup) image_more.getChildAt(0);
		image_more = (ViewGroup) image_more.getChildAt(2);
		solo.clickOnView(image_more);// 点击六宫格
		new MarketStockActivity().clickOnMarketListPlus("listview_father");// 点击【+】，展开列表
		solo.clickOnView(this.getViewById("change_range_five_days"));
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("listview_child",0)
		/**/);// 列表前五行的第一个指标数据刷新校验
		System.out.println(CaseCheck);
	}

	// 进入行业股分时页面
	public void testCase005() throws Exception {
		CaseName = "行业涨跌_进入行业股分时页面";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB
		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// 收起沪深
		ViewGroup image_more = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		image_more = (ViewGroup) image_more.getChildAt(0);
		image_more = (ViewGroup) image_more.getChildAt(2);
		solo.clickOnView(image_more);// 点击六宫格
		new MarketStockActivity().clickOnMarketListPlus("listview_father");// 点击【+】，展开列表
		String stock_name = new MarketStockActivity().getMarketListName(
				"listview_child", 0, 1);
		System.out.println(stock_name);// 获取第一个成分股的名称
		solo.clickOnText(stock_name);// 进入第一个成分股的分时页面
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name));// 校验分时页面标题
		System.out.println(CaseCheck);

	}

	// 向右滑动切换行业股分时页面
	public void testCase006() throws Exception {
		CaseName = "行业涨跌_加载下一个个股";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB
		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// 收起沪深
		ViewGroup image_more = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		image_more = (ViewGroup) image_more.getChildAt(0);
		image_more = (ViewGroup) image_more.getChildAt(2);
		solo.clickOnView(image_more);// 点击六宫格
		new MarketStockActivity().clickOnMarketListPlus("listview_father");// 点击【+】，展开列表
		String stock_name = new MarketStockActivity().getMarketListName(
				"listview_child", 0, 1);// 获取第一行列表成分名称
		String stock_name1 = new MarketStockActivity().getMarketListName(
				"listview_child", 1, 1);// 获取第二行列表成分名称
		String stock_name2 = new MarketStockActivity().getMarketListName(
				"listview_child", 2, 1);// 获取第三行列表成分名称

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

	// 向左滑动切换行业股分时页面
	public void testCase007() throws Exception {
		CaseName = "行业涨跌_加载上一个个股";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB
		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// 收起沪深

		ViewGroup image_more = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		image_more = (ViewGroup) image_more.getChildAt(0);
		image_more = (ViewGroup) image_more.getChildAt(2);
		solo.clickOnView(image_more);// 点击六宫格

		new MarketStockActivity().clickOnMarketListPlus("listview_father");// 点击【+】，展开列表

		String stock_name = new MarketStockActivity().getMarketListName(
				"listview_child", 0, 1);// 获取第一行列表成分名称

		String stock_name1 = new MarketStockActivity().getMarketListName(
				"listview_child", 1, 1);// 获取第二行列表成分名称

		String stock_name2 = new MarketStockActivity().getMarketListName(
				"listview_child", 2, 1);// 获取第三行列表成分名称

		solo.clickOnText(stock_name2);// 点击成分，进入分时页面
		solo.sleep(2000);
		TextView title2 = (TextView) this.getViewById("book_name");// 获取分时页面标题
		String F5_title2 = title2.getText().toString();

		solo.scrollToSide(Solo.LEFT);// 切换到上一个分时页面
		solo.sleep(5000);
		TextView title1 = (TextView) this.getViewById("book_name");// 获取分时页面标题
		String F5_title1 = title1.getText().toString();

		solo.scrollToSide(Solo.LEFT);// 切换到上一个分时页面
		solo.sleep(6000);
		TextView title = (TextView) this.getViewById("book_name");// 获取分时页面标题
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name)
				&& F5_title1.contains(stock_name1)
				&& F5_title2.contains(stock_name2));// 校验分时页面标题
		System.out.println(CaseCheck);
	}
}