/*   */ package java.util.zip;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.io.OutputStream;
/*   */ 
/*   */ public class GZIPOutputStream extends DeflaterOutputStream
/*   */ {
/*   */   protected CRC32 crc;
/*   */ 
/*   */   public GZIPOutputStream(OutputStream os)
/*   */     throws IOException
/*   */   {
/* 5 */     super((OutputStream)null, (Deflater)null, 0); throw new RuntimeException("Stub!"); } 
/* 6 */   public GZIPOutputStream(OutputStream os, int size) throws IOException { super((OutputStream)null, (Deflater)null, 0); throw new RuntimeException("Stub!"); } 
/* 7 */   public void finish() throws IOException { throw new RuntimeException("Stub!"); } 
/* 8 */   public void write(byte[] buffer, int off, int nbytes) throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.zip.GZIPOutputStream
 * JD-Core Version:    0.6.0
 */