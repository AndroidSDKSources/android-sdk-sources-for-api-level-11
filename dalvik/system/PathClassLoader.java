/*    */ package dalvik.system;
/*    */ 
/*    */ import java.net.URL;
/*    */ import java.util.Enumeration;
/*    */ 
/*    */ public class PathClassLoader extends ClassLoader
/*    */ {
/*    */   public PathClassLoader(String path, ClassLoader parent)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public PathClassLoader(String path, String libPath, ClassLoader parent) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected Class<?> findClass(String name) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/*  8 */   protected URL findResource(String name) { throw new RuntimeException("Stub!"); } 
/*  9 */   protected Enumeration<URL> findResources(String resName) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String findLibrary(String libname) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected Package getPackage(String name) { throw new RuntimeException("Stub!"); } 
/* 12 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     dalvik.system.PathClassLoader
 * JD-Core Version:    0.6.0
 */