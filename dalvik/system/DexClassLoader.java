/*   */ package dalvik.system;
/*   */ 
/*   */ import java.net.URL;
/*   */ 
/*   */ public class DexClassLoader extends ClassLoader
/*   */ {
/*   */   public DexClassLoader(String dexPath, String dexOutputDir, String libPath, ClassLoader parent)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   protected Class<?> findClass(String name) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 7 */   protected URL findResource(String name) { throw new RuntimeException("Stub!"); } 
/* 8 */   protected String findLibrary(String libname) { throw new RuntimeException("Stub!"); } 
/* 9 */   protected Package getPackage(String name) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     dalvik.system.DexClassLoader
 * JD-Core Version:    0.6.0
 */