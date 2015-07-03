/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnCancelListener;
/*    */ import android.content.DialogInterface.OnDismissListener;
/*    */ import android.content.DialogInterface.OnKeyListener;
/*    */ import android.content.DialogInterface.OnShowListener;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Message;
/*    */ import android.view.ActionMode;
/*    */ import android.view.ActionMode.Callback;
/*    */ import android.view.ContextMenu;
/*    */ import android.view.ContextMenu.ContextMenuInfo;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.KeyEvent.Callback;
/*    */ import android.view.LayoutInflater;
/*    */ import android.view.Menu;
/*    */ import android.view.MenuItem;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ import android.view.View.OnCreateContextMenuListener;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.Window;
/*    */ import android.view.Window.Callback;
/*    */ import android.view.WindowManager.LayoutParams;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ 
/*    */ public class Dialog
/*    */   implements DialogInterface, Window.Callback, KeyEvent.Callback, View.OnCreateContextMenuListener
/*    */ {
/*    */   public Dialog(Context context)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Dialog(Context context, int theme) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected Dialog(Context context, boolean cancelable, DialogInterface.OnCancelListener cancelListener) { throw new RuntimeException("Stub!"); } 
/*  8 */   public final Context getContext() { throw new RuntimeException("Stub!"); } 
/*  9 */   public ActionBar getActionBar() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final void setOwnerActivity(Activity activity) { throw new RuntimeException("Stub!"); } 
/* 11 */   public final Activity getOwnerActivity() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isShowing() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void show() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void hide() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void dismiss() { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected void onStart() { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void onStop() { throw new RuntimeException("Stub!"); } 
/* 19 */   public Bundle onSaveInstanceState() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void onRestoreInstanceState(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/* 21 */   public Window getWindow() { throw new RuntimeException("Stub!"); } 
/* 22 */   public View getCurrentFocus() { throw new RuntimeException("Stub!"); } 
/* 23 */   public View findViewById(int id) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setContentView(int layoutResID) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setContentView(View view) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setContentView(View view, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void addContentView(View view, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setTitle(CharSequence title) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setTitle(int titleId) { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean onKeyLongPress(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 33 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void onBackPressed() { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean onKeyShortcut(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 37 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void onWindowAttributesChanged(WindowManager.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void onContentChanged() { throw new RuntimeException("Stub!"); } 
/* 40 */   public void onWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); } 
/* 41 */   public void onAttachedToWindow() { throw new RuntimeException("Stub!"); } 
/* 42 */   public void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/* 43 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 44 */   public boolean dispatchKeyShortcutEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/* 45 */   public boolean dispatchTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/* 46 */   public boolean dispatchTrackballEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/* 47 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/* 48 */   public View onCreatePanelView(int featureId) { throw new RuntimeException("Stub!"); } 
/* 49 */   public boolean onCreatePanelMenu(int featureId, Menu menu) { throw new RuntimeException("Stub!"); } 
/* 50 */   public boolean onPreparePanel(int featureId, View view, Menu menu) { throw new RuntimeException("Stub!"); } 
/* 51 */   public boolean onMenuOpened(int featureId, Menu menu) { throw new RuntimeException("Stub!"); } 
/* 52 */   public boolean onMenuItemSelected(int featureId, MenuItem item) { throw new RuntimeException("Stub!"); } 
/* 53 */   public void onPanelClosed(int featureId, Menu menu) { throw new RuntimeException("Stub!"); } 
/* 54 */   public boolean onCreateOptionsMenu(Menu menu) { throw new RuntimeException("Stub!"); } 
/* 55 */   public boolean onPrepareOptionsMenu(Menu menu) { throw new RuntimeException("Stub!"); } 
/* 56 */   public boolean onOptionsItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); } 
/* 57 */   public void onOptionsMenuClosed(Menu menu) { throw new RuntimeException("Stub!"); } 
/* 58 */   public void openOptionsMenu() { throw new RuntimeException("Stub!"); } 
/* 59 */   public void closeOptionsMenu() { throw new RuntimeException("Stub!"); } 
/* 60 */   public void invalidateOptionsMenu() { throw new RuntimeException("Stub!"); } 
/* 61 */   public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) { throw new RuntimeException("Stub!"); } 
/* 62 */   public void registerForContextMenu(View view) { throw new RuntimeException("Stub!"); } 
/* 63 */   public void unregisterForContextMenu(View view) { throw new RuntimeException("Stub!"); } 
/* 64 */   public void openContextMenu(View view) { throw new RuntimeException("Stub!"); } 
/* 65 */   public boolean onContextItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); } 
/* 66 */   public void onContextMenuClosed(Menu menu) { throw new RuntimeException("Stub!"); } 
/* 67 */   public boolean onSearchRequested() { throw new RuntimeException("Stub!"); } 
/* 68 */   public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) { throw new RuntimeException("Stub!"); } 
/* 69 */   public void onActionModeStarted(ActionMode mode) { throw new RuntimeException("Stub!"); } 
/* 70 */   public void onActionModeFinished(ActionMode mode) { throw new RuntimeException("Stub!"); } 
/* 71 */   public void takeKeyEvents(boolean get) { throw new RuntimeException("Stub!"); } 
/* 72 */   public final boolean requestWindowFeature(int featureId) { throw new RuntimeException("Stub!"); } 
/* 73 */   public final void setFeatureDrawableResource(int featureId, int resId) { throw new RuntimeException("Stub!"); } 
/* 74 */   public final void setFeatureDrawableUri(int featureId, Uri uri) { throw new RuntimeException("Stub!"); } 
/* 75 */   public final void setFeatureDrawable(int featureId, Drawable drawable) { throw new RuntimeException("Stub!"); } 
/* 76 */   public final void setFeatureDrawableAlpha(int featureId, int alpha) { throw new RuntimeException("Stub!"); } 
/* 77 */   public LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); } 
/* 78 */   public void setCancelable(boolean flag) { throw new RuntimeException("Stub!"); } 
/* 79 */   public void setCanceledOnTouchOutside(boolean cancel) { throw new RuntimeException("Stub!"); } 
/* 80 */   public void cancel() { throw new RuntimeException("Stub!"); } 
/* 81 */   public void setOnCancelListener(DialogInterface.OnCancelListener listener) { throw new RuntimeException("Stub!"); } 
/* 82 */   public void setCancelMessage(Message msg) { throw new RuntimeException("Stub!"); } 
/* 83 */   public void setOnDismissListener(DialogInterface.OnDismissListener listener) { throw new RuntimeException("Stub!"); } 
/* 84 */   public void setOnShowListener(DialogInterface.OnShowListener listener) { throw new RuntimeException("Stub!"); } 
/* 85 */   public void setDismissMessage(Message msg) { throw new RuntimeException("Stub!"); } 
/* 86 */   public final void setVolumeControlStream(int streamType) { throw new RuntimeException("Stub!"); } 
/* 87 */   public final int getVolumeControlStream() { throw new RuntimeException("Stub!"); } 
/* 88 */   public void setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.Dialog
 * JD-Core Version:    0.6.0
 */