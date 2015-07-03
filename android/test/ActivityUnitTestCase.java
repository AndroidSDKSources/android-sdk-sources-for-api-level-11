/*    */ package android.test;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.app.Application;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ 
/*    */ public abstract class ActivityUnitTestCase<T extends Activity> extends ActivityTestCase
/*    */ {
/*    */   public ActivityUnitTestCase(Class<T> activityClass)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public T getActivity() { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); } 
/*  8 */   protected T startActivity(Intent intent, Bundle savedInstanceState, Object lastNonConfigurationInstance) { throw new RuntimeException("Stub!"); } 
/*  9 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setApplication(Application application) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setActivityContext(Context activityContext) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getRequestedOrientation() { throw new RuntimeException("Stub!"); } 
/* 13 */   public Intent getStartedActivityIntent() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getStartedActivityRequest() { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean isFinishCalled() { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getFinishedActivityRequest() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.ActivityUnitTestCase
 * JD-Core Version:    0.6.0
 */