/*    */ package org.xml.sax.helpers;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.Locale;
/*    */ import org.xml.sax.Attributes;
/*    */ import org.xml.sax.ContentHandler;
/*    */ import org.xml.sax.DTDHandler;
/*    */ import org.xml.sax.DocumentHandler;
/*    */ import org.xml.sax.EntityResolver;
/*    */ import org.xml.sax.ErrorHandler;
/*    */ import org.xml.sax.InputSource;
/*    */ import org.xml.sax.Locator;
/*    */ import org.xml.sax.Parser;
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xml.sax.XMLReader;
/*    */ 
/*    */ public class XMLReaderAdapter
/*    */   implements Parser, ContentHandler
/*    */ {
/*    */   public XMLReaderAdapter()
/*    */     throws SAXException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public XMLReaderAdapter(XMLReader xmlReader) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setLocale(Locale locale) throws SAXException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setEntityResolver(EntityResolver resolver) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setDTDHandler(DTDHandler handler) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setDocumentHandler(DocumentHandler handler) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setErrorHandler(ErrorHandler handler) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void parse(String systemId) throws IOException, SAXException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void parse(InputSource input) throws IOException, SAXException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setDocumentLocator(Locator locator) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void startDocument() throws SAXException { throw new RuntimeException("Stub!"); } 
/* 16 */   public void endDocument() throws SAXException { throw new RuntimeException("Stub!"); } 
/* 17 */   public void startPrefixMapping(String prefix, String uri) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void endPrefixMapping(String prefix) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void endElement(String uri, String localName, String qName) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 21 */   public void characters(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 22 */   public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 23 */   public void processingInstruction(String target, String data) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 24 */   public void skippedEntity(String name) throws SAXException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.xml.sax.helpers.XMLReaderAdapter
 * JD-Core Version:    0.6.0
 */