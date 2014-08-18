//���Ե㣺��ȯ
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//��Ʊ/AB��
public class F5_Stock_StockOfAB extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "AB��_�����ʱҳ��";
		new F5StockActivity().click_Stockname("600600.SH");
		String F5_title = ((TextView) this.getViewById("book_name")).getText()
				.toString();// ��ȡ��ʱҳ�����

		CaseCheck = this.EqualsChecked(F5_title.contains("�ൺơ��"));// У���ʱҳ�����
		System.out.println(CaseCheck);

	}

	

	public void testCase002() throws Exception {
		CaseName = "AB��_�������K��";
		new F5StockActivity().click_Stockname("600600.SH");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this
				.getViewById("speed_view_kt")).getChildAt(0);

		String time1 = ((TextView) K.getChildAt(6)).getText().toString();
		String time2 = ((TextView) K.getChildAt(8)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked(days < 60);
		System.out.println(CaseCheck);

	}

	public void testCase003() throws Exception {
		CaseName = "AB��_�������K��";
		new F5StockActivity().click_Stockname("600600.SH");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this
				.getViewById("speed_view_kt")).getChildAt(0);

		String time1 = ((TextView) K.getChildAt(6)).getText().toString();
		String time2 = ((TextView) K.getChildAt(8)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((60 < days) && (days < 300));
		System.out.println(CaseCheck);
	}

	public void testCase004() throws Exception {
		CaseName = "AB��_�������K��";
		new F5StockActivity().click_Stockname("600600.SH");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this
				.getViewById("speed_view_kt")).getChildAt(0);

		String time1 = ((TextView) K.getChildAt(6)).getText().toString();
		String time2 = ((TextView) K.getChildAt(8)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((300 < days) && (days < 1000));
		System.out.println(CaseCheck);
	}


	public void testCase005() throws Exception {
		CaseName = "AB��_��������桿";
		new F5StockActivity().click_Stockname("600600.SH");
		solo.scrollDown();
		View TAB = this.getViewById("tabBar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);

		String event_title = ((TextView) this.getViewById("view_event_title"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(event_title.contains("����"));
		System.out.println(CaseCheck);
	}

	public void testCase006() throws Exception {
		CaseName = "AB��_��������ϡ�";
		new F5StockActivity().click_Stockname("600600.SH");
		solo.scrollDown();
		View TAB = this.getViewById("tabBar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);
		solo.scrollDown();
		View stockholder = (View) this.getViewById("moduleview_stockholder");
		solo.clickOnView(stockholder);
		solo.sleep(2000);
		String title = ((TextView) this.getViewById("titleView")).getText()
				.toString();

		CaseCheck = this.EqualsChecked(title.equalsIgnoreCase("ʮ��ɶ�"));
		System.out.println(CaseCheck);

	}

	public void testCase007() throws Exception {
		CaseName = "AB��_���������";
		new F5StockActivity().click_Stockname("600600.SH");
		solo.scrollDown();
		View TAB = this.getViewById("tabBar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(3000);
		View keyindex = (View) this.getViewById("moduleview_keyindex");
		solo.clickOnView(keyindex);
		solo.sleep(2000);
		String title = ((TextView) this.getViewById("titleView")).getText()
				.toString();

		CaseCheck = this.EqualsChecked(title.equalsIgnoreCase("�ؼ�ָ��"));
		System.out.println(CaseCheck);

	}



	public void testCase008() throws Exception {
		CaseName = "AB��_�ο͵�¼��������б���";
		this.Logout();
		new F5StockActivity().click_Stockname("600600.SH");
		solo.scrollDown();
		View TAB = this.getViewById("tabBar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		CaseCheck = this.EqualsChecked((solo.searchText("����б�") || solo
				.searchText("��������Ϣ")));
		System.out.println(CaseCheck);
	}

	public void testCase009() throws Exception {
		CaseName = "AB��_�����˺ŵ�¼��������б���";
		this.Login("13814049700", "123456");
		new F5StockActivity().click_Stockname("600600.SH");
		solo.scrollDown();
		View TAB = this.getViewById("tabBar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		CaseCheck = this.EqualsChecked((solo.searchText("����б�") || solo
				.searchText("��������Ϣ")));
		System.out.println(CaseCheck);
	}

	public void testCase010() throws Exception {
		CaseName = "AB��_ָ������ˢ��";
		new F5StockActivity().click_Stockname("600600.SH");
		CaseCheck = this.EqualsChecked(new F5StockActivity()
				.ChangedListener("new_price"));// �ּ�ָ������ˢ��У��
		System.out.println(CaseCheck);
	}

	public void testCase011() throws Exception {
		CaseName = "AB��_������ѡ";
		this.windDeleteAllShares();
		new F5StockActivity().click_Stockname("600600.SH");

		View Gointo = (View) this.getViewById("speed_text_view");
		solo.clickOnView(Gointo);// ����������ѡ��

		View Back = (View) this.getViewById("buttonLine");
		solo.clickOnView(Back);// ��������ء�

		windBottomTool("��ѡ");// �������ѡ��

		CaseCheck = this.EqualsChecked(solo.searchText("�ൺơ��"));
		System.out.println(CaseCheck);
	}

	public void testCase012() throws Exception {
		CaseName = "AB��_�����������";
		new F5StockActivity().click_Stockname("600600.SH");

		View Search = (View) this.getViewById("rightViewLine");
		solo.clickOnView(Search);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("����"));
		System.out.println(CaseCheck);
	}

	public void testCase013() throws Exception {
		CaseName = "AB��_��������ء�";
		new F5StockActivity().click_Stockname("600600.SH");

		View Back = (View) this.getViewById("leftView");
		solo.clickOnView(Back);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("����"));
		System.out.println(CaseCheck);
	}

	public void testCase014() throws Exception {
		CaseName = "AB��_���������5��K��";
		new F5StockActivity().click_Stockname("600600.SH");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		View TAB = this.getViewById("linear_buttom");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 6.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(4)).getText().toString();
		String time2 = ((TextView) K.getChildAt(5)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked(days < 2);
		System.out.println(CaseCheck);

	}

	public void testCase015() throws Exception {
		CaseName = "AB��_���������60��K��";
		new F5StockActivity().click_Stockname("600600.SH");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		View TAB = this.getViewById("linear_buttom");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 6 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(4)).getText().toString();
		String time2 = ((TextView) K.getChildAt(5)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((2 < days) && (days < 30));
		System.out.println(CaseCheck);

	}

	public void testCase016() throws Exception {
		CaseName = "AB��_�����������K��";
		new F5StockActivity().click_Stockname("600600.SH");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		View TAB = this.getViewById("linear_buttom");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 6 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(4)).getText().toString();
		String time2 = ((TextView) K.getChildAt(5)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((30 < days) && (days < 60));
		System.out.println(CaseCheck);

	}

	public void testCase017() throws Exception {
		CaseName = "AB��_�����������K��";
		new F5StockActivity().click_Stockname("600600.SH");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		View TAB = this.getViewById("linear_buttom");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 6 * 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(4)).getText().toString();
		String time2 = ((TextView) K.getChildAt(5)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);

		CaseCheck = this.EqualsChecked((60 < days) && (days < 300));
		System.out.println(CaseCheck);

	}

	public void testCase018() throws Exception {
		CaseName = "AB��_�����������K��";
		new F5StockActivity().click_Stockname("600600.SH");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		View TAB = this.getViewById("linear_buttom");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 6 * 5.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(4)).getText().toString();
		String time2 = ((TextView) K.getChildAt(5)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time2, time1);
		CaseCheck = this.EqualsChecked((300 < days) && (days < 1000));
		System.out.println(CaseCheck);

	}

	public void testCase019() throws Exception {
		CaseName = "AB��_����K���л���ʱ";
		new F5StockActivity().click_Stockname("600600.SH");
		
		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		
		View TAB1 = this.getViewById("linear_buttom");
		final int[] location1 = new int[2];
		TAB1.getLocationOnScreen(location1);
		solo.clickOnScreen(location[0], location[1]);
		solo.sleep(2000);

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("sland_speed")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();// ��ȡ��ʱ���ƿ���ʱ��
		String time2 = ((TextView) F5_time.getChildAt(5)).getText().toString();// ��ȡ��ʱ��������ʱ��
		String time3 = ((TextView) F5_time.getChildAt(6)).getText().toString();// ��ȡ��ʱ��������ʱ��

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:30")
				&& time2.equalsIgnoreCase("11:30/13:00")
				&& time3.equalsIgnoreCase("15:00"));// ����r�g
		System.out.println(CaseCheck);

	}

	public void testCase020() throws Exception {
		CaseName = "AB��_����ҳ��ѡ���ʱ����";
		new F5StockActivity().click_Stockname("600600.SH");

		View TAB = this.getViewById("speed_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		solo.clickOnScreen(location[0], location[1]);// �������ʱ��
		solo.sleep(2000);

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		ViewGroup F5_time = (ViewGroup) ((ViewGroup) this
				.getViewById("sland_speed")).getChildAt(1);
		String time1 = ((TextView) F5_time.getChildAt(4)).getText().toString();// ��ȡ��ʱ���ƿ���ʱ��
		String time2 = ((TextView) F5_time.getChildAt(5)).getText().toString();// ��ȡ��ʱ��������ʱ��
		String time3 = ((TextView) F5_time.getChildAt(6)).getText().toString();// ��ȡ��ʱ��������ʱ��

		CaseCheck = this.EqualsChecked(time1.equalsIgnoreCase("09:30")
				&& time2.equalsIgnoreCase("11:30/13:00")
				&& time3.equalsIgnoreCase("15:00"));// ����r�g
		System.out.println(CaseCheck);

	}

}