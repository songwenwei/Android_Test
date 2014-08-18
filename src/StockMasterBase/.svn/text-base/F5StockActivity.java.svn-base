package StockMasterBase;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class F5StockActivity extends StockActivity {

	// 进入单券分时页面
	public void click_Stockname(String Windcode) throws Exception {

		windBottomTool("市场");// 点击市场
		View Search = (View) this.getViewById("rightViewLine");
		solo.clickOnView(Search);
		solo.enterText(0, Windcode);
		for (int i = 0; i < 10; i++) {
			if (solo.searchText(Windcode, 2))
				break;
			else
				solo.sleep(500);
		}
		TextView stock_name = (TextView) this.getViewById("stock_name");
		solo.clickOnView(stock_name);

		for (int i = 0; i < 10; i++) {
			if (solo.waitForActivity("ScrollSpeedAcivity")) {
				solo.sleep(500);
			} else
				break;
		}

	}

	// 求格式为：yyyy-MM-dd的时间差
	public static long getQuot(String time1, String time2) {
		long quot = 0;
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date1 = ft.parse(time1);
			Date date2 = ft.parse(time2);
			quot = date1.getTime() - date2.getTime();
			quot = quot / 1000 / 60 / 60 / 24;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return quot;
	}

	// 监听数据刷新
	boolean F5Refresh = false;

	/**
	 * @throws Exception
	 */
	public boolean ChangedListener(String ID) throws Exception {

		ViewGroup top_price_view = (ViewGroup) this
				.getViewById("top_price_view");
		final TextView Viewname = (TextView) top_price_view
				.findViewById(getSourceID(ID));// 现价的ID为："new_price",涨跌的ID为："",涨跌幅的ID为：""

		final String firstValue = Viewname.getText().toString();
		long a = System.currentTimeMillis();
		System.out.println("第一个值=" + firstValue);

		Viewname.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				if (!arg0.toString().equalsIgnoreCase(firstValue)) {
					F5Refresh = true;
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
		while (!F5Refresh) {
			b = System.currentTimeMillis();
			if (((b - a) / 1000 > 300)) {
				System.out.println("300秒后，数据仍未刷新");
				break;
			}
		}
		return F5Refresh;
	}

	
}
