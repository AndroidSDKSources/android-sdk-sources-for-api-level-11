/*   */ package java.io;
/*   */ 
/*   */ import java.nio.charset.Charset;
/*   */ 
/*   */ public class FileReader extends InputStreamReader
/*   */ {
/*   */   public FileReader(File file)
/*   */     throws FileNotFoundException
/*   */   {
/* 5 */     super((InputStream)null, (Charset)null); throw new RuntimeException("Stub!"); } 
/* 6 */   public FileReader(FileDescriptor fd) { super((InputStream)null, (Charset)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public FileReader(String filename) throws FileNotFoundException { super((InputStream)null, (Charset)null); throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.FileReader
 * JD-Core Version:    0.6.0
 */