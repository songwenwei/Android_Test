//���Ե㣺�г�
package MarketKey;

import StockMasterBase.MarketStockActivity;
import android.widget.Button;
import StockMasterBase.StockActivity;

//�г�TAB����
public class Market_LayoutOfMarketTab extends StockActivity {

	// �ο͵�¼����г����г�TAB��У��
	public void testCase001() throws Exception {
		CaseName = "�ֻ��˺ŵ�¼����г����г�TAB��У��";
		Login("15651610158", "666666");
		windBottomTool("�г�");// ����г�

		int TAB_count = new MarketStockActivity().getMarketTABCount();
		System.out.println(TAB_count); // ���TAB��ť��Ŀ

		String TAB_name = new MarketStockActivity().getMarketTABName();
		System.out.println(TAB_name);// ���TAB��ť���Ƽ�˳��

		CaseCheck = this.EqualsChecked(TAB_name
				.equalsIgnoreCase("����|�۹�|ȫ��|�и�|��Ʒ|����|���|��ָ|��ծ|�ڻ�|����||"));
		System.out.println(CaseCheck);
	}
}
