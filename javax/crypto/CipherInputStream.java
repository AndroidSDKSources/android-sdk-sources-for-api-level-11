/*    */ package javax.crypto;
/*    */ 
/*    */ import java.io.FilterInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class CipherInputStream extends FilterInputStream
/*    */ {
/*    */   public CipherInputStream(InputStream is, Cipher c)
/*    */   {
/*  5 */     super((InputStream)null); throw new RuntimeException("Stub!"); } 
/*  6 */   protected CipherInputStream(InputStream is) { super((InputStream)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public int read(byte[] b) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public long skip(long byteCount) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public int available() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean markSupported() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.CipherInputStream
 * JD-Core Version:    0.6.0
 */