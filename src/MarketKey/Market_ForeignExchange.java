//���Ե㣺�г�
package MarketKey;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//���
public class Market_ForeignExchange extends StockActivity {
	// ���ָ������ˢ��У��
	public void testCase001() throws Exception {
		CaseName = "���_���ָ������ˢ��У��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("���");// ������TAB
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// �б�ǰ���еĵ�һ��ָ������ˢ��У��
		System.out.println(CaseCheck);
	}

	// ��������ʱҳ��
	public void testCase002() throws Exception {
		CaseName = "���_��������ʱҳ��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("���");// ������TAB

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 0);
		System.out.println(stock_name);
		solo.clickOnText(stock_name);
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name));// У���ʱҳ�����
		System.out.println(CaseCheck);
	}
}
