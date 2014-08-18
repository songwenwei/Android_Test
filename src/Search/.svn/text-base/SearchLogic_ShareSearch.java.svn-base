package Search;

import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;
import StockMasterBase.StockActivity;

public class SearchLogic_ShareSearch extends StockActivity {
	
	public void testCase001() throws Exception {
		CaseName="代码检索";
		String windcode="600";String code=null;
		this.windStockSearch(windcode);
		
		ViewGroup search_result_list=(ViewGroup)this.getViewById("search_result_list");
		int count=search_result_list.getChildCount();
		
		TextView windcodeView=null;
		boolean searchcheck=false;
		for(int i=0;i<count;i++)
		{	
			windcodeView=(TextView)search_result_list.getChildAt(i).findViewById(getSourceID("wind_code"));
			code=windcodeView.getText().toString();
			if(!code.contains(windcode))
				{
					searchcheck=false;
					break;
				}
			else
				searchcheck=true;
			//只校验5只
			if(i>5)
				break;
		}
		
		CaseCheck=this.EqualsChecked(searchcheck);
	}
	
	public void testCase002() throws Exception {
		CaseName="名称检索";
		String stock_name="中国";String code=null;
		this.windStockSearch(stock_name);
		
		ViewGroup search_result_list=(ViewGroup)this.getViewById("search_result_list");
		int count=search_result_list.getChildCount();
		
		TextView windcodeView=null;
		boolean searchcheck=false;
		for(int i=0;i<count;i++)
		{	
			windcodeView=(TextView)search_result_list.getChildAt(i).findViewById(getSourceID("stock_name"));
			code=windcodeView.getText().toString();
			if(!code.contains(stock_name))
				{
					searchcheck=false;
					break;
				}
			else
				searchcheck=true;
			//只校验5只
			if(i>5)
				break;
		}
		
		CaseCheck=this.EqualsChecked(searchcheck);
		
		//Log.v("WindTest",CaseCheck);
	}
	
	public void testCase003() throws Exception {
		CaseName="拼音检索";
		String stock_name="dzh";String code=null;
		this.windStockSearch(stock_name);
		
		ViewGroup search_result_list=(ViewGroup)this.getViewById("search_result_list");
		int count=search_result_list.getChildCount();
		
		TextView windcodeView=null;
		boolean searchcheck=false;
		for(int i=0;i<count;i++)
		{	
			windcodeView=(TextView)search_result_list.getChildAt(i).findViewById(getSourceID("stock_name"));
			code=windcodeView.getText().toString();
			if(code.contains("大智慧"))
				{
					searchcheck=true;
					break;
				}
		}
		
		CaseCheck=this.EqualsChecked(searchcheck);
		
	}
	
	
}
