//���Ե㣺�г�
package MarketKey;

import com.robotium.solo.Solo;
import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.Button;
import android.widget.TextView;

//�и�
public class Market_ChinaIdea extends StockActivity {
	// �и�ָ������ˢ��У��
	public void testCase001() throws Exception {
		CaseName = "�и�_�и�ָ������ˢ��У��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("�и�");// ����и�TAB
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// �б�ǰ���еĵ�һ��ָ������ˢ��У��
		System.out.println(CaseCheck);
	}

}