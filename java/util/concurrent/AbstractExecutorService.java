/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ 
/*    */ public abstract class AbstractExecutorService
/*    */   implements ExecutorService
/*    */ {
/*    */   public AbstractExecutorService()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T value) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Future<?> submit(Runnable task) { throw new RuntimeException("Stub!"); } 
/*  9 */   public <T> Future<T> submit(Runnable task, T result) { throw new RuntimeException("Stub!"); } 
/* 10 */   public <T> Future<T> submit(Callable<T> task) { throw new RuntimeException("Stub!"); } 
/* 11 */   public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException { throw new RuntimeException("Stub!"); } 
/* 12 */   public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException { throw new RuntimeException("Stub!"); } 
/* 13 */   public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 14 */   public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.AbstractExecutorService
 * JD-Core Version:    0.6.0
 */