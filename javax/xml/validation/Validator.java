/*    */ package javax.xml.validation;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import javax.xml.transform.Result;
/*    */ import javax.xml.transform.Source;
/*    */ import org.w3c.dom.ls.LSResourceResolver;
/*    */ import org.xml.sax.ErrorHandler;
/*    */ import org.xml.sax.SAXException;
/*    */ import org.xml.sax.SAXNotRecognizedException;
/*    */ import org.xml.sax.SAXNotSupportedException;
/*    */ 
/*    */ public abstract class Validator
/*    */ {
/*    */   protected Validator()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract void reset();
/*    */ 
/*  6 */   public void validate(Source source) throws SAXException, IOException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void validate(Source paramSource, Result paramResult) throws SAXException, IOException;
/*    */ 
/*    */   public abstract void setErrorHandler(ErrorHandler paramErrorHandler);
/*    */ 
/*    */   public abstract ErrorHandler getErrorHandler();
/*    */ 
/*    */   public abstract void setResourceResolver(LSResourceResolver paramLSResourceResolver);
/*    */ 
/*    */   public abstract LSResourceResolver getResourceResolver();
/*    */ 
/* 12 */   public boolean getFeature(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setFeature(String name, boolean value) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setProperty(String name, Object object) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 15 */   public Object getProperty(String name) throws SAXNotRecognizedException, SAXNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.validation.Validator
 * JD-Core Version:    0.6.0
 */