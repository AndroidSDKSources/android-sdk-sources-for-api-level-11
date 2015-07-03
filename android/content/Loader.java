/*    */ package android.content;
/*    */ 
/*    */ import android.database.ContentObserver;
/*    */ import android.os.Handler;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public class Loader<D>
/*    */ {
/*    */   public Loader(Context context)
/*    */   {
/* 15 */     throw new RuntimeException("Stub!"); } 
/* 16 */   public void deliverResult(D data) { throw new RuntimeException("Stub!"); } 
/* 17 */   public Context getContext() { throw new RuntimeException("Stub!"); } 
/* 18 */   public int getId() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void registerListener(int id, OnLoadCompleteListener<D> listener) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void unregisterListener(OnLoadCompleteListener<D> listener) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean isStarted() { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean isAbandoned() { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean isReset() { throw new RuntimeException("Stub!"); } 
/* 24 */   public final void startLoading() { throw new RuntimeException("Stub!"); } 
/* 25 */   protected void onStartLoading() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void forceLoad() { throw new RuntimeException("Stub!"); } 
/* 27 */   protected void onForceLoad() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void stopLoading() { throw new RuntimeException("Stub!"); } 
/* 29 */   protected void onStopLoading() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void abandon() { throw new RuntimeException("Stub!"); } 
/* 31 */   protected void onAbandon() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void reset() { throw new RuntimeException("Stub!"); } 
/* 33 */   protected void onReset() { throw new RuntimeException("Stub!"); } 
/* 34 */   public boolean takeContentChanged() { throw new RuntimeException("Stub!"); } 
/* 35 */   public void onContentChanged() { throw new RuntimeException("Stub!"); } 
/* 36 */   public String dataToString(D data) { throw new RuntimeException("Stub!"); } 
/* 37 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 38 */   public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface OnLoadCompleteListener<D>
/*    */   {
/*    */     public abstract void onLoadComplete(Loader<D> paramLoader, D paramD);
/*    */   }
/*    */ 
/*    */   public final class ForceLoadContentObserver extends ContentObserver
/*    */   {
/*    */     public ForceLoadContentObserver()
/*    */     {
/*  7 */       super(); throw new RuntimeException("Stub!"); } 
/*  8 */     public boolean deliverSelfNotifications() { throw new RuntimeException("Stub!"); } 
/*  9 */     public void onChange(boolean selfChange) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.Loader
 * JD-Core Version:    0.6.0
 */