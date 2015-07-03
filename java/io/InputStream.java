/*    */ package java.io;
/*    */ 
/*    */ public abstract class InputStream
/*    */   implements Closeable
/*    */ {
/*    */   public InputStream()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int available() throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void mark(int readlimit) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean markSupported() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int read() throws IOException;
/*    */ 
/* 11 */   public int read(byte[] b) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public int read(byte[] buffer, int offset, int length) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public synchronized void reset() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public long skip(long byteCount) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.InputStream
 * JD-Core Version:    0.6.0
 */