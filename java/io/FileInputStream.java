/*    */ package java.io;
/*    */ 
/*    */ import java.nio.channels.FileChannel;
/*    */ 
/*    */ public class FileInputStream extends InputStream
/*    */   implements Closeable
/*    */ {
/*    */   public FileInputStream(File file)
/*    */     throws FileNotFoundException
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public FileInputStream(FileDescriptor fd) { throw new RuntimeException("Stub!"); } 
/*  8 */   public FileInputStream(String path) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/*  9 */   public int available() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void finalize() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public FileChannel getChannel() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final FileDescriptor getFD() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public int read() throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public int read(byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public int read(byte[] buffer, int offset, int byteCount) throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public long skip(long byteCount) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.FileInputStream
 * JD-Core Version:    0.6.0
 */