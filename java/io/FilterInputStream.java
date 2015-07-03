/*    */ package java.io;
/*    */ 
/*    */ public class FilterInputStream extends InputStream
/*    */ {
/*    */   protected volatile InputStream in;
/*    */ 
/*    */   protected FilterInputStream(InputStream in)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int available() throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public synchronized void mark(int readlimit) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean markSupported() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public int read(byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public int read(byte[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public synchronized void reset() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public long skip(long byteCount) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.FilterInputStream
 * JD-Core Version:    0.6.0
 */