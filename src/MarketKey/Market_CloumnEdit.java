//测试点：市场
package MarketKey;

import StockMasterBase.MarketStockActivity;
import android.widget.Button;
import StockMasterBase.StockActivity;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

//市场TAB栏目编辑
public class Market_CloumnEdit extends StockActivity {
	// 进入彩虹条编辑页面
	public void testCase001() throws Exception {
		CaseName = "进入彩虹条编辑页面";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABEdit();// 点击【+】，进入彩虹编辑页面

		TextView title = (TextView) this.getViewById("titleView");
		String Rainbow_title = title.getText().toString();
		System.out.println(Rainbow_title);
		CaseCheck = this.EqualsChecked(Rainbow_title.equalsIgnoreCase("栏目编辑"));
		System.out.println(CaseCheck);
	}

	// 移除栏目后，市场TAB校验
	public void testCase002() throws Exception {
		CaseName = "移除栏目后，市场TAB校验";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABEdit();// 点击【+】，进入彩虹编辑页面	
		String itemname1, itemname2;
		itemname1 = null;
		itemname2 = null;
		// 已选栏目数等于0时，先剔除
		ViewGroup Items_delete = (ViewGroup) this.getViewById("drag_grid");
		ViewGroup Items_ForChoose = (ViewGroup) this
				.getViewById("src_grid");
		if (Items_delete.getChildCount() < 6) {
			solo.clickOnView(Items_ForChoose.getChildAt(0));
			solo.sleep(1000);
		}

		itemname1 = ((TextView) Items_delete.getChildAt(0).findViewById(
				this.getSource("drag_grid_item_text"))).getText().toString();

		solo.clickOnView(Items_delete.getChildAt(0));
		solo.sleep(1000);

		solo.clickOnView(((ViewGroup) this.getViewById("leftViewLine"))
				.getChildAt(0));
		solo.sleep(1000);
		itemname2 = new MarketStockActivity().getMarketTABName();
		CaseCheck = this.EqualsChecked(!itemname2.contains(itemname1));
		System.out.println(CaseCheck);
	}

	// 添加栏目后，市场TAB校验
	public void testCase003() throws Exception {
		CaseName = "添加栏目后，市场TAB校验";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABEdit();// 点击【+】，进入彩虹编辑页面
		String itemname1, itemname2;
		itemname1 = null;
		itemname2 = null;
		// 待选栏目数等于0时，先剔除
		ViewGroup Items_ForChoose = (ViewGroup) this
				.getViewById("src_grid");
		ViewGroup Items_delete = (ViewGroup) this.getViewById("drag_grid");
		if (Items_ForChoose.getChildCount() == 0) {
			solo.clickOnView(Items_delete.getChildAt(0));
			solo.sleep(1000);
		}

		itemname1 = ((TextView) Items_ForChoose.getChildAt(0)
				.findViewById(this.getSource("drag_grid_item_text"))).getText()
				.toString();
		solo.clickOnView(Items_ForChoose.getChildAt(0));

		solo.clickOnView(((ViewGroup) this.getViewById("leftViewLine"))
				.getChildAt(0));
		solo.sleep(1000);

		int TAB_count = new MarketStockActivity().getMarketTABCount();
		ViewGroup TABview = (ViewGroup) ((ViewGroup) this
				.getViewById("view_tab")).getChildAt(0);
		TABview = (ViewGroup) TABview.getChildAt(0);
		TABview = (ViewGroup) TABview.getChildAt(TAB_count - 2);
		itemname2 = ((TextView) TABview.getChildAt(0)).getText().toString();
		CaseCheck = this.EqualsChecked(itemname1, itemname2);
		System.out.println(CaseCheck);
	}

}