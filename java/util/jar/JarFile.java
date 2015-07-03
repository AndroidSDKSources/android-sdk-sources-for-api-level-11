/*    */ package java.util.jar;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.Enumeration;
/*    */ import java.util.zip.ZipEntry;
/*    */ import java.util.zip.ZipFile;
/*    */ 
/*    */ public class JarFile extends ZipFile
/*    */ {
/*    */   public static final String MANIFEST_NAME = "META-INF/MANIFEST.MF";
/*    */ 
/*    */   public JarFile(File file)
/*    */     throws IOException
/*    */   {
/*  5 */     super((String)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public JarFile(File file, boolean verify) throws IOException { super((String)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public JarFile(File file, boolean verify, int mode) throws IOException { super((String)null); throw new RuntimeException("Stub!"); } 
/*  8 */   public JarFile(String filename) throws IOException { super((String)null); throw new RuntimeException("Stub!"); } 
/*  9 */   public JarFile(String filename, boolean verify) throws IOException { super((String)null); throw new RuntimeException("Stub!"); } 
/* 10 */   public Enumeration<JarEntry> entries() { throw new RuntimeException("Stub!"); } 
/* 11 */   public JarEntry getJarEntry(String name) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Manifest getManifest() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public InputStream getInputStream(ZipEntry ze) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public ZipEntry getEntry(String name) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void close() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.jar.JarFile
 * JD-Core Version:    0.6.0
 */