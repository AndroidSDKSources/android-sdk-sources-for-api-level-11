/*    */ package android.os;
/*    */ 
/*    */ import java.util.concurrent.ExecutionException;
/*    */ import java.util.concurrent.Executor;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import java.util.concurrent.TimeoutException;
/*    */ 
/*    */ public abstract class AsyncTask<Params, Progress, Result>
/*    */ {
/* 28 */   public static final Executor THREAD_POOL_EXECUTOR = null; public static final Executor SERIAL_EXECUTOR = null;
/*    */ 
/*    */   public AsyncTask()
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public final Status getStatus() { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract Result doInBackground(Params[] paramArrayOfParams);
/*    */ 
/* 13 */   protected void onPreExecute() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void onPostExecute(Result result) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void onProgressUpdate(Progress[] values) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void onCancelled(Result result) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected void onCancelled() { throw new RuntimeException("Stub!"); } 
/* 18 */   public final boolean isCancelled() { throw new RuntimeException("Stub!"); } 
/* 19 */   public final boolean cancel(boolean mayInterruptIfRunning) { throw new RuntimeException("Stub!"); } 
/* 20 */   public final Result get() throws InterruptedException, ExecutionException { throw new RuntimeException("Stub!"); } 
/* 21 */   public final Result get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException { throw new RuntimeException("Stub!"); } 
/* 22 */   public final AsyncTask<Params, Progress, Result> execute(Params[] params) { throw new RuntimeException("Stub!"); } 
/* 23 */   public final AsyncTask<Params, Progress, Result> executeOnExecutor(Executor exec, Params[] params) { throw new RuntimeException("Stub!"); } 
/* 24 */   public static void execute(Runnable runnable) { throw new RuntimeException("Stub!"); } 
/* 25 */   protected final void publishProgress(Progress[] values) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum Status
/*    */   {
/*  6 */     FINISHED, 
/*  7 */     PENDING, 
/*  8 */     RUNNING;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.AsyncTask
 * JD-Core Version:    0.6.0
 */