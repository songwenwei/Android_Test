//���Ե㣺�г�
package Market;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//��Ʒ
public class Market_Commodity extends StockActivity {
	// ������Ʒģ��
	public void testCase001() throws Exception {
		CaseName = "������Ʒģ��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("��Ʒ");// �����ƷTAB

		TextView title = (TextView) this.getViewById("titleView");
		String TAB_title = title.getText().toString();

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 0);

		String stock_data = new MarketStockActivity().getMarketListData(
				"markFixedView", 0, 0);

		CaseCheck = this.EqualsChecked(TAB_title.equalsIgnoreCase("ȫ����Ʒ")
				&& !stock_name.equalsIgnoreCase("--")
				&& !stock_data.equalsIgnoreCase("--"));// ���������ȷ�ԣ����ƣ��ּ����ݲ�����--
		System.out.println(CaseCheck);
	}

	// ������Ʒ��ʱҳ��
	public void testCase002() throws Exception {
		CaseName = "������Ʒ��ʱҳ��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("��Ʒ");// �����ƷTAB

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 0);
		solo.clickOnText(stock_name);
		solo.sleep(2000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name));// У���ʱҳ�����
		System.out.println(CaseCheck);
	}

	// ���һ����л���Ʒ��ʱҳ��
	public void testCase003() throws Exception {
		CaseName = "���һ����л���Ʒ��ʱҳ��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("��Ʒ");// �����ƷTAB

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 0);// ��ȡ��һ���б�ɷ�����

		String stock_name1 = new MarketStockActivity().getMarketListName(
				"markFixedView", 1, 0);// ��ȡ�ڶ����б�ɷ�����

		String stock_name2 = new MarketStockActivity().getMarketListName(
				"markFixedView", 2, 0);// ��ȡ�������б�ɷ�����

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

	// ���󻬶��л���Ʒ��ʱҳ��
	public void testCase004() throws Exception {
		CaseName = "���󻬶��л���Ʒ��ʱҳ��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("��Ʒ");// �����ƷTAB

		String stock_name = new MarketStockActivity().getMarketListName(
				"markFixedView", 0, 0);// ��ȡ��һ���б�ɷ�����

		String stock_name1 = new MarketStockActivity().getMarketListName(
				"markFixedView", 1, 0);// ��ȡ�ڶ����б�ɷ�����

		String stock_name2 = new MarketStockActivity().getMarketListName(
				"markFixedView", 2, 0);// ��ȡ�������б�ɷ�����

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
