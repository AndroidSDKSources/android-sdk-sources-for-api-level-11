/*   */ package java.util;
/*   */ 
/*   */ public abstract class TimerTask
/*   */   implements Runnable
/*   */ {
/*   */   protected TimerTask()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public boolean cancel() { throw new RuntimeException("Stub!"); } 
/* 7 */   public long scheduledExecutionTime() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void run();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.TimerTask
 * JD-Core Version:    0.6.0
 */