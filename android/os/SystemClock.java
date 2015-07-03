/*   */ package android.os;
/*   */ 
/*   */ public final class SystemClock
/*   */ {
/*   */   SystemClock()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static void sleep(long ms) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public static native boolean setCurrentTimeMillis(long paramLong);
/*   */ 
/*   */   public static native long uptimeMillis();
/*   */ 
/*   */   public static native long elapsedRealtime();
/*   */ 
/*   */   public static native long currentThreadTimeMillis();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.SystemClock
 * JD-Core Version:    0.6.0
 */