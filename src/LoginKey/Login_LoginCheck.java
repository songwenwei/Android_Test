//���Ե㣺��¼/��¼
package LoginKey;

import StockMasterBase.StockActivity;
import android.widget.Button;
import android.view.ViewGroup;
import android.widget.TextView;

//��¼�߼�/��¼У��
public class Login_LoginCheck extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "��ע����ֻ��ŵ�¼";
		Login("15651610158", "666666");
		ViewGroup swith = (ViewGroup) this.getViewById("titleViewLine");
		solo.clickOnView(swith);
		String name = ((TextView) this.getViewById("group_name")).getText()
				.toString();
		solo.clickOnView(swith);
		CaseCheck = this.EqualsChecked(name.equalsIgnoreCase("�ҵ���ѡ��"));
		System.out.println(CaseCheck);
	}

	public void testCase002() throws Exception {
		CaseName = "ʹ��������˺ŵ�¼";
		Login("QYS01302", "456123");
		ViewGroup swith = (ViewGroup) this.getViewById("titleViewLine");
		solo.clickOnView(swith);
		String name = ((TextView) this.getViewById("group_name")).getText()
				.toString();
		solo.clickOnView(swith);
		CaseCheck = this.EqualsChecked(name.equalsIgnoreCase("�ҵ���ѡ��"));
		System.out.println(CaseCheck);
	}

	public void testCase003() throws Exception {
		CaseName = "��iwind����ע����ֻ��ŵ�¼(iWind�˺�����)";
		Logout();
		windBottomTool("����");
		solo.scrollToTop();
		solo.clickOnText("�ҵ����");
		solo.enterText(0, "15077865916");
		solo.enterText(1, "123456");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();
		solo.clickOnText("ȷ��");
		String username = ((TextView) this.getViewById("login_username"))
				.getText().toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("��ΪiWindע���û�����ʹ��iWind�ʺŵ�¼!"))
				&& (button.equalsIgnoreCase("ȷ��"))
				&& (username.equalsIgnoreCase("slin@wind.com.cn")));
		System.out.println(CaseCheck);

	}

	public void testCase004() throws Exception {
		CaseName = "��iwind����ע����ֻ��ŵ�¼(��������)";
		Logout();
		windBottomTool("����");
		solo.scrollToTop();
		solo.clickOnText("�ҵ����");
		solo.enterText(0, "15077865916");
		solo.enterText(1, "111111");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();
		solo.clickOnText("ȷ��");
		String username = ((TextView) this.getViewById("login_username"))
				.getText().toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("��ΪiWindע���û�����ʹ��iWind�ʺŵ�¼!"))
				&& (button.equalsIgnoreCase("ȷ��"))
				&& (username.equalsIgnoreCase("slin@wind.com.cn")));
		System.out.println(CaseCheck);

	}

	public void testCase005() throws Exception {
		CaseName = "��iwind����ע����ֻ��ŵ�¼(�ֻ��˺�����)";
		Login("13770322050", "1234");
		ViewGroup swith = (ViewGroup) this.getViewById("titleViewLine");
		solo.clickOnView(swith);
		String name = ((TextView) this.getViewById("group_name")).getText()
				.toString();
		solo.clickOnView(swith);
		CaseCheck = this.EqualsChecked(name.equalsIgnoreCase("�ҵ���ѡ��"));
		System.out.println(CaseCheck);
	}

	public void testCase006() throws Exception {
		CaseName = "����iwind�˺Ų��ܵ�¼)";
		Logout();
		windBottomTool("����");
		solo.scrollToTop();
		solo.clickOnText("�ҵ����");
		solo.enterText(0, "iwindtest@163.com");
		solo.enterText(1, "123456");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);
		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("�����˺��ѹ��ڣ�����ϵ���Ŀͻ�����!"))
				&& (button.equalsIgnoreCase("ȷ��")));
		System.out.println(CaseCheck);

	}

	public void testCase007() throws Exception {
		CaseName = "iwind�˺ű����ò��ܵ�¼)";
		Logout();
		windBottomTool("����");
		solo.scrollToTop();
		solo.clickOnText("�ҵ����");
		solo.enterText(0, "iwindm4@163.com");
		solo.enterText(1, "123456");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("�����˺��ѱ����ã�����ϵ���Ŀͻ�����!"))
				&& (button.equalsIgnoreCase("ȷ��")));
		System.out.println(CaseCheck);

	}

	public void testCase008() throws Exception {
		CaseName = "ʹ��WFC�û�����¼";
		Logout();
		windBottomTool("����");
		solo.scrollToTop();
		solo.clickOnText("�ҵ����");
		solo.enterText(0, "W33655006");
		solo.enterText(1, "64413135");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("��ʹ��iwind�˺ŵ�¼!"))
				&& (button.equalsIgnoreCase("ȷ��")));
		System.out.println(CaseCheck);

	}

	public void testCase009() throws Exception {
		CaseName = "ʹ��WFT�û�����¼";
		Logout();
		windBottomTool("����");
		solo.scrollToTop();
		solo.clickOnText("�ҵ����");
		solo.enterText(0, "W0810340");
		solo.enterText(1, "123123");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("��ʹ��iwind�˺ŵ�¼!"))
				&& (button.equalsIgnoreCase("ȷ��")));
		System.out.println(CaseCheck);

	}

	public void testCase010() throws Exception {
		CaseName = "ʹ��WFC��iwind�˺ŵ�¼";
		Logout();
		windBottomTool("����");
		solo.scrollToTop();
		solo.clickOnText("�ҵ����");
		solo.enterText(0, "iwindm6@163.com");
		solo.enterText(1, "123456");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button1 = ((TextView) this.getViewById("button1")).getText()
				.toString();
		String button2 = ((TextView) this.getViewById("button2")).getText()
				.toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("Wind��Ѷ������רΪ�����û���Ƶ�APP���뼰ʱ������"))
				&& (button1.equalsIgnoreCase("�´ΰ�"))
				&& (button2.equalsIgnoreCase("����")));
		System.out.println(CaseCheck);

	}

	public void testCase011() throws Exception {
		CaseName = "ʹ��WFT��iwind�˺ŵ�¼";
		Logout();
		windBottomTool("����");
		solo.scrollToTop();
		solo.clickOnText("�ҵ����");
		solo.enterText(0, "iwindm1@163.com");
		solo.enterText(1, "123456");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button1 = ((TextView) this.getViewById("button1")).getText()
				.toString();
		String button2 = ((TextView) this.getViewById("button2")).getText()
				.toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("Wind��Ѷ������רΪ�����û���Ƶ�APP���뼰ʱ������"))
				&& (button1.equalsIgnoreCase("�´ΰ�"))
				&& (button2.equalsIgnoreCase("����")));
		System.out.println(CaseCheck);

	}

	
	public void testCase012() throws Exception {
		CaseName = "�û�����Ϊ�գ�����Ϊ�գ���¼";
		Logout();
		windBottomTool("����");
		solo.scrollToTop();
		solo.clickOnText("�ҵ����");
		solo.enterText(0, "15651610158");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this
				.EqualsChecked((message.equalsIgnoreCase("�˺Ż������벻��Ϊ��!"))
						&& (button.equalsIgnoreCase("ȷ��")));
		System.out.println(CaseCheck);

	}

	public void testCase013() throws Exception {
		CaseName = "�û���Ϊ�գ����벻Ϊ�գ���¼";
		Logout();
		windBottomTool("����");
		solo.scrollToTop();
		solo.clickOnText("�ҵ����");
		solo.enterText(1, "123123");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this
				.EqualsChecked((message.equalsIgnoreCase("�˺Ż������벻��Ϊ��!"))
						&& (button.equalsIgnoreCase("ȷ��")));
		System.out.println(CaseCheck);

	}

	public void testCase014() throws Exception {
		CaseName = "�û���Ϊ�գ�����Ϊ�գ���¼";
		Logout();
		windBottomTool("����");
		solo.scrollToTop();
		solo.clickOnText("�ҵ����");

		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this
				.EqualsChecked((message.equalsIgnoreCase("�˺Ż������벻��Ϊ��!"))
						&& (button.equalsIgnoreCase("ȷ��")));
		System.out.println(CaseCheck);

	}

	public void testCase015() throws Exception {
		CaseName = "�����û�������ȷ���룬��¼";
		Logout();
		windBottomTool("����");
		solo.scrollToTop();
		solo.clickOnText("�ҵ����");
		solo.enterText(0, "156516");
		solo.enterText(1, "666666");

		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this.EqualsChecked((message.equalsIgnoreCase("�˺Ż��������!"))
				&& (button.equalsIgnoreCase("ȷ��")));
		System.out.println(CaseCheck);

	}



}