/*    */ package android.test;
/*    */ 
/*    */ import android.app.Application;
/*    */ import android.app.Service;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ public abstract class ServiceTestCase<T extends Service> extends AndroidTestCase
/*    */ {
/*    */   public ServiceTestCase(Class<T> serviceClass)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public T getService() { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); } 
/*  8 */   protected void setupService() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected void startService(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected IBinder bindService(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void shutdownService() { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setApplication(Application application) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Application getApplication() { throw new RuntimeException("Stub!"); } 
/* 15 */   public Context getSystemContext() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void testServiceTestCaseSetUpProperly() throws Exception { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.ServiceTestCase
 * JD-Core Version:    0.6.0
 */