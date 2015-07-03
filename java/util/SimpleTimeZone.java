/*    */ package java.util;
/*    */ 
/*    */ public class SimpleTimeZone extends TimeZone
/*    */ {
/*    */   public static final int UTC_TIME = 2;
/*    */   public static final int STANDARD_TIME = 1;
/*    */   public static final int WALL_TIME = 0;
/*    */ 
/*    */   public SimpleTimeZone(int offset, String name)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public SimpleTimeZone(int offset, String name, int startMonth, int startDay, int startDayOfWeek, int startTime, int endMonth, int endDay, int endDayOfWeek, int endTime) { throw new RuntimeException("Stub!"); } 
/*  7 */   public SimpleTimeZone(int offset, String name, int startMonth, int startDay, int startDayOfWeek, int startTime, int endMonth, int endDay, int endDayOfWeek, int endTime, int daylightSavings) { throw new RuntimeException("Stub!"); } 
/*  8 */   public SimpleTimeZone(int offset, String name, int startMonth, int startDay, int startDayOfWeek, int startTime, int startTimeMode, int endMonth, int endDay, int endDayOfWeek, int endTime, int endTimeMode, int daylightSavings) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getDSTSavings() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getOffset(int era, int year, int month, int day, int dayOfWeek, int time) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getOffset(long time) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getRawOffset() { throw new RuntimeException("Stub!"); } 
/* 15 */   public synchronized int hashCode() { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean hasSameRules(TimeZone zone) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean inDaylightTime(Date time) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setDSTSavings(int milliseconds) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setEndRule(int month, int dayOfMonth, int time) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setEndRule(int month, int day, int dayOfWeek, int time) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setEndRule(int month, int day, int dayOfWeek, int time, boolean after) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setRawOffset(int offset) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setStartRule(int month, int dayOfMonth, int time) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setStartRule(int month, int day, int dayOfWeek, int time) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setStartRule(int month, int day, int dayOfWeek, int time, boolean after) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setStartYear(int year) { throw new RuntimeException("Stub!"); } 
/* 27 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean useDaylightTime() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.SimpleTimeZone
 * JD-Core Version:    0.6.0
 */