/*    */ package dalvik.system;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.IOException;
/*    */ import java.util.Enumeration;
/*    */ 
/*    */ public final class DexFile
/*    */ {
/*    */   public DexFile(File file)
/*    */     throws IOException
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public DexFile(String fileName) throws IOException { throw new RuntimeException("Stub!"); } 
/*  6 */   public static DexFile loadDex(String sourcePathName, String outputPathName, int flags) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getName() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public Class loadClass(String name, ClassLoader loader) { throw new RuntimeException("Stub!"); } 
/* 10 */   public Enumeration<String> entries() { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static native boolean isDexOptNeeded(String paramString)
/*    */     throws FileNotFoundException, IOException;
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     dalvik.system.DexFile
 * JD-Core Version:    0.6.0
 */