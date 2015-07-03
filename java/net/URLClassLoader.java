/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.security.CodeSource;
/*    */ import java.security.PermissionCollection;
/*    */ import java.security.SecureClassLoader;
/*    */ import java.util.Enumeration;
/*    */ import java.util.jar.Manifest;
/*    */ 
/*    */ public class URLClassLoader extends SecureClassLoader
/*    */ {
/*    */   public URLClassLoader(URL[] urls)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public URLClassLoader(URL[] urls, ClassLoader parent) { throw new RuntimeException("Stub!"); } 
/*  7 */   public URLClassLoader(URL[] searchUrls, ClassLoader parent, URLStreamHandlerFactory factory) { throw new RuntimeException("Stub!"); } 
/*  8 */   protected void addURL(URL url) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Enumeration<URL> findResources(String name) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   protected PermissionCollection getPermissions(CodeSource codesource) { throw new RuntimeException("Stub!"); } 
/* 11 */   public URL[] getURLs() { throw new RuntimeException("Stub!"); } 
/* 12 */   public static URLClassLoader newInstance(URL[] urls) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static URLClassLoader newInstance(URL[] urls, ClassLoader parentCl) { throw new RuntimeException("Stub!"); } 
/* 14 */   protected Class<?> findClass(String clsName) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 15 */   public URL findResource(String name) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected Package definePackage(String packageName, Manifest manifest, URL url) throws IllegalArgumentException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.URLClassLoader
 * JD-Core Version:    0.6.0
 */