//���Ե㣺��ȯ
package F5;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//����/����ʱ����/����ʽ����
public class F5_FundOfOpen extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "���뿪��ʽ�����ʱҳ��";
		new F5StockActivity().click_Stockname("000001.OF");

		String F5_title = ((TextView) this.getViewById("book_name")).getText()
				.toString();// ��ȡ��ʱҳ�����

		CaseCheck = this.EqualsChecked(F5_title.contains("���ĳɳ�"));// У���ʱҳ�����
		System.out.println(CaseCheck);

	}

	public void testCase002() throws Exception {
		CaseName = "ָ������ˢ��";
		new F5StockActivity().click_Stockname("000001.OF");
		CaseCheck = this.EqualsChecked(new F5StockActivity().ChangedListener("new_price"));// �ּ�ָ������ˢ��У��
		System.out.println(CaseCheck);
	}
}