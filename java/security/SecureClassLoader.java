/*   */ package java.security;
/*   */ 
/*   */ import java.nio.ByteBuffer;
/*   */ 
/*   */ public class SecureClassLoader extends ClassLoader
/*   */ {
/*   */   protected SecureClassLoader()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   protected SecureClassLoader(ClassLoader parent) { throw new RuntimeException("Stub!"); } 
/* 7 */   protected PermissionCollection getPermissions(CodeSource codesource) { throw new RuntimeException("Stub!"); } 
/* 8 */   protected final Class<?> defineClass(String name, byte[] b, int off, int len, CodeSource cs) { throw new RuntimeException("Stub!"); } 
/* 9 */   protected final Class<?> defineClass(String name, ByteBuffer b, CodeSource cs) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.SecureClassLoader
 * JD-Core Version:    0.6.0
 */