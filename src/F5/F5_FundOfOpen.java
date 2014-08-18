//测试点：单券
package F5;

import com.robotium.solo.Solo;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.F5StockActivity;
import StockMasterBase.StockActivity;

//基金/基金即时走势/开放式基金
public class F5_FundOfOpen extends StockActivity {

	public void testCase001() throws Exception {
		CaseName = "进入开放式基金分时页面";
		new F5StockActivity().click_Stockname("000001.OF");

		String F5_title = ((TextView) this.getViewById("book_name")).getText()
				.toString();// 获取分时页面标题

		CaseCheck = this.EqualsChecked(F5_title.contains("华夏成长"));// 校验分时页面标题
		System.out.println(CaseCheck);

	}

	public void testCase002() throws Exception {
		CaseName = "指标数据刷新";
		new F5StockActivity().click_Stockname("000001.OF");
		CaseCheck = this.EqualsChecked(new F5StockActivity().ChangedListener("new_price"));// 现价指标数据刷新校验
		System.out.println(CaseCheck);
	}
}