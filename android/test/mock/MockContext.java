/*    */ package android.test.mock;
/*    */ 
/*    */ import android.content.BroadcastReceiver;
/*    */ import android.content.ComponentName;
/*    */ import android.content.ContentResolver;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.content.IntentFilter;
/*    */ import android.content.IntentSender;
/*    */ import android.content.IntentSender.SendIntentException;
/*    */ import android.content.ServiceConnection;
/*    */ import android.content.SharedPreferences;
/*    */ import android.content.pm.ApplicationInfo;
/*    */ import android.content.pm.PackageManager;
/*    */ import android.content.pm.PackageManager.NameNotFoundException;
/*    */ import android.content.res.AssetManager;
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.database.DatabaseErrorHandler;
/*    */ import android.database.sqlite.SQLiteDatabase;
/*    */ import android.database.sqlite.SQLiteDatabase.CursorFactory;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import android.os.Looper;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class MockContext extends Context
/*    */ {
/*    */   public MockContext()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public AssetManager getAssets() { throw new RuntimeException("Stub!"); } 
/*  7 */   public Resources getResources() { throw new RuntimeException("Stub!"); } 
/*  8 */   public PackageManager getPackageManager() { throw new RuntimeException("Stub!"); } 
/*  9 */   public ContentResolver getContentResolver() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Looper getMainLooper() { throw new RuntimeException("Stub!"); } 
/* 11 */   public Context getApplicationContext() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setTheme(int resid) { throw new RuntimeException("Stub!"); } 
/* 13 */   public Resources.Theme getTheme() { throw new RuntimeException("Stub!"); } 
/* 14 */   public ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String getPackageName() { throw new RuntimeException("Stub!"); } 
/* 16 */   public ApplicationInfo getApplicationInfo() { throw new RuntimeException("Stub!"); } 
/* 17 */   public String getPackageResourcePath() { throw new RuntimeException("Stub!"); } 
/* 18 */   public String getPackageCodePath() { throw new RuntimeException("Stub!"); } 
/* 19 */   public SharedPreferences getSharedPreferences(String name, int mode) { throw new RuntimeException("Stub!"); } 
/* 20 */   public FileInputStream openFileInput(String name) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 21 */   public FileOutputStream openFileOutput(String name, int mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean deleteFile(String name) { throw new RuntimeException("Stub!"); } 
/* 23 */   public File getFileStreamPath(String name) { throw new RuntimeException("Stub!"); } 
/* 24 */   public String[] fileList() { throw new RuntimeException("Stub!"); } 
/* 25 */   public File getFilesDir() { throw new RuntimeException("Stub!"); } 
/* 26 */   public File getExternalFilesDir(String type) { throw new RuntimeException("Stub!"); } 
/* 27 */   public File getObbDir() { throw new RuntimeException("Stub!"); } 
/* 28 */   public File getCacheDir() { throw new RuntimeException("Stub!"); } 
/* 29 */   public File getExternalCacheDir() { throw new RuntimeException("Stub!"); } 
/* 30 */   public File getDir(String name, int mode) { throw new RuntimeException("Stub!"); } 
/* 31 */   public SQLiteDatabase openOrCreateDatabase(String file, int mode, SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); } 
/* 32 */   public SQLiteDatabase openOrCreateDatabase(String file, int mode, SQLiteDatabase.CursorFactory factory, DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); } 
/* 33 */   public File getDatabasePath(String name) { throw new RuntimeException("Stub!"); } 
/* 34 */   public String[] databaseList() { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean deleteDatabase(String name) { throw new RuntimeException("Stub!"); } 
/* 36 */   public Drawable getWallpaper() { throw new RuntimeException("Stub!"); } 
/* 37 */   public Drawable peekWallpaper() { throw new RuntimeException("Stub!"); } 
/* 38 */   public int getWallpaperDesiredMinimumWidth() { throw new RuntimeException("Stub!"); } 
/* 39 */   public int getWallpaperDesiredMinimumHeight() { throw new RuntimeException("Stub!"); } 
/* 40 */   public void setWallpaper(Bitmap bitmap) throws IOException { throw new RuntimeException("Stub!"); } 
/* 41 */   public void setWallpaper(InputStream data) throws IOException { throw new RuntimeException("Stub!"); } 
/* 42 */   public void clearWallpaper() { throw new RuntimeException("Stub!"); } 
/* 43 */   public void startActivity(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void startActivities(Intent[] intents) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException { throw new RuntimeException("Stub!"); } 
/* 46 */   public void sendBroadcast(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 47 */   public void sendBroadcast(Intent intent, String receiverPermission) { throw new RuntimeException("Stub!"); } 
/* 48 */   public void sendOrderedBroadcast(Intent intent, String receiverPermission) { throw new RuntimeException("Stub!"); } 
/* 49 */   public void sendOrderedBroadcast(Intent intent, String receiverPermission, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) { throw new RuntimeException("Stub!"); } 
/* 50 */   public void sendStickyBroadcast(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 51 */   public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) { throw new RuntimeException("Stub!"); } 
/* 52 */   public void removeStickyBroadcast(Intent intent) { throw new RuntimeException("Stub!"); } 
/* 53 */   public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) { throw new RuntimeException("Stub!"); } 
/* 54 */   public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler) { throw new RuntimeException("Stub!"); } 
/* 55 */   public void unregisterReceiver(BroadcastReceiver receiver) { throw new RuntimeException("Stub!"); } 
/* 56 */   public ComponentName startService(Intent service) { throw new RuntimeException("Stub!"); } 
/* 57 */   public boolean stopService(Intent service) { throw new RuntimeException("Stub!"); } 
/* 58 */   public boolean bindService(Intent service, ServiceConnection conn, int flags) { throw new RuntimeException("Stub!"); } 
/* 59 */   public void unbindService(ServiceConnection conn) { throw new RuntimeException("Stub!"); } 
/* 60 */   public boolean startInstrumentation(ComponentName className, String profileFile, Bundle arguments) { throw new RuntimeException("Stub!"); } 
/* 61 */   public Object getSystemService(String name) { throw new RuntimeException("Stub!"); } 
/* 62 */   public int checkPermission(String permission, int pid, int uid) { throw new RuntimeException("Stub!"); } 
/* 63 */   public int checkCallingPermission(String permission) { throw new RuntimeException("Stub!"); } 
/* 64 */   public int checkCallingOrSelfPermission(String permission) { throw new RuntimeException("Stub!"); } 
/* 65 */   public void enforcePermission(String permission, int pid, int uid, String message) { throw new RuntimeException("Stub!"); } 
/* 66 */   public void enforceCallingPermission(String permission, String message) { throw new RuntimeException("Stub!"); } 
/* 67 */   public void enforceCallingOrSelfPermission(String permission, String message) { throw new RuntimeException("Stub!"); } 
/* 68 */   public void grantUriPermission(String toPackage, Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); } 
/* 69 */   public void revokeUriPermission(Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); } 
/* 70 */   public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags) { throw new RuntimeException("Stub!"); } 
/* 71 */   public int checkCallingUriPermission(Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); } 
/* 72 */   public int checkCallingOrSelfUriPermission(Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); } 
/* 73 */   public int checkUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags) { throw new RuntimeException("Stub!"); } 
/* 74 */   public void enforceUriPermission(Uri uri, int pid, int uid, int modeFlags, String message) { throw new RuntimeException("Stub!"); } 
/* 75 */   public void enforceCallingUriPermission(Uri uri, int modeFlags, String message) { throw new RuntimeException("Stub!"); } 
/* 76 */   public void enforceCallingOrSelfUriPermission(Uri uri, int modeFlags, String message) { throw new RuntimeException("Stub!"); } 
/* 77 */   public void enforceUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags, String message) { throw new RuntimeException("Stub!"); } 
/* 78 */   public Context createPackageContext(String packageName, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); } 
/* 79 */   public boolean isRestricted() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.mock.MockContext
 * JD-Core Version:    0.6.0
 */