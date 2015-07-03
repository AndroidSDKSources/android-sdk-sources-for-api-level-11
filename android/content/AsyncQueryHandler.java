/*    */ package android.content;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ import android.os.Handler;
/*    */ import android.os.Looper;
/*    */ import android.os.Message;
/*    */ 
/*    */ public abstract class AsyncQueryHandler extends Handler
/*    */ {
/*    */   public AsyncQueryHandler(ContentResolver cr)
/*    */   {
/* 24 */     throw new RuntimeException("Stub!"); } 
/* 25 */   protected Handler createHandler(Looper looper) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void startQuery(int token, Object cookie, Uri uri, String[] projection, String selection, String[] selectionArgs, String orderBy) { throw new RuntimeException("Stub!"); } 
/* 27 */   public final void cancelOperation(int token) { throw new RuntimeException("Stub!"); } 
/* 28 */   public final void startInsert(int token, Object cookie, Uri uri, ContentValues initialValues) { throw new RuntimeException("Stub!"); } 
/* 29 */   public final void startUpdate(int token, Object cookie, Uri uri, ContentValues values, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); } 
/* 30 */   public final void startDelete(int token, Object cookie, Uri uri, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); } 
/* 31 */   protected void onQueryComplete(int token, Object cookie, Cursor cursor) { throw new RuntimeException("Stub!"); } 
/* 32 */   protected void onInsertComplete(int token, Object cookie, Uri uri) { throw new RuntimeException("Stub!"); } 
/* 33 */   protected void onUpdateComplete(int token, Object cookie, int result) { throw new RuntimeException("Stub!"); } 
/* 34 */   protected void onDeleteComplete(int token, Object cookie, int result) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void handleMessage(Message msg) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   protected class WorkerHandler extends Handler
/*    */   {
/*    */     public WorkerHandler(Looper looper)
/*    */     {
/* 21 */       throw new RuntimeException("Stub!"); } 
/* 22 */     public void handleMessage(Message msg) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   protected static final class WorkerArgs
/*    */   {
/*    */     public Uri uri;
/*    */     public Handler handler;
/* 10 */     public String[] projection = null;
/*    */     public String selection;
/* 12 */     public String[] selectionArgs = null;
/*    */     public String orderBy;
/*    */     public Object result;
/*    */     public Object cookie;
/*    */     public ContentValues values;
/*    */ 
/*    */     protected WorkerArgs()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.AsyncQueryHandler
 * JD-Core Version:    0.6.0
 */