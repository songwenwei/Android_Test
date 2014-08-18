//测试点：市场
package MarketKey;

import StockMasterBase.MarketStockActivity;
import android.widget.Button;
import StockMasterBase.StockActivity;
import android.view.ViewGroup;
import android.widget.TextView;

//沪深/沪深布局
public class Market_HS_LayoutOfHS extends StockActivity {
	// 进入沪深模块
	public void testCase001() throws Exception {
		CaseName = "进入沪深模块";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB

		TextView title = (TextView) this.getViewById("titleView");
		String TAB_title = title.getText().toString();
		System.out.println(TAB_title);

		TextView name = (TextView) (TextView) this.getViewById("name_left");
		String index_name = name.getText().toString();
		System.out.println(index_name);

		TextView price = (TextView) (TextView) this.getViewById("price_left");
		String index_price = price.getText().toString();
		System.out.println(index_price);

		CaseCheck = this.EqualsChecked(TAB_title.equalsIgnoreCase("沪深大盘")
				&& !index_name.equalsIgnoreCase("--")
				&& !index_price.equalsIgnoreCase("--"));// 检验标题正确性，名称，现价数据不等于--
		System.out.println(CaseCheck);

	}

	// 进入沪深指数分时页面
	public void testCase002() throws Exception {
		CaseName = "进入沪深指数分时页面";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB

		ViewGroup listview = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		listview = (ViewGroup) listview.getChildAt(0);
		listview = (ViewGroup) listview.getChildAt(0);
		TextView name = (TextView) listview.getChildAt(0);
		String index_name = name.getText().toString();
		System.out.println(index_name);
		solo.clickOnText(index_name);
		solo.sleep(10000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(index_name));// 校验分时页面标题
		System.out.println(CaseCheck);

	}

	// 进入行业指数分时页面
	public void testCase003() throws Exception {
		CaseName = "进入行业指数分时页面";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB

		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// 收起沪深
		solo.sleep(2000);

		ViewGroup listview = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(2);
		listview = (ViewGroup) listview.getChildAt(0);
		listview = (ViewGroup) listview.getChildAt(0);
		TextView name = (TextView) listview.getChildAt(0);
		String index_name = name.getText().toString();
		System.out.println(index_name);
		solo.clickOnText(index_name);
		solo.sleep(10000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(index_name));// 校验分时页面标题
		System.out.println(CaseCheck);

	}

	// 进入概念指数分时页面
	public void testCase004() throws Exception {
		CaseName = "进入概念指数分时页面";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB

		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// 收起沪深
		solo.sleep(2000);

		ViewGroup groupIcon = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		groupIcon = (ViewGroup) groupIcon.getChildAt(0);
		groupIcon = (ViewGroup) groupIcon.getChildAt(0);
		solo.clickOnView(groupIcon);// 收起行业
		solo.sleep(2000);

		ViewGroup listview = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(3);
		listview = (ViewGroup) listview.getChildAt(0);
		listview = (ViewGroup) listview.getChildAt(0);
		TextView name = (TextView) listview.getChildAt(0);
		String index_name = name.getText().toString();
		System.out.println(index_name);
		solo.clickOnText(index_name);
		solo.sleep(10000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(index_name));// 校验分时页面标题
		System.out.println(CaseCheck);
	}

}
