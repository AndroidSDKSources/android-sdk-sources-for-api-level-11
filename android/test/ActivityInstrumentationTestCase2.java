/*    */ package android.test;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.content.Intent;
/*    */ 
/*    */ public abstract class ActivityInstrumentationTestCase2<T extends Activity> extends ActivityTestCase
/*    */ {
/*    */   public ActivityInstrumentationTestCase2(String pkg, Class<T> activityClass)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ActivityInstrumentationTestCase2(Class<T> activityClass) { throw new RuntimeException("Stub!"); } 
/*  7 */   public T getActivity() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setActivityIntent(Intent i) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setActivityInitialTouchMode(boolean initialTouchMode) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void runTest() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.ActivityInstrumentationTestCase2
 * JD-Core Version:    0.6.0
 */