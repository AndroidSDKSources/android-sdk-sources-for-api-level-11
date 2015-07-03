/*    */ package java.io;
/*    */ 
/*    */ import java.nio.channels.FileChannel;
/*    */ 
/*    */ public class FileOutputStream extends OutputStream
/*    */   implements Closeable
/*    */ {
/*    */   public FileOutputStream(File file)
/*    */     throws FileNotFoundException
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public FileOutputStream(File file, boolean append) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/*  8 */   public FileOutputStream(FileDescriptor fd) { throw new RuntimeException("Stub!"); } 
/*  9 */   public FileOutputStream(String path) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 10 */   public FileOutputStream(String path, boolean append) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void finalize() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public FileChannel getChannel() { throw new RuntimeException("Stub!"); } 
/* 14 */   public final FileDescriptor getFD() throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public void write(byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public void write(byte[] buffer, int offset, int byteCount) throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public void write(int oneByte) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.FileOutputStream
 * JD-Core Version:    0.6.0
 */