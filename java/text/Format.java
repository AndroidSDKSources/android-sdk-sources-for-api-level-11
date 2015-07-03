/*    */ package java.text;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public abstract class Format
/*    */   implements Serializable, Cloneable
/*    */ {
/*    */   protected Format()
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final String format(Object object) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract StringBuffer format(Object paramObject, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition);
/*    */ 
/* 14 */   public AttributedCharacterIterator formatToCharacterIterator(Object object) { throw new RuntimeException("Stub!"); } 
/* 15 */   public Object parseObject(String string) throws ParseException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract Object parseObject(String paramString, ParsePosition paramParsePosition);
/*    */ 
/*    */   public static class Field extends AttributedCharacterIterator.Attribute
/*    */   {
/*    */     protected Field(String fieldName)
/*    */     {
/*  8 */       super(); throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.text.Format
 * JD-Core Version:    0.6.0
 */