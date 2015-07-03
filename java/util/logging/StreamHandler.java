/*    */ package java.util.logging;
/*    */ 
/*    */ import java.io.OutputStream;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ 
/*    */ public class StreamHandler extends Handler
/*    */ {
/*    */   public StreamHandler()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public StreamHandler(OutputStream os, Formatter formatter) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void setOutputStream(OutputStream os) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setEncoding(String encoding) throws SecurityException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void flush() { throw new RuntimeException("Stub!"); } 
/* 11 */   public synchronized void publish(LogRecord record) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isLoggable(LogRecord record) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.logging.StreamHandler
 * JD-Core Version:    0.6.0
 */