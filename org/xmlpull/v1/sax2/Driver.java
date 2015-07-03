/*    */ package org.xmlpull.v1.sax2;
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
/*    */ import org.xml.sax.XMLReader;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public class Driver
/*    */   implements Locator, XMLReader, Attributes
/*    */ {
/*    */   protected static final String DECLARATION_HANDLER_PROPERTY = "http://xml.org/sax/properties/declaration-handler";
/*    */   protected static final String LEXICAL_HANDLER_PROPERTY = "http://xml.org/sax/properties/lexical-handler";
/*    */   protected static final String NAMESPACES_FEATURE = "http://xml.org/sax/features/namespaces";
/*    */   protected static final String NAMESPACE_PREFIXES_FEATURE = "http://xml.org/sax/features/namespace-prefixes";
/*    */   protected static final String VALIDATION_FEATURE = "http://xml.org/sax/features/validation";
/*    */   protected static final String APACHE_SCHEMA_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/schema";
/*    */   protected static final String APACHE_DYNAMIC_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/dynamic";
/*    */   protected ContentHandler contentHandler;
/*    */   protected ErrorHandler errorHandler;
/*    */   protected String systemId;
/*    */   protected XmlPullParser pp;
/*    */ 
/*    */   public Driver()
/*    */     throws XmlPullParserException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Driver(XmlPullParser pp) throws XmlPullParserException { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getLength() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getURI(int index) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String getLocalName(int index) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getQName(int index) { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getType(int index) { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getValue(int index) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getIndex(String uri, String localName) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getIndex(String qName) { throw new RuntimeException("Stub!"); } 
/* 15 */   public String getType(String uri, String localName) { throw new RuntimeException("Stub!"); } 
/* 16 */   public String getType(String qName) { throw new RuntimeException("Stub!"); } 
/* 17 */   public String getValue(String uri, String localName) { throw new RuntimeException("Stub!"); } 
/* 18 */   public String getValue(String qName) { throw new RuntimeException("Stub!"); } 
/* 19 */   public String getPublicId() { throw new RuntimeException("Stub!"); } 
/* 20 */   public String getSystemId() { throw new RuntimeException("Stub!"); } 
/* 21 */   public int getLineNumber() { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getColumnNumber() { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean getFeature(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setFeature(String name, boolean value) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 25 */   public Object getProperty(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setProperty(String name, Object value) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setEntityResolver(EntityResolver resolver) { throw new RuntimeException("Stub!"); } 
/* 28 */   public EntityResolver getEntityResolver() { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setDTDHandler(DTDHandler handler) { throw new RuntimeException("Stub!"); } 
/* 30 */   public DTDHandler getDTDHandler() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setContentHandler(ContentHandler handler) { throw new RuntimeException("Stub!"); } 
/* 32 */   public ContentHandler getContentHandler() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setErrorHandler(ErrorHandler handler) { throw new RuntimeException("Stub!"); } 
/* 34 */   public ErrorHandler getErrorHandler() { throw new RuntimeException("Stub!"); } 
/* 35 */   public void parse(InputSource source) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/* 36 */   public void parse(String systemId) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/* 37 */   public void parseSubTree(XmlPullParser pp) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/* 38 */   protected void startElement(String namespace, String localName, String qName) throws SAXException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.xmlpull.v1.sax2.Driver
 * JD-Core Version:    0.6.0
 */