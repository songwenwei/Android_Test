package StockMasterBase;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import com.robotium.solo.Solo;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Instrumentation;
import android.os.SystemClock;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;


@SuppressLint("SdCardPath")
@SuppressWarnings("rawtypes")
public class StockActivity extends ActivityInstrumentationTestCase2 {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public StockActivity() {
		super(TARGET_PACKAGE_ID, launcherActivityClass);
		// TODO Auto-generated constructor stub
		
	}

	private static final String TARGET_PACKAGE_ID = "wind.android";
	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "wind.android.WiAndroidAppDelegate";

	private static Class<?> launcherActivityClass;
	static {
		try {
			launcherActivityClass = Class
					.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	protected static Solo solo;

	@Override
	protected void setUp() throws Exception {
		
		solo = new Solo(getInstrumentation(), getActivity());

		solo.sleep(2000);
		if(this.windLoginiwind())
			solo.clickOnButton("下次吧");
		
		if(this.windAPPisError())
			solo.clickOnButton("取消");
	
	}

	@Override
	protected void tearDown() throws Exception {	
		
		moudulepath=moudulepath+this.getName();
		moudulepath=(this.getClass().toString()+"#").substring(5)+this.getName();
		if(windAPPisError())
			CaseCheck=this.EqualsChecked(false);
		this.WriteLog(CaseName, CaseCheck);
		
		moudulepath=(this.getClass().toString()+"#").substring(5);	
		
		this.windWaitForMainActivity();
		
		try {
			solo.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	// 获取资源ID
	protected int getSourceID(String sourceName) {
		
			return getSource(sourceName);	
	}
	
	protected int getSource(String sourceName) 
	{
		Activity act = solo.getCurrentActivity();
		int viewid=0;
		for(int i=0;i<6;i++)
		{
			try
			{
			   viewid= act.getResources().getIdentifier(sourceName, "id",TARGET_PACKAGE_ID);
			}
			catch(Exception e)
			{
				//Log.v("WindTest",viewid+":::::");
			}
			if(viewid!=0)
				break;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(viewid == 0){
			viewid= act.getResources().getIdentifier(sourceName, "id","android");
		}
		return viewid;
	}

	// 根据 hierarchyviewer 显示的ID来定位view
	protected View getViewById(String idName) throws Exception {
		View view=solo.getView(getSourceID(idName));
		
		 return view;
	}

	// 根据ID点击view
	protected void clickViewByName(String idname) throws Exception {
		try {

			Activity act = solo.getCurrentActivity();
			int id = act.getResources().getIdentifier(idname, "id",
					TARGET_PACKAGE_ID);
			View view = solo.getView(id);
			solo.clickOnView(view);
		} catch (Exception ex) {

		}
	}

	// 读写日志
	protected static String CaseName = "无";
	protected static String CaseCheck ="异常";
	protected static String moudulepath ="";
	@SuppressLint("SimpleDateFormat")
	protected void WriteLog(String CaseName, String CaseChecked) {
		String CaseCheckedTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		String LogTime = new SimpleDateFormat("yy-MM-dd").format(Calendar.getInstance().getTime());
		if (!CaseChecked.equalsIgnoreCase("异常")) 
		{	
			if (CaseChecked.equalsIgnoreCase("成功"))
				CaseName =moudulepath+"#"+CaseCheckedTime + "#" + CaseName + "##成功" + "\n";
			else
				CaseName =moudulepath+"#"+ CaseCheckedTime + "#" + CaseName + "##失败" + "\n";
			try {
				FileOutputStream fs = new FileOutputStream("/sdcard/Stock_Test"+LogTime+".txt", true);
				fs.write(CaseName.getBytes());
				fs.flush();
				fs.close();
			} catch (IOException ex) {
				// Log.v("MMM","the file cannot be opened for writing.");
			}
		}

		else 
		{
			CaseName =moudulepath+"#"+ CaseCheckedTime + "#" + CaseName + "##异常" + "\n";
			try {
				FileOutputStream fs = new FileOutputStream("/sdcard/Stock_Test"+LogTime+".txt", true);
				fs.write(CaseName.getBytes());
				fs.flush();
				fs.close();
			} catch (IOException ex) {
				// Log.v("MMM","the file cannot be opened for writing.");
			}
		}
		CaseCheck = "异常";
		
	}

	// 字符串比较
	protected String EqualsChecked(String s1, String s2) {
		moudulepath=moudulepath+this.getName();
		if (s1.equals(s2))
			return "成功";
		else
			return "失败";

	}

	// float比较
	protected String EqualsChecked(float s1, float s2) {
		moudulepath=moudulepath+this.getName();
		if (s1 == s2)
			return "成功";
		else
			return "失败";
	}

	// 布尔型比较
	protected String EqualsChecked(boolean b) {
		moudulepath=moudulepath+this.getName();
		if (b)
			return "成功";
		else
			return "失败";
	}

	// 登录
	public void Login(String username, String pwd) throws Exception {
		Logout();
		this.windBottomTool("互联");
		/*ViewGroup lt = (ViewGroup) ((ViewGroup) this.getViewById("wm_login")).getChildAt(0);
		TextView wm_login = (TextView) lt.findViewById(getSourceID("roundRectItemLeftLabel"));
		String s = wm_login.getText().toString();*/
		solo.clickOnView(this.getViewById("wm_login"));
		
		//EditText login_username=(EditText)this.getViewById("login_username");
        //EditText login_password=(EditText)this.getViewById("login_password");

        solo.typeText(0, username);;
        solo.clickOnView(this.getViewById("titleView"));
        solo.typeText(1, pwd);
		solo.clickOnView(this.getViewById("login_login_button"));
		solo.sleep(3000);
		this.windWaitForMainActivity();
	}

	// 注销
	public void Logout() throws Exception {

		// 登录验证
		//Log.v("WindTest","进来了");
		windBottomTool("互联");
		//Log.v("WindTest","到探索了");
		ViewGroup lt = (ViewGroup) ((ViewGroup) this.getViewById("wm_login")).getChildAt(0);
		TextView wm_login = (TextView) lt.findViewById(getSourceID("roundRectItemRightLabel"));
		String s = wm_login.getText().toString();
		//Log.v("WindTest",s);
		if(!s.equals("未登录"))
		//if(!solo.searchText("我的万得"))
		{
			solo.clickOnText("设置");
			// 登录页面元素获取
			solo.scrollDown();
			solo.clickOnView(this.getViewById("loginOut"));
			solo.clickOnView(this.getViewById("button2"));
			//判断登录提示框是否消失
			for(int i=0;i<5;i++)
			{
				solo.sleep(500);
				if (solo.waitForActivity("WiAndroidAppDelegate",500)||solo.waitForActivity("MainLaunchActivity",500))
					{
						break;
					}
			}
		}

		//Log.v("WindTest","结束");
	}
	


	/*
	 * @SuppressLint("Recycle") public void Wind_Drag(float from_x,float
	 * from_y,float to_x,float to_y ) throws Exception {
	 * //获得视图View中手机屏幕上的绝对x、y坐标 try {
	 * 
	 * public static MotionEvent obtain（long downtime,long eventtime,int
	 * action,int pointerCount）
	 * 
	 * 
	 * 
	 * MotionEvent event = MotionEvent.obtain(1000, 1000,
	 * MotionEvent.ACTION_DOWN,from_x,from_y,0); Instrumentation inst = new
	 * Instrumentation(); inst.sendPointerSync(event); //发送点的响应事件
	 * 
	 * 
	 * //延迟一秒，模拟长按操作
	 * 
	 * //xStop加了10点坐标，获得的View坐标需根据应用实际情况稍做一点调整 event = MotionEvent.obtain(1000,
	 * 1000, MotionEvent.ACTION_MOVE,to_x,to_y,0); inst.sendPointerSync(event);
	 * 
	 * //又再小小移动了一次，不这么做的话可以无法激活被测应用状态，导致View移动后又回复到原来位置 //event =
	 * MotionEvent.obtain(downTime, eventTime, MotionEvent.ACTION_MOVE,
	 * xStop+10f, yStop+10f, 0); //inst.sendPointerSync(event);
	 * 
	 * event = MotionEvent.obtain(1000, 1000, MotionEvent.ACTION_UP, to_x, to_y,
	 * 0); inst.sendPointerSync(event); } catch (Exception ignored) { // Handle
	 * exceptions if necessary } }
	 */
	
	//*name：自选、新闻、市场、机会、互联*/
	public void windBottomTool(String name) throws Exception {
		
		this.windWaitForMainActivity();
		int a =0;
		for(int i=0;i<6;i++)
			{
				solo.sleep(1000);
				a=((ViewGroup) this.getViewById("toolLayout")).getChildCount();
				if(a>0)
					break;
			}
		
		int b = 0;
		if (name.equalsIgnoreCase("自选"))
			b = 0;
		if (name.equalsIgnoreCase("新闻"))
			b = 1;
		if (name.equalsIgnoreCase("市场"))
			b = 2;
		if (name.equalsIgnoreCase("机会"))
			b = 3;
		if (name.equalsIgnoreCase("互联"))
			b = 4;
			
		solo.clickOnView(((ViewGroup) this.getViewById("toolLayout")).getChildAt(b));
		solo.sleep(500);
		
	}

	// 控件拖拽替换位置
	public void windSwitchPosition(View v1, View v2) {
		int[] A_TitleItem = new int[2];
		int[] B_TitleItem = new int[2];
		v1.getLocationOnScreen(A_TitleItem);
		v2.getLocationOnScreen(B_TitleItem);
		solo.drag(A_TitleItem[0] + 5, B_TitleItem[0] + 15, A_TitleItem[1] + 5,
				B_TitleItem[1] + 5, 10);
	}

	// 控件拖拽替换位置 horizontally水平便宜量、垂直偏移量
	public void windSwitchPosition(View v1, View v2, int horizontally,
			int vertically) {
		int[] A_TitleItem = new int[2];
		int[] B_TitleItem = new int[2];
		v1.getLocationOnScreen(A_TitleItem);
		v2.getLocationOnScreen(B_TitleItem);
		solo.drag(A_TitleItem[0] + 3, B_TitleItem[0] + horizontally,
				A_TitleItem[1] + 3, B_TitleItem[1] + vertically, 10);
	}

	public int[] windViewPosition(View v1) {
		int[] A_TitleItem = new int[2];

		v1.getLocationOnScreen(A_TitleItem);
		// Log.v("WindTest", A_TitleItem[0]+"：："+A_TitleItem[1]);

		A_TitleItem[0] = A_TitleItem[0] + 5;
		A_TitleItem[1] = A_TitleItem[1] + 5;
		// Log.v("WindTest", A_TitleItem[0]+"--"+A_TitleItem[1]);
		return A_TitleItem;
		
	}
	
	public void windWaitForMainActivity()
	{	
		for(int i=0;i<3;i++)
		{
			if(!solo.waitForActivity("MainLaunchActivity",500)&&!solo.waitForActivity("WiAndroidAppDelegate",500))
			{
				Activity a = solo.getCurrentActivity();
				a.finish();
				
			}
		}
	}
	public void windEnterTimeShare(String windcode) throws Exception
	{
		windStockSearch(windcode);
		solo.clickOnText(windcode,2);
		/*ViewGroup search_result_list=(ViewGroup)this.getViewById("search_result_list");
		solo.clickOnView(search_result_list.getChildAt(0));*/
		solo.sleep(1000);
	}
	public void windStockSearch(String windcode) throws Exception
	{
		this.windBottomTool("市场");
		View search=this.getViewById("rightViewLine");
		solo.clickOnView(search);
		//EditText textField_editText=(EditText)this.getViewById("textField_editText");
		solo.clearEditText(0);
		solo.enterText(0,windcode);
		
	}
	
	
	public void windDeleteAllShares() throws Exception
	{
		//删除当前板块的所有自选股
		this.windBottomTool("自选");
		ViewGroup optional_info_tabbar=(ViewGroup)this.getViewById("optional_info_tabbar");
		solo.clickOnView(optional_info_tabbar.getChildAt(4));
		solo.sleep(1000);//加载数据
		
		String tipcontent="暂无盈亏数据，请先设置您的头寸";
		if(!solo.getCurrentViews(Button.class).isEmpty())
			solo.clickOnButton("确定");
		else
		{
			View optionaledit=this.getViewById("rightViewLine");
			solo.clickOnView(optionaledit);
		}
				
		solo.sleep(1000);
		while(true)
		{
			ViewGroup editView=(ViewGroup)((ViewGroup)this.getViewById("editView")).getChildAt(1);
			int sharescount=0;View deletebutton=null;
			sharescount=editView.getChildCount();
			Log.v("WindTest",sharescount+"");
			if(sharescount!=0)
			{
				if(sharescount>5)
				{
					for(int i=0;i<5;i++)
					{
						deletebutton=editView.getChildAt(i).findViewById(this.getSourceID("deleteImage"));
						solo.clickOnView(deletebutton);
					}
					solo.clickOnText("删除自选");
				}
				else
				{
					for(int i=0;i<sharescount;i++)
					{
						deletebutton=editView.getChildAt(i).findViewById(this.getSourceID("deleteImage"));
						solo.clickOnView(deletebutton);
					}
					solo.clickOnText("删除自选");
				}
				
			}
			else
				break;
		}
		solo.clickOnText("完成");
	}
	


	public void windF5DragToLeft() throws Exception
	{
		View toppriceview= this.getViewById("linearlayout_top");
		int []toppriceview_location={0,0};
		int[] tabBar_size={0,0};
		toppriceview.getLocationOnScreen(toppriceview_location);
		tabBar_size[0]=toppriceview.getWidth();
		tabBar_size[1]=toppriceview.getHeight();
		int x1=toppriceview_location[0]+tabBar_size[0]/5*4;
		int x2=toppriceview_location[0]+tabBar_size[0]/5;
		int y1=toppriceview_location[1]+tabBar_size[1]/2;
		int y2=toppriceview_location[1]+tabBar_size[1]/2;
		solo.drag(x1,x2,y1,y2,10);
		
	}
	
	public void windF5DragToRight() throws Exception
	{
		View toppriceview= this.getViewById("linearlayout_top");
		int []toppriceview_location={0,0};
		int[] tabBar_size={0,0};
		toppriceview.getLocationOnScreen(toppriceview_location);
		tabBar_size[0]=toppriceview.getWidth();
		tabBar_size[1]=toppriceview.getHeight();
		int x1=toppriceview_location[0]+tabBar_size[0]/5;
		int x2=toppriceview_location[0]+tabBar_size[0]/5*4;
		int y1=toppriceview_location[1]+tabBar_size[1]/2;
		int y2=toppriceview_location[1]+tabBar_size[1]/2;
		solo.drag(x1,x2,y1,y2,10);
		
		
	}
	// 登录
	public void iwindLogin(String username, String pwd) throws Exception {
              Logout();
              this.windBottomTool("互联");
              /*
               * ViewGroup lt = (ViewGroup) ((ViewGroup)
               * this.getViewById("wm_login")).getChildAt(0); TextView wm_login =
               * (TextView) lt.findViewById(getSourceID("roundRectItemLeftLabel"));
               * String s = wm_login.getText().toString();
               */
              //solo.clickOnText("我的万得");
              solo.clickOnView(this.getViewById("wm_login"));
              
             // EditText login_username=(EditText)this.getViewById("login_username");
             // EditText login_password=(EditText)this.getViewById("login_password");
             
              solo.typeText(0, username);
          
              solo.typeText(1, pwd);
            
              solo.clickOnView(this.getViewById("login_login_button"));
              solo.sleep(3000);
              if(this.windLoginiwind())
            	  solo.clickOnButton("下次吧");
              this.windWaitForMainActivity();
              
             
    }

    // 注销
    public void iwindLogout() throws Exception {

              // 登录验证
              // Log.v("WindTest","进来了");
              windBottomTool("互联");
              // Log.v("WindTest","到探索了");
              ViewGroup lt = (ViewGroup) ((ViewGroup) this.getViewById("wm_login"))
                                .getChildAt(0);
              TextView wm_login = (TextView) lt
                                .findViewById(getSourceID("roundRectItemRightLabel"));
              String s = wm_login.getText().toString();
              // Log.v("WindTest",s);
              if (!s.equals("未登录"))
              // if(!solo.searchText("我的万得"))
              {
                       solo.clickOnText("设置");
                       // 登录页面元素获取
                       solo.scrollDown();
                       solo.clickOnView(this.getViewById("loginOut"));
                       solo.clickOnView(this.getViewById("button2"));
                       // 判断登录提示框是否消失
                       for (int i = 0; i < 10; i++) {
                                if (solo.waitForActivity("WiAndroidAppDelegate", 500)
                                                   || solo.waitForActivity("MainLaunchActivity", 500)) {
                                          break;
                                }
                       }
              }

    }

    public View windGetView(String  id)
    {
    	int viewid=this.getSourceID(id);
    	final Activity activity=solo.getCurrentActivity();
    	View viewToReturn=activity.findViewById(viewid);
		return viewToReturn;
    }

    
    public boolean windAPPisError()
    {
    	
    	
    	if(!solo.getCurrentViews(Button.class).isEmpty())
    	{
    		
    		if(!solo.getCurrentViews(TextView.class).isEmpty())
    			{	String tip=solo.getCurrentViews(TextView.class).get(0).getText()+"";
    				
    				if(tip.equalsIgnoreCase("提示"))
    				{
    					String content=solo.getCurrentViews(TextView.class).get(1).getText()+"";
    					
    					if(content.contains("应用程序在上一次使用时"))
    						return true;
    				}
    			}
    	}	
    	
    		return false;
    }
    

    public boolean windLoginiwind()
    {	
    	if(!solo.getCurrentViews(Button.class).isEmpty())
    	{

    		if(!solo.getCurrentViews(TextView.class).isEmpty())
    			{	String tip=solo.getCurrentViews(TextView.class).get(0).getText()+"";
    				
    				if(tip.equalsIgnoreCase("提示"))
    				{
    				
    					String content=solo.getCurrentViews(TextView.class).get(1).getText()+"";
    				//	Log.v("WindTest",content);
    					if(content.contains("Wind资讯发布了专为机构用户设计的APP"))
    							return true;
    				}
    			}
    	}	
    		return false;
    }
    
    public void windDataReq()
    {
    	ArrayList<ProgressBar> pb;
    	pb=solo.getCurrentViews(ProgressBar.class);
    	int count=0;
    	while(!pb.isEmpty())
    	{
    		solo.sleep(1000);
    		count++;
    		if(count>3)
    			break;
    	}
    }
    
    
    public boolean windOptionalTip()
    {	
    	if(!solo.getCurrentViews(Button.class).isEmpty())
    	{

    		if(!solo.getCurrentViews(TextView.class).isEmpty())
    			{	String tip=solo.getCurrentViews(TextView.class).get(0).getText()+"";
    				
    				if(tip.equalsIgnoreCase("温馨提示"))
    				{
    				
    					String content=solo.getCurrentViews(TextView.class).get(1).getText()+"";
    				//	Log.v("WindTest",content);
    					if(content.contains("登录账号，云端存储自选股"))
    							return true;
    				}
    			}
    	}	
    		return false;
    }
    
    //----------------------
    private String windowManagerString;
	private void setWindowManagerString(){

		if (android.os.Build.VERSION.SDK_INT >= 17) {
			windowManagerString = "sDefaultWindowManager";
			
		} else if(android.os.Build.VERSION.SDK_INT >= 13) {
			windowManagerString = "sWindowManager";

		} else {
			windowManagerString = "mWindowManager";
		}
	}
	private static Class<?> windowManager;
	static{
		try {
			String windowManagerClassName;
			if (android.os.Build.VERSION.SDK_INT >= 17) {
				windowManagerClassName = "android.view.WindowManagerGlobal";
			} else {
				windowManagerClassName = "android.view.WindowManagerImpl"; 
			}
 			windowManager = Class.forName(windowManagerClassName);

		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public View[] getWindowDecorViews()
	{
		this.setWindowManagerString();
		Field viewsField;
		Field instanceField;
		try {
			viewsField = windowManager.getDeclaredField("mViews");
			instanceField = windowManager.getDeclaredField(windowManagerString);
			viewsField.setAccessible(true);
			instanceField.setAccessible(true);
			Object instance = instanceField.get(null);
			View[] result;
			if (android.os.Build.VERSION.SDK_INT >= 19) {
				result = ((ArrayList<View>) viewsField.get(instance)).toArray(new View[0]);
			} else {
				result = (View[]) viewsField.get(instance);
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

    
}
