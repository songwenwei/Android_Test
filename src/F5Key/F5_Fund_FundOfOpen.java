//���Ե㣺��ȯ
package F5Key;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//����/����ʽ����
public class F5_Fund_FundOfOpen extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "����ʽ����_�����������";
		new F5StockActivity().click_Stockname("000001.OF");
		solo.scrollDown();
		View TAB = this.getViewById("view_tab");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);

		String investYear = ((TextView) this.getViewById("investYear"))
				.getText().toString();
		String manageResume = ((TextView) this.getViewById("manageResume"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(investYear.contains("Ͷ������")
				&& manageResume.contains("��ѧ"));
		System.out.println(CaseCheck);
	}

	public void testCase002() throws Exception {
		CaseName = "����ʽ����_���������˾��";
		new F5StockActivity().click_Stockname("000001.OF");
		solo.scrollDown();
		View TAB = this.getViewById("view_tab");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		String product_name = ((TextView) this.getViewById("product_name"))
				.getText().toString();
		String textView1_1 = ((TextView) this.getViewById("textView1_1"))
				.getText().toString();
		String textView2_1 = ((TextView) this.getViewById("textView2_1"))
				.getText().toString();

		CaseCheck = this.EqualsChecked((product_name.equalsIgnoreCase("���Ļ���"))
				&& (textView1_1.equalsIgnoreCase("��������"))
				&& (textView2_1.equalsIgnoreCase("Ͷ���ܼ�")));
		System.out.println(CaseCheck);

	}

	public void testCase003() throws Exception {
		CaseName = "����ʽ����_��������š�";
		new F5StockActivity().click_Stockname("000001.OF");
		solo.scrollDown();
		View TAB = this.getViewById("view_tab");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 4 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		String newstitle_time = ((TextView) this.getViewById("newstitle_time"))
				.getText().toString();
		String newstitle_text = ((TextView) this.getViewById("newstitle_text"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(!newstitle_time.equalsIgnoreCase("--")
				&& !newstitle_text.equalsIgnoreCase("--"));
		System.out.println(CaseCheck);
	}


	public void testCase004() throws Exception {
		CaseName = "����ʽ����_�����������";
		new F5StockActivity().click_Stockname("000001.OF");

		View Search = (View) this.getViewById("rightViewLine");
		solo.clickOnView(Search);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("����"));
		System.out.println(CaseCheck);
	}

	public void testCase005() throws Exception {
		CaseName = "����ʽ����_��������ء�";
		new F5StockActivity().click_Stockname("000001.OF");

		View Back = (View) this.getViewById("leftView");
		solo.clickOnView(Back);
		solo.sleep(2000);

		String search_title = ((TextView) this.getViewById("titleView"))
				.getText().toString();

		CaseCheck = this.EqualsChecked(search_title.contains("����"));
		System.out.println(CaseCheck);
	}

	public void testCase006() throws Exception {
		CaseName = "����ʽ����_������ѡ";
		
		this.windDeleteAllShares();
		
		new F5StockActivity().click_Stockname("000001.OF");

		View Gointo = (View) this.getViewById("speed_text_view");
		solo.clickOnView(Gointo);// ����������ѡ��

		View Back = (View) this.getViewById("buttonLine");
		solo.clickOnView(Back);// ��������ء�

		windBottomTool("��ѡ");// �������ѡ��

		CaseCheck = this.EqualsChecked(solo.searchText("���ĳɳ�"));
		System.out.println(CaseCheck);
	}

	public void testCase007() throws Exception {
		CaseName = "����ʽ����_������������ȡ�";
		new F5StockActivity().click_Stockname("000001.OF");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		View TAB = this.getViewById("speed_land_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		solo.clickOnScreen(location[0], location[1]);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(5)).getText().toString();
		String time2 = ((TextView) K.getChildAt(6)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time1, time2);

		CaseCheck = this.EqualsChecked(days < 100
				&& !time1.equalsIgnoreCase("0000-00-00")
				&& !time2.equalsIgnoreCase("0000-00-00"));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);

	}

	public void testCase008() throws Exception {
		CaseName = "����ʽ����_������������꡿";
		new F5StockActivity().click_Stockname("000001.OF");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		View TAB = this.getViewById("speed_land_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(2000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(5)).getText().toString();
		String time2 = ((TextView) K.getChildAt(6)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time1, time2);

		CaseCheck = this.EqualsChecked((100 < days) && (days < 200));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);

	}

	public void testCase009() throws Exception {
		CaseName = "����ʽ����_���������һ�꡿";
		new F5StockActivity().click_Stockname("000001.OF");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		View TAB = this.getViewById("speed_land_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 2.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(3000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(5)).getText().toString();
		String time2 = ((TextView) K.getChildAt(6)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time1, time2);

		CaseCheck = this.EqualsChecked((300 < days) && (days < 400));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);

	}

	public void testCase010() throws Exception {
		CaseName = "����ʽ����_������������꡿";
		new F5StockActivity().click_Stockname("000001.OF");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		View TAB = this.getViewById("speed_land_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 3.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(4000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(5)).getText().toString();
		String time2 = ((TextView) K.getChildAt(6)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time1, time2);

		CaseCheck = this.EqualsChecked((900 < days) && (days < 1200));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);

	}

	public void testCase011() throws Exception {
		CaseName = "����ʽ����_�������������������";
		new F5StockActivity().click_Stockname("000001.OF");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		View TAB = this.getViewById("speed_land_tabbar");
		final int[] location = new int[2];
		TAB.getLocationOnScreen(location);
		final int viewWidth = TAB.getWidth();
		float x = location[0] + (viewWidth / 5 * 4.0f);
		float y = location[1];
		solo.clickOnScreen(x, y);
		solo.sleep(3000);

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(5)).getText().toString();
		String time2 = ((TextView) K.getChildAt(6)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time1, time2);

		CaseCheck = this
				.EqualsChecked(((time2.contains("01-01")
						|| (time2.contains("01-02")) || (time2
						.contains("01-03"))) && (days < 400)));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);

	}

	public void testCase012() throws Exception {
		CaseName = "����ʽ����_�������";
		new F5StockActivity().click_Stockname("000001.OF");

		solo.setActivityOrientation(Solo.LANDSCAPE);// ������ʾ

		ViewGroup K = (ViewGroup) ((ViewGroup) this.getViewById("sland_speed"))
				.getChildAt(0);

		String time1 = ((TextView) K.getChildAt(5)).getText().toString();
		String time2 = ((TextView) K.getChildAt(6)).getText().toString();

		new F5StockActivity();
		long days = F5StockActivity.getQuot(time1, time2);

		CaseCheck = this.EqualsChecked(days < 100
				&& !time1.equalsIgnoreCase("0000-00-00")
				&& !time2.equalsIgnoreCase("0000-00-00"));
		System.out.println(CaseCheck);
		solo.setActivityOrientation(solo.PORTRAIT);

	}

}