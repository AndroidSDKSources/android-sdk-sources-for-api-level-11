/*    */ package java.io;
/*    */ 
/*    */ public class PipedReader extends Reader
/*    */ {
/*    */   public PipedReader()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public PipedReader(PipedWriter out) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public PipedReader(int pipeSize) { throw new RuntimeException("Stub!"); } 
/*  8 */   public PipedReader(PipedWriter out, int pipeSize) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public synchronized void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void connect(PipedWriter src) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public synchronized int read(char[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public synchronized boolean ready() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.PipedReader
 * JD-Core Version:    0.6.0
 */