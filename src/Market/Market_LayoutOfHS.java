//���Ե㣺�г�
package Market;

import StockMasterBase.MarketStockActivity;
import android.widget.Button;
import StockMasterBase.StockActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.TextView;

//����/�����
public class Market_LayoutOfHS extends StockActivity {

	// Ĭ����ʾ����ָ���б�У��
	public void testCase001() throws Exception {
		CaseName = "Ĭ����ʾ����ָ���б�У��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB

		int i, j;
		String index_name;
		StringBuffer data_bag = new StringBuffer();
		for (i = 1; i < 3; i++)
			for (j = 0; j < 3; j++) {
				ViewGroup listview = (ViewGroup) ((ViewGroup) this
						.getViewById("listview_hs")).getChildAt(i);
				listview = (ViewGroup) listview.getChildAt(0);
				listview = (ViewGroup) listview.getChildAt(j);
				TextView name = (TextView) listview.getChildAt(0);
				index_name = name.getText().toString();
				data_bag.append(index_name);
				data_bag.append("|");
			}
		index_name = data_bag.toString();
		CaseCheck = this.EqualsChecked(index_name
				.equalsIgnoreCase("��֤��ָ|��֤��ָ|����300|��֤��ָ|��С��ָ|��ҵ��ָ|"));
		System.out.println(CaseCheck);
	}

	// Ĭ����ʾ����ָ������ˢ��У��
	boolean testCase002Refresh = false;

	/**
	 * @throws Exception
	 */
	public void testCase002() throws Exception {
		CaseName = "Ĭ����ʾ����ָ������ˢ��У��";
		windBottomTool("�г�");// ����г�
		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB
		ViewGroup listview = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(1);
		listview = (ViewGroup) listview.getChildAt(0);
		listview = (ViewGroup) listview.getChildAt(0);
		TextView Viewname = (TextView) listview.getChildAt(1);
		final String firstValue = Viewname.getText().toString();
		long a = System.currentTimeMillis();
		System.out.println("��һ��ֵ=" + firstValue);

		Viewname.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				if (!arg0.toString().equalsIgnoreCase(firstValue)) {
					testCase002Refresh = true;
					System.out.println("------ˢ�³ɹ�----��һ��ֵ=" + firstValue
							+ "----�ڶ���ֵ=" + arg0.toString());
				}
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
			}

			@Override
			public void afterTextChanged(Editable arg0) {
			}
		});
		long b;
		while (!testCase002Refresh) {
			b = System.currentTimeMillis();
			if (((b - a) / 1000 > 300)) {
				System.out.println("300���������δˢ��");
				break;
			}
		}
		CaseCheck = this.EqualsChecked(testCase002Refresh);
		System.out.println(CaseCheck);
	}

	// Ĭ����ʾ��ҵָ������ˢ��У��
	boolean testCase003Refresh = false;

	/**
	 * @throws Exception
	 */
	public void testCase003() throws Exception {
		CaseName = "Ĭ����ʾ��ҵָ������ˢ��У��";
		windBottomTool("�г�");// ����г�

		new MarketStockActivity().clickOnMarketTABView("����");// �������TAB

		solo.clickOnView((ViewGroup) this.getViewById("groupIcon"));// ������
		solo.sleep(2000);

		ViewGroup listview = (ViewGroup) ((ViewGroup) this
				.getViewById("listview_hs")).getChildAt(2);
		listview = (ViewGroup) listview.getChildAt(0);
		listview = (ViewGroup) listview.getChildAt(0);
		TextView Viewname = (TextView) listview.getChildAt(1);
		final String firstValue = Viewname.getText().toString();
		long a = System.currentTimeMillis();
		System.out.println("��һ��ֵ=" + firstValue);

		Viewname.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				if (!arg0.toString().equalsIgnoreCase(firstValue)) {
					testCase003Refresh = true;
					System.out.println("------ˢ�³ɹ�----��һ��ֵ=" + firstValue
							+ "----�ڶ���ֵ=" + arg0.toString());
				}
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
			}

			@Override
			public void afterTextChanged(Editable arg0) {
			}
		});
		long b;
		while (!testCase003Refresh) {
			b = System.currentTimeMillis();
			if (((b - a) / 1000 > 300)) {
				System.out.println("300���������δˢ��");
				break;
			}
		}
		CaseCheck = this.EqualsChecked(testCase003Refresh);
		System.out.println(CaseCheck);
	}

	// Ĭ����ʾ����ָ������ˢ��У��
	boolean testCase004Refresh = false;

	/**
	 * @throws Exception
	 */
	public void testCase004() throws Exception {
		CaseName = "Ĭ����ʾ����ָ������ˢ��У��";
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
		TextView Viewname = (TextView) listview.getChildAt(1);
		final String firstValue = Viewname.getText().toString();
		long a = System.currentTimeMillis();
		System.out.println("��һ��ֵ=" + firstValue);

		Viewname.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				if (!arg0.toString().equalsIgnoreCase(firstValue)) {
					testCase004Refresh = true;
					System.out.println("------ˢ�³ɹ�----��һ��ֵ=" + firstValue
							+ "----�ڶ���ֵ=" + arg0.toString());
				}
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
			}

			@Override
			public void afterTextChanged(Editable arg0) {
			}
		});
		long b;
		while (!testCase004Refresh) {
			b = System.currentTimeMillis();
			if (((b - a) / 1000 > 300)) {
				System.out.println("300���������δˢ��");
				break;
			}
		}
		CaseCheck = this.EqualsChecked(testCase004Refresh);
		System.out.println(CaseCheck);
	}

}
