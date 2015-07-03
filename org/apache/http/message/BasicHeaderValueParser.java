/*    */ package org.apache.http.message;
/*    */ 
/*    */ import org.apache.http.HeaderElement;
/*    */ import org.apache.http.NameValuePair;
/*    */ import org.apache.http.ParseException;
/*    */ import org.apache.http.util.CharArrayBuffer;
/*    */ 
/*    */ public class BasicHeaderValueParser
/*    */   implements HeaderValueParser
/*    */ {
/* 18 */   public static final BasicHeaderValueParser DEFAULT = null;
/*    */ 
/*    */   public BasicHeaderValueParser()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static final HeaderElement[] parseElements(String value, HeaderValueParser parser) throws ParseException { throw new RuntimeException("Stub!"); } 
/*  7 */   public HeaderElement[] parseElements(CharArrayBuffer buffer, ParserCursor cursor) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static final HeaderElement parseHeaderElement(String value, HeaderValueParser parser) throws ParseException { throw new RuntimeException("Stub!"); } 
/*  9 */   public HeaderElement parseHeaderElement(CharArrayBuffer buffer, ParserCursor cursor) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected HeaderElement createHeaderElement(String name, String value, NameValuePair[] params) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static final NameValuePair[] parseParameters(String value, HeaderValueParser parser) throws ParseException { throw new RuntimeException("Stub!"); } 
/* 12 */   public NameValuePair[] parseParameters(CharArrayBuffer buffer, ParserCursor cursor) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static final NameValuePair parseNameValuePair(String value, HeaderValueParser parser) throws ParseException { throw new RuntimeException("Stub!"); } 
/* 14 */   public NameValuePair parseNameValuePair(CharArrayBuffer buffer, ParserCursor cursor) { throw new RuntimeException("Stub!"); } 
/* 15 */   public NameValuePair parseNameValuePair(CharArrayBuffer buffer, ParserCursor cursor, char[] delimiters) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected NameValuePair createNameValuePair(String name, String value) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.message.BasicHeaderValueParser
 * JD-Core Version:    0.6.0
 */