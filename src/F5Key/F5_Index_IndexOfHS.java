//测试点：单券
package F5Key;

import com.robotium.solo.Solo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;
import android.widget.Button;

//指数/沪深指数
public class F5_Index_IndexOfHS extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "沪深指数_点击【日K】";
		new F5StockActivity().click_Stockname("000001.SH");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this
				.getViewById("speed_view_kt")).getChildAt(0);

		String time1 = ((TextView) K.getChildAt(6)).getText().toString();
		String time2 = ((TextView) K.getChildAt(8)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

			CaseCheck = this.EqualsChecked(days < 60);
		System.out.println(CaseCheck);

	}

	public void testCase002() throws Exception {
		CaseName = "沪深指数_点击【周K】";
		new F5StockActivity().click_Stockname("000001.SH");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this
				.getViewById("speed_view_kt")).getChildAt(0);

		String time1 = ((TextView) K.getChildAt(6)).getText().toString();
		String time2 = ((TextView) K.getChildAt(8)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

			CaseCheck = this.EqualsChecked((60 < days) && (days < 300));
		System.out.println(CaseCheck);
	}

	public void testCase003() throws Exception {
		CaseName = "沪深指数_点击【月K】";
		new F5StockActivity().click_Stockname("000001.SH");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this
				.getViewById("speed_view_kt")).getChildAt(0);

		String time1 = ((TextView) K.getChildAt(6)).getText().toString();
		String time2 = ((TextView) K.getChildAt(8)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

			CaseCheck = this.EqualsChecked((300 < days) && (days < 1000));
		System.out.println(CaseCheck);
	}

	public void testCase004() throws Exception {
		CaseName = "沪深指数_点击【新闻】";
		new F5StockActivity().click_Stockname("000001.SH");

		View TAB = this.getViewById("tabBar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);

		String newstitle_time = ((TextView) this.getViewById("newstitle_time"))
				.getText().toString();
		String newstitle_text = ((TextView) this.getViewById("newstitle_text"))
				.getText().toString();

			CaseCheck = this.EqualsChecked(!newstitle_time.equalsIgnoreCase("--")
					&& !newstitle_text.equalsIgnoreCase("--"));
		System.out.println(CaseCheck);
	}

	public void testCase005() throws Exception {
		CaseName = "沪深指数_加入自选";
		this.windDeleteAllShares();
		new F5StockActivity().click_Stockname("000001.SH");

		View Gointo = (View) this.getViewById("speed_text_view");
		solo.clickOnView(Gointo);// 点击【添加自选】

		View Back = (View) this.getViewById("buttonLine");
		solo.clickOnView(Back);// 点击【返回】

		windBottomTool("自选");// 点击【自选】

			CaseCheck = this.EqualsChecked(solo.searchText("上证综指"));
		System.out.println(CaseCheck);
	}

	public void testCase006() throws Exception {
		CaseName = "沪深指数_横屏点击【5分K】";
		new F5StockActivity().click_Stockname("000001.SH");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示
		solo.sleep(2000);

		View TAB = this.getViewById("linear_buttom");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 6.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(4)).getText().toString();
		String time2 = ((TextView) K.getChildAt(5)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

			CaseCheck = this.EqualsChecked(days < 2);
		System.out.println(CaseCheck);

	}

	public void testCase007() throws Exception {
		CaseName = "沪深指数_横屏点击【60分K】";
		new F5StockActivity().click_Stockname("000001.SH");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示
		solo.sleep(2000);

		View TAB = this.getViewById("linear_buttom");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 6 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(4)).getText().toString();
		String time2 = ((TextView) K.getChildAt(5)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

			CaseCheck = this.EqualsChecked((2 < days) && (days < 30));
		System.out.println(CaseCheck);

	}

	public void testCase008() throws Exception {
		CaseName = "沪深指数_横屏点击【日K】";
		new F5StockActivity().click_Stockname("000001.SH");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示
		solo.sleep(2000);

		View TAB = this.getViewById("linear_buttom");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 6 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(4)).getText().toString();
		String time2 = ((TextView) K.getChildAt(5)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

			CaseCheck = this.EqualsChecked((30 < days) && (days < 60));
		System.out.println(CaseCheck);

	}

	public void testCase009() throws Exception {
		CaseName = "沪深指数_横屏点击【周K】";
		new F5StockActivity().click_Stockname("000001.SH");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示
		solo.sleep(2000);

		View TAB = this.getViewById("linear_buttom");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 6 * 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(4)).getText().toString();
		String time2 = ((TextView) K.getChildAt(5)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);
			CaseCheck = this.EqualsChecked((60 < days) && (days < 300));
		System.out.println(CaseCheck);

	}

	public void testCase010() throws Exception {
		CaseName = "沪深指数_横屏点击【月K】";
		new F5StockActivity().click_Stockname("000001.SH");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示
		solo.sleep(2000);

		View TAB = this.getViewById("linear_buttom");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 6 * 5.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(4)).getText().toString();
		String time2 = ((TextView) K.getChildAt(5)).getText().toString();
		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

			CaseCheck = this.EqualsChecked((300 < days) && (days < 1000));
		System.out.println(CaseCheck);

	}

	public void testCase011() throws Exception {
		CaseName = "沪深指数_横屏K线切换至分时";
		new F5StockActivity().click_Stockname("000001.SH");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示
		solo.sleep(2000);

		View TAB1 = this.getViewById("linear_buttom");
		final int[] location1 = new int[2];
		TAB1.getLocationOnScreen(location1);
		solo.clickOnScreen(location1[0], location1[1]);
		solo.sleep(2000);

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("sland_speed")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();// 获取分时走势开盘时间
		String time2 = ((TextView) F5_time.getChildAt(5)).getText().toString();// 获取分时走势午休时间
		String time3 = ((TextView) F5_time.getChildAt(6)).getText().toString();// 获取分时走势收盘时间

			CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:30")
					&& time2.equalsIgnoreCase("11:30/13:00")
					&& time3.equalsIgnoreCase("15:00"));// 检验時間
		System.out.println(CaseCheck);

	}

	public void testCase012() throws Exception {
		CaseName = "沪深指数_竖屏页面选择分时横屏";
		new F5StockActivity().click_Stockname("600600.SH");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		solo.clickOnScreen(location[0], location[1]);// 点击【分时】
		solo.sleep(2000);

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示
		solo.sleep(2000);

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("sland_speed")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();// 获取分时走势开盘时间
		String time2 = ((TextView) F5_time.getChildAt(5)).getText().toString();// 获取分时走势午休时间
		String time3 = ((TextView) F5_time.getChildAt(6)).getText().toString();// 获取分时走势收盘时间

			CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:30")
					&& time2.equalsIgnoreCase("11:30/13:00")
					&& time3.equalsIgnoreCase("15:00"));// 检验時間
		System.out.println(CaseCheck);

	}


	public void testCase013() throws Exception {
		CaseName = "沪深指数_点击【领涨】";
		new F5StockActivity().click_Stockname("000001.SH");
		View TAB = this.getViewById("tabBar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		solo.clickOnScreen(location[0], location[1]);
		solo.sleep(2000);

		ViewGroup driverlist = (ViewGroup) this.getViewById("driverlist");
		String stock_name = ((TextView) driverlist
				.findViewById(getSourceID("f5_list_item_name"))).getText()
				.toString();
		String wind_code = ((TextView) driverlist
				.findViewById(getSourceID("f5_list_item_code"))).getText()
				.toString();
		String price = ((TextView) driverlist
				.findViewById(getSourceID("f5_list_item_price"))).getText()
				.toString();
		String rate = ((TextView) driverlist
				.findViewById(getSourceID("f5_list_item_rate"))).getText()
				.toString();

			CaseCheck = this.EqualsChecked((!stock_name.equalsIgnoreCase("--"))
					&& (!wind_code.equalsIgnoreCase("--"))
					&& (!price.equalsIgnoreCase("--"))
					&& (!rate.equalsIgnoreCase("--")));
		System.out.println(CaseCheck);
	}

	public void testCase014() throws Exception {
		CaseName = "沪深指数_点击【领跌】";
		new F5StockActivity().click_Stockname("000001.SH");
		View TAB = this.getViewById("tabBar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup driverlist = (ViewGroup) this.getViewById("driverlist");
		String stock_name = ((TextView) driverlist
				.findViewById(getSourceID("f5_list_item_name"))).getText()
				.toString();
		String wind_code = ((TextView) driverlist
				.findViewById(getSourceID("f5_list_item_code"))).getText()
				.toString();
		String price = ((TextView) driverlist
				.findViewById(getSourceID("f5_list_item_price"))).getText()
				.toString();
		String rate = ((TextView) driverlist
				.findViewById(getSourceID("f5_list_item_rate"))).getText()
				.toString();

			CaseCheck = this.EqualsChecked((!stock_name.equalsIgnoreCase("--"))
					&& (!wind_code.equalsIgnoreCase("--"))
					&& (!price.equalsIgnoreCase("--"))
					&& (!rate.equalsIgnoreCase("--")));
		System.out.println(CaseCheck);
	}

	public void testCase015() throws Exception {
		CaseName = "沪深指数_点击【换手率】";
		new F5StockActivity().click_Stockname("000001.SH");
		View TAB = this.getViewById("tabBar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup driverlist = (ViewGroup) this.getViewById("driverlist");
		String stock_name = ((TextView) driverlist
				.findViewById(getSourceID("f5_list_item_name"))).getText()
				.toString();
		String wind_code = ((TextView) driverlist
				.findViewById(getSourceID("f5_list_item_code"))).getText()
				.toString();
		String price = ((TextView) driverlist
				.findViewById(getSourceID("f5_list_item_price"))).getText()
				.toString();
		String rate = ((TextView) driverlist
				.findViewById(getSourceID("f5_list_item_rate"))).getText()
				.toString();

			CaseCheck = this.EqualsChecked((!stock_name.equalsIgnoreCase("--"))
					&& (!wind_code.equalsIgnoreCase("--"))
					&& (!price.equalsIgnoreCase("--"))
					&& (!rate.equalsIgnoreCase("--")));
		System.out.println(CaseCheck);
	}
}