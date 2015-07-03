/*    */ package javax.xml.parsers;
/*    */ 
/*    */ import javax.xml.validation.Schema;
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xml.sax.SAXNotRecognizedException;
/*    */ import org.xml.sax.SAXNotSupportedException;
/*    */ 
/*    */ public abstract class SAXParserFactory
/*    */ {
/*    */   protected SAXParserFactory()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static SAXParserFactory newInstance() { throw new RuntimeException("Stub!"); } 
/*  6 */   public static SAXParserFactory newInstance(String factoryClassName, ClassLoader classLoader) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract SAXParser newSAXParser() throws ParserConfigurationException, SAXException;
/*    */ 
/*  8 */   public void setNamespaceAware(boolean awareness) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setValidating(boolean validating) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isNamespaceAware() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean isValidating() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void setFeature(String paramString, boolean paramBoolean) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException;
/*    */ 
/*    */   public abstract boolean getFeature(String paramString) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException;
/*    */ 
/* 14 */   public Schema getSchema() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setSchema(Schema schema) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setXIncludeAware(boolean state) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isXIncludeAware() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.parsers.SAXParserFactory
 * JD-Core Version:    0.6.0
 */