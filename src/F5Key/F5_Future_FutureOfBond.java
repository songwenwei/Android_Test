//���Ե㣺��ȯ
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//�ڻ�/��ծ�ڻ�
public class F5_Future_FutureOfBond extends StockActivity {
	public void testCase001() throws Exception {
		CaseName = "��ծ�ڻ�_������ծ��ʱҳ��";
		new F5StockActivity().click_Stockname("TF1409.CFE");

		String F5_title = ((TextView) this.getViewById("book_name")).getText()
				.toString();// ��ȡ��ʱҳ�����

		CaseCheck = this.EqualsChecked(F5_title.contains("TF1406"));// У���ʱҳ�����
		System.out.println(CaseCheck);

	}


	public void testCase002() throws Exception {
		CaseName = "��ծ�ڻ�_�������";
		new F5StockActivity().click_Stockname("TF1409.CFE");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("sland_speed")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();
		String time2 = ((TextView) F5_time.getChildAt(5)).getText().toString();
		String time3 = ((TextView) F5_time.getChildAt(6)).getText().toString();

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:15")
				&& time2.equalsIgnoreCase("11:30/13:00")
				&& time3.equalsIgnoreCase("15:15"));// ����r�g
		System.out.println(CaseCheck);

	}

}