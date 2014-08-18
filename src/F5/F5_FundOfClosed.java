//测试点：单券
package F5;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//基金/基金即时走势/封闭式基金
public class F5_FundOfClosed extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "进入封闭式基金分时页面";
		new F5StockActivity().click_Stockname("150045.SZ");

		String F5_title = ((TextView) this.getViewById("book_name")).getText()
				.toString();// 获取分时页面标题

		CaseCheck = this.EqualsChecked(F5_title.contains("海富通稳进增利B"));// 校验分时页面标题
		System.out.println(CaseCheck);

	}

	public void testCase002() throws Exception {
		CaseName = "点击【日K】";
		new F5StockActivity().click_Stockname("150045.SZ");

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
		System.out.println(time1);
		System.out.println(time2);

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((30 < days) && (days < 60));
		System.out.println(CaseCheck);

	}

	public void testCase003() throws Exception {
		CaseName = "点击【周K】";
		new F5StockActivity().click_Stockname("150045.SZ");

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
		System.out.println(time1);
		System.out.println(time2);

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((60 < days) && (days < 300));
		System.out.println(CaseCheck);
	}

	public void testCase004() throws Exception {
		CaseName = "点击【月K】";
		new F5StockActivity().click_Stockname("150045.SZ");

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
		System.out.println(time1);
		System.out.println(time2);

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((300 < days) && (days < 1000));
		System.out.println(CaseCheck);
	}

	public void testCase005() throws Exception {
		CaseName = "点击【分时】";
		new F5StockActivity().click_Stockname("150045.SZ");// 进入分时页面

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
		String time2 = ((TextView) F5_time.getChildAt(8)).getText().toString();
		String time3 = ((TextView) F5_time.getChildAt(10)).getText().toString();// 获取分时走势收盘时间

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:30")
				&& time2.equalsIgnoreCase("11:30/13:00")
				&& time3.equalsIgnoreCase("15:00"));// 检验時間
		System.out.println(CaseCheck);

	}

	public void testCase006() throws Exception {
		CaseName = "点击【基金经理】";
		new F5StockActivity().click_Stockname("150045.SZ");
		solo.scrollDown();
		View TAB = this.getViewById("view_tab");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);

		String manageName = ((TextView) this.getViewById("manageName"))
				.getText().toString();
		String investYear = ((TextView) this.getViewById("investYear"))
				.getText().toString();
		String manageResume = ((TextView) this.getViewById("manageResume"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(manageName.contains("邵佳民")
				&& investYear.contains("投资年限")
				&& manageResume.contains("硕士，持有基金从业人员资格证书"));
		System.out.println(CaseCheck);
	}

	public void testCase007() throws Exception {
		CaseName = "点击【基金公司】";
		new F5StockActivity().click_Stockname("150045.SZ");
		solo.scrollDown();
		View TAB = this.getViewById("view_tab");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		String product_name = ((TextView) this.getViewById("product_name"))
				.getText().toString();
		String textView1_1 = ((TextView) this.getViewById("textView1_1"))
				.getText().toString();
		String textView2_1 = ((TextView) this.getViewById("textView2_1"))
				.getText().toString();

		CaseCheck = this.EqualsChecked((product_name.equalsIgnoreCase("海富通基金"))
				&& (textView1_1.equalsIgnoreCase("基金数量"))
				&& (textView2_1.equalsIgnoreCase("投资总监")));
		System.out.println(CaseCheck);

	}

	public void testCase008() throws Exception {
		CaseName = "点击【新闻】";
		new F5StockActivity().click_Stockname("150045.SZ");
		solo.scrollDown();
		View TAB = this.getViewById("view_tab");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		String newstitle_time = ((TextView) this.getViewById("newstitle_time"))
				.getText().toString();
		String newstitle_text = ((TextView) this.getViewById("newstitle_text"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(!newstitle_time.equalsIgnoreCase("--")
				&& !newstitle_text.equalsIgnoreCase("--"));
		System.out.println(CaseCheck);
	}

	public void testCase009() throws Exception {
		CaseName = "点击【资料】：无法校验";
		CaseCheck = this.EqualsChecked(false);
		System.out.println(CaseCheck);
	}

	/*
	 * new F5StockActivity().click_Stockname("150045.SZ"); solo.scrollDown();
	 * View TAB = this.getViewById("view_tab"); final int[] location = new
	 * int[2]; TAB.getLocationOnScreen(location); final int viewWidth =
	 * TAB.getWidth(); float x = location[0] + (viewWidth / 4.0f); float y =
	 * location[1]; solo.clickOnScreen(x, y); solo.sleep(2000);
	 * solo.clickOnScreen(location[0], location[1]);//点击【资料】 solo.sleep(2000);
	 */

	public void testCase010() throws Exception {
		CaseName = "点击【搜索】";
		new F5StockActivity().click_Stockname("150045.SZ");

		View Search = (View) this.getViewById("rightViewLine");
		solo.clickOnView(Search);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("搜索"));
		System.out.println(CaseCheck);
	}

	public void testCase011() throws Exception {
		CaseName = "点击【返回】";
		new F5StockActivity().click_Stockname("150045.SZ");

		View Back = (View) this.getViewById("leftView");
		solo.clickOnView(Back);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("搜索"));
		System.out.println(CaseCheck);
	}

	public void testCase012() throws Exception {
		CaseName = "指标数据刷新";
		new F5StockActivity().click_Stockname("150045.SZ");
		CaseCheck = this.EqualsChecked(new F5StockActivity().ChangedListener("new_price"));// 现价指标数据刷新校验
		System.out.println(CaseCheck);
	}

	public void testCase013() throws Exception {
		CaseName = "加入自选";
		new F5StockActivity().click_Stockname("150045.SZ");

		View Gointo = (View) this.getViewById("speed_text_view");
		solo.clickOnView(Gointo);// 点击【添加自选】

		View Back = (View) this.getViewById("buttonLine");
		solo.clickOnView(Back);// 点击【返回】

		windBottomTool("自选");// 点击【自选】

		CaseCheck = this.EqualsChecked(solo.searchText("海富通稳进"));
		System.out.println(CaseCheck);
	}

	public void testCase014() throws Exception {
		CaseName = "横屏点击【分时】";
		new F5StockActivity().click_Stockname("150045.SZ");

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
		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();// 获取分时走势开盘时间
		String time2 = ((TextView) F5_time.getChildAt(5)).getText().toString();
		String time3 = ((TextView) F5_time.getChildAt(6)).getText().toString();// 获取分时走势收盘时间

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:30")
				&& time2.equalsIgnoreCase("11:30/13:00")
				&& time3.equalsIgnoreCase("15:00"));// 检验時間
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);
	}
}