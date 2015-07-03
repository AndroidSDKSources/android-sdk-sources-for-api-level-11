/*    */ package android.app;
/*    */ 
/*    */ import android.content.ComponentCallbacks;
/*    */ import android.content.Context;
/*    */ import android.content.ContextWrapper;
/*    */ import android.content.Intent;
/*    */ import android.content.res.Configuration;
/*    */ import android.os.IBinder;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public abstract class Service extends ContextWrapper
/*    */   implements ComponentCallbacks
/*    */ {
/*    */   public static final int START_CONTINUATION_MASK = 15;
/*    */   public static final int START_STICKY_COMPATIBILITY = 0;
/*    */   public static final int START_STICKY = 1;
/*    */   public static final int START_NOT_STICKY = 2;
/*    */   public static final int START_REDELIVER_INTENT = 3;
/*    */   public static final int START_FLAG_REDELIVERY = 1;
/*    */   public static final int START_FLAG_RETRY = 2;
/*    */ 
/*    */   public Service()
/*    */   {
/*  6 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public final Application getApplication() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void onCreate() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void onStart(Intent intent, int startId) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int onStartCommand(Intent intent, int flags, int startId) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void onDestroy() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void onLowMemory() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract IBinder onBind(Intent paramIntent);
/*    */ 
/* 15 */   public boolean onUnbind(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void onRebind(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 17 */   public final void stopSelf() { throw new RuntimeException("Stub!"); } 
/* 18 */   public final void stopSelf(int startId) { throw new RuntimeException("Stub!"); } 
/* 19 */   public final boolean stopSelfResult(int startId) { throw new RuntimeException("Stub!"); } 
/* 20 */   public final void startForeground(int id, Notification notification) { throw new RuntimeException("Stub!"); } 
/* 21 */   public final void stopForeground(boolean removeNotification) { throw new RuntimeException("Stub!"); } 
/* 22 */   protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.Service
 * JD-Core Version:    0.6.0
 */