/*    */ package java.util.concurrent.locks;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Collection;
/*    */ import java.util.Date;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ 
/*    */ public abstract class AbstractQueuedLongSynchronizer extends AbstractOwnableSynchronizer
/*    */   implements Serializable
/*    */ {
/*    */   protected AbstractQueuedLongSynchronizer()
/*    */   {
/* 21 */     throw new RuntimeException("Stub!"); } 
/* 22 */   protected final long getState() { throw new RuntimeException("Stub!"); } 
/* 23 */   protected final void setState(long newState) { throw new RuntimeException("Stub!"); } 
/* 24 */   protected final boolean compareAndSetState(long expect, long update) { throw new RuntimeException("Stub!"); } 
/* 25 */   protected boolean tryAcquire(long arg) { throw new RuntimeException("Stub!"); } 
/* 26 */   protected boolean tryRelease(long arg) { throw new RuntimeException("Stub!"); } 
/* 27 */   protected long tryAcquireShared(long arg) { throw new RuntimeException("Stub!"); } 
/* 28 */   protected boolean tryReleaseShared(long arg) { throw new RuntimeException("Stub!"); } 
/* 29 */   protected boolean isHeldExclusively() { throw new RuntimeException("Stub!"); } 
/* 30 */   public final void acquire(long arg) { throw new RuntimeException("Stub!"); } 
/* 31 */   public final void acquireInterruptibly(long arg) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 32 */   public final boolean tryAcquireNanos(long arg, long nanosTimeout) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 33 */   public final boolean release(long arg) { throw new RuntimeException("Stub!"); } 
/* 34 */   public final void acquireShared(long arg) { throw new RuntimeException("Stub!"); } 
/* 35 */   public final void acquireSharedInterruptibly(long arg) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 36 */   public final boolean tryAcquireSharedNanos(long arg, long nanosTimeout) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 37 */   public final boolean releaseShared(long arg) { throw new RuntimeException("Stub!"); } 
/* 38 */   public final boolean hasQueuedThreads() { throw new RuntimeException("Stub!"); } 
/* 39 */   public final boolean hasContended() { throw new RuntimeException("Stub!"); } 
/* 40 */   public final Thread getFirstQueuedThread() { throw new RuntimeException("Stub!"); } 
/* 41 */   public final boolean isQueued(Thread thread) { throw new RuntimeException("Stub!"); } 
/* 42 */   public final int getQueueLength() { throw new RuntimeException("Stub!"); } 
/* 43 */   public final Collection<Thread> getQueuedThreads() { throw new RuntimeException("Stub!"); } 
/* 44 */   public final Collection<Thread> getExclusiveQueuedThreads() { throw new RuntimeException("Stub!"); } 
/* 45 */   public final Collection<Thread> getSharedQueuedThreads() { throw new RuntimeException("Stub!"); } 
/* 46 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 47 */   public final boolean owns(ConditionObject condition) { throw new RuntimeException("Stub!"); } 
/* 48 */   public final boolean hasWaiters(ConditionObject condition) { throw new RuntimeException("Stub!"); } 
/* 49 */   public final int getWaitQueueLength(ConditionObject condition) { throw new RuntimeException("Stub!"); } 
/* 50 */   public final Collection<Thread> getWaitingThreads(ConditionObject condition) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public class ConditionObject
/*    */     implements Condition, Serializable
/*    */   {
/*    */     public ConditionObject()
/*    */     {
/*  9 */       throw new RuntimeException("Stub!"); } 
/* 10 */     public final void signal() { throw new RuntimeException("Stub!"); } 
/* 11 */     public final void signalAll() { throw new RuntimeException("Stub!"); } 
/* 12 */     public final void awaitUninterruptibly() { throw new RuntimeException("Stub!"); } 
/* 13 */     public final void await() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 14 */     public final long awaitNanos(long nanosTimeout) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 15 */     public final boolean awaitUntil(Date deadline) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 16 */     public final boolean await(long time, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 17 */     protected final boolean hasWaiters() { throw new RuntimeException("Stub!"); } 
/* 18 */     protected final int getWaitQueueLength() { throw new RuntimeException("Stub!"); } 
/* 19 */     protected final Collection<Thread> getWaitingThreads() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.locks.AbstractQueuedLongSynchronizer
 * JD-Core Version:    0.6.0
 */