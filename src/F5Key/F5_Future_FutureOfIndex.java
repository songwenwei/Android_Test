//测试点：单券
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//期货/股指期货
public class F5_Future_FutureOfIndex extends StockActivity {



	public void testCase001() throws Exception {
		CaseName = "股指期货_进入横屏";
		new F5StockActivity().click_Stockname("IF1406.CFE");

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