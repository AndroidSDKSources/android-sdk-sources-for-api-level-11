/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public abstract class Calendar
/*    */   implements Serializable, Cloneable, Comparable<Calendar>
/*    */ {
/*    */   protected boolean areFieldsSet;
/* 55 */   protected int[] fields = null;
/* 56 */   protected boolean[] isSet = null;
/*    */   protected boolean isTimeSet;
/*    */   protected long time;
/*    */   public static final int JANUARY = 0;
/*    */   public static final int FEBRUARY = 1;
/*    */   public static final int MARCH = 2;
/*    */   public static final int APRIL = 3;
/*    */   public static final int MAY = 4;
/*    */   public static final int JUNE = 5;
/*    */   public static final int JULY = 6;
/*    */   public static final int AUGUST = 7;
/*    */   public static final int SEPTEMBER = 8;
/*    */   public static final int OCTOBER = 9;
/*    */   public static final int NOVEMBER = 10;
/*    */   public static final int DECEMBER = 11;
/*    */   public static final int UNDECIMBER = 12;
/*    */   public static final int SUNDAY = 1;
/*    */   public static final int MONDAY = 2;
/*    */   public static final int TUESDAY = 3;
/*    */   public static final int WEDNESDAY = 4;
/*    */   public static final int THURSDAY = 5;
/*    */   public static final int FRIDAY = 6;
/*    */   public static final int SATURDAY = 7;
/*    */   public static final int ERA = 0;
/*    */   public static final int YEAR = 1;
/*    */   public static final int MONTH = 2;
/*    */   public static final int WEEK_OF_YEAR = 3;
/*    */   public static final int WEEK_OF_MONTH = 4;
/*    */   public static final int DATE = 5;
/*    */   public static final int DAY_OF_MONTH = 5;
/*    */   public static final int DAY_OF_YEAR = 6;
/*    */   public static final int DAY_OF_WEEK = 7;
/*    */   public static final int DAY_OF_WEEK_IN_MONTH = 8;
/*    */   public static final int AM_PM = 9;
/*    */   public static final int HOUR = 10;
/*    */   public static final int HOUR_OF_DAY = 11;
/*    */   public static final int MINUTE = 12;
/*    */   public static final int SECOND = 13;
/*    */   public static final int MILLISECOND = 14;
/*    */   public static final int ZONE_OFFSET = 15;
/*    */   public static final int DST_OFFSET = 16;
/*    */   public static final int FIELD_COUNT = 17;
/*    */   public static final int AM = 0;
/*    */   public static final int PM = 1;
/*    */   public static final int ALL_STYLES = 0;
/*    */   public static final int SHORT = 1;
/*    */   public static final int LONG = 2;
/*    */ 
/*    */   protected Calendar()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected Calendar(TimeZone timezone, Locale locale) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void add(int paramInt1, int paramInt2);
/*    */ 
/*  8 */   public boolean after(Object calendar) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean before(Object calendar) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final void clear() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final void clear(int field) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/* 13 */   protected void complete() { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void computeFields();
/*    */ 
/*    */   protected abstract void computeTime();
/*    */ 
/* 16 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 17 */   public int get(int field) { throw new RuntimeException("Stub!"); } 
/* 18 */   public int getActualMaximum(int field) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getActualMinimum(int field) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static synchronized Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); } 
/* 21 */   public int getFirstDayOfWeek() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int getGreatestMinimum(int paramInt);
/*    */ 
/* 23 */   public static synchronized Calendar getInstance() { throw new RuntimeException("Stub!"); } 
/* 24 */   public static synchronized Calendar getInstance(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 25 */   public static synchronized Calendar getInstance(TimeZone timezone) { throw new RuntimeException("Stub!"); } 
/* 26 */   public static synchronized Calendar getInstance(TimeZone timezone, Locale locale) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int getLeastMaximum(int paramInt);
/*    */ 
/*    */   public abstract int getMaximum(int paramInt);
/*    */ 
/* 29 */   public int getMinimalDaysInFirstWeek() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int getMinimum(int paramInt);
/*    */ 
/* 31 */   public final Date getTime() { throw new RuntimeException("Stub!"); } 
/* 32 */   public long getTimeInMillis() { throw new RuntimeException("Stub!"); } 
/* 33 */   public TimeZone getTimeZone() { throw new RuntimeException("Stub!"); } 
/* 34 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 35 */   protected final int internalGet(int field) { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean isLenient() { throw new RuntimeException("Stub!"); } 
/* 37 */   public final boolean isSet(int field) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void roll(int field, int value) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void roll(int paramInt, boolean paramBoolean);
/*    */ 
/* 40 */   public void set(int field, int value) { throw new RuntimeException("Stub!"); } 
/* 41 */   public final void set(int year, int month, int day) { throw new RuntimeException("Stub!"); } 
/* 42 */   public final void set(int year, int month, int day, int hourOfDay, int minute) { throw new RuntimeException("Stub!"); } 
/* 43 */   public final void set(int year, int month, int day, int hourOfDay, int minute, int second) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void setFirstDayOfWeek(int value) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void setLenient(boolean value) { throw new RuntimeException("Stub!"); } 
/* 46 */   public void setMinimalDaysInFirstWeek(int value) { throw new RuntimeException("Stub!"); } 
/* 47 */   public final void setTime(Date date) { throw new RuntimeException("Stub!"); } 
/* 48 */   public void setTimeInMillis(long milliseconds) { throw new RuntimeException("Stub!"); } 
/* 49 */   public void setTimeZone(TimeZone timezone) { throw new RuntimeException("Stub!"); } 
/* 50 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 51 */   public int compareTo(Calendar anotherCalendar) { throw new RuntimeException("Stub!"); } 
/* 52 */   public String getDisplayName(int field, int style, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 53 */   public Map<String, Integer> getDisplayNames(int field, int style, Locale locale) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.Calendar
 * JD-Core Version:    0.6.0
 */