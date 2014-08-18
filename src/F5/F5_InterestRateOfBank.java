//测试点：单券
package F5;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//利率/利率即时走势/银行间利率
public class F5_InterestRateOfBank extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "点击【成交】";
		new F5StockActivity().click_Stockname("R001.IB");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		solo.clickOnScreen(location[0], location[1]);// 点击【成交】
		solo.sleep(2000);

		ViewGroup detail = (ViewGroup) this.getViewById("speed_view_kt");

		String time = ((TextView) detail.findViewById(getSourceID("time")))
				.getText().toString();
		String price = ((TextView) detail.findViewById(getSourceID("price")))
				.getText().toString();
		String increase = ((TextView) detail
				.findViewById(getSourceID("increase"))).getText().toString();
		String status = ((TextView) detail.findViewById(getSourceID("status")))
				.getText().toString();

		CaseCheck = this.EqualsChecked((time.equalsIgnoreCase("时间"))
				&& (price.equalsIgnoreCase("价格"))
				&& (increase.equalsIgnoreCase("量(亿)"))
				&& (status.equalsIgnoreCase("加权平均")));
		System.out.println(CaseCheck);
	}

	public void testCase002() throws Exception {
		CaseName = "指标数据刷新";
		new F5StockActivity().click_Stockname("R001.IB");
		CaseCheck = this.EqualsChecked(new F5StockActivity()
				.ChangedListener("new_price"));// 现价指标数据刷新校验
		System.out.println(CaseCheck);
	}

	public void testCase003() throws Exception {
		CaseName = "加入自选";
		new F5StockActivity().click_Stockname("R001.IB");

		View Gointo = (View) this.getViewById("speed_text_view");
		solo.clickOnView(Gointo);// 点击【添加自选】

		View Back = (View) this.getViewById("buttonLine");
		solo.clickOnView(Back);// 点击【返回】

		windBottomTool("自选");// 点击【自选】

		CaseCheck = this.EqualsChecked(solo.searchText("1日回购"));
		System.out.println(CaseCheck);
	}

	public void testCase004() throws Exception {
		CaseName = "横屏点击【5分K】";
		new F5StockActivity().click_Stockname("R001.IB");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

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
		System.out.println(time1);
		System.out.println(time2);

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked(days < 2);
		System.out.println(CaseCheck);

	}

	public void testCase005() throws Exception {
		CaseName = "横屏点击【60分K】";
		new F5StockActivity().click_Stockname("R001.IB");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

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
		System.out.println(time1);
		System.out.println(time2);

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((2 < days) && (days < 30));
		System.out.println(CaseCheck);

	}

	public void testCase006() throws Exception {
		CaseName = "横屏点击【日K】";
		new F5StockActivity().click_Stockname("R001.IB");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

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
		System.out.println(time1);
		System.out.println(time2);

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((30 < days) && (days < 60));
		System.out.println(CaseCheck);

	}

	public void testCase007() throws Exception {
		CaseName = "横屏点击【周K】";
		new F5StockActivity().click_Stockname("R001.IB");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

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
		System.out.println(time1);
		System.out.println(time2);

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((60 < days) && (days < 300));
		System.out.println(CaseCheck);

	}

	public void testCase008() throws Exception {
		CaseName = "横屏点击【月K】";
		new F5StockActivity().click_Stockname("R001.IB");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

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
		System.out.println(time1);
		System.out.println(time2);

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((300 < days) && (days < 1000));
		System.out.println(CaseCheck);

	}

	public void testCase009() throws Exception {
		CaseName = "横屏点击【分时】";
		new F5StockActivity().click_Stockname("R001.IB");

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

		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();
		String time2 = ((TextView) F5_time.getChildAt(5)).getText().toString();
		String time3 = ((TextView) F5_time.getChildAt(6)).getText().toString();

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:00")
				&& time2.equalsIgnoreCase("12:00/13:30")
				&& time3.equalsIgnoreCase("16:30"));// 检验時間
		System.out.println(CaseCheck);

	}

}