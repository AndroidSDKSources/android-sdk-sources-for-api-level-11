/*    */ package java.io;
/*    */ 
/*    */ public class ByteArrayOutputStream extends OutputStream
/*    */ {
/* 17 */   protected byte[] buf = null;
/*    */   protected int count;
/*    */ 
/*    */   public ByteArrayOutputStream()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ByteArrayOutputStream(int size) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public synchronized void reset() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 10 */   public synchronized byte[] toByteArray() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String toString(int hibyte) { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString(String enc) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 14 */   public synchronized void write(byte[] buffer, int offset, int len) { throw new RuntimeException("Stub!"); } 
/* 15 */   public synchronized void write(int oneByte) { throw new RuntimeException("Stub!"); } 
/* 16 */   public synchronized void writeTo(OutputStream out) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.ByteArrayOutputStream
 * JD-Core Version:    0.6.0
 */