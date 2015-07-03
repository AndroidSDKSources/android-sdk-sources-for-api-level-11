/*    */ package org.xml.sax;
/*    */ 
/*    */ @Deprecated
/*    */ public class HandlerBase
/*    */   implements EntityResolver, DTDHandler, DocumentHandler, ErrorHandler
/*    */ {
/*    */   public HandlerBase()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public InputSource resolveEntity(String publicId, String systemId) throws SAXException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void notationDecl(String name, String publicId, String systemId) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setDocumentLocator(Locator locator) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void startDocument() throws SAXException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void endDocument() throws SAXException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void startElement(String name, AttributeList attributes) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void endElement(String name) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 15 */   public void characters(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 16 */   public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 17 */   public void processingInstruction(String target, String data) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 18 */   public void warning(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 19 */   public void error(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void fatalError(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.xml.sax.HandlerBase
 * JD-Core Version:    0.6.0
 */