/*    */ package javax.xml.validation;
/*    */ 
/*    */ import org.w3c.dom.ls.LSResourceResolver;
/*    */ import org.xml.sax.ContentHandler;
/*    */ import org.xml.sax.ErrorHandler;
/*    */ import org.xml.sax.SAXNotRecognizedException;
/*    */ import org.xml.sax.SAXNotSupportedException;
/*    */ 
/*    */ public abstract class ValidatorHandler
/*    */   implements ContentHandler
/*    */ {
/*    */   protected ValidatorHandler()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract void setContentHandler(ContentHandler paramContentHandler);
/*    */ 
/*    */   public abstract ContentHandler getContentHandler();
/*    */ 
/*    */   public abstract void setErrorHandler(ErrorHandler paramErrorHandler);
/*    */ 
/*    */   public abstract ErrorHandler getErrorHandler();
/*    */ 
/*    */   public abstract void setResourceResolver(LSResourceResolver paramLSResourceResolver);
/*    */ 
/*    */   public abstract LSResourceResolver getResourceResolver();
/*    */ 
/*    */   public abstract TypeInfoProvider getTypeInfoProvider();
/*    */ 
/* 13 */   public boolean getFeature(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setFeature(String name, boolean value) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setProperty(String name, Object object) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 16 */   public Object getProperty(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.validation.ValidatorHandler
 * JD-Core Version:    0.6.0
 */