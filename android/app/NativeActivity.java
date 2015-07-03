/*    */ package android.app;
/*    */ 
/*    */ import android.content.res.Configuration;
/*    */ import android.os.Bundle;
/*    */ import android.view.InputQueue;
/*    */ import android.view.InputQueue.Callback;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.SurfaceHolder;
/*    */ import android.view.SurfaceHolder.Callback2;
/*    */ import android.view.ViewTreeObserver.OnGlobalLayoutListener;
/*    */ 
/*    */ public class NativeActivity extends Activity
/*    */   implements SurfaceHolder.Callback2, InputQueue.Callback, ViewTreeObserver.OnGlobalLayoutListener
/*    */ {
/*    */   public static final String META_DATA_LIB_NAME = "android.app.lib_name";
/*    */   public static final String META_DATA_FUNC_NAME = "android.app.func_name";
/*    */ 
/*    */   public NativeActivity()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   protected void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/*  8 */   protected void onDestroy() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected void onPause() { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void onResume() { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void onStart() { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void onStop() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void onLowMemory() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void onWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void surfaceCreated(SurfaceHolder holder) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void surfaceRedrawNeeded(SurfaceHolder holder) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void surfaceDestroyed(SurfaceHolder holder) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void onInputQueueCreated(InputQueue queue) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void onInputQueueDestroyed(InputQueue queue) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void onGlobalLayout() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.NativeActivity
 * JD-Core Version:    0.6.0
 */