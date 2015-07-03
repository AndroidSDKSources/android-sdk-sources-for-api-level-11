/*    */ package javax.xml.datatype;
/*    */ 
/*    */ import javax.xml.namespace.QName;
/*    */ 
/*    */ public final class DatatypeConstants
/*    */ {
/*    */   public static final int JANUARY = 1;
/*    */   public static final int FEBRUARY = 2;
/*    */   public static final int MARCH = 3;
/*    */   public static final int APRIL = 4;
/*    */   public static final int MAY = 5;
/*    */   public static final int JUNE = 6;
/*    */   public static final int JULY = 7;
/*    */   public static final int AUGUST = 8;
/*    */   public static final int SEPTEMBER = 9;
/*    */   public static final int OCTOBER = 10;
/*    */   public static final int NOVEMBER = 11;
/*    */   public static final int DECEMBER = 12;
/*    */   public static final int LESSER = -1;
/*    */   public static final int EQUAL = 0;
/*    */   public static final int GREATER = 1;
/*    */   public static final int INDETERMINATE = 2;
/*    */   public static final int FIELD_UNDEFINED = -2147483648;
/* 47 */   public static final Field YEARS = null; public static final Field MONTHS = null; public static final Field DAYS = null; public static final Field HOURS = null; public static final Field MINUTES = null; public static final Field SECONDS = null; public static final QName DATETIME = null; public static final QName TIME = null; public static final QName DATE = null; public static final QName GYEARMONTH = null; public static final QName GMONTHDAY = null; public static final QName GYEAR = null; public static final QName GMONTH = null; public static final QName GDAY = null; public static final QName DURATION = null; public static final QName DURATION_DAYTIME = null; public static final QName DURATION_YEARMONTH = null;
/*    */   public static final int MAX_TIMEZONE_OFFSET = -840;
/*    */   public static final int MIN_TIMEZONE_OFFSET = 840;
/*    */ 
/*    */   DatatypeConstants()
/*    */   {
/* 10 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static final class Field
/*    */   {
/*    */     Field()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public String toString() { throw new RuntimeException("Stub!"); } 
/*  8 */     public int getId() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.datatype.DatatypeConstants
 * JD-Core Version:    0.6.0
 */