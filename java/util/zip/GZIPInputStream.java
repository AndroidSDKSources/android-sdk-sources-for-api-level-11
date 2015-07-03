/*   */ package java.util.zip;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.io.InputStream;
/*   */ 
/*   */ public class GZIPInputStream extends InflaterInputStream
/*   */ {
/*   */   public static final int GZIP_MAGIC = 35615;
/*   */   protected CRC32 crc;
/*   */   protected boolean eos;
/*   */ 
/*   */   public GZIPInputStream(InputStream is)
/*   */     throws IOException
/*   */   {
/* 5 */     super((InputStream)null, (Inflater)null, 0); throw new RuntimeException("Stub!"); } 
/* 6 */   public GZIPInputStream(InputStream is, int size) throws IOException { super((InputStream)null, (Inflater)null, 0); throw new RuntimeException("Stub!"); } 
/* 7 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 8 */   public int read(byte[] buffer, int offset, int byteCount) throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.zip.GZIPInputStream
 * JD-Core Version:    0.6.0
 */