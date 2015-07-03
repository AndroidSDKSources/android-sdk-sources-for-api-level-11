/*    */ package android.app;
/*    */ 
/*    */ public class AlarmManager
/*    */ {
/*    */   public static final int RTC_WAKEUP = 0;
/*    */   public static final int RTC = 1;
/*    */   public static final int ELAPSED_REALTIME_WAKEUP = 2;
/*    */   public static final int ELAPSED_REALTIME = 3;
/*    */   public static final long INTERVAL_FIFTEEN_MINUTES = 900000L;
/*    */   public static final long INTERVAL_HALF_HOUR = 1800000L;
/*    */   public static final long INTERVAL_HOUR = 3600000L;
/*    */   public static final long INTERVAL_HALF_DAY = 43200000L;
/*    */   public static final long INTERVAL_DAY = 86400000L;
/*    */ 
/*    */   AlarmManager()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void set(int type, long triggerAtTime, PendingIntent operation) { throw new RuntimeException("Stub!"); } 
/*  6 */   public void setRepeating(int type, long triggerAtTime, long interval, PendingIntent operation) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setInexactRepeating(int type, long triggerAtTime, long interval, PendingIntent operation) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void cancel(PendingIntent operation) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setTime(long millis) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setTimeZone(String timeZone) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.AlarmManager
 * JD-Core Version:    0.6.0
 */