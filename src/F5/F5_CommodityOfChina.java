//测试点：单券
package F5;

import com.robotium.solo.Solo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//期货/期货即时走势/国内商品11
public class F5_CommodityOfChina extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "进入国内商品分时页面";
		new F5StockActivity().click_Stockname("AU.SHF");

		String F5_title = ((TextView) this.getViewById("book_name")).getText()
				.toString();// 获取分时页面标题
		CaseCheck = this.EqualsChecked(F5_title.contains("SHFE黄金"));// 校验分时页面标题
		System.out.println(CaseCheck);
		
	}

	public void testCase002() throws Exception {
		CaseName = "点击【分时】";
		new F5StockActivity().click_Stockname("AU.SHF");// 进入分时页面

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);// 点击【盘口】
		solo.sleep(2000);

		solo.clickOnScreen(location[0], location[1]);// 点击【分时】
		solo.sleep(2000);

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("speed_view_kt")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(6)).getText().toString();
		String time2 = ((TextView) F5_time.getChildAt(7)).getText().toString();
		String time3 = ((TextView) F5_time.getChildAt(9)).getText().toString();
		String time4 = ((TextView) F5_time.getChildAt(10)).getText().toString();

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("21:00")
				&& time2.equalsIgnoreCase("02:30/09:00")
				&& time3.equalsIgnoreCase("11:30/13:30")
				&& time4.equalsIgnoreCase("15:00"));// 检验時間
		System.out.println(CaseCheck);

	}

	public void testCase003() throws Exception {
		CaseName = "点击【搜索】";
		new F5StockActivity().click_Stockname("AU.SHF");

		View Search = (View) this.getViewById("rightViewLine");
		solo.clickOnView(Search);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();
		CaseCheck = this.EqualsChecked(search_title.contains("搜索"));
		System.out.println(CaseCheck);
	}

	public void testCase004() throws Exception {
		CaseName = "点击【返回】";
		new F5StockActivity().click_Stockname("AU.SHF");

		View Back = (View) this.getViewById("leftView");
		solo.clickOnView(Back);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("搜索"));
		System.out.println(CaseCheck);
	}

	public void testCase005() throws Exception {
		CaseName = "指标数据刷新";
		new F5StockActivity().click_Stockname("AU.SHF");
		CaseCheck = this.EqualsChecked(new F5StockActivity()
				.ChangedListener("new_price"));// 现价指标数据刷新校验
		System.out.println(CaseCheck);
	}

	public void testCase006() throws Exception {
		CaseName = "加入自选";
		new F5StockActivity().click_Stockname("AU.SHF");

		View Gointo = (View) this.getViewById("speed_text_view");
		solo.clickOnView(Gointo);// 点击【添加自选】

		View Back = (View) this.getViewById("buttonLine");
		solo.clickOnView(Back);// 点击【返回】

		windBottomTool("自选");// 点击【自选】

		CaseCheck = this.EqualsChecked(solo.searchText("SHFE黄金"));
		System.out.println(CaseCheck);
	}

	public void testCase007() throws Exception {
		CaseName = "横屏点击【分时】";
		new F5StockActivity().click_Stockname("AU.SHF");

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

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("21:00")
				&& time2.equalsIgnoreCase("02:30/09:00")
				&& time3.equalsIgnoreCase("15:00"));// 检验時間
		System.out.println(CaseCheck);

	}
}