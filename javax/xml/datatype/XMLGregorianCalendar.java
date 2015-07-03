/*    */ package javax.xml.datatype;
/*    */ 
/*    */ import java.math.BigDecimal;
/*    */ import java.math.BigInteger;
/*    */ import java.util.GregorianCalendar;
/*    */ import java.util.Locale;
/*    */ import java.util.TimeZone;
/*    */ import javax.xml.namespace.QName;
/*    */ 
/*    */ public abstract class XMLGregorianCalendar
/*    */   implements Cloneable
/*    */ {
/*    */   public XMLGregorianCalendar()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract void clear();
/*    */ 
/*    */   public abstract void reset();
/*    */ 
/*    */   public abstract void setYear(BigInteger paramBigInteger);
/*    */ 
/*    */   public abstract void setYear(int paramInt);
/*    */ 
/*    */   public abstract void setMonth(int paramInt);
/*    */ 
/*    */   public abstract void setDay(int paramInt);
/*    */ 
/*    */   public abstract void setTimezone(int paramInt);
/*    */ 
/* 13 */   public void setTime(int hour, int minute, int second) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void setHour(int paramInt);
/*    */ 
/*    */   public abstract void setMinute(int paramInt);
/*    */ 
/*    */   public abstract void setSecond(int paramInt);
/*    */ 
/*    */   public abstract void setMillisecond(int paramInt);
/*    */ 
/*    */   public abstract void setFractionalSecond(BigDecimal paramBigDecimal);
/*    */ 
/* 19 */   public void setTime(int hour, int minute, int second, BigDecimal fractional) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setTime(int hour, int minute, int second, int millisecond) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract BigInteger getEon();
/*    */ 
/*    */   public abstract int getYear();
/*    */ 
/*    */   public abstract BigInteger getEonAndYear();
/*    */ 
/*    */   public abstract int getMonth();
/*    */ 
/*    */   public abstract int getDay();
/*    */ 
/*    */   public abstract int getTimezone();
/*    */ 
/*    */   public abstract int getHour();
/*    */ 
/*    */   public abstract int getMinute();
/*    */ 
/*    */   public abstract int getSecond();
/*    */ 
/* 30 */   public int getMillisecond() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract BigDecimal getFractionalSecond();
/*    */ 
/*    */   public abstract int compare(XMLGregorianCalendar paramXMLGregorianCalendar);
/*    */ 
/*    */   public abstract XMLGregorianCalendar normalize();
/*    */ 
/* 34 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 35 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract String toXMLFormat();
/*    */ 
/*    */   public abstract QName getXMLSchemaType();
/*    */ 
/* 38 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract boolean isValid();
/*    */ 
/*    */   public abstract void add(Duration paramDuration);
/*    */ 
/*    */   public abstract GregorianCalendar toGregorianCalendar();
/*    */ 
/*    */   public abstract GregorianCalendar toGregorianCalendar(TimeZone paramTimeZone, Locale paramLocale, XMLGregorianCalendar paramXMLGregorianCalendar);
/*    */ 
/*    */   public abstract TimeZone getTimeZone(int paramInt);
/*    */ 
/*    */   public abstract Object clone();
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.datatype.XMLGregorianCalendar
 * JD-Core Version:    0.6.0
 */