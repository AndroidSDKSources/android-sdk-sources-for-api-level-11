/*    */ package java.io;
/*    */ 
/*    */ import java.net.MalformedURLException;
/*    */ import java.net.URI;
/*    */ import java.net.URL;
/*    */ 
/*    */ public class File
/*    */   implements Serializable, Comparable<File>
/*    */ {
/* 62 */   public static final char separatorChar = '\000'; public static final String separator = null; public static final char pathSeparatorChar = '\000'; public static final String pathSeparator = null;
/*    */ 
/*    */   public File(File dir, String name)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public File(String path) { throw new RuntimeException("Stub!"); } 
/*  7 */   public File(String dirPath, String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public File(URI uri) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static File[] listRoots() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean canExecute() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean canRead() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean canWrite() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int compareTo(File another) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean delete() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void deleteOnExit() { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean exists() { throw new RuntimeException("Stub!"); } 
/* 18 */   public String getAbsolutePath() { throw new RuntimeException("Stub!"); } 
/* 19 */   public File getAbsoluteFile() { throw new RuntimeException("Stub!"); } 
/* 20 */   public String getCanonicalPath() throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public File getCanonicalFile() throws IOException { throw new RuntimeException("Stub!"); } 
/* 22 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 23 */   public String getParent() { throw new RuntimeException("Stub!"); } 
/* 24 */   public File getParentFile() { throw new RuntimeException("Stub!"); } 
/* 25 */   public String getPath() { throw new RuntimeException("Stub!"); } 
/* 26 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean isAbsolute() { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean isDirectory() { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean isFile() { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean isHidden() { throw new RuntimeException("Stub!"); } 
/* 31 */   public long lastModified() { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean setLastModified(long time) { throw new RuntimeException("Stub!"); } 
/* 33 */   public boolean setReadOnly() { throw new RuntimeException("Stub!"); } 
/* 34 */   public boolean setExecutable(boolean executable, boolean ownerOnly) { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean setExecutable(boolean executable) { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean setReadable(boolean readable, boolean ownerOnly) { throw new RuntimeException("Stub!"); } 
/* 37 */   public boolean setReadable(boolean readable) { throw new RuntimeException("Stub!"); } 
/* 38 */   public boolean setWritable(boolean writable, boolean ownerOnly) { throw new RuntimeException("Stub!"); } 
/* 39 */   public boolean setWritable(boolean writable) { throw new RuntimeException("Stub!"); } 
/* 40 */   public long length() { throw new RuntimeException("Stub!"); } 
/* 41 */   public String[] list() { throw new RuntimeException("Stub!"); } 
/* 42 */   public String[] list(FilenameFilter filter) { throw new RuntimeException("Stub!"); } 
/* 43 */   public File[] listFiles() { throw new RuntimeException("Stub!"); } 
/* 44 */   public File[] listFiles(FilenameFilter filter) { throw new RuntimeException("Stub!"); } 
/* 45 */   public File[] listFiles(FileFilter filter) { throw new RuntimeException("Stub!"); } 
/* 46 */   public boolean mkdir() { throw new RuntimeException("Stub!"); } 
/* 47 */   public boolean mkdirs() { throw new RuntimeException("Stub!"); } 
/* 48 */   public boolean createNewFile() throws IOException { throw new RuntimeException("Stub!"); } 
/* 49 */   public static File createTempFile(String prefix, String suffix) throws IOException { throw new RuntimeException("Stub!"); } 
/* 50 */   public static File createTempFile(String prefix, String suffix, File directory) throws IOException { throw new RuntimeException("Stub!"); } 
/* 51 */   public boolean renameTo(File newPath) { throw new RuntimeException("Stub!"); } 
/* 52 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 53 */   public URI toURI() { throw new RuntimeException("Stub!"); } 
/* 54 */   public URL toURL() throws MalformedURLException { throw new RuntimeException("Stub!"); } 
/* 55 */   public long getTotalSpace() { throw new RuntimeException("Stub!"); } 
/* 56 */   public long getUsableSpace() { throw new RuntimeException("Stub!"); } 
/* 57 */   public long getFreeSpace() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.File
 * JD-Core Version:    0.6.0
 */