//���Ե㣺��ȯ
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//ͨ��/̨��
public class F5_public_StockOfTW extends StockActivity {
	public void testCase001() throws Exception {
		CaseName = "̨��_�����ʱҳ��";
		new F5StockActivity().click_Stockname("6116.TW");
		String F5_title = ((TextView) this.getViewById("book_name")).getText()
				.toString();// ��ȡ��ʱҳ�����

		CaseCheck = this.EqualsChecked(F5_title.contains("�ʾ�"));// У���ʱҳ�����
		System.out.println(CaseCheck);

	}

	public void testCase002() throws Exception {
		CaseName = "̨��_����ҳ��ѡ���ʱ����";
		new F5StockActivity().click_Stockname("6116.TW");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		solo.clickOnScreen(location[0], location[1]);// �������ʱ��
		solo.sleep(2000);

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("sland_speed")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();
		String time2 = ((TextView) F5_time.getChildAt(6)).getText().toString();

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:00")
				&& time2.equalsIgnoreCase("13:30"));// ����r�g
		System.out.println(CaseCheck);

	}

}