//���Ե㣺��ȯ
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//�ڻ�/������Ʒ
public class F5_Future_CommodityOfGlobal extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "������Ʒ_�������K��";
		new F5StockActivity().click_Stockname("GC.CMX");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(3000);

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
		CaseName = "������Ʒ_�������K��";
		new F5StockActivity().click_Stockname("GC.CMX");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(3000);

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
		CaseName = "������Ʒ_�������K��";
		new F5StockActivity().click_Stockname("GC.CMX");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(3000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this
				.getViewById("speed_view_kt")).getChildAt(0);

		String time1 = ((TextView) K.getChildAt(6)).getText().toString();
		String time2 = ((TextView) K.getChildAt(8)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((300 < days) && (days < 1000));
		System.out.println(CaseCheck);
	}

}