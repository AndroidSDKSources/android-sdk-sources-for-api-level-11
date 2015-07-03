/*    */ package java.io;
/*    */ 
/*    */ public abstract class Writer
/*    */   implements Appendable, Closeable, Flushable
/*    */ {
/*    */   protected Object lock;
/*    */ 
/*    */   protected Writer()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected Writer(Object lock) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void close() throws IOException;
/*    */ 
/*    */   public abstract void flush() throws IOException;
/*    */ 
/*  9 */   public void write(char[] buf) throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract void write(char[] paramArrayOfChar, int paramInt1, int paramInt2) throws IOException;
/*    */ 
/* 11 */   public void write(int oneChar) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void write(String str) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void write(String str, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public Writer append(char c) throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public Writer append(CharSequence csq) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public Writer append(CharSequence csq, int start, int end) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.Writer
 * JD-Core Version:    0.6.0
 */