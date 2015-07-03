/*    */ package java.io;
/*    */ 
/*    */ public class PushbackInputStream extends FilterInputStream
/*    */ {
/* 18 */   protected byte[] buf = null;
/*    */   protected int pos;
/*    */ 
/*    */   public PushbackInputStream(InputStream in)
/*    */   {
/*  5 */     super((InputStream)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public PushbackInputStream(InputStream in, int size) { super((InputStream)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public int available() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean markSupported() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public int read(byte[] buffer, int offset, int length) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public long skip(long byteCount) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void unread(byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void unread(byte[] buffer, int offset, int length) throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public void unread(int oneByte) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public void mark(int readlimit) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void reset() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.PushbackInputStream
 * JD-Core Version:    0.6.0
 */