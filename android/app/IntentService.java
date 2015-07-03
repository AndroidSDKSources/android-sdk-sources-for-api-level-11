/*    */ package android.app;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ public abstract class IntentService extends Service
/*    */ {
/*    */   public IntentService(String name)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void setIntentRedelivery(boolean enabled) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void onCreate() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void onStart(Intent intent, int startId) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int onStartCommand(Intent intent, int flags, int startId) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onDestroy() { throw new RuntimeException("Stub!"); } 
/* 11 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   protected abstract void onHandleIntent(Intent paramIntent);
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.IntentService
 * JD-Core Version:    0.6.0
 */