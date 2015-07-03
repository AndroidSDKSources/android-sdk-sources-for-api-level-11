/*    */ package android.content;
/*    */ 
/*    */ import android.content.pm.ApplicationInfo;
/*    */ import android.content.pm.PackageManager;
/*    */ import android.content.pm.PackageManager.NameNotFoundException;
/*    */ import android.content.res.AssetManager;
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.Resources.NotFoundException;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.content.res.TypedArray;
/*    */ import android.database.DatabaseErrorHandler;
/*    */ import android.database.sqlite.SQLiteDatabase;
/*    */ import android.database.sqlite.SQLiteDatabase.CursorFactory;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import android.os.Looper;
/*    */ import android.util.AttributeSet;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public abstract class Context
/*    */ {
/*    */   public static final int MODE_PRIVATE = 0;
/*    */   public static final int MODE_WORLD_READABLE = 1;
/*    */   public static final int MODE_WORLD_WRITEABLE = 2;
/*    */   public static final int MODE_APPEND = 32768;
/*    */   public static final int MODE_MULTI_PROCESS = 4;
/*    */   public static final int BIND_AUTO_CREATE = 1;
/*    */   public static final int BIND_DEBUG_UNBIND = 2;
/*    */   public static final int BIND_NOT_FOREGROUND = 4;
/*    */   public static final String POWER_SERVICE = "power";
/*    */   public static final String WINDOW_SERVICE = "window";
/*    */   public static final String LAYOUT_INFLATER_SERVICE = "layout_inflater";
/*    */   public static final String ACCOUNT_SERVICE = "account";
/*    */   public static final String ACTIVITY_SERVICE = "activity";
/*    */   public static final String ALARM_SERVICE = "alarm";
/*    */   public static final String NOTIFICATION_SERVICE = "notification";
/*    */   public static final String ACCESSIBILITY_SERVICE = "accessibility";
/*    */   public static final String KEYGUARD_SERVICE = "keyguard";
/*    */   public static final String LOCATION_SERVICE = "location";
/*    */   public static final String SEARCH_SERVICE = "search";
/*    */   public static final String SENSOR_SERVICE = "sensor";
/*    */   public static final String STORAGE_SERVICE = "storage";
/*    */   public static final String WALLPAPER_SERVICE = "wallpaper";
/*    */   public static final String VIBRATOR_SERVICE = "vibrator";
/*    */   public static final String CONNECTIVITY_SERVICE = "connectivity";
/*    */   public static final String WIFI_SERVICE = "wifi";
/*    */   public static final String AUDIO_SERVICE = "audio";
/*    */   public static final String TELEPHONY_SERVICE = "phone";
/*    */   public static final String CLIPBOARD_SERVICE = "clipboard";
/*    */   public static final String INPUT_METHOD_SERVICE = "input_method";
/*    */   public static final String DROPBOX_SERVICE = "dropbox";
/*    */   public static final String DEVICE_POLICY_SERVICE = "device_policy";
/*    */   public static final String UI_MODE_SERVICE = "uimode";
/*    */   public static final String DOWNLOAD_SERVICE = "download";
/*    */   public static final String NFC_SERVICE = "nfc";
/*    */   public static final int CONTEXT_INCLUDE_CODE = 1;
/*    */   public static final int CONTEXT_IGNORE_SECURITY = 2;
/*    */   public static final int CONTEXT_RESTRICTED = 4;
/*    */ 
/*    */   public Context()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract AssetManager getAssets();
/*    */ 
/*    */   public abstract Resources getResources();
/*    */ 
/*    */   public abstract PackageManager getPackageManager();
/*    */ 
/*    */   public abstract ContentResolver getContentResolver();
/*    */ 
/*    */   public abstract Looper getMainLooper();
/*    */ 
/*    */   public abstract Context getApplicationContext();
/*    */ 
/* 11 */   public final CharSequence getText(int resId) { throw new RuntimeException("Stub!"); } 
/* 12 */   public final String getString(int resId) { throw new RuntimeException("Stub!"); } 
/* 13 */   public final String getString(int resId, Object[] formatArgs) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void setTheme(int paramInt);
/*    */ 
/*    */   public abstract Resources.Theme getTheme();
/*    */ 
/* 16 */   public final TypedArray obtainStyledAttributes(int[] attrs) { throw new RuntimeException("Stub!"); } 
/* 17 */   public final TypedArray obtainStyledAttributes(int resid, int[] attrs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); } 
/* 18 */   public final TypedArray obtainStyledAttributes(AttributeSet set, int[] attrs) { throw new RuntimeException("Stub!"); } 
/* 19 */   public final TypedArray obtainStyledAttributes(AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract ClassLoader getClassLoader();
/*    */ 
/*    */   public abstract String getPackageName();
/*    */ 
/*    */   public abstract ApplicationInfo getApplicationInfo();
/*    */ 
/*    */   public abstract String getPackageResourcePath();
/*    */ 
/*    */   public abstract String getPackageCodePath();
/*    */ 
/*    */   public abstract SharedPreferences getSharedPreferences(String paramString, int paramInt);
/*    */ 
/*    */   public abstract FileInputStream openFileInput(String paramString) throws FileNotFoundException;
/*    */ 
/*    */   public abstract FileOutputStream openFileOutput(String paramString, int paramInt) throws FileNotFoundException;
/*    */ 
/*    */   public abstract boolean deleteFile(String paramString);
/*    */ 
/*    */   public abstract File getFileStreamPath(String paramString);
/*    */ 
/*    */   public abstract File getFilesDir();
/*    */ 
/*    */   public abstract File getExternalFilesDir(String paramString);
/*    */ 
/*    */   public abstract File getObbDir();
/*    */ 
/*    */   public abstract File getCacheDir();
/*    */ 
/*    */   public abstract File getExternalCacheDir();
/*    */ 
/*    */   public abstract String[] fileList();
/*    */ 
/*    */   public abstract File getDir(String paramString, int paramInt);
/*    */ 
/*    */   public abstract SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory);
/*    */ 
/*    */   public abstract SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler);
/*    */ 
/*    */   public abstract boolean deleteDatabase(String paramString);
/*    */ 
/*    */   public abstract File getDatabasePath(String paramString);
/*    */ 
/*    */   public abstract String[] databaseList();
/*    */ 
/*    */   public abstract Drawable getWallpaper();
/*    */ 
/*    */   public abstract Drawable peekWallpaper();
/*    */ 
/*    */   public abstract int getWallpaperDesiredMinimumWidth();
/*    */ 
/*    */   public abstract int getWallpaperDesiredMinimumHeight();
/*    */ 
/*    */   public abstract void setWallpaper(Bitmap paramBitmap) throws IOException;
/*    */ 
/*    */   public abstract void setWallpaper(InputStream paramInputStream) throws IOException;
/*    */ 
/*    */   public abstract void clearWallpaper() throws IOException;
/*    */ 
/*    */   public abstract void startActivity(Intent paramIntent);
/*    */ 
/*    */   public abstract void startActivities(Intent[] paramArrayOfIntent);
/*    */ 
/*    */   public abstract void startIntentSender(IntentSender paramIntentSender, Intent paramIntent, int paramInt1, int paramInt2, int paramInt3) throws IntentSender.SendIntentException;
/*    */ 
/*    */   public abstract void sendBroadcast(Intent paramIntent);
/*    */ 
/*    */   public abstract void sendBroadcast(Intent paramIntent, String paramString);
/*    */ 
/*    */   public abstract void sendOrderedBroadcast(Intent paramIntent, String paramString);
/*    */ 
/*    */   public abstract void sendOrderedBroadcast(Intent paramIntent, String paramString1, BroadcastReceiver paramBroadcastReceiver, Handler paramHandler, int paramInt, String paramString2, Bundle paramBundle);
/*    */ 
/*    */   public abstract void sendStickyBroadcast(Intent paramIntent);
/*    */ 
/*    */   public abstract void sendStickyOrderedBroadcast(Intent paramIntent, BroadcastReceiver paramBroadcastReceiver, Handler paramHandler, int paramInt, String paramString, Bundle paramBundle);
/*    */ 
/*    */   public abstract void removeStickyBroadcast(Intent paramIntent);
/*    */ 
/*    */   public abstract Intent registerReceiver(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter);
/*    */ 
/*    */   public abstract Intent registerReceiver(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler);
/*    */ 
/*    */   public abstract void unregisterReceiver(BroadcastReceiver paramBroadcastReceiver);
/*    */ 
/*    */   public abstract ComponentName startService(Intent paramIntent);
/*    */ 
/*    */   public abstract boolean stopService(Intent paramIntent);
/*    */ 
/*    */   public abstract boolean bindService(Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt);
/*    */ 
/*    */   public abstract void unbindService(ServiceConnection paramServiceConnection);
/*    */ 
/*    */   public abstract boolean startInstrumentation(ComponentName paramComponentName, String paramString, Bundle paramBundle);
/*    */ 
/*    */   public abstract Object getSystemService(String paramString);
/*    */ 
/*    */   public abstract int checkPermission(String paramString, int paramInt1, int paramInt2);
/*    */ 
/*    */   public abstract int checkCallingPermission(String paramString);
/*    */ 
/*    */   public abstract int checkCallingOrSelfPermission(String paramString);
/*    */ 
/*    */   public abstract void enforcePermission(String paramString1, int paramInt1, int paramInt2, String paramString2);
/*    */ 
/*    */   public abstract void enforceCallingPermission(String paramString1, String paramString2);
/*    */ 
/*    */   public abstract void enforceCallingOrSelfPermission(String paramString1, String paramString2);
/*    */ 
/*    */   public abstract void grantUriPermission(String paramString, Uri paramUri, int paramInt);
/*    */ 
/*    */   public abstract void revokeUriPermission(Uri paramUri, int paramInt);
/*    */ 
/*    */   public abstract int checkUriPermission(Uri paramUri, int paramInt1, int paramInt2, int paramInt3);
/*    */ 
/*    */   public abstract int checkCallingUriPermission(Uri paramUri, int paramInt);
/*    */ 
/*    */   public abstract int checkCallingOrSelfUriPermission(Uri paramUri, int paramInt);
/*    */ 
/*    */   public abstract int checkUriPermission(Uri paramUri, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3);
/*    */ 
/*    */   public abstract void enforceUriPermission(Uri paramUri, int paramInt1, int paramInt2, int paramInt3, String paramString);
/*    */ 
/*    */   public abstract void enforceCallingUriPermission(Uri paramUri, int paramInt, String paramString);
/*    */ 
/*    */   public abstract void enforceCallingOrSelfUriPermission(Uri paramUri, int paramInt, String paramString);
/*    */ 
/*    */   public abstract void enforceUriPermission(Uri paramUri, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3);
/*    */ 
/*    */   public abstract Context createPackageContext(String paramString, int paramInt) throws PackageManager.NameNotFoundException;
/*    */ 
/* 85 */   public boolean isRestricted() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.Context
 * JD-Core Version:    0.6.0
 */