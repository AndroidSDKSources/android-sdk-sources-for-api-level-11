/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public class ThreadPoolExecutor extends AbstractExecutorService
/*    */ {
/*    */   public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue)
/*    */   {
/* 29 */     throw new RuntimeException("Stub!"); } 
/* 30 */   public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); } 
/* 31 */   public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) { throw new RuntimeException("Stub!"); } 
/* 32 */   public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void execute(Runnable command) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void shutdown() { throw new RuntimeException("Stub!"); } 
/* 35 */   public List<Runnable> shutdownNow() { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean isShutdown() { throw new RuntimeException("Stub!"); } 
/* 37 */   public boolean isTerminating() { throw new RuntimeException("Stub!"); } 
/* 38 */   public boolean isTerminated() { throw new RuntimeException("Stub!"); } 
/* 39 */   public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 40 */   protected void finalize() { throw new RuntimeException("Stub!"); } 
/* 41 */   public void setThreadFactory(ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); } 
/* 42 */   public ThreadFactory getThreadFactory() { throw new RuntimeException("Stub!"); } 
/* 43 */   public void setRejectedExecutionHandler(RejectedExecutionHandler handler) { throw new RuntimeException("Stub!"); } 
/* 44 */   public RejectedExecutionHandler getRejectedExecutionHandler() { throw new RuntimeException("Stub!"); } 
/* 45 */   public void setCorePoolSize(int corePoolSize) { throw new RuntimeException("Stub!"); } 
/* 46 */   public int getCorePoolSize() { throw new RuntimeException("Stub!"); } 
/* 47 */   public boolean prestartCoreThread() { throw new RuntimeException("Stub!"); } 
/* 48 */   public int prestartAllCoreThreads() { throw new RuntimeException("Stub!"); } 
/* 49 */   public boolean allowsCoreThreadTimeOut() { throw new RuntimeException("Stub!"); } 
/* 50 */   public void allowCoreThreadTimeOut(boolean value) { throw new RuntimeException("Stub!"); } 
/* 51 */   public void setMaximumPoolSize(int maximumPoolSize) { throw new RuntimeException("Stub!"); } 
/* 52 */   public int getMaximumPoolSize() { throw new RuntimeException("Stub!"); } 
/* 53 */   public void setKeepAliveTime(long time, TimeUnit unit) { throw new RuntimeException("Stub!"); } 
/* 54 */   public long getKeepAliveTime(TimeUnit unit) { throw new RuntimeException("Stub!"); } 
/* 55 */   public BlockingQueue<Runnable> getQueue() { throw new RuntimeException("Stub!"); } 
/* 56 */   public boolean remove(Runnable task) { throw new RuntimeException("Stub!"); } 
/* 57 */   public void purge() { throw new RuntimeException("Stub!"); } 
/* 58 */   public int getPoolSize() { throw new RuntimeException("Stub!"); } 
/* 59 */   public int getActiveCount() { throw new RuntimeException("Stub!"); } 
/* 60 */   public int getLargestPoolSize() { throw new RuntimeException("Stub!"); } 
/* 61 */   public long getTaskCount() { throw new RuntimeException("Stub!"); } 
/* 62 */   public long getCompletedTaskCount() { throw new RuntimeException("Stub!"); } 
/* 63 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 64 */   protected void beforeExecute(Thread t, Runnable r) { throw new RuntimeException("Stub!"); } 
/* 65 */   protected void afterExecute(Runnable r, Throwable t) { throw new RuntimeException("Stub!"); } 
/* 66 */   protected void terminated() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class DiscardOldestPolicy
/*    */     implements RejectedExecutionHandler
/*    */   {
/*    */     public DiscardOldestPolicy()
/*    */     {
/* 26 */       throw new RuntimeException("Stub!"); } 
/* 27 */     public void rejectedExecution(Runnable r, ThreadPoolExecutor e) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class DiscardPolicy
/*    */     implements RejectedExecutionHandler
/*    */   {
/*    */     public DiscardPolicy()
/*    */     {
/* 20 */       throw new RuntimeException("Stub!"); } 
/* 21 */     public void rejectedExecution(Runnable r, ThreadPoolExecutor e) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class AbortPolicy
/*    */     implements RejectedExecutionHandler
/*    */   {
/*    */     public AbortPolicy()
/*    */     {
/* 14 */       throw new RuntimeException("Stub!"); } 
/* 15 */     public void rejectedExecution(Runnable r, ThreadPoolExecutor e) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class CallerRunsPolicy
/*    */     implements RejectedExecutionHandler
/*    */   {
/*    */     public CallerRunsPolicy()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public void rejectedExecution(Runnable r, ThreadPoolExecutor e) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.ThreadPoolExecutor
 * JD-Core Version:    0.6.0
 */