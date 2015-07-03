/*    */ package android.test.mock;
/*    */ 
/*    */ import android.content.ContentProvider;
/*    */ import android.content.ContentProviderOperation;
/*    */ import android.content.ContentProviderResult;
/*    */ import android.content.ContentValues;
/*    */ import android.content.Context;
/*    */ import android.content.pm.PathPermission;
/*    */ import android.content.pm.ProviderInfo;
/*    */ import android.content.res.AssetFileDescriptor;
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class MockContentProvider extends ContentProvider
/*    */ {
/*    */   protected MockContentProvider()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public MockContentProvider(Context context) { throw new RuntimeException("Stub!"); } 
/*  7 */   public MockContentProvider(Context context, String readPermission, String writePermission, PathPermission[] pathPermissions) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int delete(Uri uri, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getType(Uri uri) { throw new RuntimeException("Stub!"); } 
/* 10 */   public Uri insert(Uri uri, ContentValues values) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean onCreate() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int bulkInsert(Uri uri, ContentValues[] values) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void attachInfo(Context context, ProviderInfo info) { throw new RuntimeException("Stub!"); } 
/* 16 */   public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> operations) { throw new RuntimeException("Stub!"); } 
/* 17 */   public String[] getStreamTypes(Uri url, String mimeTypeFilter) { throw new RuntimeException("Stub!"); } 
/* 18 */   public AssetFileDescriptor openTypedAssetFile(Uri url, String mimeType, Bundle opts) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.mock.MockContentProvider
 * JD-Core Version:    0.6.0
 */