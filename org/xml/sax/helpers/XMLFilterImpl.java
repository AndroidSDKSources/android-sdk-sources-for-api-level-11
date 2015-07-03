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
/*    */ import org.xml.sax.SAXNotRecognizedException;
/*    */ import org.xml.sax.SAXNotSupportedException;
/*    */ import org.xml.sax.SAXParseException;
/*    */ import org.xml.sax.XMLFilter;
/*    */ import org.xml.sax.XMLReader;
/*    */ 
/*    */ public class XMLFilterImpl
/*    */   implements XMLFilter, EntityResolver, DTDHandler, ContentHandler, ErrorHandler
/*    */ {
/*    */   public XMLFilterImpl()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public XMLFilterImpl(XMLReader parent) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setParent(XMLReader parent) { throw new RuntimeException("Stub!"); } 
/*  8 */   public XMLReader getParent() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setFeature(String name, boolean value) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean getFeature(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setProperty(String name, Object value) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 12 */   public Object getProperty(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setEntityResolver(EntityResolver resolver) { throw new RuntimeException("Stub!"); } 
/* 14 */   public EntityResolver getEntityResolver() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setDTDHandler(DTDHandler handler) { throw new RuntimeException("Stub!"); } 
/* 16 */   public DTDHandler getDTDHandler() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setContentHandler(ContentHandler handler) { throw new RuntimeException("Stub!"); } 
/* 18 */   public ContentHandler getContentHandler() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setErrorHandler(ErrorHandler handler) { throw new RuntimeException("Stub!"); } 
/* 20 */   public ErrorHandler getErrorHandler() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void parse(InputSource input) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/* 22 */   public void parse(String systemId) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/* 23 */   public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/* 24 */   public void notationDecl(String name, String publicId, String systemId) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 25 */   public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setDocumentLocator(Locator locator) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void startDocument() throws SAXException { throw new RuntimeException("Stub!"); } 
/* 28 */   public void endDocument() throws SAXException { throw new RuntimeException("Stub!"); } 
/* 29 */   public void startPrefixMapping(String prefix, String uri) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 30 */   public void endPrefixMapping(String prefix) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 31 */   public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 32 */   public void endElement(String uri, String localName, String qName) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 33 */   public void characters(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 34 */   public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 35 */   public void processingInstruction(String target, String data) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 36 */   public void skippedEntity(String name) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 37 */   public void warning(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 38 */   public void error(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 39 */   public void fatalError(SAXParseException e) throws SAXException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.xml.sax.helpers.XMLFilterImpl
 * JD-Core Version:    0.6.0
 */