/*    */ package java.io;
/*    */ 
/*    */ public class BufferedInputStream extends FilterInputStream
/*    */ {
/* 15 */   protected volatile byte[] buf = null;
/*    */   protected int count;
/*    */   protected int marklimit;
/*    */   protected int markpos;
/*    */   protected int pos;
/*    */ 
/*    */   public BufferedInputStream(InputStream in)
/*    */   {
/*  5 */     super((InputStream)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public BufferedInputStream(InputStream in, int size) { super((InputStream)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public synchronized int available() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public synchronized void mark(int readlimit) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean markSupported() { throw new RuntimeException("Stub!"); } 
/* 11 */   public synchronized int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public synchronized int read(byte[] buffer, int offset, int byteCount) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public synchronized void reset() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public synchronized long skip(long byteCount) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.BufferedInputStream
 * JD-Core Version:    0.6.0
 */