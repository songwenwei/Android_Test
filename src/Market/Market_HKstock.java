//���Ե㣺�г�
package Market;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//�۹�
public class Market_HKstock extends StockActivity {
	// ����۹�ģ��
	public void testCase001() throws Exception {
		CaseName = "����۹�ģ��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("�۹�");// ����۹�TAB

		TextView title = (TextView) this.getViewById("titleView");
		String TAB_title = title.getText().toString();

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);

		String stock_data = new MarketStockActivity().getMarketListData(
				"markFixedView", 0, 0);

		CaseCheck = this.EqualsChecked(TAB_title.equalsIgnoreCase("�۹�ָ��")
				&& !stock_name.equalsIgnoreCase("--")
				&& !stock_data.equalsIgnoreCase("--"));// ���������ȷ�ԣ����ƣ��ּ����ݲ�����--
		System.out.println(CaseCheck);

	}

	// �����+����չ���۹��б�
	public void testCase002() throws Exception {
		CaseName = "�����+����չ���۹��б�";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("�۹�");// ����۹�TAB
		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// �����+����չ���б�

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);

		String stock_data = new MarketStockActivity().getMarketListData(
				"markFixedView", 0, 0);

		CaseCheck = this.EqualsChecked(!stock_name.equalsIgnoreCase("--")
				&& !stock_data.equalsIgnoreCase("--"));// ���������ȷ�ԣ����ƣ��ּ����ݲ�����--
		System.out.println(CaseCheck);

		new MarketStockActivity().clickOnMarketListMinus("markTitleList");// �����-���������б�

	}

}
