//���Ե㣺�г�
package MarketKey;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//��ծ
public class Market_FuturesOfBond extends StockActivity {
	// ��ծָ������ˢ��У��
	public void testCase001() throws Exception {
		CaseName = "��ծ_��ծָ������ˢ��У��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("��ծ");// �����ծTAB
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// �б�ǰ���еĵ�һ��ָ������ˢ��У��
		System.out.println(CaseCheck);
	}

	// ������ծ��ʱҳ��
	public void testCase002() throws Exception {
		CaseName = "��ծ_������ծ��ʱҳ��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("��ծ");// �����ծTAB

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
