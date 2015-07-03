/*   */ package android.test.mock;
/*   */ 
/*   */ import android.app.Application;
/*   */ import android.content.res.Configuration;
/*   */ 
/*   */ public class MockApplication extends Application
/*   */ {
/*   */   public MockApplication()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public void onCreate() { throw new RuntimeException("Stub!"); } 
/* 7 */   public void onTerminate() { throw new RuntimeException("Stub!"); } 
/* 8 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.mock.MockApplication
 * JD-Core Version:    0.6.0
 */