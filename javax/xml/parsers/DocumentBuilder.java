/*    */ package javax.xml.parsers;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import javax.xml.validation.Schema;
/*    */ import org.w3c.dom.DOMImplementation;
/*    */ import org.w3c.dom.Document;
/*    */ import org.xml.sax.EntityResolver;
/*    */ import org.xml.sax.ErrorHandler;
/*    */ import org.xml.sax.InputSource;
/*    */ import org.xml.sax.SAXException;
/*    */ 
/*    */ public abstract class DocumentBuilder
/*    */ {
/*    */   protected DocumentBuilder()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void reset() { throw new RuntimeException("Stub!"); } 
/*  6 */   public Document parse(InputStream is) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public Document parse(InputStream is, String systemId) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public Document parse(String uri) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public Document parse(File f) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Document parse(InputSource paramInputSource) throws SAXException, IOException;
/*    */ 
/*    */   public abstract boolean isNamespaceAware();
/*    */ 
/*    */   public abstract boolean isValidating();
/*    */ 
/*    */   public abstract void setEntityResolver(EntityResolver paramEntityResolver);
/*    */ 
/*    */   public abstract void setErrorHandler(ErrorHandler paramErrorHandler);
/*    */ 
/*    */   public abstract Document newDocument();
/*    */ 
/*    */   public abstract DOMImplementation getDOMImplementation();
/*    */ 
/* 17 */   public Schema getSchema() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean isXIncludeAware() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.parsers.DocumentBuilder
 * JD-Core Version:    0.6.0
 */