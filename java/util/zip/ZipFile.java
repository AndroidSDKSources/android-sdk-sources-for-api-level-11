/*    */ package java.util.zip;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.Enumeration;
/*    */ 
/*    */ public class ZipFile
/*    */ {
/*    */   public static final int OPEN_READ = 1;
/*    */   public static final int OPEN_DELETE = 4;
/*    */ 
/*    */   public ZipFile(File file)
/*    */     throws ZipException, IOException
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public ZipFile(File file, int mode) throws IOException { throw new RuntimeException("Stub!"); } 
/*  6 */   public ZipFile(String name) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void finalize() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public Enumeration<? extends ZipEntry> entries() { throw new RuntimeException("Stub!"); } 
/* 10 */   public ZipEntry getEntry(String entryName) { throw new RuntimeException("Stub!"); } 
/* 11 */   public InputStream getInputStream(ZipEntry entry) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int size() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.zip.ZipFile
 * JD-Core Version:    0.6.0
 */