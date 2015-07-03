/*    */ package java.util.concurrent;
/*    */ 
/*    */ public class ExecutorCompletionService<V>
/*    */   implements CompletionService<V>
/*    */ {
/*    */   public ExecutorCompletionService(Executor executor)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ExecutorCompletionService(Executor executor, BlockingQueue<Future<V>> completionQueue) { throw new RuntimeException("Stub!"); } 
/*  7 */   public Future<V> submit(Callable<V> task) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Future<V> submit(Runnable task, V result) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Future<V> take() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 10 */   public Future<V> poll() { throw new RuntimeException("Stub!"); } 
/* 11 */   public Future<V> poll(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.ExecutorCompletionService
 * JD-Core Version:    0.6.0
 */