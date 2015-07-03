/*    */ package java.util.concurrent.locks;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ 
/*    */ public class ReentrantLock
/*    */   implements Lock, Serializable
/*    */ {
/*    */   public ReentrantLock()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ReentrantLock(boolean fair) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void lock() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void lockInterruptibly() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean tryLock() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void unlock() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Condition newCondition() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getHoldCount() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean isHeldByCurrentThread() { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean isLocked() { throw new RuntimeException("Stub!"); } 
/* 16 */   public final boolean isFair() { throw new RuntimeException("Stub!"); } 
/* 17 */   protected Thread getOwner() { throw new RuntimeException("Stub!"); } 
/* 18 */   public final boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); } 
/* 19 */   public final boolean hasQueuedThread(Thread thread) { throw new RuntimeException("Stub!"); } 
/* 20 */   public final int getQueueLength() { throw new RuntimeException("Stub!"); } 
/* 21 */   protected Collection<Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean hasWaiters(Condition condition) { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getWaitQueueLength(Condition condition) { throw new RuntimeException("Stub!"); } 
/* 24 */   protected Collection<Thread> getWaitingThreads(Condition condition) { throw new RuntimeException("Stub!"); } 
/* 25 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.locks.ReentrantLock
 * JD-Core Version:    0.6.0
 */