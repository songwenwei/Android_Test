//���Ե㣺�г�
package MarketKey;

import StockMasterBase.MarketStockActivity;
import android.widget.Button;
import StockMasterBase.StockActivity;
import android.view.ViewGroup;
import android.widget.TextView;

//����/�����
public class Market_HS_LayoutOfHS extends StockActivity {
	// ���뻦��ģ��
	public void testCase001() throws Exception {
		CaseName = "���뻦��ģ��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB

		TextView title = (TextView) this.getViewById("titleView");
		String TAB_title = title.getText().toString();
		System.out.println(TAB_title);

		TextView name = (TextView) (TextView) this.getViewById("name_left");
		String index_name = name.getText().toString();
		System.out.println(index_name);

		TextView price = (TextView) (TextView) this.getViewById("price_left");
		String index_price = price.getText().toString();
		System.out.println(index_price);

		CaseCheck = this.EqualsChecked(TAB_title.equalsIgnoreCase("�������")
				&& !index_name.equalsIgnoreCase("--")
				&& !index_price.equalsIgnoreCase("--"));// ���������ȷ�ԣ����ƣ��ּ����ݲ�����--
		System.out.println(CaseCheck);

	}

	// ���뻦��ָ����ʱҳ��
	public void testCase002() throws Exception {
		CaseName = "���뻦��ָ����ʱҳ��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB

		ViewGroup listview = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		listview = (ViewGroup) listview.getChildAt(0);
		listview = (ViewGroup) listview.getChildAt(0);
		TextView name = (TextView) listview.getChildAt(0);
		String index_name = name.getText().toString();
		System.out.println(index_name);
		solo.clickOnText(index_name);
		solo.sleep(10000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(index_name));// У���ʱҳ�����
		System.out.println(CaseCheck);

	}

	// ������ҵָ����ʱҳ��
	public void testCase003() throws Exception {
		CaseName = "������ҵָ����ʱҳ��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB

		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// ������
		solo.sleep(2000);

		ViewGroup listview = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(2);
		listview = (ViewGroup) listview.getChildAt(0);
		listview = (ViewGroup) listview.getChildAt(0);
		TextView name = (TextView) listview.getChildAt(0);
		String index_name = name.getText().toString();
		System.out.println(index_name);
		solo.clickOnText(index_name);
		solo.sleep(10000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(index_name));// У���ʱҳ�����
		System.out.println(CaseCheck);

	}

	// �������ָ����ʱҳ��
	public void testCase004() throws Exception {
		CaseName = "�������ָ����ʱҳ��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB

		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// ������
		solo.sleep(2000);

		ViewGroup groupIcon = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		groupIcon = (ViewGroup) groupIcon.getChildAt(0);
		groupIcon = (ViewGroup) groupIcon.getChildAt(0);
		solo.clickOnView(groupIcon);// ������ҵ
		solo.sleep(2000);

		ViewGroup listview = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(3);
		listview = (ViewGroup) listview.getChildAt(0);
		listview = (ViewGroup) listview.getChildAt(0);
		TextView name = (TextView) listview.getChildAt(0);
		String index_name = name.getText().toString();
		System.out.println(index_name);
		solo.clickOnText(index_name);
		solo.sleep(10000);

		TextView title = (TextView) this.getViewById("book_name");
		String F5_title = title.getText().toString();

		CaseCheck = this.EqualsChecked(F5_title.contains(index_name));// У���ʱҳ�����
		System.out.println(CaseCheck);
	}

}
