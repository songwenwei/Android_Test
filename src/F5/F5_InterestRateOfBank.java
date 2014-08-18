//���Ե㣺��ȯ
package F5;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//����/���ʼ�ʱ����/���м�����
public class F5_InterestRateOfBank extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "������ɽ���";
		new F5StockActivity().click_Stockname("R001.IB");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		solo.clickOnScreen(location[0], location[1]);// ������ɽ���
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

		CaseCheck = this.EqualsChecked((time.equalsIgnoreCase("ʱ��"))
				&& (price.equalsIgnoreCase("�۸�"))
				&& (increase.equalsIgnoreCase("��(��)"))
				&& (status.equalsIgnoreCase("��Ȩƽ��")));
		System.out.println(CaseCheck);
	}

	public void testCase002() throws Exception {
		CaseName = "ָ������ˢ��";
		new F5StockActivity().click_Stockname("R001.IB");
		CaseCheck = this.EqualsChecked(new F5StockActivity()
				.ChangedListener("new_price"));// �ּ�ָ������ˢ��У��
		System.out.println(CaseCheck);
	}

	public void testCase003() throws Exception {
		CaseName = "������ѡ";
		new F5StockActivity().click_Stockname("R001.IB");

		View Gointo = (View) this.getViewById("speed_text_view");
		solo.clickOnView(Gointo);// ����������ѡ��

		View Back = (View) this.getViewById("buttonLine");
		solo.clickOnView(Back);// ��������ء�

		windBottomTool("��ѡ");// �������ѡ��

		CaseCheck = this.EqualsChecked(solo.searchText("1�ջع�"));
		System.out.println(CaseCheck);
	}

	public void testCase004() throws Exception {
		CaseName = "���������5��K��";
		new F5StockActivity().click_Stockname("R001.IB");

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
		System.out.println(time1);
		System.out.println(time2);

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked(days < 2);
		System.out.println(CaseCheck);

	}

	public void testCase005() throws Exception {
		CaseName = "���������60��K��";
		new F5StockActivity().click_Stockname("R001.IB");

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
		System.out.println(time1);
		System.out.println(time2);

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((2 < days) && (days < 30));
		System.out.println(CaseCheck);

	}

	public void testCase006() throws Exception {
		CaseName = "�����������K��";
		new F5StockActivity().click_Stockname("R001.IB");

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
		System.out.println(time1);
		System.out.println(time2);

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((30 < days) && (days < 60));
		System.out.println(CaseCheck);

	}

	public void testCase007() throws Exception {
		CaseName = "�����������K��";
		new F5StockActivity().click_Stockname("R001.IB");

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
		System.out.println(time1);
		System.out.println(time2);

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((60 < days) && (days < 300));
		System.out.println(CaseCheck);

	}

	public void testCase008() throws Exception {
		CaseName = "�����������K��";
		new F5StockActivity().click_Stockname("R001.IB");

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
		System.out.println(time1);
		System.out.println(time2);

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((300 < days) && (days < 1000));
		System.out.println(CaseCheck);

	}

	public void testCase009() throws Exception {
		CaseName = "�����������ʱ��";
		new F5StockActivity().click_Stockname("R001.IB");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

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
				&& time3.equalsIgnoreCase("16:30"));// ����r�g
		System.out.println(CaseCheck);

	}

}