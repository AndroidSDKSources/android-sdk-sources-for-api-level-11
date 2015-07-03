/*    */ package android.os;
/*    */ 
/*    */ public class PowerManager
/*    */ {
/*    */   public static final int PARTIAL_WAKE_LOCK = 1;
/*    */   public static final int FULL_WAKE_LOCK = 26;
/*    */   public static final int SCREEN_BRIGHT_WAKE_LOCK = 10;
/*    */   public static final int SCREEN_DIM_WAKE_LOCK = 6;
/*    */   public static final int ACQUIRE_CAUSES_WAKEUP = 268435456;
/*    */   public static final int ON_AFTER_RELEASE = 536870912;
/*    */ 
/*    */   PowerManager()
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   public WakeLock newWakeLock(int flags, String tag) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void userActivity(long when, boolean noChangeLights) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void goToSleep(long time) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean isScreenOn() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void reboot(String reason) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public class WakeLock
/*    */   {
/*    */     WakeLock()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public void setReferenceCounted(boolean value) { throw new RuntimeException("Stub!"); } 
/*  8 */     public void acquire() { throw new RuntimeException("Stub!"); } 
/*  9 */     public void acquire(long timeout) { throw new RuntimeException("Stub!"); } 
/* 10 */     public void release() { throw new RuntimeException("Stub!"); } 
/* 11 */     public boolean isHeld() { throw new RuntimeException("Stub!"); } 
/* 12 */     public void setWorkSource(WorkSource ws) { throw new RuntimeException("Stub!"); } 
/* 13 */     public String toString() { throw new RuntimeException("Stub!"); } 
/* 14 */     protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.PowerManager
 * JD-Core Version:    0.6.0
 */