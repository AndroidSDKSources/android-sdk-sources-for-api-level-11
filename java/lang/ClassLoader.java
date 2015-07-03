/*    */ package java.lang;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.net.URL;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.security.ProtectionDomain;
/*    */ import java.util.Enumeration;
/*    */ 
/*    */ public abstract class ClassLoader
/*    */ {
/*    */   protected ClassLoader()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   protected ClassLoader(ClassLoader parentLoader) { throw new RuntimeException("Stub!"); } 
/*  6 */   public static ClassLoader getSystemClassLoader() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static URL getSystemResource(String resName) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static Enumeration<URL> getSystemResources(String resName) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static InputStream getSystemResourceAsStream(String resName) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected final Class<?> defineClass(byte[] classRep, int offset, int length) throws ClassFormatError { throw new RuntimeException("Stub!"); } 
/* 11 */   protected final Class<?> defineClass(String className, byte[] classRep, int offset, int length) throws ClassFormatError { throw new RuntimeException("Stub!"); } 
/* 12 */   protected final Class<?> defineClass(String className, byte[] classRep, int offset, int length, ProtectionDomain protectionDomain) throws ClassFormatError { throw new RuntimeException("Stub!"); } 
/* 13 */   protected final Class<?> defineClass(String name, ByteBuffer b, ProtectionDomain protectionDomain) throws ClassFormatError { throw new RuntimeException("Stub!"); } 
/* 14 */   protected Class<?> findClass(String className) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 15 */   protected final Class<?> findLoadedClass(String className) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected final Class<?> findSystemClass(String className) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 17 */   public final ClassLoader getParent() { throw new RuntimeException("Stub!"); } 
/* 18 */   public URL getResource(String resName) { throw new RuntimeException("Stub!"); } 
/* 19 */   public Enumeration<URL> getResources(String resName) throws IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public InputStream getResourceAsStream(String resName) { throw new RuntimeException("Stub!"); } 
/* 21 */   public Class<?> loadClass(String className) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 22 */   protected Class<?> loadClass(String className, boolean resolve) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 23 */   protected final void resolveClass(Class<?> clazz) { throw new RuntimeException("Stub!"); } 
/* 24 */   protected URL findResource(String resName) { throw new RuntimeException("Stub!"); } 
/* 25 */   protected Enumeration<URL> findResources(String resName) throws IOException { throw new RuntimeException("Stub!"); } 
/* 26 */   protected String findLibrary(String libName) { throw new RuntimeException("Stub!"); } 
/* 27 */   protected Package getPackage(String name) { throw new RuntimeException("Stub!"); } 
/* 28 */   protected Package[] getPackages() { throw new RuntimeException("Stub!"); } 
/* 29 */   protected Package definePackage(String name, String specTitle, String specVersion, String specVendor, String implTitle, String implVersion, String implVendor, URL sealBase) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 30 */   protected final void setSigners(Class<?> c, Object[] signers) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setClassAssertionStatus(String cname, boolean enable) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setPackageAssertionStatus(String pname, boolean enable) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setDefaultAssertionStatus(boolean enable) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void clearAssertionStatus() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.ClassLoader
 * JD-Core Version:    0.6.0
 */