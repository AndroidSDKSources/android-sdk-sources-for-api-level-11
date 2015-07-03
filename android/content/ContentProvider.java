/*    */ package android.content;
/*    */ 
/*    */ import android.content.pm.PathPermission;
/*    */ import android.content.pm.ProviderInfo;
/*    */ import android.content.res.AssetFileDescriptor;
/*    */ import android.content.res.Configuration;
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public abstract class ContentProvider
/*    */   implements ComponentCallbacks
/*    */ {
/*    */   public ContentProvider()
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   public final Context getContext() { throw new RuntimeException("Stub!"); } 
/* 11 */   protected final void setReadPermission(String permission) { throw new RuntimeException("Stub!"); } 
/* 12 */   public final String getReadPermission() { throw new RuntimeException("Stub!"); } 
/* 13 */   protected final void setWritePermission(String permission) { throw new RuntimeException("Stub!"); } 
/* 14 */   public final String getWritePermission() { throw new RuntimeException("Stub!"); } 
/* 15 */   protected final void setPathPermissions(PathPermission[] permissions) { throw new RuntimeException("Stub!"); } 
/* 16 */   public final PathPermission[] getPathPermissions() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean onCreate();
/*    */ 
/* 18 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void onLowMemory() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2);
/*    */ 
/*    */   public abstract String getType(Uri paramUri);
/*    */ 
/*    */   public abstract Uri insert(Uri paramUri, ContentValues paramContentValues);
/*    */ 
/* 23 */   public int bulkInsert(Uri uri, ContentValues[] values) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int delete(Uri paramUri, String paramString, String[] paramArrayOfString);
/*    */ 
/*    */   public abstract int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString);
/*    */ 
/* 26 */   public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 27 */   public AssetFileDescriptor openAssetFile(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 28 */   protected final ParcelFileDescriptor openFileHelper(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 29 */   public String[] getStreamTypes(Uri uri, String mimeTypeFilter) { throw new RuntimeException("Stub!"); } 
/* 30 */   public AssetFileDescriptor openTypedAssetFile(Uri uri, String mimeTypeFilter, Bundle opts) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 31 */   public <T> ParcelFileDescriptor openPipeHelper(Uri uri, String mimeType, Bundle opts, T args, PipeDataWriter<T> func) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 32 */   protected boolean isTemporary() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void attachInfo(Context context, ProviderInfo info) { throw new RuntimeException("Stub!"); } 
/* 34 */   public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> operations) throws OperationApplicationException { throw new RuntimeException("Stub!"); } 
/* 35 */   public Bundle call(String method, String arg, Bundle extras) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void shutdown() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface PipeDataWriter<T>
/*    */   {
/*    */     public abstract void writeDataToPipe(ParcelFileDescriptor paramParcelFileDescriptor, Uri paramUri, String paramString, Bundle paramBundle, T paramT);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.ContentProvider
 * JD-Core Version:    0.6.0
 */