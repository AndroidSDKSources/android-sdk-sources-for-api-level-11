/*    */ package org.apache.http.impl.conn.tsccm;
/*    */ 
/*    */ import java.util.Date;
/*    */ import java.util.concurrent.locks.Condition;
/*    */ 
/*    */ public class WaitingThread
/*    */ {
/*    */   public WaitingThread(Condition cond, RouteSpecificPool pool)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final Condition getCondition() { throw new RuntimeException("Stub!"); } 
/*  6 */   public final RouteSpecificPool getPool() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final Thread getThread() { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean await(Date deadline) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void wakeup() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void interrupt() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.tsccm.WaitingThread
 * JD-Core Version:    0.6.0
 */