package LoginKey;

import java.util.Random;

import android.widget.Button;
import android.widget.EditText;

import StockMasterBase.StockActivity;

public class Logon extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "注册新号码";
		Random r = new Random();
		String phoneNo = null;
		int No = 0;
		while (true) {
			No = r.nextInt(100000000);
			if (No > 10000000)
				break;
		}
		phoneNo = "139" + No;
		this.Logout();
		this.windBottomTool("互联");
		solo.clickOnView(this.getViewById("roundRectItemRightLabel"));
		solo.clickOnView(this.getViewById("login_register_button"));
		EditText register_phonenumber = (EditText) this
				.getViewById("register_phonenumber");
		solo.clearEditText(register_phonenumber);
		solo.typeText(register_phonenumber, phoneNo);
		solo.clickOnView(this.getViewById("register_submit"));
		if (!solo.getCurrentViews(Button.class).isEmpty())
			solo.clickOnButton("确定");

		EditText login_username = (EditText) this.getViewById("login_username");
		CaseCheck = this.EqualsChecked(phoneNo.equalsIgnoreCase(login_username
				.getText().toString()));

	}

	public void testCase002() throws Exception {
		CaseName = "股票专家-注册界面返回";
		this.Logout();
		this.windBottomTool("互联");
		solo.clickOnView(this.getViewById("roundRectItemRightLabel"));
		solo.clickOnView(this.getViewById("login_register_button"));
		solo.sleep(1500);
		solo.clickOnView(this.getViewById("leftView"));
		solo.sleep(1500);
		CaseCheck = this.EqualsChecked(!this.windAPPisError());

	}

}
