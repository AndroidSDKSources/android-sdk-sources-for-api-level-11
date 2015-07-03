/*    */ package java.util.concurrent;
/*    */ 
/*    */ public class FutureTask<V>
/*    */   implements RunnableFuture<V>
/*    */ {
/*    */   public FutureTask(Callable<V> callable)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public FutureTask(Runnable runnable, V result) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean isCancelled() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean isDone() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean cancel(boolean mayInterruptIfRunning) { throw new RuntimeException("Stub!"); } 
/* 10 */   public V get() throws InterruptedException, ExecutionException { throw new RuntimeException("Stub!"); } 
/* 11 */   public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void done() { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void set(V v) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void setException(Throwable t) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void run() { throw new RuntimeException("Stub!"); } 
/* 16 */   protected boolean runAndReset() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.FutureTask
 * JD-Core Version:    0.6.0
 */