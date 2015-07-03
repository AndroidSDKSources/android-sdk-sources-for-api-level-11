/*    */ package org.apache.http.impl.cookie;
/*    */ 
/*    */ import java.util.Date;
/*    */ import java.util.TimeZone;
/*    */ 
/*    */ public final class DateUtils
/*    */ {
/*    */   public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
/*    */   public static final String PATTERN_RFC1036 = "EEEE, dd-MMM-yy HH:mm:ss zzz";
/*    */   public static final String PATTERN_ASCTIME = "EEE MMM d HH:mm:ss yyyy";
/* 14 */   public static final TimeZone GMT = null;
/*    */ 
/*    */   DateUtils()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static Date parseDate(String dateValue) throws DateParseException { throw new RuntimeException("Stub!"); } 
/*  6 */   public static Date parseDate(String dateValue, String[] dateFormats) throws DateParseException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static Date parseDate(String dateValue, String[] dateFormats, Date startDate) throws DateParseException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static String formatDate(Date date) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static String formatDate(Date date, String pattern) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.cookie.DateUtils
 * JD-Core Version:    0.6.0
 */