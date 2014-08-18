//测试点：登录/登录
package LoginKey;

import StockMasterBase.StockActivity;
import android.widget.Button;
import android.view.ViewGroup;
import android.widget.TextView;

//登录逻辑/登录校验
public class Login_LoginCheck extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "已注册的手机号登录";
		Login("15651610158", "666666");
		ViewGroup swith = (ViewGroup) this.getViewById("titleViewLine");
		solo.clickOnView(swith);
		String name = ((TextView) this.getViewById("group_name")).getText()
				.toString();
		solo.clickOnView(swith);
		CaseCheck = this.EqualsChecked(name.equalsIgnoreCase("我的自选股"));
		System.out.println(CaseCheck);
	}

	public void testCase002() throws Exception {
		CaseName = "使用老万点账号登录";
		Login("QYS01302", "456123");
		ViewGroup swith = (ViewGroup) this.getViewById("titleViewLine");
		solo.clickOnView(swith);
		String name = ((TextView) this.getViewById("group_name")).getText()
				.toString();
		solo.clickOnView(swith);
		CaseCheck = this.EqualsChecked(name.equalsIgnoreCase("我的自选股"));
		System.out.println(CaseCheck);
	}

	public void testCase003() throws Exception {
		CaseName = "绑定iwind并已注册的手机号登录(iWind账号密码)";
		Logout();
		windBottomTool("互联");
		solo.scrollToTop();
		solo.clickOnText("我的万得");
		solo.enterText(0, "15077865916");
		solo.enterText(1, "123456");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();
		solo.clickOnText("确定");
		String username = ((TextView) this.getViewById("login_username"))
				.getText().toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("您为iWind注册用户，请使用iWind帐号登录!"))
				&& (button.equalsIgnoreCase("确定"))
				&& (username.equalsIgnoreCase("slin@wind.com.cn")));
		System.out.println(CaseCheck);

	}

	public void testCase004() throws Exception {
		CaseName = "绑定iwind并已注册的手机号登录(错误密码)";
		Logout();
		windBottomTool("互联");
		solo.scrollToTop();
		solo.clickOnText("我的万得");
		solo.enterText(0, "15077865916");
		solo.enterText(1, "111111");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();
		solo.clickOnText("确定");
		String username = ((TextView) this.getViewById("login_username"))
				.getText().toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("您为iWind注册用户，请使用iWind帐号登录!"))
				&& (button.equalsIgnoreCase("确定"))
				&& (username.equalsIgnoreCase("slin@wind.com.cn")));
		System.out.println(CaseCheck);

	}

	public void testCase005() throws Exception {
		CaseName = "绑定iwind并已注册的手机号登录(手机账号密码)";
		Login("13770322050", "1234");
		ViewGroup swith = (ViewGroup) this.getViewById("titleViewLine");
		solo.clickOnView(swith);
		String name = ((TextView) this.getViewById("group_name")).getText()
				.toString();
		solo.clickOnView(swith);
		CaseCheck = this.EqualsChecked(name.equalsIgnoreCase("我的自选股"));
		System.out.println(CaseCheck);
	}

	public void testCase006() throws Exception {
		CaseName = "过期iwind账号不能登录)";
		Logout();
		windBottomTool("互联");
		solo.scrollToTop();
		solo.clickOnText("我的万得");
		solo.enterText(0, "iwindtest@163.com");
		solo.enterText(1, "123456");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);
		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("您的账号已过期，请联系您的客户经理!"))
				&& (button.equalsIgnoreCase("确定")));
		System.out.println(CaseCheck);

	}

	public void testCase007() throws Exception {
		CaseName = "iwind账号被禁用不能登录)";
		Logout();
		windBottomTool("互联");
		solo.scrollToTop();
		solo.clickOnText("我的万得");
		solo.enterText(0, "iwindm4@163.com");
		solo.enterText(1, "123456");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("您的账号已被禁用，请联系您的客户经理!"))
				&& (button.equalsIgnoreCase("确定")));
		System.out.println(CaseCheck);

	}

	public void testCase008() throws Exception {
		CaseName = "使用WFC用户名登录";
		Logout();
		windBottomTool("互联");
		solo.scrollToTop();
		solo.clickOnText("我的万得");
		solo.enterText(0, "W33655006");
		solo.enterText(1, "64413135");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("请使用iwind账号登录!"))
				&& (button.equalsIgnoreCase("确定")));
		System.out.println(CaseCheck);

	}

	public void testCase009() throws Exception {
		CaseName = "使用WFT用户名登录";
		Logout();
		windBottomTool("互联");
		solo.scrollToTop();
		solo.clickOnText("我的万得");
		solo.enterText(0, "W0810340");
		solo.enterText(1, "123123");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this.EqualsChecked((message
				.equalsIgnoreCase("请使用iwind账号登录!"))
				&& (button.equalsIgnoreCase("确定")));
		System.out.println(CaseCheck);

	}

	public void testCase010() throws Exception {
		CaseName = "使用WFC的iwind账号登录";
		Logout();
		windBottomTool("互联");
		solo.scrollToTop();
		solo.clickOnText("我的万得");
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
				.equalsIgnoreCase("Wind资讯发布了专为机构用户设计的APP，请及时更换！"))
				&& (button1.equalsIgnoreCase("下次吧"))
				&& (button2.equalsIgnoreCase("下载")));
		System.out.println(CaseCheck);

	}

	public void testCase011() throws Exception {
		CaseName = "使用WFT的iwind账号登录";
		Logout();
		windBottomTool("互联");
		solo.scrollToTop();
		solo.clickOnText("我的万得");
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
				.equalsIgnoreCase("Wind资讯发布了专为机构用户设计的APP，请及时更换！"))
				&& (button1.equalsIgnoreCase("下次吧"))
				&& (button2.equalsIgnoreCase("下载")));
		System.out.println(CaseCheck);

	}

	
	public void testCase012() throws Exception {
		CaseName = "用户名不为空，密码为空，登录";
		Logout();
		windBottomTool("互联");
		solo.scrollToTop();
		solo.clickOnText("我的万得");
		solo.enterText(0, "15651610158");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this
				.EqualsChecked((message.equalsIgnoreCase("账号或者密码不能为空!"))
						&& (button.equalsIgnoreCase("确定")));
		System.out.println(CaseCheck);

	}

	public void testCase013() throws Exception {
		CaseName = "用户名为空，密码不为空，登录";
		Logout();
		windBottomTool("互联");
		solo.scrollToTop();
		solo.clickOnText("我的万得");
		solo.enterText(1, "123123");
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this
				.EqualsChecked((message.equalsIgnoreCase("账号或者密码不能为空!"))
						&& (button.equalsIgnoreCase("确定")));
		System.out.println(CaseCheck);

	}

	public void testCase014() throws Exception {
		CaseName = "用户名为空，密码为空，登录";
		Logout();
		windBottomTool("互联");
		solo.scrollToTop();
		solo.clickOnText("我的万得");

		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this
				.EqualsChecked((message.equalsIgnoreCase("账号或者密码不能为空!"))
						&& (button.equalsIgnoreCase("确定")));
		System.out.println(CaseCheck);

	}

	public void testCase015() throws Exception {
		CaseName = "错误用户名，正确密码，登录";
		Logout();
		windBottomTool("互联");
		solo.scrollToTop();
		solo.clickOnText("我的万得");
		solo.enterText(0, "156516");
		solo.enterText(1, "666666");

		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(2000);

		String message = ((TextView) this.getViewById("message")).getText()
				.toString();
		String button = ((TextView) this.getViewById("button1")).getText()
				.toString();

		CaseCheck = this.EqualsChecked((message.equalsIgnoreCase("账号或密码错误!"))
				&& (button.equalsIgnoreCase("确定")));
		System.out.println(CaseCheck);

	}



}