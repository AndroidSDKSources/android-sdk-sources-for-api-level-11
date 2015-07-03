/*   */ package android.test;
/*   */ 
/*   */ import android.app.Activity;
/*   */ 
/*   */ public abstract class SingleLaunchActivityTestCase<T extends Activity> extends InstrumentationTestCase
/*   */ {
/*   */   public SingleLaunchActivityTestCase(String pkg, Class<T> activityClass)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public T getActivity() { throw new RuntimeException("Stub!"); } 
/* 7 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); } 
/* 8 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); } 
/* 9 */   public void testActivityTestCaseSetUpProperly() throws Exception { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.SingleLaunchActivityTestCase
 * JD-Core Version:    0.6.0
 */