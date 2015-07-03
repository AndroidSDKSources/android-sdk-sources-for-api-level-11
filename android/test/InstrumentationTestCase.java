/*    */ package android.test;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.app.Instrumentation;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import junit.framework.TestCase;
/*    */ 
/*    */ public class InstrumentationTestCase extends TestCase
/*    */ {
/*    */   public InstrumentationTestCase()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void injectInstrumentation(Instrumentation instrumentation) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void injectInsrumentation(Instrumentation instrumentation) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Instrumentation getInstrumentation() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final <T extends Activity> T launchActivity(String pkg, Class<T> activityCls, Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final <T extends Activity> T launchActivityWithIntent(String pkg, Class<T> activityCls, Intent intent) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void runTestOnUiThread(Runnable r) throws Throwable { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void runTest() throws Throwable { throw new RuntimeException("Stub!"); } 
/* 13 */   public void sendKeys(String keysSequence) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void sendKeys(int[] keys) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void sendRepeatedKeys(int[] keys) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.InstrumentationTestCase
 * JD-Core Version:    0.6.0
 */