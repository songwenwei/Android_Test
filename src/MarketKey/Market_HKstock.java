//���Ե㣺�г�
package MarketKey;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//�۹�
public class Market_HKstock extends StockActivity {
	// �۹�ָ��ָ������ˢ��У��
	public void testCase001() throws Exception {
		CaseName = "�۹�_�۹�ָ��ָ������ˢ��У��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("�۹�");// ����۹�TAB
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// �б�ǰ���еĵ�һ��ָ������ˢ��У��
		System.out.println(CaseCheck);
	}

	// ����۹�ָ����ʱҳ��
	public void testCase002() throws Exception {
		CaseName = "�۹�_����۹�ָ����ʱҳ��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("�۹�");// ����۹�TAB

		String index_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);
		System.out.println(index_name);
		solo.clickOnText(index_name);
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();
		CaseCheck = this.EqualsChecked(F5_title.contains(index_name));// У���ʱҳ�����
		System.out.println(CaseCheck);

	}

	// �����л�ָ��
	public void testCase003() throws Exception {
		CaseName = "�۹�_�����л�ָ��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("�۹�");// ����۹�TAB

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);// ��ȡ��һ���б�ɷ�����

		String stock_name1 = new MarketStockActivity().getMarketListName(
				"markFixedView", 1, 1);// ��ȡ�ڶ����б�ɷ�����

		String stock_name2 = new MarketStockActivity().getMarketListName(
				"markFixedView", 2, 1);// ��ȡ�������б�ɷ�����

		solo.clickOnText(stock_name);// ����ɷ֣������ʱҳ��
		solo.sleep(2000);
		TextView title = (TextView) this.getViewById("book_name");// ��ȡ��ʱҳ�����
		String F5_title = title.getText().toString();

		solo.scrollToSide(Solo.RIGHT);// �л�����һ����ʱҳ��
		solo.sleep(5000);
		TextView title1 = (TextView) this.getViewById("book_name");// ��ȡ��ʱҳ�����
		String F5_title1 = title1.getText().toString();

		solo.scrollToSide(Solo.RIGHT);// �л�����һ����ʱҳ��
		solo.sleep(5000);
		TextView title2 = (TextView) this.getViewById("book_name");// ��ȡ��ʱҳ�����
		String F5_title2 = title2.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name)
				&& F5_title1.contains(stock_name1)
				&& F5_title2.contains(stock_name2));// У���ʱҳ�����
		System.out.println(CaseCheck);
	}

	

	// �۹�ָ������ˢ��У��
	public void testCase004() throws Exception {
		CaseName = "�۹�_�۹�ָ������ˢ��У��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("�۹�");// ����۹�TAB
		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// �����+����չ���б�
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("markFixedView",0));// �б�ǰ���еĵ�һ��ָ������ˢ��У��
		System.out.println(CaseCheck);
		new MarketStockActivity().clickOnMarketListMinus("markTitleList");// ��������-���������б�
	}

	// ����۹ɷ�ʱҳ��
	public void testCase005() throws Exception {
		CaseName = "�۹�_����۹ɷ�ʱҳ��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("�۹�");// ����۹�TAB

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

	// ������һ������
	public void testCase006() throws Exception {
		CaseName = "�۹�_������һ������";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("�۹�");// ����۹�TAB

		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// �����+����չ���б�

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);// ��ȡ��һ���б�ɷ�����

		String stock_name1 = new MarketStockActivity().getMarketListName(
				"markFixedView", 1, 1);// ��ȡ�ڶ����б�ɷ�����

		String stock_name2 = new MarketStockActivity().getMarketListName(
				"markFixedView", 2, 1);// ��ȡ�������б�ɷ�����

		solo.clickOnText(stock_name);// ����ɷ֣������ʱҳ��
		solo.sleep(2000);
		TextView title = (TextView) this.getViewById("book_name");// ��ȡ��ʱҳ�����
		String F5_title = title.getText().toString();

		solo.scrollToSide(Solo.RIGHT);// �л�����һ����ʱҳ��
		solo.sleep(5000);
		TextView title1 = (TextView) this.getViewById("book_name");// ��ȡ��ʱҳ�����
		String F5_title1 = title1.getText().toString();

		solo.scrollToSide(Solo.RIGHT);// �л�����һ����ʱҳ��
		solo.sleep(5000);
		TextView title2 = (TextView) this.getViewById("book_name");// ��ȡ��ʱҳ�����
		String F5_title2 = title2.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name)
				&& F5_title1.contains(stock_name1)
				&& F5_title2.contains(stock_name2));// У���ʱҳ�����
		System.out.println(CaseCheck);
	}

	// ������һ������
	public void testCase007() throws Exception {
		CaseName = "�۹�_������һ������";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("�۹�");// ����۹�TAB

		new MarketStockActivity().clickOnMarketListPlus("markFixedView");// �����+����չ���б�

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 1);// ��ȡ��һ���б�ɷ�����

		String stock_name1 = new MarketStockActivity().getMarketListName(
				"markFixedView", 1, 1);// ��ȡ�ڶ����б�ɷ�����

		String stock_name2 = new MarketStockActivity().getMarketListName(
				"markFixedView", 2, 1);// ��ȡ�������б�ɷ�����

		solo.clickOnText(stock_name2);// ����ɷ֣������ʱҳ��
		solo.sleep(2000);
		TextView title2 = (TextView) this.getViewById("book_name");// ��ȡ��ʱҳ�����
		String F5_title2 = title2.getText().toString();

		solo.scrollToSide(Solo.LEFT);// �л�����һ����ʱҳ��
		solo.sleep(5000);
		TextView title1 = (TextView) this.getViewById("book_name");// ��ȡ��ʱҳ�����
		String F5_title1 = title1.getText().toString();

		solo.scrollToSide(Solo.LEFT);// �л�����һ����ʱҳ��
		solo.sleep(5000);
		TextView title = (TextView) this.getViewById("book_name");// ��ȡ��ʱҳ�����
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name)
				&& F5_title1.contains(stock_name1)
				&& F5_title2.contains(stock_name2));// У���ʱҳ�����
		System.out.println(CaseCheck);
	}

}
