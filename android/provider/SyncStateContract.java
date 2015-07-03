/*    */ package android.provider;
/*    */ 
/*    */ import android.accounts.Account;
/*    */ import android.content.ContentProviderClient;
/*    */ import android.content.ContentProviderOperation;
/*    */ import android.net.Uri;
/*    */ import android.os.RemoteException;
/*    */ import android.util.Pair;
/*    */ 
/*    */ public class SyncStateContract
/*    */ {
/*    */   public SyncStateContract()
/*    */   {
/* 28 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static final class Helpers
/*    */   {
/*    */     public Helpers()
/*    */     {
/* 19 */       throw new RuntimeException("Stub!"); } 
/* 20 */     public static byte[] get(ContentProviderClient provider, Uri uri, Account account) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 21 */     public static void set(ContentProviderClient provider, Uri uri, Account account, byte[] data) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 22 */     public static Uri insert(ContentProviderClient provider, Uri uri, Account account, byte[] data) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 23 */     public static void update(ContentProviderClient provider, Uri uri, byte[] data) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 24 */     public static Pair<Uri, byte[]> getWithUri(ContentProviderClient provider, Uri uri, Account account) throws RemoteException { throw new RuntimeException("Stub!"); } 
/* 25 */     public static ContentProviderOperation newSetOperation(Uri uri, Account account, byte[] data) { throw new RuntimeException("Stub!"); } 
/* 26 */     public static ContentProviderOperation newUpdateOperation(Uri uri, byte[] data) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class Constants
/*    */     implements SyncStateContract.Columns
/*    */   {
/*    */     public static final String CONTENT_DIRECTORY = "syncstate";
/*    */ 
/*    */     public Constants()
/*    */     {
/* 14 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface Columns extends BaseColumns
/*    */   {
/*    */     public static final String ACCOUNT_NAME = "account_name";
/*    */     public static final String ACCOUNT_TYPE = "account_type";
/*    */     public static final String DATA = "data";
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.provider.SyncStateContract
 * JD-Core Version:    0.6.0
 */