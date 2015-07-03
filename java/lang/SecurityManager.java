/*    */ package java.lang;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.net.InetAddress;
/*    */ import java.security.Permission;
/*    */ 
/*    */ public class SecurityManager
/*    */ {
/*    */   protected boolean inCheck;
/*    */ 
/*    */   public SecurityManager()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void checkAccept(String host, int port) { throw new RuntimeException("Stub!"); } 
/*  6 */   public void checkAccess(Thread thread) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void checkAccess(ThreadGroup group) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void checkConnect(String host, int port) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void checkConnect(String host, int port, Object context) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void checkCreateClassLoader() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void checkDelete(String file) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void checkExec(String cmd) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void checkExit(int status) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void checkLink(String libName) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void checkListen(int port) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void checkMemberAccess(Class<?> cls, int type) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void checkMulticast(InetAddress maddr) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void checkMulticast(InetAddress maddr, byte ttl) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void checkPackageAccess(String packageName) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void checkPackageDefinition(String packageName) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void checkPropertiesAccess() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void checkPropertyAccess(String key) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void checkRead(FileDescriptor fd) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void checkRead(String file) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void checkRead(String file, Object context) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void checkSecurityAccess(String target) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void checkSetFactory() { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean checkTopLevelWindow(Object window) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void checkSystemClipboardAccess() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void checkAwtEventQueueAccess() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void checkPrintJobAccess() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void checkWrite(FileDescriptor fd) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void checkWrite(String file) { throw new RuntimeException("Stub!"); } 
/* 34 */   public boolean getInCheck() { throw new RuntimeException("Stub!"); } 
/* 35 */   protected Class[] getClassContext() { throw new RuntimeException("Stub!"); } 
/* 36 */   protected ClassLoader currentClassLoader() { throw new RuntimeException("Stub!"); } 
/* 37 */   protected int classLoaderDepth() { throw new RuntimeException("Stub!"); } 
/* 38 */   protected Class<?> currentLoadedClass() { throw new RuntimeException("Stub!"); } 
/* 39 */   protected int classDepth(String name) { throw new RuntimeException("Stub!"); } 
/* 40 */   protected boolean inClass(String name) { throw new RuntimeException("Stub!"); } 
/* 41 */   protected boolean inClassLoader() { throw new RuntimeException("Stub!"); } 
/* 42 */   public ThreadGroup getThreadGroup() { throw new RuntimeException("Stub!"); } 
/* 43 */   public Object getSecurityContext() { throw new RuntimeException("Stub!"); } 
/* 44 */   public void checkPermission(Permission permission) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void checkPermission(Permission permission, Object context) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.SecurityManager
 * JD-Core Version:    0.6.0
 */