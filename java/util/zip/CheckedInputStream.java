/*   */ package java.util.zip;
/*   */ 
/*   */ import java.io.FilterInputStream;
/*   */ import java.io.IOException;
/*   */ import java.io.InputStream;
/*   */ 
/*   */ public class CheckedInputStream extends FilterInputStream
/*   */ {
/*   */   public CheckedInputStream(InputStream is, Checksum csum)
/*   */   {
/* 5 */     super((InputStream)null); throw new RuntimeException("Stub!"); } 
/* 6 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 7 */   public int read(byte[] buf, int off, int nbytes) throws IOException { throw new RuntimeException("Stub!"); } 
/* 8 */   public Checksum getChecksum() { throw new RuntimeException("Stub!"); } 
/* 9 */   public long skip(long byteCount) throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.zip.CheckedInputStream
 * JD-Core Version:    0.6.0
 */