//���Ե㣺�г�
package Market;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//����
public class Market_Fund extends StockActivity {
	// �������ģ��
	public void testCase001() throws Exception {
		CaseName = "�������ģ��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB

		TextView title = (TextView) this.getViewById("titleView");
		String TAB_title = title.getText().toString();

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);

		String stock_data = new MarketStockActivity().getMarketListData(
				"markFixedView", 0, 0);

		CaseCheck = this.EqualsChecked(TAB_title.equalsIgnoreCase("����ָ��")
				&& !stock_name.equalsIgnoreCase("--")
				&& !stock_data.equalsIgnoreCase("--"));// ���������ȷ�ԣ����ƣ��ּ����ݲ�����--
		System.out.println(CaseCheck);
	}

	// �������ָ����ʱҳ��
	public void testCase002() throws Exception {
		CaseName = "�������ָ����ʱҳ��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB

		String index_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);
		solo.clickOnText(index_name);
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(index_name));// У���ʱҳ�����
		System.out.println(CaseCheck);

	}

}
