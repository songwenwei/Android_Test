//���Ե㣺��ȯ
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//����/����������//�������
public class F5_InterestRate_InterestRateOfSZTrade extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "�������_�����ʱҳ��";
		new F5StockActivity().click_Stockname("204001.SH");
		String F5_title = ((TextView) this.getViewById("book_name")).getText()
				.toString();// ��ȡ��ʱҳ�����

		CaseCheck = this.EqualsChecked(F5_title.contains("GC001"));// У���ʱҳ�����
		System.out.println(CaseCheck);

	}

	public void testCase002() throws Exception {
		CaseName = "�������_�����ʱҳ��������ʱ��";
		new F5StockActivity().click_Stockname("204001.SH");// �����ʱҳ��

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);// �������ʱ��
		solo.sleep(2000);

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("speed_view_kt")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(6)).getText().toString();// ��ȡ��ʱ���ƿ���ʱ��
		String time2 = ((TextView) F5_time.getChildAt(8)).getText().toString();// ��ȡ��ʱ��������ʱ��
		String time3 = ((TextView) F5_time.getChildAt(10)).getText().toString();// ��ȡ��ʱ��������ʱ��

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:30")
				&& time2.equalsIgnoreCase("11:30/13:00")
				&& time3.equalsIgnoreCase("15:00"));// ����r�g
		System.out.println(CaseCheck);

	}

	
	public void testCase003() throws Exception {
		CaseName = "�������_�����ʱҳ��������";
		new F5StockActivity().click_Stockname("204001.SH");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("sland_speed")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();// ��ȡ��ʱ���ƿ���ʱ��
		String time2 = ((TextView) F5_time.getChildAt(5)).getText().toString();// ��ȡ��ʱ��������ʱ��
		String time3 = ((TextView) F5_time.getChildAt(6)).getText().toString();// ��ȡ��ʱ��������ʱ��

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:30")
				&& time2.equalsIgnoreCase("11:30/13:00")
				&& time3.equalsIgnoreCase("15:00"));// ����r�g
		System.out.println(CaseCheck);

	}

	

}