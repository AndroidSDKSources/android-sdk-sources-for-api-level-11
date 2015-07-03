/*    */ package android.media;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.ServiceConnection;
/*    */ import android.net.Uri;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ public class MediaScannerConnection
/*    */   implements ServiceConnection
/*    */ {
/*    */   public MediaScannerConnection(Context context, MediaScannerConnectionClient client)
/*    */   {
/* 15 */     throw new RuntimeException("Stub!"); } 
/* 16 */   public void connect() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void disconnect() { throw new RuntimeException("Stub!"); } 
/* 18 */   public synchronized boolean isConnected() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void scanFile(String path, String mimeType) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static void scanFile(Context context, String[] paths, String[] mimeTypes, OnScanCompletedListener callback) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void onServiceConnected(ComponentName className, IBinder service) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void onServiceDisconnected(ComponentName className) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface MediaScannerConnectionClient extends MediaScannerConnection.OnScanCompletedListener
/*    */   {
/*    */     public abstract void onMediaScannerConnected();
/*    */ 
/*    */     public abstract void onScanCompleted(String paramString, Uri paramUri);
/*    */   }
/*    */ 
/*    */   public static abstract interface OnScanCompletedListener
/*    */   {
/*    */     public abstract void onScanCompleted(String paramString, Uri paramUri);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.media.MediaScannerConnection
 * JD-Core Version:    0.6.0
 */