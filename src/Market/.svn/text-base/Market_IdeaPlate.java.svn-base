//测试点：市场
package Market;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.view.ViewGroup;
import android.widget.TextView;

//沪深/概念板块
public class Market_IdeaPlate extends StockActivity {

	// 进入概念板块
	public void testCase001() throws Exception {
		CaseName = "进入概念板块";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB
		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// 收起沪深
		ViewGroup groupIcon = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		groupIcon = (ViewGroup) groupIcon.getChildAt(0);
		groupIcon = (ViewGroup) groupIcon.getChildAt(0);
		solo.clickOnView(groupIcon);// 收起行业
		ViewGroup image_more = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(2);
		image_more = (ViewGroup) image_more.getChildAt(0);
		image_more = (ViewGroup) image_more.getChildAt(2);
		solo.clickOnView(image_more);// 点击六宫格
		TextView title = (TextView) this.getViewById("titleView");
		String List_title = title.getText().toString();// 获取行情列表标题

		String index_name = new MarketStockActivity().getMarketListName(
				"listview_father", 0, 1);// 获取第一个指数的名称
		String index_price = new MarketStockActivity().getMarketListData(
				"listview_father", 0, 0);// 获取第一个指数的涨跌幅

		CaseCheck = this.EqualsChecked(List_title.equalsIgnoreCase("概念板块")
				&& !index_name.equalsIgnoreCase("--")
				&& !index_price.equalsIgnoreCase("--"));// 检验标题正确性，名称，涨跌幅数据不等于--
		System.out.println(CaseCheck);

	}

	// 点击【+】，展开概念股列表
	public void testCase002() throws Exception {
		CaseName = "点击【+】，展开概念股列表";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB
		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// 收起沪深
		ViewGroup groupIcon = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		groupIcon = (ViewGroup) groupIcon.getChildAt(0);
		groupIcon = (ViewGroup) groupIcon.getChildAt(0);
		solo.clickOnView(groupIcon);// 收起行业
		ViewGroup image_more = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(2);
		image_more = (ViewGroup) image_more.getChildAt(0);
		image_more = (ViewGroup) image_more.getChildAt(2);
		solo.clickOnView(image_more);// 点击六宫格
		new MarketStockActivity().clickOnMarketListPlus("listview_father");// 点击【+】，展开列表
		String stock_name = new MarketStockActivity().getMarketListName(
				"listview_child", 0, 1);// 获取第一个成分股的名称
		String stock_price = new MarketStockActivity().getMarketListData(
				"listview_child", 0, 0);// 获取第一个成分股的涨跌幅

		CaseCheck = this.EqualsChecked(!stock_name.equalsIgnoreCase("--")
				&& !stock_price.equalsIgnoreCase("--"));// 检验名称，涨跌幅数据不等于--
		System.out.println(CaseCheck);

	}

}