/*    */ package java.util.logging;
/*    */ 
/*    */ import java.io.UnsupportedEncodingException;
/*    */ 
/*    */ public abstract class Handler
/*    */ {
/*    */   protected Handler()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract void close();
/*    */ 
/*    */   public abstract void flush();
/*    */ 
/*    */   public abstract void publish(LogRecord paramLogRecord);
/*    */ 
/*  8 */   public String getEncoding() { throw new RuntimeException("Stub!"); } 
/*  9 */   public ErrorManager getErrorManager() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Filter getFilter() { throw new RuntimeException("Stub!"); } 
/* 11 */   public Formatter getFormatter() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Level getLevel() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isLoggable(LogRecord record) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void reportError(String msg, Exception ex, int code) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setEncoding(String encoding) throws SecurityException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setErrorManager(ErrorManager em) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setFilter(Filter newFilter) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setFormatter(Formatter newFormatter) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setLevel(Level newLevel) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.logging.Handler
 * JD-Core Version:    0.6.0
 */