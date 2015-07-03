/*   */ package android.os;
/*   */ 
/*   */ public abstract class CountDownTimer
/*   */ {
/*   */   public CountDownTimer(long millisInFuture, long countDownInterval)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public final void cancel() { throw new RuntimeException("Stub!"); } 
/* 6 */   public final synchronized CountDownTimer start() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void onTick(long paramLong);
/*   */ 
/*   */   public abstract void onFinish();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.CountDownTimer
 * JD-Core Version:    0.6.0
 */