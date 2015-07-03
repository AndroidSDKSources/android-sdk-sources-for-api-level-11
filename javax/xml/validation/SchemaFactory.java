/*    */ package javax.xml.validation;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.net.URL;
/*    */ import javax.xml.transform.Source;
/*    */ import org.w3c.dom.ls.LSResourceResolver;
/*    */ import org.xml.sax.ErrorHandler;
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xml.sax.SAXNotRecognizedException;
/*    */ import org.xml.sax.SAXNotSupportedException;
/*    */ 
/*    */ public abstract class SchemaFactory
/*    */ {
/*    */   protected SchemaFactory()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static SchemaFactory newInstance(String schemaLanguage) { throw new RuntimeException("Stub!"); } 
/*  6 */   public static SchemaFactory newInstance(String schemaLanguage, String factoryClassName, ClassLoader classLoader) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isSchemaLanguageSupported(String paramString);
/*    */ 
/*  8 */   public boolean getFeature(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setFeature(String name, boolean value) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setProperty(String name, Object object) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 11 */   public Object getProperty(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void setErrorHandler(ErrorHandler paramErrorHandler);
/*    */ 
/*    */   public abstract ErrorHandler getErrorHandler();
/*    */ 
/*    */   public abstract void setResourceResolver(LSResourceResolver paramLSResourceResolver);
/*    */ 
/*    */   public abstract LSResourceResolver getResourceResolver();
/*    */ 
/* 16 */   public Schema newSchema(Source schema) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 17 */   public Schema newSchema(File schema) throws SAXException { throw new RuntimeException("Stub!"); } 
/* 18 */   public Schema newSchema(URL schema) throws SAXException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract Schema newSchema(Source[] paramArrayOfSource)
/*    */     throws SAXException;
/*    */ 
/*    */   public abstract Schema newSchema()
/*    */     throws SAXException;
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.validation.SchemaFactory
 * JD-Core Version:    0.6.0
 */