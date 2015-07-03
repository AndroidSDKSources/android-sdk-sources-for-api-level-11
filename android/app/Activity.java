/*     */ package android.app;
/*     */ 
/*     */ import android.content.ComponentCallbacks;
/*     */ import android.content.ComponentName;
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.content.IntentSender;
/*     */ import android.content.IntentSender.SendIntentException;
/*     */ import android.content.SharedPreferences;
/*     */ import android.content.res.Configuration;
/*     */ import android.content.res.Resources.Theme;
/*     */ import android.database.Cursor;
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.net.Uri;
/*     */ import android.os.Bundle;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.ActionMode;
/*     */ import android.view.ActionMode.Callback;
/*     */ import android.view.ContextMenu;
/*     */ import android.view.ContextMenu.ContextMenuInfo;
/*     */ import android.view.ContextThemeWrapper;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.KeyEvent.Callback;
/*     */ import android.view.LayoutInflater;
/*     */ import android.view.LayoutInflater.Factory2;
/*     */ import android.view.Menu;
/*     */ import android.view.MenuInflater;
/*     */ import android.view.MenuItem;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View;
/*     */ import android.view.View.OnCreateContextMenuListener;
/*     */ import android.view.ViewGroup.LayoutParams;
/*     */ import android.view.Window;
/*     */ import android.view.Window.Callback;
/*     */ import android.view.WindowManager;
/*     */ import android.view.WindowManager.LayoutParams;
/*     */ import android.view.accessibility.AccessibilityEvent;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.PrintWriter;
/*     */ 
/*     */ public class Activity extends ContextThemeWrapper
/*     */   implements LayoutInflater.Factory2, Window.Callback, KeyEvent.Callback, View.OnCreateContextMenuListener, ComponentCallbacks
/*     */ {
/*     */   public static final int RESULT_CANCELED = 0;
/*     */   public static final int RESULT_OK = -1;
/*     */   public static final int RESULT_FIRST_USER = 1;
/* 170 */   protected static final int[] FOCUSED_STATE_SET = null;
/*     */   public static final int DEFAULT_KEYS_DISABLE = 0;
/*     */   public static final int DEFAULT_KEYS_DIALER = 1;
/*     */   public static final int DEFAULT_KEYS_SHORTCUT = 2;
/*     */   public static final int DEFAULT_KEYS_SEARCH_LOCAL = 3;
/*     */   public static final int DEFAULT_KEYS_SEARCH_GLOBAL = 4;
/*     */ 
/*     */   public Activity()
/*     */   {
/*   6 */     throw new RuntimeException("Stub!"); } 
/*   7 */   public Intent getIntent() { throw new RuntimeException("Stub!"); } 
/*   8 */   public void setIntent(Intent newIntent) { throw new RuntimeException("Stub!"); } 
/*   9 */   public final Application getApplication() { throw new RuntimeException("Stub!"); } 
/*  10 */   public final boolean isChild() { throw new RuntimeException("Stub!"); } 
/*  11 */   public final Activity getParent() { throw new RuntimeException("Stub!"); } 
/*  12 */   public WindowManager getWindowManager() { throw new RuntimeException("Stub!"); } 
/*  13 */   public Window getWindow() { throw new RuntimeException("Stub!"); } 
/*  14 */   public LoaderManager getLoaderManager() { throw new RuntimeException("Stub!"); } 
/*  15 */   public View getCurrentFocus() { throw new RuntimeException("Stub!"); } 
/*  16 */   public int getWallpaperDesiredMinimumWidth() { throw new RuntimeException("Stub!"); } 
/*  17 */   public int getWallpaperDesiredMinimumHeight() { throw new RuntimeException("Stub!"); } 
/*  18 */   protected void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/*  19 */   protected void onRestoreInstanceState(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/*  20 */   protected void onPostCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); } 
/*  21 */   protected void onStart() { throw new RuntimeException("Stub!"); } 
/*  22 */   protected void onRestart() { throw new RuntimeException("Stub!"); } 
/*  23 */   protected void onResume() { throw new RuntimeException("Stub!"); } 
/*  24 */   protected void onPostResume() { throw new RuntimeException("Stub!"); } 
/*  25 */   protected void onNewIntent(Intent intent) { throw new RuntimeException("Stub!"); } 
/*  26 */   protected void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); } 
/*  27 */   protected void onPause() { throw new RuntimeException("Stub!"); } 
/*  28 */   protected void onUserLeaveHint() { throw new RuntimeException("Stub!"); } 
/*  29 */   public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) { throw new RuntimeException("Stub!"); } 
/*  30 */   public CharSequence onCreateDescription() { throw new RuntimeException("Stub!"); } 
/*  31 */   protected void onStop() { throw new RuntimeException("Stub!"); } 
/*  32 */   protected void onDestroy() { throw new RuntimeException("Stub!"); } 
/*  33 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/*  34 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); } 
/*  35 */   public Object getLastNonConfigurationInstance() { throw new RuntimeException("Stub!"); } 
/*  36 */   public Object onRetainNonConfigurationInstance() { throw new RuntimeException("Stub!"); } 
/*  37 */   public void onLowMemory() { throw new RuntimeException("Stub!"); } 
/*  38 */   public FragmentManager getFragmentManager() { throw new RuntimeException("Stub!"); } 
/*  39 */   public void onAttachFragment(Fragment fragment) { throw new RuntimeException("Stub!"); } 
/*  40 */   public final Cursor managedQuery(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) { throw new RuntimeException("Stub!"); } 
/*  41 */   public void startManagingCursor(Cursor c) { throw new RuntimeException("Stub!"); } 
/*  42 */   public void stopManagingCursor(Cursor c) { throw new RuntimeException("Stub!"); } 
/*  43 */   public View findViewById(int id) { throw new RuntimeException("Stub!"); } 
/*  44 */   public ActionBar getActionBar() { throw new RuntimeException("Stub!"); } 
/*  45 */   public void setContentView(int layoutResID) { throw new RuntimeException("Stub!"); } 
/*  46 */   public void setContentView(View view) { throw new RuntimeException("Stub!"); } 
/*  47 */   public void setContentView(View view, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/*  48 */   public void addContentView(View view, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/*  49 */   public void setFinishOnTouchOutside(boolean finish) { throw new RuntimeException("Stub!"); } 
/*  50 */   public final void setDefaultKeyMode(int mode) { throw new RuntimeException("Stub!"); } 
/*  51 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  52 */   public boolean onKeyLongPress(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  53 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  54 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  55 */   public void onBackPressed() { throw new RuntimeException("Stub!"); } 
/*  56 */   public boolean onKeyShortcut(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  57 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/*  58 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); } 
/*  59 */   public void onUserInteraction() { throw new RuntimeException("Stub!"); } 
/*  60 */   public void onWindowAttributesChanged(WindowManager.LayoutParams params) { throw new RuntimeException("Stub!"); } 
/*  61 */   public void onContentChanged() { throw new RuntimeException("Stub!"); } 
/*  62 */   public void onWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); } 
/*  63 */   public void onAttachedToWindow() { throw new RuntimeException("Stub!"); } 
/*  64 */   public void onDetachedFromWindow() { throw new RuntimeException("Stub!"); } 
/*  65 */   public boolean hasWindowFocus() { throw new RuntimeException("Stub!"); } 
/*  66 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  67 */   public boolean dispatchKeyShortcutEvent(KeyEvent event) { throw new RuntimeException("Stub!"); } 
/*  68 */   public boolean dispatchTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/*  69 */   public boolean dispatchTrackballEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); } 
/*  70 */   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); } 
/*  71 */   public View onCreatePanelView(int featureId) { throw new RuntimeException("Stub!"); } 
/*  72 */   public boolean onCreatePanelMenu(int featureId, Menu menu) { throw new RuntimeException("Stub!"); } 
/*  73 */   public boolean onPreparePanel(int featureId, View view, Menu menu) { throw new RuntimeException("Stub!"); } 
/*  74 */   public boolean onMenuOpened(int featureId, Menu menu) { throw new RuntimeException("Stub!"); } 
/*  75 */   public boolean onMenuItemSelected(int featureId, MenuItem item) { throw new RuntimeException("Stub!"); } 
/*  76 */   public void onPanelClosed(int featureId, Menu menu) { throw new RuntimeException("Stub!"); } 
/*  77 */   public void invalidateOptionsMenu() { throw new RuntimeException("Stub!"); } 
/*  78 */   public boolean onCreateOptionsMenu(Menu menu) { throw new RuntimeException("Stub!"); } 
/*  79 */   public boolean onPrepareOptionsMenu(Menu menu) { throw new RuntimeException("Stub!"); } 
/*  80 */   public boolean onOptionsItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); } 
/*  81 */   public void onOptionsMenuClosed(Menu menu) { throw new RuntimeException("Stub!"); } 
/*  82 */   public void openOptionsMenu() { throw new RuntimeException("Stub!"); } 
/*  83 */   public void closeOptionsMenu() { throw new RuntimeException("Stub!"); } 
/*  84 */   public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) { throw new RuntimeException("Stub!"); } 
/*  85 */   public void registerForContextMenu(View view) { throw new RuntimeException("Stub!"); } 
/*  86 */   public void unregisterForContextMenu(View view) { throw new RuntimeException("Stub!"); } 
/*  87 */   public void openContextMenu(View view) { throw new RuntimeException("Stub!"); } 
/*  88 */   public void closeContextMenu() { throw new RuntimeException("Stub!"); } 
/*  89 */   public boolean onContextItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); } 
/*  90 */   public void onContextMenuClosed(Menu menu) { throw new RuntimeException("Stub!"); } 
/*  91 */   protected Dialog onCreateDialog(int id) { throw new RuntimeException("Stub!"); } 
/*  92 */   protected Dialog onCreateDialog(int id, Bundle args) { throw new RuntimeException("Stub!"); } 
/*  93 */   protected void onPrepareDialog(int id, Dialog dialog) { throw new RuntimeException("Stub!"); } 
/*  94 */   protected void onPrepareDialog(int id, Dialog dialog, Bundle args) { throw new RuntimeException("Stub!"); } 
/*  95 */   public final void showDialog(int id) { throw new RuntimeException("Stub!"); } 
/*  96 */   public final boolean showDialog(int id, Bundle args) { throw new RuntimeException("Stub!"); } 
/*  97 */   public final void dismissDialog(int id) { throw new RuntimeException("Stub!"); } 
/*  98 */   public final void removeDialog(int id) { throw new RuntimeException("Stub!"); } 
/*  99 */   public boolean onSearchRequested() { throw new RuntimeException("Stub!"); } 
/* 100 */   public void startSearch(String initialQuery, boolean selectInitialQuery, Bundle appSearchData, boolean globalSearch) { throw new RuntimeException("Stub!"); } 
/* 101 */   public void triggerSearch(String query, Bundle appSearchData) { throw new RuntimeException("Stub!"); } 
/* 102 */   public void takeKeyEvents(boolean get) { throw new RuntimeException("Stub!"); } 
/* 103 */   public final boolean requestWindowFeature(int featureId) { throw new RuntimeException("Stub!"); } 
/* 104 */   public final void setFeatureDrawableResource(int featureId, int resId) { throw new RuntimeException("Stub!"); } 
/* 105 */   public final void setFeatureDrawableUri(int featureId, Uri uri) { throw new RuntimeException("Stub!"); } 
/* 106 */   public final void setFeatureDrawable(int featureId, Drawable drawable) { throw new RuntimeException("Stub!"); } 
/* 107 */   public final void setFeatureDrawableAlpha(int featureId, int alpha) { throw new RuntimeException("Stub!"); } 
/* 108 */   public LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); } 
/* 109 */   public MenuInflater getMenuInflater() { throw new RuntimeException("Stub!"); } 
/* 110 */   protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) { throw new RuntimeException("Stub!"); } 
/* 111 */   public void startActivityForResult(Intent intent, int requestCode) { throw new RuntimeException("Stub!"); } 
/* 112 */   public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException { throw new RuntimeException("Stub!"); } 
/* 113 */   public void startActivity(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 114 */   public void startActivities(Intent[] intents) { throw new RuntimeException("Stub!"); } 
/* 115 */   public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException { throw new RuntimeException("Stub!"); } 
/* 116 */   public boolean startActivityIfNeeded(Intent intent, int requestCode) { throw new RuntimeException("Stub!"); } 
/* 117 */   public boolean startNextMatchingActivity(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 118 */   public void startActivityFromChild(Activity child, Intent intent, int requestCode) { throw new RuntimeException("Stub!"); } 
/* 119 */   public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode) { throw new RuntimeException("Stub!"); } 
/* 120 */   public void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException { throw new RuntimeException("Stub!"); } 
/* 121 */   public void overridePendingTransition(int enterAnim, int exitAnim) { throw new RuntimeException("Stub!"); } 
/* 122 */   public final void setResult(int resultCode) { throw new RuntimeException("Stub!"); } 
/* 123 */   public final void setResult(int resultCode, Intent data) { throw new RuntimeException("Stub!"); } 
/* 124 */   public String getCallingPackage() { throw new RuntimeException("Stub!"); } 
/* 125 */   public ComponentName getCallingActivity() { throw new RuntimeException("Stub!"); } 
/* 126 */   public void setVisible(boolean visible) { throw new RuntimeException("Stub!"); } 
/* 127 */   public boolean isFinishing() { throw new RuntimeException("Stub!"); } 
/* 128 */   public boolean isChangingConfigurations() { throw new RuntimeException("Stub!"); } 
/* 129 */   public void recreate() { throw new RuntimeException("Stub!"); } 
/* 130 */   public void finish() { throw new RuntimeException("Stub!"); } 
/* 131 */   public void finishFromChild(Activity child) { throw new RuntimeException("Stub!"); } 
/* 132 */   public void finishActivity(int requestCode) { throw new RuntimeException("Stub!"); } 
/* 133 */   public void finishActivityFromChild(Activity child, int requestCode) { throw new RuntimeException("Stub!"); } 
/* 134 */   protected void onActivityResult(int requestCode, int resultCode, Intent data) { throw new RuntimeException("Stub!"); } 
/* 135 */   public PendingIntent createPendingResult(int requestCode, Intent data, int flags) { throw new RuntimeException("Stub!"); } 
/* 136 */   public void setRequestedOrientation(int requestedOrientation) { throw new RuntimeException("Stub!"); } 
/* 137 */   public int getRequestedOrientation() { throw new RuntimeException("Stub!"); } 
/* 138 */   public int getTaskId() { throw new RuntimeException("Stub!"); } 
/* 139 */   public boolean isTaskRoot() { throw new RuntimeException("Stub!"); } 
/* 140 */   public boolean moveTaskToBack(boolean nonRoot) { throw new RuntimeException("Stub!"); } 
/* 141 */   public String getLocalClassName() { throw new RuntimeException("Stub!"); } 
/* 142 */   public ComponentName getComponentName() { throw new RuntimeException("Stub!"); } 
/* 143 */   public SharedPreferences getPreferences(int mode) { throw new RuntimeException("Stub!"); } 
/* 144 */   public Object getSystemService(String name) { throw new RuntimeException("Stub!"); } 
/* 145 */   public void setTitle(CharSequence title) { throw new RuntimeException("Stub!"); } 
/* 146 */   public void setTitle(int titleId) { throw new RuntimeException("Stub!"); } 
/* 147 */   public void setTitleColor(int textColor) { throw new RuntimeException("Stub!"); } 
/* 148 */   public final CharSequence getTitle() { throw new RuntimeException("Stub!"); } 
/* 149 */   public final int getTitleColor() { throw new RuntimeException("Stub!"); } 
/* 150 */   protected void onTitleChanged(CharSequence title, int color) { throw new RuntimeException("Stub!"); } 
/* 151 */   protected void onChildTitleChanged(Activity childActivity, CharSequence title) { throw new RuntimeException("Stub!"); } 
/* 152 */   public final void setProgressBarVisibility(boolean visible) { throw new RuntimeException("Stub!"); } 
/* 153 */   public final void setProgressBarIndeterminateVisibility(boolean visible) { throw new RuntimeException("Stub!"); } 
/* 154 */   public final void setProgressBarIndeterminate(boolean indeterminate) { throw new RuntimeException("Stub!"); } 
/* 155 */   public final void setProgress(int progress) { throw new RuntimeException("Stub!"); } 
/* 156 */   public final void setSecondaryProgress(int secondaryProgress) { throw new RuntimeException("Stub!"); } 
/* 157 */   public final void setVolumeControlStream(int streamType) { throw new RuntimeException("Stub!"); } 
/* 158 */   public final int getVolumeControlStream() { throw new RuntimeException("Stub!"); } 
/* 159 */   public final void runOnUiThread(Runnable action) { throw new RuntimeException("Stub!"); } 
/* 160 */   public View onCreateView(String name, Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 161 */   public View onCreateView(View parent, String name, Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); } 
/* 162 */   public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); } 
/* 163 */   public ActionMode startActionMode(ActionMode.Callback callback) { throw new RuntimeException("Stub!"); } 
/* 164 */   public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) { throw new RuntimeException("Stub!"); } 
/* 165 */   public void onActionModeStarted(ActionMode mode) { throw new RuntimeException("Stub!"); } 
/* 166 */   public void onActionModeFinished(ActionMode mode) { throw new RuntimeException("Stub!");
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.Activity
 * JD-Core Version:    0.6.0
 */