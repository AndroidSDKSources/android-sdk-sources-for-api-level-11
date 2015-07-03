/*    */ package javax.xml.datatype;
/*    */ 
/*    */ import java.math.BigDecimal;
/*    */ import java.util.Calendar;
/*    */ import java.util.Date;
/*    */ import javax.xml.namespace.QName;
/*    */ 
/*    */ public abstract class Duration
/*    */ {
/*    */   public Duration()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public QName getXMLSchemaType() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int getSign();
/*    */ 
/*  7 */   public int getYears() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getMonths() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getDays() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getHours() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getMinutes() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getSeconds() { throw new RuntimeException("Stub!"); } 
/* 13 */   public long getTimeInMillis(Calendar startInstant) { throw new RuntimeException("Stub!"); } 
/* 14 */   public long getTimeInMillis(Date startInstant) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Number getField(DatatypeConstants.Field paramField);
/*    */ 
/*    */   public abstract boolean isSet(DatatypeConstants.Field paramField);
/*    */ 
/*    */   public abstract Duration add(Duration paramDuration);
/*    */ 
/*    */   public abstract void addTo(Calendar paramCalendar);
/*    */ 
/* 19 */   public void addTo(Date date) { throw new RuntimeException("Stub!"); } 
/* 20 */   public Duration subtract(Duration rhs) { throw new RuntimeException("Stub!"); } 
/* 21 */   public Duration multiply(int factor) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Duration multiply(BigDecimal paramBigDecimal);
/*    */ 
/*    */   public abstract Duration negate();
/*    */ 
/*    */   public abstract Duration normalizeWith(Calendar paramCalendar);
/*    */ 
/*    */   public abstract int compare(Duration paramDuration);
/*    */ 
/* 26 */   public boolean isLongerThan(Duration duration) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean isShorterThan(Duration duration) { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean equals(Object duration) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int hashCode();
/*    */ 
/* 30 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.datatype.Duration
 * JD-Core Version:    0.6.0
 */