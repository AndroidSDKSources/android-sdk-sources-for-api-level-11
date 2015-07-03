/*    */ package android.content;
/*    */ 
/*    */ import android.accounts.Account;
/*    */ import android.content.res.AssetFileDescriptor;
/*    */ import android.database.ContentObserver;
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import android.os.RemoteException;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public abstract class ContentResolver
/*    */ {
/*    */   public static final String SYNC_EXTRAS_ACCOUNT = "account";
/*    */   public static final String SYNC_EXTRAS_EXPEDITED = "expedited";
/*    */   public static final String SYNC_EXTRAS_FORCE = "force";
/*    */   public static final String SYNC_EXTRAS_IGNORE_SETTINGS = "ignore_settings";
/*    */   public static final String SYNC_EXTRAS_IGNORE_BACKOFF = "ignore_backoff";
/*    */   public static final String SYNC_EXTRAS_DO_NOT_RETRY = "do_not_retry";
/*    */   public static final String SYNC_EXTRAS_MANUAL = "force";
/*    */   public static final String SYNC_EXTRAS_UPLOAD = "upload";
/*    */   public static final String SYNC_EXTRAS_OVERRIDE_TOO_MANY_DELETIONS = "deletions_override";
/*    */   public static final String SYNC_EXTRAS_DISCARD_LOCAL_DELETIONS = "discard_deletions";
/*    */   public static final String SYNC_EXTRAS_INITIALIZE = "initialize";
/*    */   public static final String SCHEME_CONTENT = "content";
/*    */   public static final String SCHEME_ANDROID_RESOURCE = "android.resource";
/*    */   public static final String SCHEME_FILE = "file";
/*    */   public static final String CURSOR_ITEM_BASE_TYPE = "vnd.android.cursor.item";
/*    */   public static final String CURSOR_DIR_BASE_TYPE = "vnd.android.cursor.dir";
/*    */   public static final int SYNC_OBSERVER_TYPE_SETTINGS = 1;
/*    */   public static final int SYNC_OBSERVER_TYPE_PENDING = 2;
/*    */   public static final int SYNC_OBSERVER_TYPE_ACTIVE = 4;
/*    */ 
/*    */   public ContentResolver(Context context)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final String getType(Uri url) { throw new RuntimeException("Stub!"); } 
/*  6 */   public String[] getStreamTypes(Uri url, String mimeTypeFilter) { throw new RuntimeException("Stub!"); } 
/*  7 */   public final Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) { throw new RuntimeException("Stub!"); } 
/*  8 */   public final InputStream openInputStream(Uri uri) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/*  9 */   public final OutputStream openOutputStream(Uri uri) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 10 */   public final OutputStream openOutputStream(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 11 */   public final ParcelFileDescriptor openFileDescriptor(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 12 */   public final AssetFileDescriptor openAssetFileDescriptor(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 13 */   public final AssetFileDescriptor openTypedAssetFileDescriptor(Uri uri, String mimeType, Bundle opts) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 14 */   public final Uri insert(Uri url, ContentValues values) { throw new RuntimeException("Stub!"); } 
/* 15 */   public ContentProviderResult[] applyBatch(String authority, ArrayList<ContentProviderOperation> operations) throws RemoteException, OperationApplicationException { throw new RuntimeException("Stub!"); } 
/* 16 */   public final int bulkInsert(Uri url, ContentValues[] values) { throw new RuntimeException("Stub!"); } 
/* 17 */   public final int delete(Uri url, String where, String[] selectionArgs) { throw new RuntimeException("Stub!"); } 
/* 18 */   public final int update(Uri uri, ContentValues values, String where, String[] selectionArgs) { throw new RuntimeException("Stub!"); } 
/* 19 */   public final Bundle call(Uri uri, String method, String arg, Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 20 */   public final ContentProviderClient acquireContentProviderClient(Uri uri) { throw new RuntimeException("Stub!"); } 
/* 21 */   public final ContentProviderClient acquireContentProviderClient(String name) { throw new RuntimeException("Stub!"); } 
/* 22 */   public final void registerContentObserver(Uri uri, boolean notifyForDescendents, ContentObserver observer) { throw new RuntimeException("Stub!"); } 
/* 23 */   public final void unregisterContentObserver(ContentObserver observer) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void notifyChange(Uri uri, ContentObserver observer) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void notifyChange(Uri uri, ContentObserver observer, boolean syncToNetwork) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void startSync(Uri uri, Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 27 */   public static void requestSync(Account account, String authority, Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 28 */   public static void validateSyncExtrasBundle(Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void cancelSync(Uri uri) { throw new RuntimeException("Stub!"); } 
/* 30 */   public static void cancelSync(Account account, String authority) { throw new RuntimeException("Stub!"); } 
/* 31 */   public static SyncAdapterType[] getSyncAdapterTypes() { throw new RuntimeException("Stub!"); } 
/* 32 */   public static boolean getSyncAutomatically(Account account, String authority) { throw new RuntimeException("Stub!"); } 
/* 33 */   public static void setSyncAutomatically(Account account, String authority, boolean sync) { throw new RuntimeException("Stub!"); } 
/* 34 */   public static void addPeriodicSync(Account account, String authority, Bundle extras, long pollFrequency) { throw new RuntimeException("Stub!"); } 
/* 35 */   public static void removePeriodicSync(Account account, String authority, Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 36 */   public static List<PeriodicSync> getPeriodicSyncs(Account account, String authority) { throw new RuntimeException("Stub!"); } 
/* 37 */   public static int getIsSyncable(Account account, String authority) { throw new RuntimeException("Stub!"); } 
/* 38 */   public static void setIsSyncable(Account account, String authority, int syncable) { throw new RuntimeException("Stub!"); } 
/* 39 */   public static boolean getMasterSyncAutomatically() { throw new RuntimeException("Stub!"); } 
/* 40 */   public static void setMasterSyncAutomatically(boolean sync) { throw new RuntimeException("Stub!"); } 
/* 41 */   public static boolean isSyncActive(Account account, String authority) { throw new RuntimeException("Stub!"); } 
/* 42 */   public static SyncInfo getCurrentSync() { throw new RuntimeException("Stub!"); } 
/* 43 */   public static List<SyncInfo> getCurrentSyncs() { throw new RuntimeException("Stub!"); } 
/* 44 */   public static boolean isSyncPending(Account account, String authority) { throw new RuntimeException("Stub!"); } 
/* 45 */   public static Object addStatusChangeListener(int mask, SyncStatusObserver callback) { throw new RuntimeException("Stub!"); } 
/* 46 */   public static void removeStatusChangeListener(Object handle) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.ContentResolver
 * JD-Core Version:    0.6.0
 */