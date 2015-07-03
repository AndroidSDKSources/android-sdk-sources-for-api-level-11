/*    */ package java.text;
/*    */ 
/*    */ import java.util.Locale;
/*    */ 
/*    */ public class MessageFormat extends Format
/*    */ {
/*    */   public MessageFormat(String template, Locale locale)
/*    */   {
/* 12 */     throw new RuntimeException("Stub!"); } 
/* 13 */   public MessageFormat(String template) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void applyPattern(String template) { throw new RuntimeException("Stub!"); } 
/* 15 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 17 */   public AttributedCharacterIterator formatToCharacterIterator(Object object) { throw new RuntimeException("Stub!"); } 
/* 18 */   public final StringBuffer format(Object[] objects, StringBuffer buffer, FieldPosition field) { throw new RuntimeException("Stub!"); } 
/* 19 */   public final StringBuffer format(Object object, StringBuffer buffer, FieldPosition field) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static String format(String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 21 */   public Format[] getFormats() { throw new RuntimeException("Stub!"); } 
/* 22 */   public Format[] getFormatsByArgumentIndex() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setFormatByArgumentIndex(int argIndex, Format format) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setFormatsByArgumentIndex(Format[] formats) { throw new RuntimeException("Stub!"); } 
/* 25 */   public Locale getLocale() { throw new RuntimeException("Stub!"); } 
/* 26 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 27 */   public Object[] parse(String string) throws ParseException { throw new RuntimeException("Stub!"); } 
/* 28 */   public Object[] parse(String string, ParsePosition position) { throw new RuntimeException("Stub!"); } 
/* 29 */   public Object parseObject(String string, ParsePosition position) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setFormat(int offset, Format format) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setFormats(Format[] formats) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setLocale(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 33 */   public String toPattern() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Field extends Format.Field
/*    */   {
/* 10 */     public static final Field ARGUMENT = null;
/*    */ 
/*    */     protected Field(String fieldName)
/*    */     {
/*  8 */       super(); throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.text.MessageFormat
 * JD-Core Version:    0.6.0
 */