/*    */ package android.content;
/*    */ 
/*    */ import android.content.res.AssetFileDescriptor;
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import android.os.RemoteException;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class ContentProviderClient
/*    */ {
/*    */   ContentProviderClient()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public Cursor query(Uri url, String[] projection, String selection, String[] selectionArgs, String sortOrder) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  6 */   public String getType(Uri url) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  7 */   public String[] getStreamTypes(Uri url, String mimeTypeFilter) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  8 */   public Uri insert(Uri url, ContentValues initialValues) throws RemoteException { throw new RuntimeException("Stub!"); } 
/*  9 */   public int bulkInsert(Uri url, ContentValues[] initialValues) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 10 */   public int delete(Uri url, String selection, String[] selectionArgs) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 11 */   public int update(Uri url, ContentValues values, String selection, String[] selectionArgs) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 12 */   public ParcelFileDescriptor openFile(Uri url, String mode) throws RemoteException, FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 13 */   public AssetFileDescriptor openAssetFile(Uri url, String mode) throws RemoteException, FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 14 */   public final AssetFileDescriptor openTypedAssetFileDescriptor(Uri uri, String mimeType, Bundle opts) throws RemoteException, FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 15 */   public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> operations) throws RemoteException, OperationApplicationException { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean release() { throw new RuntimeException("Stub!"); } 
/* 17 */   public ContentProvider getLocalContentProvider() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.ContentProviderClient
 * JD-Core Version:    0.6.0
 */