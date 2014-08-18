package StockMasterBase;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

public class MarketStockActivity extends StockActivity {

	// 获取市场TAB数目
	public int getMarketTABCount() throws Exception {	
		int TAB_count;
		ViewGroup TABS = (ViewGroup) ((ViewGroup) this.getViewById("view_tab"))
				.getChildAt(0);
		TABS = (ViewGroup) TABS.getChildAt(0);
		TAB_count = TABS.getChildCount();
		return TAB_count;
	}

	// 获取市场TAB的名称
	public String getMarketTABName() throws Exception {

		int TAB_count = this.getMarketTABCount();

		int i;
		String TAB_name;
		StringBuffer TAB = new StringBuffer();
		for (i = 0; i < TAB_count; i++) {
			ViewGroup nameGroup = (ViewGroup) ((ViewGroup) this
					.getViewById("view_tab")).getChildAt(0);
			nameGroup = (ViewGroup) nameGroup.getChildAt(0);
			nameGroup = (ViewGroup) nameGroup.getChildAt(i);
			TextView name = (TextView) nameGroup.getChildAt(0);
			TAB_name = name.getText().toString();
			TAB.append(TAB_name);
			TAB.append("|");
		}
		TAB_name = TAB.toString();
		return TAB_name;
	}

	// 点击市场TAB
	public void clickOnMarketTABView(String Text) throws Exception {

		int TAB_count = this.getMarketTABCount();

		int i;
		String TAB_name;
		StringBuffer TAB = new StringBuffer();
		for (i = 0; i < TAB_count; i++) {
			ViewGroup TAB_view = (ViewGroup) ((ViewGroup) this
					.getViewById("view_tab")).getChildAt(0);
			TAB_view = (ViewGroup) TAB_view.getChildAt(0);
			TAB_view = (ViewGroup) TAB_view.getChildAt(i);
			TextView name = (TextView) TAB_view.getChildAt(0);
			TAB_name = name.getText().toString();
			TAB.append(TAB_name);
			TAB.append("|");
			if (TAB_name.equalsIgnoreCase(Text)) {
				int x = TAB_view.getLeft();
				int y = TAB_view.getTop();// 获取TAB的坐标

				ViewGroup scroll_TAB = (ViewGroup) ((ViewGroup) this
						.getViewById("view_tab")).getChildAt(0);
				scroll_TAB.scrollTo(x, y);// 移动TAB栏至TAB的坐标
				solo.sleep(1000);
				solo.clickOnView(TAB_view);// 点击市场TAB
				solo.sleep(3000);
				break;
			}
		}
		String TAB_names = TAB.toString();

		Log.v("WindTest", TAB_names);
		if (!TAB_names.contains(Text)) {

			ViewGroup TAB_plus = (ViewGroup) ((ViewGroup) this
					.getViewById("view_tab")).getChildAt(0);
			TAB_plus = (ViewGroup) TAB_plus.getChildAt(0);
			TAB_plus = (ViewGroup) TAB_plus.getChildAt(TAB_count - 1);
			int x = TAB_plus.getLeft();
			int y = TAB_plus.getTop();// 获取【+】的坐标

			ViewGroup scroll_TAB = (ViewGroup) ((ViewGroup) this
					.getViewById("view_tab")).getChildAt(0);
			scroll_TAB.scrollTo(x, y);// 移动TAB栏至【+】的坐标
			solo.sleep(1000);
			solo.clickOnView(TAB_plus);// // 点击【+】，进入彩虹编辑页面
			solo.sleep(2000);
			solo.clickOnText(Text);// 将Text从候选栏目移动到现有栏目,比如String Text="外汇"
			solo.sleep(1000);
			solo.clickOnView(((ViewGroup) this.getViewById("leftViewLine"))
					.getChildAt(0));
			solo.sleep(1000);// 保存，返回市场页面

			ViewGroup TAB_view = (ViewGroup) ((ViewGroup) this
					.getViewById("view_tab")).getChildAt(0);
			TAB_view = (ViewGroup) TAB_view.getChildAt(0);
			TAB_view = (ViewGroup) TAB_view.getChildAt(TAB_count - 1);
			int m = TAB_view.getLeft();
			int n = TAB_view.getTop();// 获取Text的坐标,比如String Text="外汇"

			ViewGroup scroll_TAB1 = (ViewGroup) ((ViewGroup) this
					.getViewById("view_tab")).getChildAt(0);
			scroll_TAB1.scrollTo(m, n);// 移动TAB栏至Text的坐标,比如String Text="外汇"

			solo.clickOnView(TAB_view);// 点击Text,比如String Text="外汇"
			solo.sleep(3000);
		}
	}

	// 点击【+】，进入彩虹编辑页面
	public void clickOnMarketTABEdit() throws Exception {

		int TAB_count = this.getMarketTABCount();

		ViewGroup TAB_plus = (ViewGroup) ((ViewGroup) this
				.getViewById("view_tab")).getChildAt(0);
		TAB_plus = (ViewGroup) TAB_plus.getChildAt(0);
		TAB_plus = (ViewGroup) TAB_plus.getChildAt(TAB_count - 1);
		int x = TAB_plus.getLeft();
		int y = TAB_plus.getTop();// 获取【+】的坐标

		ViewGroup scroll_TAB = (ViewGroup) ((ViewGroup) this
				.getViewById("view_tab")).getChildAt(0);
		scroll_TAB.scrollTo(x, y);// 移动TAB栏至【+】的坐标
		solo.sleep(1000);
		solo.clickOnView(TAB_plus);// 点击【+】，进入彩虹编辑页面
		solo.sleep(1000);
	}

	// 获取行情列表的所有数据
	public String getMarketListsDatas(String ID1, String ID2, int x)
			throws Exception {

		int i, j;
		String stock_data;
		StringBuffer data_bag = new StringBuffer();
		j = ((ViewGroup) this.getViewById(ID1)).getChildCount();
		for (i = 0; i < j; i++) {
			ViewGroup dataGroup = (ViewGroup) this.getViewById(ID2);
			dataGroup = (ViewGroup) dataGroup.getChildAt(x);// 第一行列表x为0，第二行列表x为1.....
			dataGroup = (ViewGroup) dataGroup.getChildAt(0);
			dataGroup = (ViewGroup) dataGroup.getChildAt(1);
			TextView data = (TextView) dataGroup.getChildAt(i);
			stock_data = data.getText().toString();
			data_bag.append(stock_data);
			data_bag.append("|");
		}
		stock_data = data_bag.toString();
		return stock_data;

	}

	// 获取行情列表的不同指标的数据
	public String getMarketListData(String ID, int x, int y) throws Exception {
		String stock_data;
		ViewGroup dataGroup = (ViewGroup) this.getViewById(ID);
		dataGroup = (ViewGroup) dataGroup.getChildAt(x);// 第一行列表x为0，第二行列表x为1.....
		dataGroup = (ViewGroup) dataGroup.getChildAt(0);
		dataGroup = (ViewGroup) dataGroup.getChildAt(1);
		TextView data = (TextView) dataGroup.getChildAt(y);// 第一个指标y为0，第二个指标y为1
		stock_data = data.getText().toString();
		return stock_data;
	}

	// 获取行情列表成分的名称
	public String getMarketListName(String ID, int x, int y) throws Exception {

		ViewGroup nameGroup = (ViewGroup) this.getViewById(ID);
		nameGroup = (ViewGroup) nameGroup.getChildAt(x);// 第一行列表x为0，第二行列表x为1.....
		nameGroup = (ViewGroup) nameGroup.getChildAt(0);
		nameGroup = (ViewGroup) nameGroup.getChildAt(0);
		nameGroup = (ViewGroup) nameGroup.getChildAt(0);
		TextView name = (TextView) nameGroup.getChildAt(y);// 行情列表前面无+号，y为0，行情列表前面有+号，y为1
		String stock_name = name.getText().toString();
		return stock_name;
	}

	// 点击【+】，展开列表
	public void clickOnMarketListPlus(String ID) throws Exception {
		ViewGroup Plus = (ViewGroup) this.getViewById(ID);
		Plus = (ViewGroup) Plus.getChildAt(0);
		Plus = (ViewGroup) Plus.getChildAt(0);
		Plus = (ViewGroup) Plus.getChildAt(0);
		Plus = (ViewGroup) Plus.getChildAt(0);
		Plus = (ViewGroup) Plus.getChildAt(0);
		solo.clickOnView(Plus);
		solo.sleep(3000);
	}

	// 点击【-】，收起列表
	public void clickOnMarketListMinus(String ID) throws Exception {
		ViewGroup Minus = (ViewGroup) this.getViewById(ID);
		Minus = (ViewGroup) Minus.getChildAt(0);
		Minus = (ViewGroup) Minus.getChildAt(0);
		solo.clickOnView(Minus);
		solo.sleep(1000);
	}

	// 数据刷新，数组比较
	public String compairWith(String ID, int x, int y) throws Exception {
		String Check = null;
		String[][] data = new String[10][1];
		ViewGroup dataGroup = (ViewGroup) this.getViewById(ID);
		dataGroup = (ViewGroup) dataGroup.getChildAt(x);// 第一行列表x为0，第二行列表x为1.....
		dataGroup = (ViewGroup) dataGroup.getChildAt(0);
		dataGroup = (ViewGroup) dataGroup.getChildAt(1);
		TextView Viewname = (TextView) dataGroup.getChildAt(y);// 第一个指标y为0，第二个指标y为1

		for (int i = 0; i < 10; i++) {
			data[i][0] = Viewname.getText().toString();
			if (data[0][0].equalsIgnoreCase(data[i][0])) {
				if (i == 9) {
					System.out.println("第10秒数据还没有刷新--");
					Check = this.EqualsChecked(false);
					break;
				}
				solo.sleep(1000);
			} else {
				System.out.println("刷新成功----第一个值=" + data[0][0] + "----第二个值="
						+ data[i][0]);
				Check = this.EqualsChecked(true);
				break;
			}
		}
		return Check;
	}

	// 监听数据刷新
	boolean MarketRefresh = false;

	/**
	 * @throws Exception
	 */
	public boolean changedListener(String ID, int x) throws Exception {

		ViewGroup dataGroup = (ViewGroup) this.getViewById(ID);

		ViewGroup dataGroup1 = null;
		dataGroup1 = (ViewGroup) dataGroup.getChildAt(0);// 列表第一行
		dataGroup1 = (ViewGroup) dataGroup1.getChildAt(0);
		dataGroup1 = (ViewGroup) dataGroup1.getChildAt(1);
		TextView Viewname1 = (TextView) dataGroup1.getChildAt(x);// 第一个指标x为0，第二个指标x为1

		ViewGroup dataGroup2 = null;
		dataGroup2 = (ViewGroup) dataGroup.getChildAt(1);// 列表第二行
		dataGroup2 = (ViewGroup) dataGroup2.getChildAt(0);
		dataGroup2 = (ViewGroup) dataGroup2.getChildAt(1);
		TextView Viewname2 = (TextView) dataGroup2.getChildAt(x);

		ViewGroup dataGroup3 = null;
		dataGroup3 = (ViewGroup) dataGroup.getChildAt(2);// 列表第三行
		dataGroup3 = (ViewGroup) dataGroup3.getChildAt(0);
		dataGroup3 = (ViewGroup) dataGroup3.getChildAt(1);
		TextView Viewname3 = (TextView) dataGroup3.getChildAt(x);

		ViewGroup dataGroup4 = null;
		dataGroup4 = (ViewGroup) dataGroup.getChildAt(3);// 列表第四行
		dataGroup4 = (ViewGroup) dataGroup4.getChildAt(0);
		dataGroup4 = (ViewGroup) dataGroup4.getChildAt(1);
		TextView Viewname4 = (TextView) dataGroup4.getChildAt(x);

		final String firstValue1 = Viewname1.getText().toString();
		final String firstValue2 = Viewname2.getText().toString();
		final String firstValue3 = Viewname3.getText().toString();
		final String firstValue4 = Viewname4.getText().toString();

		long a = System.currentTimeMillis();

		Viewname1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				if (!arg0.toString().equalsIgnoreCase(firstValue1)) {
					MarketRefresh = true;
					System.out.println("刷新成功----列表第一行的第一个值=" + firstValue1
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

		Viewname2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				if (!arg0.toString().equalsIgnoreCase(firstValue2)) {
					MarketRefresh = true;
					System.out.println("刷新成功----列表第二行的第一个值=" + firstValue2
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

		Viewname3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				if (!arg0.toString().equalsIgnoreCase(firstValue3)) {
					MarketRefresh = true;
					System.out.println("刷新成功----列表第三行的第一个值=" + firstValue3
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

		Viewname4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				if (!arg0.toString().equalsIgnoreCase(firstValue4)) {
					MarketRefresh = true;
					System.out.println("刷新成功----列表第四行的第一个值=" + firstValue4
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
		while (!MarketRefresh) {
			b = System.currentTimeMillis();
			if (((b - a) / 1000 > 300)) {
				System.out.println("300秒后，数据仍未刷新");
				break;
			}
		}
		return MarketRefresh;
	}
}
