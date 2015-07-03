/*    */ package java.util.concurrent;
/*    */ 
/*    */ public class CyclicBarrier
/*    */ {
/*    */   public CyclicBarrier(int parties, Runnable barrierAction)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public CyclicBarrier(int parties) { throw new RuntimeException("Stub!"); } 
/*  6 */   public int getParties() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int await() throws InterruptedException, BrokenBarrierException { throw new RuntimeException("Stub!"); } 
/*  8 */   public int await(long timeout, TimeUnit unit) throws InterruptedException, BrokenBarrierException, TimeoutException { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isBroken() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void reset() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getNumberWaiting() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.CyclicBarrier
 * JD-Core Version:    0.6.0
 */