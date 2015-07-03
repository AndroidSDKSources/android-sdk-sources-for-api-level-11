/*    */ package javax.xml.transform;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public class TransformerException extends Exception
/*    */ {
/*    */   public TransformerException(String message)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public TransformerException(Throwable e) { throw new RuntimeException("Stub!"); } 
/*  7 */   public TransformerException(String message, Throwable e) { throw new RuntimeException("Stub!"); } 
/*  8 */   public TransformerException(String message, SourceLocator locator) { throw new RuntimeException("Stub!"); } 
/*  9 */   public TransformerException(String message, SourceLocator locator, Throwable e) { throw new RuntimeException("Stub!"); } 
/* 10 */   public SourceLocator getLocator() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setLocator(SourceLocator location) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Throwable getException() { throw new RuntimeException("Stub!"); } 
/* 13 */   public Throwable getCause() { throw new RuntimeException("Stub!"); } 
/* 14 */   public synchronized Throwable initCause(Throwable cause) { throw new RuntimeException("Stub!"); } 
/* 15 */   public String getMessageAndLocation() { throw new RuntimeException("Stub!"); } 
/* 16 */   public String getLocationAsString() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void printStackTrace() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void printStackTrace(PrintStream s) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void printStackTrace(PrintWriter s) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.transform.TransformerException
 * JD-Core Version:    0.6.0
 */