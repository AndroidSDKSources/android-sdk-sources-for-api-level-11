/*    */ package java.util.zip;
/*    */ 
/*    */ public class Deflater
/*    */ {
/*    */   public static final int BEST_COMPRESSION = 9;
/*    */   public static final int BEST_SPEED = 1;
/*    */   public static final int DEFAULT_COMPRESSION = -1;
/*    */   public static final int DEFAULT_STRATEGY = 0;
/*    */   public static final int DEFLATED = 8;
/*    */   public static final int FILTERED = 1;
/*    */   public static final int HUFFMAN_ONLY = 2;
/*    */   public static final int NO_COMPRESSION = 0;
/*    */ 
/*    */   public Deflater()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public Deflater(int level) { throw new RuntimeException("Stub!"); } 
/*  6 */   public Deflater(int level, boolean noHeader) { throw new RuntimeException("Stub!"); } 
/*  7 */   public int deflate(byte[] buf) { throw new RuntimeException("Stub!"); } 
/*  8 */   public synchronized int deflate(byte[] buf, int offset, int byteCount) { throw new RuntimeException("Stub!"); } 
/*  9 */   public synchronized void end() { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void finalize() { throw new RuntimeException("Stub!"); } 
/* 11 */   public synchronized void finish() { throw new RuntimeException("Stub!"); } 
/* 12 */   public synchronized boolean finished() { throw new RuntimeException("Stub!"); } 
/* 13 */   public synchronized int getAdler() { throw new RuntimeException("Stub!"); } 
/* 14 */   public synchronized int getTotalIn() { throw new RuntimeException("Stub!"); } 
/* 15 */   public synchronized int getTotalOut() { throw new RuntimeException("Stub!"); } 
/* 16 */   public synchronized boolean needsInput() { throw new RuntimeException("Stub!"); } 
/* 17 */   public synchronized void reset() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setDictionary(byte[] dictionary) { throw new RuntimeException("Stub!"); } 
/* 19 */   public synchronized void setDictionary(byte[] buf, int offset, int byteCount) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setInput(byte[] buf) { throw new RuntimeException("Stub!"); } 
/* 21 */   public synchronized void setInput(byte[] buf, int offset, int byteCount) { throw new RuntimeException("Stub!"); } 
/* 22 */   public synchronized void setLevel(int level) { throw new RuntimeException("Stub!"); } 
/* 23 */   public synchronized void setStrategy(int strategy) { throw new RuntimeException("Stub!"); } 
/* 24 */   public synchronized long getBytesRead() { throw new RuntimeException("Stub!"); } 
/* 25 */   public synchronized long getBytesWritten() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.zip.Deflater
 * JD-Core Version:    0.6.0
 */