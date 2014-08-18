//测试点：单券
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//基金/开放式基金
public class F5_Fund_FundOfOpen extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "开放式基金_点击【基金经理】";
		new F5StockActivity().click_Stockname("000001.OF");
		solo.scrollDown();
		View TAB = this.getViewById("view_tab");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);

		String investYear = ((TextView) this.getViewById("investYear"))
				.getText().toString();
		String manageResume = ((TextView) this.getViewById("manageResume"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(investYear.contains("投资年限")
				&& manageResume.contains("大学"));
		System.out.println(CaseCheck);
	}

	public void testCase002() throws Exception {
		CaseName = "开放式基金_点击【基金公司】";
		new F5StockActivity().click_Stockname("000001.OF");
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

		CaseCheck = this.EqualsChecked((product_name.equalsIgnoreCase("华夏基金"))
				&& (textView1_1.equalsIgnoreCase("基金数量"))
				&& (textView2_1.equalsIgnoreCase("投资总监")));
		System.out.println(CaseCheck);

	}

	public void testCase003() throws Exception {
		CaseName = "开放式基金_点击【新闻】";
		new F5StockActivity().click_Stockname("000001.OF");
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


	public void testCase004() throws Exception {
		CaseName = "开放式基金_点击【搜索】";
		new F5StockActivity().click_Stockname("000001.OF");

		View Search = (View) this.getViewById("rightViewLine");
		solo.clickOnView(Search);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("搜索"));
		System.out.println(CaseCheck);
	}

	public void testCase005() throws Exception {
		CaseName = "开放式基金_点击【返回】";
		new F5StockActivity().click_Stockname("000001.OF");

		View Back = (View) this.getViewById("leftView");
		solo.clickOnView(Back);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("搜索"));
		System.out.println(CaseCheck);
	}

	public void testCase006() throws Exception {
		CaseName = "开放式基金_加入自选";
		
		this.windDeleteAllShares();
		
		new F5StockActivity().click_Stockname("000001.OF");

		View Gointo = (View) this.getViewById("speed_text_view");
		solo.clickOnView(Gointo);// 点击【添加自选】

		View Back = (View) this.getViewById("buttonLine");
		solo.clickOnView(Back);// 点击【返回】

		windBottomTool("自选");// 点击【自选】

		CaseCheck = this.EqualsChecked(solo.searchText("华夏成长"));
		System.out.println(CaseCheck);
	}

	public void testCase007() throws Exception {
		CaseName = "开放式基金_横屏点击【季度】";
		new F5StockActivity().click_Stockname("000001.OF");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

		View TAB = this.getViewById("speed_land_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		solo.clickOnScreen(location[0], location[1]);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(5)).getText().toString();
		String time2 = ((TextView) K.getChildAt(6)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time1, time2);

		CaseCheck = this.EqualsChecked(days < 100
				&& !time1.equalsIgnoreCase("0000-00-00")
				&& !time2.equalsIgnoreCase("0000-00-00"));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);

	}

	public void testCase008() throws Exception {
		CaseName = "开放式基金_横屏点击【半年】";
		new F5StockActivity().click_Stockname("000001.OF");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

		View TAB = this.getViewById("speed_land_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(5)).getText().toString();
		String time2 = ((TextView) K.getChildAt(6)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time1, time2);

		CaseCheck = this.EqualsChecked((100 < days) && (days < 200));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);

	}

	public void testCase009() throws Exception {
		CaseName = "开放式基金_横屏点击【一年】";
		new F5StockActivity().click_Stockname("000001.OF");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

		View TAB = this.getViewById("speed_land_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(3000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(5)).getText().toString();
		String time2 = ((TextView) K.getChildAt(6)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time1, time2);

		CaseCheck = this.EqualsChecked((300 < days) && (days < 400));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);

	}

	public void testCase010() throws Exception {
		CaseName = "开放式基金_横屏点击【三年】";
		new F5StockActivity().click_Stockname("000001.OF");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

		View TAB = this.getViewById("speed_land_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(4000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(5)).getText().toString();
		String time2 = ((TextView) K.getChildAt(6)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time1, time2);

		CaseCheck = this.EqualsChecked((900 < days) && (days < 1200));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);

	}

	public void testCase011() throws Exception {
		CaseName = "开放式基金_横屏点击【今年以来】";
		new F5StockActivity().click_Stockname("000001.OF");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

		View TAB = this.getViewById("speed_land_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(3000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(5)).getText().toString();
		String time2 = ((TextView) K.getChildAt(6)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time1, time2);

		CaseCheck = this
				.EqualsChecked(((time2.contains("01-01")
						|| (time2.contains("01-02")) || (time2
						.contains("01-03"))) && (days < 400)));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);

	}

	public void testCase012() throws Exception {
		CaseName = "开放式基金_进入横屏";
		new F5StockActivity().click_Stockname("000001.OF");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(5)).getText().toString();
		String time2 = ((TextView) K.getChildAt(6)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time1, time2);

		CaseCheck = this.EqualsChecked(days < 100
				&& !time1.equalsIgnoreCase("0000-00-00")
				&& !time2.equalsIgnoreCase("0000-00-00"));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);

	}

}