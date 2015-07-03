/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Collection;
/*    */ 
/*    */ public class Semaphore
/*    */   implements Serializable
/*    */ {
/*    */   public Semaphore(int permits)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Semaphore(int permits, boolean fair) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void acquire() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void acquireUninterruptibly() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean tryAcquire() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean tryAcquire(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void release() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void acquire(int permits) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void acquireUninterruptibly(int permits) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean tryAcquire(int permits) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean tryAcquire(int permits, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 16 */   public void release(int permits) { throw new RuntimeException("Stub!"); } 
/* 17 */   public int availablePermits() { throw new RuntimeException("Stub!"); } 
/* 18 */   public int drainPermits() { throw new RuntimeException("Stub!"); } 
/* 19 */   protected void reducePermits(int reduction) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean isFair() { throw new RuntimeException("Stub!"); } 
/* 21 */   public final boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); } 
/* 22 */   public final int getQueueLength() { throw new RuntimeException("Stub!"); } 
/* 23 */   protected Collection<Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); } 
/* 24 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.Semaphore
 * JD-Core Version:    0.6.0
 */