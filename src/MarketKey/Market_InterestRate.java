//���Ե㣺�г�
package MarketKey;

import com.robotium.solo.Solo;
import android.widget.Button;
import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//����
public class Market_InterestRate extends StockActivity {
	// ����ָ������ˢ��У��
	public void testCase001() throws Exception {
		CaseName = "����_����ָ������ˢ��У��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// �б�ǰ���еĵ�һ��ָ������ˢ��У��
		System.out.println(CaseCheck);
	}
}