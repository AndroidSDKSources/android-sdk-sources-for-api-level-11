/*    */ package javax.xml.datatype;
/*    */ 
/*    */ import java.math.BigDecimal;
/*    */ import java.math.BigInteger;
/*    */ import java.util.GregorianCalendar;
/*    */ 
/*    */ public abstract class DatatypeFactory
/*    */ {
/*    */   public static final String DATATYPEFACTORY_PROPERTY = "javax.xml.datatype.DatatypeFactory";
/* 30 */   public static final String DATATYPEFACTORY_IMPLEMENTATION_CLASS = null;
/*    */ 
/*    */   protected DatatypeFactory()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static DatatypeFactory newInstance() throws DatatypeConfigurationException { throw new RuntimeException("Stub!"); } 
/*  6 */   public static DatatypeFactory newInstance(String factoryClassName, ClassLoader classLoader) throws DatatypeConfigurationException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Duration newDuration(String paramString);
/*    */ 
/*    */   public abstract Duration newDuration(long paramLong);
/*    */ 
/*    */   public abstract Duration newDuration(boolean paramBoolean, BigInteger paramBigInteger1, BigInteger paramBigInteger2, BigInteger paramBigInteger3, BigInteger paramBigInteger4, BigInteger paramBigInteger5, BigDecimal paramBigDecimal);
/*    */ 
/* 10 */   public Duration newDuration(boolean isPositive, int years, int months, int days, int hours, int minutes, int seconds) { throw new RuntimeException("Stub!"); } 
/* 11 */   public Duration newDurationDayTime(String lexicalRepresentation) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Duration newDurationDayTime(long durationInMilliseconds) { throw new RuntimeException("Stub!"); } 
/* 13 */   public Duration newDurationDayTime(boolean isPositive, BigInteger day, BigInteger hour, BigInteger minute, BigInteger second) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Duration newDurationDayTime(boolean isPositive, int day, int hour, int minute, int second) { throw new RuntimeException("Stub!"); } 
/* 15 */   public Duration newDurationYearMonth(String lexicalRepresentation) { throw new RuntimeException("Stub!"); } 
/* 16 */   public Duration newDurationYearMonth(long durationInMilliseconds) { throw new RuntimeException("Stub!"); } 
/* 17 */   public Duration newDurationYearMonth(boolean isPositive, BigInteger year, BigInteger month) { throw new RuntimeException("Stub!"); } 
/* 18 */   public Duration newDurationYearMonth(boolean isPositive, int year, int month) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract XMLGregorianCalendar newXMLGregorianCalendar();
/*    */ 
/*    */   public abstract XMLGregorianCalendar newXMLGregorianCalendar(String paramString);
/*    */ 
/*    */   public abstract XMLGregorianCalendar newXMLGregorianCalendar(GregorianCalendar paramGregorianCalendar);
/*    */ 
/*    */   public abstract XMLGregorianCalendar newXMLGregorianCalendar(BigInteger paramBigInteger, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, BigDecimal paramBigDecimal, int paramInt6);
/*    */ 
/* 23 */   public XMLGregorianCalendar newXMLGregorianCalendar(int year, int month, int day, int hour, int minute, int second, int millisecond, int timezone) { throw new RuntimeException("Stub!"); } 
/* 24 */   public XMLGregorianCalendar newXMLGregorianCalendarDate(int year, int month, int day, int timezone) { throw new RuntimeException("Stub!"); } 
/* 25 */   public XMLGregorianCalendar newXMLGregorianCalendarTime(int hours, int minutes, int seconds, int timezone) { throw new RuntimeException("Stub!"); } 
/* 26 */   public XMLGregorianCalendar newXMLGregorianCalendarTime(int hours, int minutes, int seconds, BigDecimal fractionalSecond, int timezone) { throw new RuntimeException("Stub!"); } 
/* 27 */   public XMLGregorianCalendar newXMLGregorianCalendarTime(int hours, int minutes, int seconds, int milliseconds, int timezone) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.datatype.DatatypeFactory
 * JD-Core Version:    0.6.0
 */