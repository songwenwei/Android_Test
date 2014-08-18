//测试点：市场
package Market;

import StockMasterBase.MarketStockActivity;
import android.widget.Button;
import StockMasterBase.StockActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.TextView;

//沪深/沪深布局
public class Market_LayoutOfHS extends StockActivity {

	// 默认显示沪深指数列表校验
	public void testCase001() throws Exception {
		CaseName = "默认显示沪深指数列表校验";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB

		int i, j;
		String index_name;
		StringBuffer data_bag = new StringBuffer();
		for (i = 1; i < 3; i++)
			for (j = 0; j < 3; j++) {
				ViewGroup listview = (ViewGroup) ((ViewGroup) this
						.getViewById("listview_hs")).getChildAt(i);
				listview = (ViewGroup) listview.getChildAt(0);
				listview = (ViewGroup) listview.getChildAt(j);
				TextView name = (TextView) listview.getChildAt(0);
				index_name = name.getText().toString();
				data_bag.append(index_name);
				data_bag.append("|");
			}
		index_name = data_bag.toString();
		CaseCheck = this.EqualsChecked(index_name
				.equalsIgnoreCase("上证综指|深证成指|沪深300|深证综指|中小板指|创业板指|"));
		System.out.println(CaseCheck);
	}

	// 默认显示沪深指数数据刷新校验
	boolean testCase002Refresh = false;

	/**
	 * @throws Exception
	 */
	public void testCase002() throws Exception {
		CaseName = "默认显示沪深指数数据刷新校验";
		windBottomTool("市场");// 点击市场
		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB
		ViewGroup listview = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		listview = (ViewGroup) listview.getChildAt(0);
		listview = (ViewGroup) listview.getChildAt(0);
		TextView Viewname = (TextView) listview.getChildAt(1);
		final String firstValue = Viewname.getText().toString();
		long a = System.currentTimeMillis();
		System.out.println("第一个值=" + firstValue);

		Viewname.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				if (!arg0.toString().equalsIgnoreCase(firstValue)) {
					testCase002Refresh = true;
					System.out.println("------刷新成功----第一个值=" + firstValue
							+ "----第二个值=" + arg0.toString());
				}
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
			}

			@Override
			public void afterTextChanged(Editable arg0) {
			}
		});
		long b;
		while (!testCase002Refresh) {
			b = System.currentTimeMillis();
			if (((b - a) / 1000 > 300)) {
				System.out.println("300秒后，数据仍未刷新");
				break;
			}
		}
		CaseCheck = this.EqualsChecked(testCase002Refresh);
		System.out.println(CaseCheck);
	}

	// 默认显示行业指数数据刷新校验
	boolean testCase003Refresh = false;

	/**
	 * @throws Exception
	 */
	public void testCase003() throws Exception {
		CaseName = "默认显示行业指数数据刷新校验";
		windBottomTool("市场");// 点击市场

		new MarketStockActivity().clickOnMarketTABView("沪深");// 点击沪深TAB

		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// 收起沪深
		solo.sleep(2000);

		ViewGroup listview = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(2);
		listview = (ViewGroup) listview.getChildAt(0);
		listview = (ViewGroup) listview.getChildAt(0);
		TextView Viewname = (TextView) listview.getChildAt(1);
		final String firstValue = Viewname.getText().toString();
		long a = System.currentTimeMillis();
		System.out.println("第一个值=" + firstValue);

		Viewname.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				if (!arg0.toString().equalsIgnoreCase(firstValue)) {
					testCase003Refresh = true;
					System.out.println("------刷新成功----第一个值=" + firstValue
							+ "----第二个值=" + arg0.toString());
				}
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
			}

			@Override
			public void afterTextChanged(Editable arg0) {
			}
		});
		long b;
		while (!testCase003Refresh) {
			b = System.currentTimeMillis();
			if (((b - a) / 1000 > 300)) {
				System.out.println("300秒后，数据仍未刷新");
				break;
			}
		}
		CaseCheck = this.EqualsChecked(testCase003Refresh);
		System.out.println(CaseCheck);
	}

	// 默认显示概念指数数据刷新校验
	boolean testCase004Refresh = false;

	/**
	 * @throws Exception
	 */
	public void testCase004() throws Exception {
		CaseName = "默认显示概念指数数据刷新校验";
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
		TextView Viewname = (TextView) listview.getChildAt(1);
		final String firstValue = Viewname.getText().toString();
		long a = System.currentTimeMillis();
		System.out.println("第一个值=" + firstValue);

		Viewname.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				if (!arg0.toString().equalsIgnoreCase(firstValue)) {
					testCase004Refresh = true;
					System.out.println("------刷新成功----第一个值=" + firstValue
							+ "----第二个值=" + arg0.toString());
				}
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
			}

			@Override
			public void afterTextChanged(Editable arg0) {
			}
		});
		long b;
		while (!testCase004Refresh) {
			b = System.currentTimeMillis();
			if (((b - a) / 1000 > 300)) {
				System.out.println("300秒后，数据仍未刷新");
				break;
			}
		}
		CaseCheck = this.EqualsChecked(testCase004Refresh);
		System.out.println(CaseCheck);
	}

}
