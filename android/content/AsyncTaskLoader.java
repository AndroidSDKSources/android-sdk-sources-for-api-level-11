/*    */ package android.content;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public abstract class AsyncTaskLoader<D> extends Loader<D>
/*    */ {
/*    */   public AsyncTaskLoader(Context context)
/*    */   {
/*  5 */     super((Context)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public void setUpdateThrottle(long delayMS) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void onForceLoad() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean cancelLoad() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void onCanceled(D data) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract D loadInBackground();
/*    */ 
/* 11 */   protected D onLoadInBackground() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.content.AsyncTaskLoader
 * JD-Core Version:    0.6.0
 */