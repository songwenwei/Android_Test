//���Ե㣺��ȯ
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//����/���м�����
public class F5_InterestRate_InterestRateOfBank extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "���м�����_�����ʱҳ��";
		new F5StockActivity().click_Stockname("R001.IB");

		String F5_title = ((TextView) this.getViewById("book_name")).getText()
				.toString();// ��ȡ��ʱҳ�����

		CaseCheck = this.EqualsChecked(F5_title.contains("1�ջع�"));// У���ʱҳ�����
		System.out.println(CaseCheck);

	}

	public void testCase002() throws Exception {
		CaseName = "���м�����_�������ʱ��";
		new F5StockActivity().click_Stockname("R001.IB");// �����ʱҳ��

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);// �������ʱ��
		solo.sleep(2000);

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("speed_view_kt")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(6)).getText().toString();// ��ȡ��ʱ���ƿ���ʱ��
		String time2 = ((TextView) F5_time.getChildAt(8)).getText().toString();
		String time3 = ((TextView) F5_time.getChildAt(10)).getText().toString();// ��ȡ��ʱ��������ʱ��

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:00")
				&& time2.equalsIgnoreCase("12:00/13:30")
				&& time3.equalsIgnoreCase("16:30"));// ����r�g
		System.out.println(CaseCheck);

	}

	public void testCase003() throws Exception {
		CaseName = "���м�����_�������K��";
		new F5StockActivity().click_Stockname("R001.IB");

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

		CaseCheck = this.EqualsChecked(days < 60);
		System.out.println(CaseCheck);

	}

	public void testCase004() throws Exception {
		CaseName = "���м�����_�������K��";
		new F5StockActivity().click_Stockname("R001.IB");

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

		CaseCheck = this.EqualsChecked((60 < days) && (days < 300));
		System.out.println(CaseCheck);
	}

	public void testCase005() throws Exception {
		CaseName = "���м�����_�����������";
		new F5StockActivity().click_Stockname("R001.IB");

		View Search = (View) this.getViewById("rightViewLine");
		solo.clickOnView(Search);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("����"));
		System.out.println(CaseCheck);
	}

	public void testCase006() throws Exception {
		CaseName = "���м�����_��������ء�";
		new F5StockActivity().click_Stockname("R001.IB");

		View Back = (View) this.getViewById("leftView");
		solo.clickOnView(Back);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("����"));
		System.out.println(CaseCheck);
	}

	public void testCase007() throws Exception {
		CaseName = "���м�����_�������";
		new F5StockActivity().click_Stockname("R001.IB");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ
		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("sland_speed")).getChildAt(1);

		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();
		String time2 = ((TextView) F5_time.getChildAt(5)).getText().toString();
		String time3 = ((TextView) F5_time.getChildAt(6)).getText().toString();

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:00")
				&& time2.equalsIgnoreCase("12:00/13:30")
				&& time3.equalsIgnoreCase("16:30"));// ����r�g
		System.out.println(CaseCheck);

	}


}