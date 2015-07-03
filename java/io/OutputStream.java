/*   */ package java.io;
/*   */ 
/*   */ public abstract class OutputStream
/*   */   implements Closeable, Flushable
/*   */ {
/*   */   public OutputStream()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 7 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 8 */   public void write(byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 9 */   public void write(byte[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void write(int paramInt)
/*   */     throws IOException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.OutputStream
 * JD-Core Version:    0.6.0
 */