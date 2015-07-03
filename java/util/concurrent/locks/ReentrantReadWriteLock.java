/*    */ package java.util.concurrent.locks;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ 
/*    */ public class ReentrantReadWriteLock
/*    */   implements ReadWriteLock, Serializable
/*    */ {
/*    */   public ReentrantReadWriteLock()
/*    */   {
/* 31 */     throw new RuntimeException("Stub!"); } 
/* 32 */   public ReentrantReadWriteLock(boolean fair) { throw new RuntimeException("Stub!"); } 
/* 33 */   public WriteLock writeLock() { throw new RuntimeException("Stub!"); } 
/* 34 */   public ReadLock readLock() { throw new RuntimeException("Stub!"); } 
/* 35 */   public final boolean isFair() { throw new RuntimeException("Stub!"); } 
/* 36 */   protected Thread getOwner() { throw new RuntimeException("Stub!"); } 
/* 37 */   public int getReadLockCount() { throw new RuntimeException("Stub!"); } 
/* 38 */   public boolean isWriteLocked() { throw new RuntimeException("Stub!"); } 
/* 39 */   public boolean isWriteLockedByCurrentThread() { throw new RuntimeException("Stub!"); } 
/* 40 */   public int getWriteHoldCount() { throw new RuntimeException("Stub!"); } 
/* 41 */   public int getReadHoldCount() { throw new RuntimeException("Stub!"); } 
/* 42 */   protected Collection<Thread> getQueuedWriterThreads() { throw new RuntimeException("Stub!"); } 
/* 43 */   protected Collection<Thread> getQueuedReaderThreads() { throw new RuntimeException("Stub!"); } 
/* 44 */   public final boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); } 
/* 45 */   public final boolean hasQueuedThread(Thread thread) { throw new RuntimeException("Stub!"); } 
/* 46 */   public final int getQueueLength() { throw new RuntimeException("Stub!"); } 
/* 47 */   protected Collection<Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); } 
/* 48 */   public boolean hasWaiters(Condition condition) { throw new RuntimeException("Stub!"); } 
/* 49 */   public int getWaitQueueLength(Condition condition) { throw new RuntimeException("Stub!"); } 
/* 50 */   protected Collection<Thread> getWaitingThreads(Condition condition) { throw new RuntimeException("Stub!"); } 
/* 51 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class WriteLock
/*    */     implements Lock, Serializable
/*    */   {
/*    */     protected WriteLock(ReentrantReadWriteLock lock)
/*    */     {
/* 20 */       throw new RuntimeException("Stub!"); } 
/* 21 */     public void lock() { throw new RuntimeException("Stub!"); } 
/* 22 */     public void lockInterruptibly() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 23 */     public boolean tryLock() { throw new RuntimeException("Stub!"); } 
/* 24 */     public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 25 */     public void unlock() { throw new RuntimeException("Stub!"); } 
/* 26 */     public Condition newCondition() { throw new RuntimeException("Stub!"); } 
/* 27 */     public String toString() { throw new RuntimeException("Stub!"); } 
/* 28 */     public boolean isHeldByCurrentThread() { throw new RuntimeException("Stub!"); } 
/* 29 */     public int getHoldCount() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class ReadLock
/*    */     implements Lock, Serializable
/*    */   {
/*    */     protected ReadLock(ReentrantReadWriteLock lock)
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public void lock() { throw new RuntimeException("Stub!"); } 
/* 10 */     public void lockInterruptibly() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 11 */     public boolean tryLock() { throw new RuntimeException("Stub!"); } 
/* 12 */     public boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 13 */     public void unlock() { throw new RuntimeException("Stub!"); } 
/* 14 */     public Condition newCondition() { throw new RuntimeException("Stub!"); } 
/* 15 */     public String toString() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.locks.ReentrantReadWriteLock
 * JD-Core Version:    0.6.0
 */