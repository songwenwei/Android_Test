//���Ե㣺��ȯ
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//ָ��/ȫ��ָ��
public class F5_Index_IndexOfGlobal extends StockActivity {
	public void testCase001() throws Exception {
		CaseName = "�����ָ��_������ѡ";
		this.windDeleteAllShares();
		new F5StockActivity().click_Stockname("DJI.GI");

		View Gointo = (View) this.getViewById("speed_text_view");
		solo.clickOnView(Gointo);// ����������ѡ��

		View Back = (View) this.getViewById("buttonLine");
		solo.clickOnView(Back);// ��������ء�

		windBottomTool("��ѡ");// �������ѡ��

		CaseCheck = this.EqualsChecked(solo.searchText("����˹��ҵ"));
		System.out.println(CaseCheck);
	}

	public void testCase002() throws Exception {
		CaseName = "�����ָ��_�������";
		new F5StockActivity().click_Stockname("DJI.GI");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ
		solo.sleep(2000);
		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("sland_speed")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();// ��ȡ��ʱ���ƿ���ʱ��
		String time2 = ((TextView) F5_time.getChildAt(6)).getText().toString();// ��ȡ��ʱ��������ʱ��

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:30")
				&& time2.equalsIgnoreCase("16:00"));// ����r�g
		System.out.println(CaseCheck);

	}

}