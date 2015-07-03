/*    */ package java.text;
/*    */ 
/*    */ import java.util.Calendar;
/*    */ import java.util.Date;
/*    */ import java.util.Locale;
/*    */ import java.util.TimeZone;
/*    */ 
/*    */ public abstract class DateFormat extends Format
/*    */ {
/*    */   protected Calendar calendar;
/*    */   protected NumberFormat numberFormat;
/*    */   public static final int DEFAULT = 2;
/*    */   public static final int FULL = 0;
/*    */   public static final int LONG = 1;
/*    */   public static final int MEDIUM = 2;
/*    */   public static final int SHORT = 3;
/*    */   public static final int ERA_FIELD = 0;
/*    */   public static final int YEAR_FIELD = 1;
/*    */   public static final int MONTH_FIELD = 2;
/*    */   public static final int DATE_FIELD = 3;
/*    */   public static final int HOUR_OF_DAY1_FIELD = 4;
/*    */   public static final int HOUR_OF_DAY0_FIELD = 5;
/*    */   public static final int MINUTE_FIELD = 6;
/*    */   public static final int SECOND_FIELD = 7;
/*    */   public static final int MILLISECOND_FIELD = 8;
/*    */   public static final int DAY_OF_WEEK_FIELD = 9;
/*    */   public static final int DAY_OF_YEAR_FIELD = 10;
/*    */   public static final int DAY_OF_WEEK_IN_MONTH_FIELD = 11;
/*    */   public static final int WEEK_OF_YEAR_FIELD = 12;
/*    */   public static final int WEEK_OF_MONTH_FIELD = 13;
/*    */   public static final int AM_PM_FIELD = 14;
/*    */   public static final int HOUR1_FIELD = 15;
/*    */   public static final int HOUR0_FIELD = 16;
/*    */   public static final int TIMEZONE_FIELD = 17;
/*    */ 
/*    */   protected DateFormat()
/*    */   {
/* 31 */     throw new RuntimeException("Stub!"); } 
/* 32 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/* 33 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 34 */   public final StringBuffer format(Object object, StringBuffer buffer, FieldPosition field) { throw new RuntimeException("Stub!"); } 
/* 35 */   public final String format(Date date) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract StringBuffer format(Date paramDate, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition);
/*    */ 
/* 37 */   public static Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); } 
/* 38 */   public Calendar getCalendar() { throw new RuntimeException("Stub!"); } 
/* 39 */   public static final DateFormat getDateInstance() { throw new RuntimeException("Stub!"); } 
/* 40 */   public static final DateFormat getDateInstance(int style) { throw new RuntimeException("Stub!"); } 
/* 41 */   public static final DateFormat getDateInstance(int style, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 42 */   public static final DateFormat getDateTimeInstance() { throw new RuntimeException("Stub!"); } 
/* 43 */   public static final DateFormat getDateTimeInstance(int dateStyle, int timeStyle) { throw new RuntimeException("Stub!"); } 
/* 44 */   public static final DateFormat getDateTimeInstance(int dateStyle, int timeStyle, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 45 */   public static final DateFormat getInstance() { throw new RuntimeException("Stub!"); } 
/* 46 */   public NumberFormat getNumberFormat() { throw new RuntimeException("Stub!"); } 
/* 47 */   public static final DateFormat getTimeInstance() { throw new RuntimeException("Stub!"); } 
/* 48 */   public static final DateFormat getTimeInstance(int style) { throw new RuntimeException("Stub!"); } 
/* 49 */   public static final DateFormat getTimeInstance(int style, Locale locale) { throw new RuntimeException("Stub!"); } 
/* 50 */   public TimeZone getTimeZone() { throw new RuntimeException("Stub!"); } 
/* 51 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 52 */   public boolean isLenient() { throw new RuntimeException("Stub!"); } 
/* 53 */   public Date parse(String string) throws ParseException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Date parse(String paramString, ParsePosition paramParsePosition);
/*    */ 
/* 55 */   public Object parseObject(String string, ParsePosition position) { throw new RuntimeException("Stub!"); } 
/* 56 */   public void setCalendar(Calendar cal) { throw new RuntimeException("Stub!"); } 
/* 57 */   public void setLenient(boolean value) { throw new RuntimeException("Stub!"); } 
/* 58 */   public void setNumberFormat(NumberFormat format) { throw new RuntimeException("Stub!"); } 
/* 59 */   public void setTimeZone(TimeZone timezone) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Field extends Format.Field
/*    */   {
/* 29 */     public static final Field ERA = null; public static final Field YEAR = null; public static final Field MONTH = null; public static final Field HOUR_OF_DAY0 = null; public static final Field HOUR_OF_DAY1 = null; public static final Field MINUTE = null; public static final Field SECOND = null; public static final Field MILLISECOND = null; public static final Field DAY_OF_WEEK = null; public static final Field DAY_OF_MONTH = null; public static final Field DAY_OF_YEAR = null; public static final Field DAY_OF_WEEK_IN_MONTH = null; public static final Field WEEK_OF_YEAR = null; public static final Field WEEK_OF_MONTH = null; public static final Field AM_PM = null; public static final Field HOUR0 = null; public static final Field HOUR1 = null; public static final Field TIME_ZONE = null;
/*    */ 
/*    */     protected Field(String fieldName, int calendarField)
/*    */     {
/*  8 */       super(); throw new RuntimeException("Stub!"); } 
/*  9 */     public int getCalendarField() { throw new RuntimeException("Stub!"); } 
/* 10 */     public static Field ofCalendarField(int calendarField) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.text.DateFormat
 * JD-Core Version:    0.6.0
 */