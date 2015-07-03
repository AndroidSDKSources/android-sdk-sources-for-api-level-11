/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.security.PrivilegedAction;
/*    */ import java.security.PrivilegedExceptionAction;
/*    */ 
/*    */ public class Executors
/*    */ {
/*    */   Executors()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static ExecutorService newFixedThreadPool(int nThreads) { throw new RuntimeException("Stub!"); } 
/*  6 */   public static ExecutorService newFixedThreadPool(int nThreads, ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static ExecutorService newSingleThreadExecutor() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static ExecutorService newCachedThreadPool() { throw new RuntimeException("Stub!"); } 
/* 10 */   public static ExecutorService newCachedThreadPool(ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static ScheduledExecutorService newSingleThreadScheduledExecutor() { throw new RuntimeException("Stub!"); } 
/* 12 */   public static ScheduledExecutorService newSingleThreadScheduledExecutor(ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize, ThreadFactory threadFactory) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static ExecutorService unconfigurableExecutorService(ExecutorService executor) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static ScheduledExecutorService unconfigurableScheduledExecutorService(ScheduledExecutorService executor) { throw new RuntimeException("Stub!"); } 
/* 17 */   public static ThreadFactory defaultThreadFactory() { throw new RuntimeException("Stub!"); } 
/* 18 */   public static ThreadFactory privilegedThreadFactory() { throw new RuntimeException("Stub!"); } 
/* 19 */   public static <T> Callable<T> callable(Runnable task, T result) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static Callable<Object> callable(Runnable task) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static Callable<Object> callable(PrivilegedAction<?> action) { throw new RuntimeException("Stub!"); } 
/* 22 */   public static Callable<Object> callable(PrivilegedExceptionAction<?> action) { throw new RuntimeException("Stub!"); } 
/* 23 */   public static <T> Callable<T> privilegedCallable(Callable<T> callable) { throw new RuntimeException("Stub!"); } 
/* 24 */   public static <T> Callable<T> privilegedCallableUsingCurrentClassLoader(Callable<T> callable) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.Executors
 * JD-Core Version:    0.6.0
 */