//���Ե㣺�г�
package MarketKey;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//��Ʒ
public class Market_Commodity extends StockActivity {
	// ��Ʒָ������ˢ��У��
	public void testCase001() throws Exception {
		CaseName = "��Ʒ_��Ʒָ������ˢ��У��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("��Ʒ");// �����ƷTAB
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// �б�ǰ���еĵ�һ��ָ������ˢ��У��
		System.out.println(CaseCheck);
	}
}