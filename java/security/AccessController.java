/*    */ package java.security;
/*    */ 
/*    */ public final class AccessController
/*    */ {
/*    */   AccessController()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static <T> T doPrivileged(PrivilegedAction<T> action) { throw new RuntimeException("Stub!"); } 
/*  6 */   public static <T> T doPrivileged(PrivilegedAction<T> action, AccessControlContext context) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static <T> T doPrivileged(PrivilegedExceptionAction<T> action) throws PrivilegedActionException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static <T> T doPrivileged(PrivilegedExceptionAction<T> action, AccessControlContext context) throws PrivilegedActionException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static <T> T doPrivilegedWithCombiner(PrivilegedAction<T> action) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static <T> T doPrivilegedWithCombiner(PrivilegedExceptionAction<T> action) throws PrivilegedActionException { throw new RuntimeException("Stub!"); } 
/* 11 */   public static void checkPermission(Permission permission) throws AccessControlException { throw new RuntimeException("Stub!"); } 
/* 12 */   public static AccessControlContext getContext() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.AccessController
 * JD-Core Version:    0.6.0
 */