/*    */ package org.xml.sax.helpers;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import org.xml.sax.AttributeList;
/*    */ import org.xml.sax.ContentHandler;
/*    */ import org.xml.sax.DTDHandler;
/*    */ import org.xml.sax.DocumentHandler;
/*    */ import org.xml.sax.EntityResolver;
/*    */ import org.xml.sax.ErrorHandler;
/*    */ import org.xml.sax.InputSource;
/*    */ import org.xml.sax.Locator;
/*    */ import org.xml.sax.Parser;
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xml.sax.SAXNotRecognizedException;
/*    */ import org.xml.sax.SAXNotSupportedException;
/*    */ import org.xml.sax.XMLReader;
/*    */ 
/*    */ public class ParserAdapter
/*    */   implements XMLReader, DocumentHandler
/*    */ {
/*    */   public ParserAdapter()
/*    */     throws SAXException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ParserAdapter(Parser parser) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setFeature(String name, boolean value) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean getFeature(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setProperty(String name, Object value) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 10 */   public Object getProperty(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setEntityResolver(EntityResolver resolver) { throw new RuntimeException("Stub!"); } 
/* 12 */   public EntityResolver getEntityResolver() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setDTDHandler(DTDHandler handler) { throw new RuntimeException("Stub!"); } 
/* 14 */   public DTDHandler getDTDHandler() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setContentHandler(ContentHandler handler) { throw new RuntimeException("Stub!"); } 
/* 16 */   public ContentHandler getContentHandler() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setErrorHandler(ErrorHandler handler) { throw new RuntimeException("Stub!"); } 
/* 18 */   public ErrorHandler getErrorHandler() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void parse(String systemId) throws IOException, SAXException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void parse(InputSource input) throws IOException, SAXException { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setDocumentLocator(Locator locator) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void startDocument() throws SAXException { throw new RuntimeException("Stub!"); } 
/* 23 */   public void endDocument() throws SAXException { throw new RuntimeException("Stub!"); } 
/* 24 */   public void startElement(String qName, AttributeList qAtts) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 25 */   public void endElement(String qName) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 26 */   public void characters(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 27 */   public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 28 */   public void processingInstruction(String target, String data) throws SAXException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.xml.sax.helpers.ParserAdapter
 * JD-Core Version:    0.6.0
 */