//测试点：单券
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//期货/国债期货
public class F5_Future_FutureOfBond extends StockActivity {
	public void testCase001() throws Exception {
		CaseName = "国债期货_进入期债分时页面";
		new F5StockActivity().click_Stockname("TF1409.CFE");

		String F5_title = ((TextView) this.getViewById("book_name")).getText()
				.toString();// 获取分时页面标题

		CaseCheck = this.EqualsChecked(F5_title.contains("TF1406"));// 校验分时页面标题
		System.out.println(CaseCheck);

	}


	public void testCase002() throws Exception {
		CaseName = "国债期货_进入横屏";
		new F5StockActivity().click_Stockname("TF1409.CFE");

		solo.setActivityOrientation(Solo.LANDSCAPE);// 横屏显示

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("sland_speed")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();
		String time2 = ((TextView) F5_time.getChildAt(5)).getText().toString();
		String time3 = ((TextView) F5_time.getChildAt(6)).getText().toString();

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:15")
				&& time2.equalsIgnoreCase("11:30/13:00")
				&& time3.equalsIgnoreCase("15:15"));// 检验時間
		System.out.println(CaseCheck);

	}

}