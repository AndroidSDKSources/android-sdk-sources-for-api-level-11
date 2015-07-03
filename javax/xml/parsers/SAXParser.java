/*    */ package javax.xml.parsers;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import javax.xml.validation.Schema;
/*    */ import org.xml.sax.HandlerBase;
/*    */ import org.xml.sax.InputSource;
/*    */ import org.xml.sax.Parser;
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xml.sax.SAXNotRecognizedException;
/*    */ import org.xml.sax.SAXNotSupportedException;
/*    */ import org.xml.sax.XMLReader;
/*    */ import org.xml.sax.helpers.DefaultHandler;
/*    */ 
/*    */ public abstract class SAXParser
/*    */ {
/*    */   protected SAXParser()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void reset() { throw new RuntimeException("Stub!"); } 
/*  6 */   public void parse(InputStream is, HandlerBase hb) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void parse(InputStream is, HandlerBase hb, String systemId) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void parse(InputStream is, DefaultHandler dh) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void parse(InputStream is, DefaultHandler dh, String systemId) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void parse(String uri, HandlerBase hb) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void parse(String uri, DefaultHandler dh) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void parse(File f, HandlerBase hb) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void parse(File f, DefaultHandler dh) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void parse(InputSource is, HandlerBase hb) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public void parse(InputSource is, DefaultHandler dh) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Parser getParser() throws SAXException;
/*    */ 
/*    */   public abstract XMLReader getXMLReader() throws SAXException;
/*    */ 
/*    */   public abstract boolean isNamespaceAware();
/*    */ 
/*    */   public abstract boolean isValidating();
/*    */ 
/*    */   public abstract void setProperty(String paramString, Object paramObject) throws SAXNotRecognizedException, SAXNotSupportedException;
/*    */ 
/*    */   public abstract Object getProperty(String paramString) throws SAXNotRecognizedException, SAXNotSupportedException;
/*    */ 
/* 22 */   public Schema getSchema() { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean isXIncludeAware() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.parsers.SAXParser
 * JD-Core Version:    0.6.0
 */