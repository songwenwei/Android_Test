//���Ե㣺��ȯ
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//����/���ʽ����
public class F5_Fund_FundOfClosed extends StockActivity {
	public void testCase001() throws Exception {
		CaseName = "���ʽ����_���������5��K��";
		new F5StockActivity().click_Stockname("150045.SZ");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

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

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked(days < 10
				&& !time1.equalsIgnoreCase("0000-00-00")
				&& !time2.equalsIgnoreCase("0000-00-00"));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);
	}

	public void testCase002() throws Exception {
		CaseName = "���ʽ����_���������60��K��";
		new F5StockActivity().click_Stockname("150045.SZ");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

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

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((10 < days) && (days < 30));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);
	}

	public void testCase003() throws Exception {
		CaseName = "���ʽ����_�����������K��";
		new F5StockActivity().click_Stockname("150045.SZ");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

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

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((30 < days) && (days < 60));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);
	}

	public void testCase004() throws Exception {
		CaseName = "���ʽ����_�����������K��";
		new F5StockActivity().click_Stockname("150045.SZ");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

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

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((60 < days) && (days < 300));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);
	}

	public void testCase005() throws Exception {
		CaseName = "���ʽ����_�����������K��";
		new F5StockActivity().click_Stockname("150045.SZ");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

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

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((300 < days) && (days < 1000));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);
	}

	public void testCase006() throws Exception {
		CaseName = "���ʽ����_����K���л���ʱ";
		new F5StockActivity().click_Stockname("150045.SZ");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		View TAB1 = this.getViewById("linear_buttom");
		final int[] location1 = new int[2];
		TAB1.getLocationOnScreen(location1);
		solo.clickOnScreen(location1[0], location1[1]);
		solo.sleep(2000);

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("sland_speed")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();// ��ȡ��ʱ���ƿ���ʱ��
		String time2 = ((TextView) F5_time.getChildAt(5)).getText().toString();
		String time3 = ((TextView) F5_time.getChildAt(6)).getText().toString();// ��ȡ��ʱ��������ʱ��

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:30")
				&& time2.equalsIgnoreCase("11:30/13:00")
				&& time3.equalsIgnoreCase("15:00"));// ����r�g
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);
	}

}