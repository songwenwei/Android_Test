//测试点：单券
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//指数/全球指数
public class F5_Index_IndexOfGlobal extends StockActivity {
	public void testCase001() throws Exception {
		CaseName = "海外股指数_加入自选";
		this.windDeleteAllShares();
		new F5StockActivity().click_Stockname("DJI.GI");

		View Gointo = (View) this.getViewById("speed_text_view");
		solo.clickOnView(Gointo);// 点击【添加自选】

		View Back = (View) this.getViewById("buttonLine");
		solo.clickOnView(Back);// 点击【返回】

		windBottomTool("自选");// 点击【自选】

		CaseCheck = this.EqualsChecked(solo.searchText("道琼斯工业"));
		System.out.println(CaseCheck);
	}

	public void testCase002() throws Exception {
		CaseName = "海外股指数_进入横屏";
		new F5StockActivity().click_Stockname("DJI.GI");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示
		solo.sleep(2000);
		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("sland_speed")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();// 获取分时走势开盘时间
		String time2 = ((TextView) F5_time.getChildAt(6)).getText().toString();// 获取分时走势收盘时间

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:30")
				&& time2.equalsIgnoreCase("16:00"));// 检验時間
		System.out.println(CaseCheck);

	}

}