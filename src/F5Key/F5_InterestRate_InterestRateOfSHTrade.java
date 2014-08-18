//测试点：单券
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//利率/交易所利率//上交所利率
public class F5_InterestRate_InterestRateOfSHTrade extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "上交所利率_进入分时页面";
		new F5StockActivity().click_Stockname("204001.SH");
		String F5_title = ((TextView) this.getViewById("book_name")).getText()
				.toString();// 获取分时页面标题

		CaseCheck = this.EqualsChecked(F5_title.contains("GC001"));// 校验分时页面标题
		System.out.println(CaseCheck);

	}

	public void testCase002() throws Exception {
		CaseName = "上交所利率_点击【分时】";
		new F5StockActivity().click_Stockname("204001.SH");// 进入分时页面

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);// 点击【分时】
		solo.sleep(2000);

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("speed_view_kt")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(6)).getText().toString();// 获取分时走势开盘时间
		String time2 = ((TextView) F5_time.getChildAt(8)).getText().toString();// 获取分时走势午休时间
		String time3 = ((TextView) F5_time.getChildAt(10)).getText().toString();// 获取分时走势收盘时间

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:30")
				&& time2.equalsIgnoreCase("11:30/13:00")
				&& time3.equalsIgnoreCase("15:00"));// 检验時間
		System.out.println(CaseCheck);

	}

	public void testCase003() throws Exception {
		CaseName = "上交所利率_点击【日K】";
		new F5StockActivity().click_Stockname("204001.SH");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 3.0f);
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

	public void testCase004() throws Exception {
		CaseName = "上交所利率_点击【周K】";
		new F5StockActivity().click_Stockname("204001.SH");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 4.0f);
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

	public void testCase005() throws Exception {
		CaseName = "上交所利率_点击【搜索】";
		new F5StockActivity().click_Stockname("204001.SH");

		View Search = (View) this.getViewById("rightViewLine");
		solo.clickOnView(Search);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("搜索"));
		System.out.println(CaseCheck);
	}

	public void testCase006() throws Exception {
		CaseName = "上交所利率_点击【返回】";
		new F5StockActivity().click_Stockname("204001.SH");

		View Back = (View) this.getViewById("leftView");
		solo.clickOnView(Back);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("搜索"));
		System.out.println(CaseCheck);
	}

	

	public void testCase007() throws Exception {
		CaseName = "上交所利率_进入横屏";
		new F5StockActivity().click_Stockname("204001.SH");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

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



}