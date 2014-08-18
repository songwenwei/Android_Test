//测试点：单券
package F5;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//指数/指数即时走势/沪深指数
public class F5_IndexOfHS extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "进入指数分时页面";
		new F5StockActivity().click_Stockname("000001.SH");

		String F5_title = ((TextView) this.getViewById("book_name")).getText()
				.toString();// 获取分时页面标题

		CaseCheck = this.EqualsChecked(F5_title.contains("上证综指"));// 校验分时页面标题
		System.out.println(CaseCheck);

	}

	public void testCase002() throws Exception {
		CaseName = "点击【分时】";
		new F5StockActivity().click_Stockname("000001.SH");// 进入分时页面

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);// 点击【日K】
		solo.sleep(2000);

		solo.clickOnScreen(location[0], location[1]);// 点击【分时】
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
		CaseName = "游客登录，点击【研报】";
		this.Logout();
		new F5StockActivity().click_Stockname("000001.SH");
		solo.scrollDown();
		View TAB = this.getViewById("tabBar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		String newstitle_year_text = ((TextView) this
				.getViewById("newstitle_year_text")).getText().toString();
		System.out.println(newstitle_year_text);

		CaseCheck = this.EqualsChecked(newstitle_year_text.contains("年度研报"));
		System.out.println(CaseCheck);
	}

	public void testCase004() throws Exception {
		CaseName = "点击【搜索】";
		new F5StockActivity().click_Stockname("000001.SH");

		View Search = (View) this.getViewById("rightViewLine");
		solo.clickOnView(Search);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("搜索"));
		System.out.println(CaseCheck);
	}

	public void testCase005() throws Exception {
		CaseName = "点击【返回】";
		new F5StockActivity().click_Stockname("000001.SH");

		View Back = (View) this.getViewById("leftView");
		solo.clickOnView(Back);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("搜索"));
		System.out.println(CaseCheck);
	}

	public void testCase006() throws Exception {
		CaseName = "指标数据刷新";
		new F5StockActivity().click_Stockname("000001.SH");
		CaseCheck = this.EqualsChecked(new F5StockActivity()
				.ChangedListener("new_price"));// 现价指标数据刷新校验
		System.out.println(CaseCheck);
	}

	public void testCase007() throws Exception {
		CaseName = "横屏点击【分时】";
		new F5StockActivity().click_Stockname("000001.SH");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

		View TAB = this.getViewById("linear_buttom");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 6.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		solo.clickOnScreen(location[0], location[1]);
		solo.sleep(2000);

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("sland_speed")).getChildAt(1);
		TextView time1 = (TextView) F5_time.getChildAt(4);// 获取分时走势开盘时间
		String kai_time = time1.getText().toString();
		TextView time2 = (TextView) F5_time.getChildAt(5);// 获取分时走势午休时间
		String xiu_time = time2.getText().toString();
		TextView time3 = (TextView) F5_time.getChildAt(6);// 获取分时走势收盘时间
		String shou_time = time3.getText().toString();

		CaseCheck = this.EqualsChecked(kai_time.equalsIgnoreCase("09:30")
				&& xiu_time.equalsIgnoreCase("11:30/13:00")
				&& shou_time.equalsIgnoreCase("15:00"));// 检验時間

		System.out.println(CaseCheck);

	}

}