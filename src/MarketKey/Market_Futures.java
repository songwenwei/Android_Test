//���Ե㣺�г�
package MarketKey;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//�ڻ�
public class Market_Futures extends StockActivity {
	// �ڻ�ָ������ˢ��У��
	public void testCase001() throws Exception {
		CaseName = "�ڻ�_�ڻ�ָ������ˢ��У��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("�ڻ�");// ����ڻ�TAB
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// �б�ǰ���еĵ�һ��ָ������ˢ��У��
		System.out.println(CaseCheck);
	}

	// �ڻ��ɷ�ָ������ˢ��У��
	public void testCase002() throws Exception {
		CaseName = "�ڻ�_�ڻ��ɷ�ָ������ˢ��У��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("�ڻ�");// ����ڻ�TAB

		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// �����+����չ���б�
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// �б�ǰ���еĵ�һ��ָ������ˢ��У��
		System.out.println(CaseCheck);
		new MarketStockActivity().clickOnMarketListMinus("markTitleList");// �����-���������б�
	}

	// �����ڻ��ɷַ�ʱҳ��
	public void testCase003() throws Exception {
		CaseName = "�ڻ�_�����ڻ��ɷַ�ʱҳ��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("�ڻ�");// ����ڻ�TAB

		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// �����+����չ���б�

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);
		System.out.println(stock_name);
		solo.clickOnText(stock_name);
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();
		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name));// У���ʱҳ�����
		System.out.println(CaseCheck);
	}
}