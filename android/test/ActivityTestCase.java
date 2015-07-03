/*   */ package android.test;
/*   */ 
/*   */ import android.app.Activity;
/*   */ 
/*   */ public abstract class ActivityTestCase extends InstrumentationTestCase
/*   */ {
/*   */   public ActivityTestCase()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   protected Activity getActivity() { throw new RuntimeException("Stub!"); } 
/* 7 */   protected void setActivity(Activity testActivity) { throw new RuntimeException("Stub!"); } 
/* 8 */   protected void scrubClass(Class<?> testCaseClass) throws IllegalAccessException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.ActivityTestCase
 * JD-Core Version:    0.6.0
 */