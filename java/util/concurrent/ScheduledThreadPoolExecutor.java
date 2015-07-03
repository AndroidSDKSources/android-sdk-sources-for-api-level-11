/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public class ScheduledThreadPoolExecutor extends ThreadPoolExecutor
/*    */   implements ScheduledExecutorService
/*    */ {
/*    */   public ScheduledThreadPoolExecutor(int corePoolSize)
/*    */   {
/*  6 */     super(0, 0, 0L, (TimeUnit)null, (BlockingQueue)null, (ThreadFactory)null, (RejectedExecutionHandler)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public ScheduledThreadPoolExecutor(int corePoolSize, ThreadFactory threadFactory) { super(0, 0, 0L, (TimeUnit)null, (BlockingQueue)null, (ThreadFactory)null, (RejectedExecutionHandler)null); throw new RuntimeException("Stub!"); } 
/*  8 */   public ScheduledThreadPoolExecutor(int corePoolSize, RejectedExecutionHandler handler) { super(0, 0, 0L, (TimeUnit)null, (BlockingQueue)null, (ThreadFactory)null, (RejectedExecutionHandler)null); throw new RuntimeException("Stub!"); } 
/*  9 */   public ScheduledThreadPoolExecutor(int corePoolSize, ThreadFactory threadFactory, RejectedExecutionHandler handler) { super(0, 0, 0L, (TimeUnit)null, (BlockingQueue)null, (ThreadFactory)null, (RejectedExecutionHandler)null); throw new RuntimeException("Stub!"); } 
/* 10 */   protected <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> task) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected <V> RunnableScheduledFuture<V> decorateTask(Callable<V> callable, RunnableScheduledFuture<V> task) { throw new RuntimeException("Stub!"); } 
/* 12 */   public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) { throw new RuntimeException("Stub!"); } 
/* 13 */   public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) { throw new RuntimeException("Stub!"); } 
/* 14 */   public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) { throw new RuntimeException("Stub!"); } 
/* 15 */   public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void execute(Runnable command) { throw new RuntimeException("Stub!"); } 
/* 17 */   public Future<?> submit(Runnable task) { throw new RuntimeException("Stub!"); } 
/* 18 */   public <T> Future<T> submit(Runnable task, T result) { throw new RuntimeException("Stub!"); } 
/* 19 */   public <T> Future<T> submit(Callable<T> task) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean value) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean getContinueExistingPeriodicTasksAfterShutdownPolicy() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean value) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean getExecuteExistingDelayedTasksAfterShutdownPolicy() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void shutdown() { throw new RuntimeException("Stub!"); } 
/* 25 */   public List<Runnable> shutdownNow() { throw new RuntimeException("Stub!"); } 
/* 26 */   public BlockingQueue<Runnable> getQueue() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.ScheduledThreadPoolExecutor
 * JD-Core Version:    0.6.0
 */