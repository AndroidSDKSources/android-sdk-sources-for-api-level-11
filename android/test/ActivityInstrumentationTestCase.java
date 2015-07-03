/*    */ package android.test;
/*    */ 
/*    */ import android.app.Activity;
/*    */ 
/*    */ @Deprecated
/*    */ public abstract class ActivityInstrumentationTestCase<T extends Activity> extends ActivityTestCase
/*    */ {
/*    */   public ActivityInstrumentationTestCase(String pkg, Class<T> activityClass)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public ActivityInstrumentationTestCase(String pkg, Class<T> activityClass, boolean initialTouchMode) { throw new RuntimeException("Stub!"); } 
/*  8 */   public T getActivity() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); } 
/* 11 */   public void testActivityTestCaseSetUpProperly() throws Exception { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.ActivityInstrumentationTestCase
 * JD-Core Version:    0.6.0
 */