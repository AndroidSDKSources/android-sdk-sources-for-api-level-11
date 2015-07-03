/*    */ package java.util.concurrent;
/*    */ 
/*    */ public enum TimeUnit
/*    */ {
/*  4 */   DAYS, 
/*  5 */   HOURS, 
/*  6 */   MICROSECONDS, 
/*  7 */   MILLISECONDS, 
/*  8 */   MINUTES, 
/*  9 */   NANOSECONDS, 
/* 10 */   SECONDS;
/*    */ 
/* 11 */   public long convert(long sourceDuration, TimeUnit sourceUnit) { throw new RuntimeException("Stub!"); } 
/* 12 */   public long toNanos(long duration) { throw new RuntimeException("Stub!"); } 
/* 13 */   public long toMicros(long duration) { throw new RuntimeException("Stub!"); } 
/* 14 */   public long toMillis(long duration) { throw new RuntimeException("Stub!"); } 
/* 15 */   public long toSeconds(long duration) { throw new RuntimeException("Stub!"); } 
/* 16 */   public long toMinutes(long duration) { throw new RuntimeException("Stub!"); } 
/* 17 */   public long toHours(long duration) { throw new RuntimeException("Stub!"); } 
/* 18 */   public long toDays(long duration) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void timedWait(Object obj, long timeout) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void timedJoin(Thread thread, long timeout) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 21 */   public void sleep(long timeout) throws InterruptedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.TimeUnit
 * JD-Core Version:    0.6.0
 */