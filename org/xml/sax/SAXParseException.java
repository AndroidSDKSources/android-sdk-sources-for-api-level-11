/*    */ package org.xml.sax;
/*    */ 
/*    */ public class SAXParseException extends SAXException
/*    */ {
/*    */   public SAXParseException(String message, Locator locator)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public SAXParseException(String message, Locator locator, Exception e) { throw new RuntimeException("Stub!"); } 
/*  7 */   public SAXParseException(String message, String publicId, String systemId, int lineNumber, int columnNumber) { throw new RuntimeException("Stub!"); } 
/*  8 */   public SAXParseException(String message, String publicId, String systemId, int lineNumber, int columnNumber, Exception e) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getPublicId() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getSystemId() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getLineNumber() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getColumnNumber() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.xml.sax.SAXParseException
 * JD-Core Version:    0.6.0
 */