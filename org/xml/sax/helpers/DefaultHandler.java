/*    */ package org.xml.sax.helpers;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.xml.sax.Attributes;
/*    */ import org.xml.sax.ContentHandler;
/*    */ import org.xml.sax.DTDHandler;
/*    */ import org.xml.sax.EntityResolver;
/*    */ import org.xml.sax.ErrorHandler;
/*    */ import org.xml.sax.InputSource;
/*    */ import org.xml.sax.Locator;
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xml.sax.SAXParseException;
/*    */ 
/*    */ public class DefaultHandler
/*    */   implements EntityResolver, DTDHandler, ContentHandler, ErrorHandler
/*    */ {
/*    */   public DefaultHandler()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public InputSource resolveEntity(String publicId, String systemId) throws IOException, SAXException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void notationDecl(String name, String publicId, String systemId) throws SAXException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) throws SAXException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setDocumentLocator(Locator locator) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void startDocument() throws SAXException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void endDocument() throws SAXException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void startPrefixMapping(String prefix, String uri) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void endPrefixMapping(String prefix) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 15 */   public void endElement(String uri, String localName, String qName) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 16 */   public void characters(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 17 */   public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 18 */   public void processingInstruction(String target, String data) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 19 */   public void skippedEntity(String name) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void warning(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 21 */   public void error(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 22 */   public void fatalError(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.xml.sax.helpers.DefaultHandler
 * JD-Core Version:    0.6.0
 */