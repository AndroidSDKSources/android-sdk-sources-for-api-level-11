/*    */ package android.app;
/*    */ 
/*    */ import android.content.ComponentCallbacks;
/*    */ import android.content.Context;
/*    */ import android.content.ContextWrapper;
/*    */ import android.content.res.Configuration;
/*    */ 
/*    */ public class Application extends ContextWrapper
/*    */   implements ComponentCallbacks
/*    */ {
/*    */   public Application()
/*    */   {
/*  6 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public void onCreate() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void onTerminate() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onLowMemory() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.Application
 * JD-Core Version:    0.6.0
 */