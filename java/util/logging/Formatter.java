/*   */ package java.util.logging;
/*   */ 
/*   */ public abstract class Formatter
/*   */ {
/*   */   protected Formatter()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/*   */   public abstract String format(LogRecord paramLogRecord);
/*   */ 
/* 6 */   public String formatMessage(LogRecord r) { throw new RuntimeException("Stub!"); } 
/* 7 */   public String getHead(Handler h) { throw new RuntimeException("Stub!"); } 
/* 8 */   public String getTail(Handler h) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.logging.Formatter
 * JD-Core Version:    0.6.0
 */