/*    */ package android.test;
/*    */ 
/*    */ import android.app.Application;
/*    */ import android.content.Context;
/*    */ 
/*    */ public abstract class ApplicationTestCase<T extends Application> extends AndroidTestCase
/*    */ {
/*    */   public ApplicationTestCase(Class<T> applicationClass)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public T getApplication() { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); } 
/*  8 */   protected final void createApplication() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected final void terminateApplication() { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); } 
/* 11 */   public Context getSystemContext() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void testApplicationTestCaseSetUpProperly() throws Exception { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.ApplicationTestCase
 * JD-Core Version:    0.6.0
 */