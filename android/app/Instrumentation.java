/*    */ package android.app;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.content.IntentFilter;
/*    */ import android.content.pm.ActivityInfo;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ 
/*    */ public class Instrumentation
/*    */ {
/*    */   public static final String REPORT_KEY_IDENTIFIER = "id";
/*    */   public static final String REPORT_KEY_STREAMRESULT = "stream";
/*    */ 
/*    */   public Instrumentation()
/*    */   {
/* 22 */     throw new RuntimeException("Stub!"); } 
/* 23 */   public void onCreate(Bundle arguments) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void start() { throw new RuntimeException("Stub!"); } 
/* 25 */   public void onStart() { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean onException(Object obj, Throwable e) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void sendStatus(int resultCode, Bundle results) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void finish(int resultCode, Bundle results) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setAutomaticPerformanceSnapshots() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void startPerformanceSnapshot() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void endPerformanceSnapshot() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void onDestroy() { throw new RuntimeException("Stub!"); } 
/* 33 */   public Context getContext() { throw new RuntimeException("Stub!"); } 
/* 34 */   public ComponentName getComponentName() { throw new RuntimeException("Stub!"); } 
/* 35 */   public Context getTargetContext() { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean isProfiling() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void startProfiling() { throw new RuntimeException("Stub!"); } 
/* 38 */   public void stopProfiling() { throw new RuntimeException("Stub!"); } 
/* 39 */   public void setInTouchMode(boolean inTouch) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void waitForIdle(Runnable recipient) { throw new RuntimeException("Stub!"); } 
/* 41 */   public void waitForIdleSync() { throw new RuntimeException("Stub!"); } 
/* 42 */   public void runOnMainSync(Runnable runner) { throw new RuntimeException("Stub!"); } 
/* 43 */   public Activity startActivitySync(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void addMonitor(ActivityMonitor monitor) { throw new RuntimeException("Stub!"); } 
/* 45 */   public ActivityMonitor addMonitor(IntentFilter filter, ActivityResult result, boolean block) { throw new RuntimeException("Stub!"); } 
/* 46 */   public ActivityMonitor addMonitor(String cls, ActivityResult result, boolean block) { throw new RuntimeException("Stub!"); } 
/* 47 */   public boolean checkMonitorHit(ActivityMonitor monitor, int minHits) { throw new RuntimeException("Stub!"); } 
/* 48 */   public Activity waitForMonitor(ActivityMonitor monitor) { throw new RuntimeException("Stub!"); } 
/* 49 */   public Activity waitForMonitorWithTimeout(ActivityMonitor monitor, long timeOut) { throw new RuntimeException("Stub!"); } 
/* 50 */   public void removeMonitor(ActivityMonitor monitor) { throw new RuntimeException("Stub!"); } 
/* 51 */   public boolean invokeMenuActionSync(Activity targetActivity, int id, int flag) { throw new RuntimeException("Stub!"); } 
/* 52 */   public boolean invokeContextMenuAction(Activity targetActivity, int id, int flag) { throw new RuntimeException("Stub!"); } 
/* 53 */   public void sendStringSync(String text) { throw new RuntimeException("Stub!"); } 
/* 54 */   public void sendKeySync(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 55 */   public void sendKeyDownUpSync(int key) { throw new RuntimeException("Stub!"); } 
/* 56 */   public void sendCharacterSync(int keyCode) { throw new RuntimeException("Stub!"); } 
/* 57 */   public void sendPointerSync(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 58 */   public void sendTrackballEventSync(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 59 */   public Application newApplication(ClassLoader cl, String className, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 60 */   public static Application newApplication(Class<?> clazz, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 61 */   public void callApplicationOnCreate(Application app) { throw new RuntimeException("Stub!"); } 
/* 62 */   public Activity newActivity(Class<?> clazz, Context context, IBinder token, Application application, Intent intent, ActivityInfo info, CharSequence title, Activity parent, String id, Object lastNonConfigurationInstance) throws InstantiationException, IllegalAccessException { throw new RuntimeException("Stub!"); } 
/* 63 */   public Activity newActivity(ClassLoader cl, String className, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 64 */   public void callActivityOnCreate(Activity activity, Bundle icicle) { throw new RuntimeException("Stub!"); } 
/* 65 */   public void callActivityOnDestroy(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 66 */   public void callActivityOnRestoreInstanceState(Activity activity, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 67 */   public void callActivityOnPostCreate(Activity activity, Bundle icicle) { throw new RuntimeException("Stub!"); } 
/* 68 */   public void callActivityOnNewIntent(Activity activity, Intent intent) { throw new RuntimeException("Stub!"); } 
/* 69 */   public void callActivityOnStart(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 70 */   public void callActivityOnRestart(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 71 */   public void callActivityOnResume(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 72 */   public void callActivityOnStop(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 73 */   public void callActivityOnSaveInstanceState(Activity activity, Bundle outState) { throw new RuntimeException("Stub!"); } 
/* 74 */   public void callActivityOnPause(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 75 */   public void callActivityOnUserLeaving(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 76 */   public void startAllocCounting() { throw new RuntimeException("Stub!"); } 
/* 77 */   public void stopAllocCounting() { throw new RuntimeException("Stub!"); } 
/* 78 */   public Bundle getAllocCounts() { throw new RuntimeException("Stub!"); } 
/* 79 */   public Bundle getBinderCounts() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static final class ActivityResult
/*    */   {
/*    */     public ActivityResult(int resultCode, Intent resultData)
/*    */     {
/* 18 */       throw new RuntimeException("Stub!"); } 
/* 19 */     public int getResultCode() { throw new RuntimeException("Stub!"); } 
/* 20 */     public Intent getResultData() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class ActivityMonitor
/*    */   {
/*    */     public ActivityMonitor(IntentFilter which, Instrumentation.ActivityResult result, boolean block)
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public ActivityMonitor(String cls, Instrumentation.ActivityResult result, boolean block) { throw new RuntimeException("Stub!"); } 
/*  8 */     public final IntentFilter getFilter() { throw new RuntimeException("Stub!"); } 
/*  9 */     public final Instrumentation.ActivityResult getResult() { throw new RuntimeException("Stub!"); } 
/* 10 */     public final boolean isBlocking() { throw new RuntimeException("Stub!"); } 
/* 11 */     public final int getHits() { throw new RuntimeException("Stub!"); } 
/* 12 */     public final Activity getLastActivity() { throw new RuntimeException("Stub!"); } 
/* 13 */     public final Activity waitForActivity() { throw new RuntimeException("Stub!"); } 
/* 14 */     public final Activity waitForActivityWithTimeout(long timeOut) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.Instrumentation
 * JD-Core Version:    0.6.0
 */