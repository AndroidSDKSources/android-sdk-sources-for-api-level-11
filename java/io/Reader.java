/*    */ package java.io;
/*    */ 
/*    */ import java.nio.CharBuffer;
/*    */ 
/*    */ public abstract class Reader
/*    */   implements Readable, Closeable
/*    */ {
/*    */   protected Object lock;
/*    */ 
/*    */   protected Reader()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected Reader(Object lock) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void close() throws IOException;
/*    */ 
/*  8 */   public void mark(int readLimit) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean markSupported() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public int read(char[] buf) throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int read(char[] paramArrayOfChar, int paramInt1, int paramInt2) throws IOException;
/*    */ 
/* 13 */   public boolean ready() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void reset() throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public long skip(long charCount) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public int read(CharBuffer target) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.Reader
 * JD-Core Version:    0.6.0
 */