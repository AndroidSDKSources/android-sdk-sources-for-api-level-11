/*    */ package java.io;
/*    */ 
/*    */ public abstract class FilterReader extends Reader
/*    */ {
/*    */   protected Reader in;
/*    */ 
/*    */   protected FilterReader(Reader in)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public synchronized void mark(int readlimit) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean markSupported() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public int read(char[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean ready() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void reset() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public long skip(long charCount) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.FilterReader
 * JD-Core Version:    0.6.0
 */