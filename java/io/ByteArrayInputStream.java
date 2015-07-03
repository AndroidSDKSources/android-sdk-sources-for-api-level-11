/*    */ package java.io;
/*    */ 
/*    */ public class ByteArrayInputStream extends InputStream
/*    */ {
/* 15 */   protected byte[] buf = null;
/*    */   protected int pos;
/*    */   protected int mark;
/*    */   protected int count;
/*    */ 
/*    */   public ByteArrayInputStream(byte[] buf)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ByteArrayInputStream(byte[] buf, int offset, int length) { throw new RuntimeException("Stub!"); } 
/*  7 */   public synchronized int available() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public synchronized void mark(int readlimit) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean markSupported() { throw new RuntimeException("Stub!"); } 
/* 11 */   public synchronized int read() { throw new RuntimeException("Stub!"); } 
/* 12 */   public synchronized int read(byte[] buffer, int offset, int length) { throw new RuntimeException("Stub!"); } 
/* 13 */   public synchronized void reset() { throw new RuntimeException("Stub!"); } 
/* 14 */   public synchronized long skip(long byteCount) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.ByteArrayInputStream
 * JD-Core Version:    0.6.0
 */