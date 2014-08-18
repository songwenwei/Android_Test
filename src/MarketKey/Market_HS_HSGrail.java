//���Ե㣺�г�
package MarketKey;

import com.robotium.solo.Solo;
import android.widget.Button;

import StockMasterBase.MarketStockActivity;
import StockMasterBase.StockActivity;
import android.widget.TextView;

//����/�������
public class Market_HS_HSGrail extends StockActivity {

	// ����ָ��ָ������ˢ��У��
	public void testCase001() throws Exception {
		CaseName = "�������_����ָ��ָ������ˢ��У��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB
		solo.clickOnView(this.getViewById("image_more"));// ���������
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("listview_father",0));// �б�ǰ���еĵ�һ��ָ������ˢ��У��
		System.out.println(CaseCheck);
	}

	// ���뻦��ָ����ʱҳ��
	public void testCase002() throws Exception {
		CaseName = "�������_���뻦��ָ����ʱҳ��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB
		solo.clickOnView(this.getViewById("image_more"));// ���������
		String index_name = new MarketStockActivity().getMarketListName(
				"listview_father", 0, 1);
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
		CaseName = "�������_�����л�ָ��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB
		solo.clickOnView(this.getViewById("image_more"));// ���������
		String stock_name = new MarketStockActivity().getMarketListName(
				"listview_father", 0, 1);// ��ȡ��һ���б�ɷ�����
		String stock_name1 = new MarketStockActivity().getMarketListName(
				"listview_father", 1, 1);// ��ȡ�ڶ����б�ɷ�����
		String stock_name2 = new MarketStockActivity().getMarketListName(
				"listview_father", 2, 1);// ��ȡ�������б�ɷ�����

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



	// �����ָ������ˢ��У��
	public void testCase004() throws Exception {
		CaseName = "�������_�����ָ������ˢ��У��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB
		solo.clickOnView(this.getViewById("image_more"));// ���������
		new MarketStockActivity().clickOnMarketListPlus("listview_father");// �����+����չ���б�
		solo.clickOnView(this.getViewById("new_price_sort"));
		CaseCheck = this.EqualsChecked(new MarketStockActivity()
				.changedListener("listview_child",0)
		/**/);// �б�ǰ���еĵ�һ��ָ������ˢ��У��
		System.out.println(CaseCheck);
	}

	// ���뻦��ɷ�ʱҳ��
	public void testCase005() throws Exception {
		CaseName = "�������_���뻦��ɷ�ʱҳ��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB
		solo.clickOnView(this.getViewById("image_more"));// ���������
		new MarketStockActivity().clickOnMarketListPlus("listview_father");// �����+����չ���б�
		String stock_name = new MarketStockActivity().getMarketListName(
				"listview_child", 0, 1);
		System.out.println(stock_name);// ��ȡ��һ���ɷֹɵ�����
		solo.clickOnText(stock_name);// �����һ���ɷֹɵķ�ʱҳ��
		solo.sleep(2000);
		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(stock_name));// У���ʱҳ�����
		System.out.println(CaseCheck);
	}

	// ���һ����л�����ɷ�ʱҳ��
	public void testCase006() throws Exception {
		CaseName = "�������_������һ������";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB
		solo.clickOnView(this.getViewById("image_more"));// ���������
		solo.sleep(2000);
		new MarketStockActivity().clickOnMarketListPlus("listview_father");// �����+����չ���б�
		String stock_name = new MarketStockActivity().getMarketListName(
				"listview_child", 0, 1);// ��ȡ��һ���б�ɷ�����
		String stock_name1 = new MarketStockActivity().getMarketListName(
				"listview_child", 1, 1);// ��ȡ�ڶ����б�ɷ�����
		String stock_name2 = new MarketStockActivity().getMarketListName(
				"listview_child", 2, 1);// ��ȡ�������б�ɷ�����
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

	// ���󻬶��л�����ɷ�ʱҳ��
	public void testCase007() throws Exception {
		CaseName = "�������_������һ������";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB
		solo.clickOnView(this.getViewById("image_more"));// ���������
		new MarketStockActivity().clickOnMarketListPlus("listview_father");// �����+����չ���б�
		String stock_name = new MarketStockActivity().getMarketListName(
				"listview_child", 0, 1);// ��ȡ��һ���б�ɷ�����
		String stock_name1 = new MarketStockActivity().getMarketListName(
				"listview_child", 1, 1);// ��ȡ�ڶ����б�ɷ�����
		String stock_name2 = new MarketStockActivity().getMarketListName(
				"listview_child", 2, 1);// ��ȡ�������б�ɷ�����

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