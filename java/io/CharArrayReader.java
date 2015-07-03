/*    */ package java.io;
/*    */ 
/*    */ public class CharArrayReader extends Reader
/*    */ {
/* 15 */   protected char[] buf = null;
/*    */   protected int pos;
/*    */   protected int markedPos;
/*    */   protected int count;
/*    */ 
/*    */   public CharArrayReader(char[] buf)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public CharArrayReader(char[] buf, int offset, int length) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void close() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void mark(int readLimit) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean markSupported() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public int read(char[] buffer, int offset, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean ready() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void reset() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public long skip(long charCount) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.CharArrayReader
 * JD-Core Version:    0.6.0
 */