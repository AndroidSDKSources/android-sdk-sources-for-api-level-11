/*    */ package org.apache.http.message;
/*    */ 
/*    */ import org.apache.http.HeaderElement;
/*    */ import org.apache.http.NameValuePair;
/*    */ import org.apache.http.util.CharArrayBuffer;
/*    */ 
/*    */ public class BasicHeaderValueFormatter
/*    */   implements HeaderValueFormatter
/*    */ {
/* 24 */   public static final BasicHeaderValueFormatter DEFAULT = null;
/*    */   public static final String SEPARATORS = " ;,:@()<>\\\"/[]?={}\t";
/*    */   public static final String UNSAFE_CHARS = "\"\\";
/*    */ 
/*    */   public BasicHeaderValueFormatter()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static final String formatElements(HeaderElement[] elems, boolean quote, HeaderValueFormatter formatter) { throw new RuntimeException("Stub!"); } 
/*  7 */   public CharArrayBuffer formatElements(CharArrayBuffer buffer, HeaderElement[] elems, boolean quote) { throw new RuntimeException("Stub!"); } 
/*  8 */   protected int estimateElementsLen(HeaderElement[] elems) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static final String formatHeaderElement(HeaderElement elem, boolean quote, HeaderValueFormatter formatter) { throw new RuntimeException("Stub!"); } 
/* 10 */   public CharArrayBuffer formatHeaderElement(CharArrayBuffer buffer, HeaderElement elem, boolean quote) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected int estimateHeaderElementLen(HeaderElement elem) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static final String formatParameters(NameValuePair[] nvps, boolean quote, HeaderValueFormatter formatter) { throw new RuntimeException("Stub!"); } 
/* 13 */   public CharArrayBuffer formatParameters(CharArrayBuffer buffer, NameValuePair[] nvps, boolean quote) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected int estimateParametersLen(NameValuePair[] nvps) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static final String formatNameValuePair(NameValuePair nvp, boolean quote, HeaderValueFormatter formatter) { throw new RuntimeException("Stub!"); } 
/* 16 */   public CharArrayBuffer formatNameValuePair(CharArrayBuffer buffer, NameValuePair nvp, boolean quote) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected int estimateNameValuePairLen(NameValuePair nvp) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void doFormatValue(CharArrayBuffer buffer, String value, boolean quote) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected boolean isSeparator(char ch) { throw new RuntimeException("Stub!"); } 
/* 20 */   protected boolean isUnsafe(char ch) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.message.BasicHeaderValueFormatter
 * JD-Core Version:    0.6.0
 */