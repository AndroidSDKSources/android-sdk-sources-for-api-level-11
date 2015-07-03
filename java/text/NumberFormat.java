/*    */ package java.text;
/*    */ 
/*    */ import java.math.RoundingMode;
/*    */ import java.util.Currency;
/*    */ import java.util.Locale;
/*    */ 
/*    */ public abstract class NumberFormat extends Format
/*    */ {
/*    */   public static final int INTEGER_FIELD = 0;
/*    */   public static final int FRACTION_FIELD = 1;
/*    */ 
/*    */   protected NumberFormat()
/*    */   {
/* 22 */     throw new RuntimeException("Stub!"); } 
/* 23 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 25 */   public final String format(double value) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract StringBuffer format(double paramDouble, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition);
/*    */ 
/* 27 */   public final String format(long value) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract StringBuffer format(long paramLong, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition);
/*    */ 
/* 29 */   public StringBuffer format(Object object, StringBuffer buffer, FieldPosition field) { throw new RuntimeException("Stub!"); } 
/* 30 */   public static Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); } 
/* 31 */   public Currency getCurrency() { throw new RuntimeException("Stub!"); } 
/* 32 */   public static final NumberFormat getCurrencyInstance() { throw new RuntimeException("Stub!"); } 
/* 33 */   public static NumberFormat getCurrencyInstance(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 34 */   public static final NumberFormat getIntegerInstance() { throw new RuntimeException("Stub!"); } 
/* 35 */   public static NumberFormat getIntegerInstance(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 36 */   public static final NumberFormat getInstance() { throw new RuntimeException("Stub!"); } 
/* 37 */   public static NumberFormat getInstance(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 38 */   public int getMaximumFractionDigits() { throw new RuntimeException("Stub!"); } 
/* 39 */   public int getMaximumIntegerDigits() { throw new RuntimeException("Stub!"); } 
/* 40 */   public int getMinimumFractionDigits() { throw new RuntimeException("Stub!"); } 
/* 41 */   public int getMinimumIntegerDigits() { throw new RuntimeException("Stub!"); } 
/* 42 */   public static final NumberFormat getNumberInstance() { throw new RuntimeException("Stub!"); } 
/* 43 */   public static NumberFormat getNumberInstance(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 44 */   public static final NumberFormat getPercentInstance() { throw new RuntimeException("Stub!"); } 
/* 45 */   public static NumberFormat getPercentInstance(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 46 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 47 */   public boolean isGroupingUsed() { throw new RuntimeException("Stub!"); } 
/* 48 */   public boolean isParseIntegerOnly() { throw new RuntimeException("Stub!"); } 
/* 49 */   public Number parse(String string) throws ParseException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Number parse(String paramString, ParsePosition paramParsePosition);
/*    */ 
/* 51 */   public final Object parseObject(String string, ParsePosition position) { throw new RuntimeException("Stub!"); } 
/* 52 */   public void setCurrency(Currency currency) { throw new RuntimeException("Stub!"); } 
/* 53 */   public void setGroupingUsed(boolean value) { throw new RuntimeException("Stub!"); } 
/* 54 */   public void setMaximumFractionDigits(int value) { throw new RuntimeException("Stub!"); } 
/* 55 */   public void setMaximumIntegerDigits(int value) { throw new RuntimeException("Stub!"); } 
/* 56 */   public void setMinimumFractionDigits(int value) { throw new RuntimeException("Stub!"); } 
/* 57 */   public void setMinimumIntegerDigits(int value) { throw new RuntimeException("Stub!"); } 
/* 58 */   public void setParseIntegerOnly(boolean value) { throw new RuntimeException("Stub!"); } 
/* 59 */   public RoundingMode getRoundingMode() { throw new RuntimeException("Stub!"); } 
/* 60 */   public void setRoundingMode(RoundingMode roundingMode) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Field extends Format.Field
/*    */   {
/* 20 */     public static final Field SIGN = null; public static final Field INTEGER = null; public static final Field FRACTION = null; public static final Field EXPONENT = null; public static final Field EXPONENT_SIGN = null; public static final Field EXPONENT_SYMBOL = null; public static final Field DECIMAL_SEPARATOR = null; public static final Field GROUPING_SEPARATOR = null; public static final Field PERCENT = null; public static final Field PERMILLE = null; public static final Field CURRENCY = null;
/*    */ 
/*    */     protected Field(String fieldName)
/*    */     {
/*  8 */       super(); throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.text.NumberFormat
 * JD-Core Version:    0.6.0
 */