/*    */ package javax.security.auth;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.security.AccessControlContext;
/*    */ import java.security.Principal;
/*    */ import java.security.PrivilegedAction;
/*    */ import java.security.PrivilegedActionException;
/*    */ import java.security.PrivilegedExceptionAction;
/*    */ import java.util.Set;
/*    */ 
/*    */ public final class Subject
/*    */   implements Serializable
/*    */ {
/*    */   public Subject()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Subject(boolean readOnly, Set<? extends Principal> subjPrincipals, Set<?> pubCredentials, Set<?> privCredentials) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static <T> T doAs(Subject subject, PrivilegedAction<T> action) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static <T> T doAsPrivileged(Subject subject, PrivilegedAction<T> action, AccessControlContext context) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static <T> T doAs(Subject subject, PrivilegedExceptionAction<T> action) throws PrivilegedActionException { throw new RuntimeException("Stub!"); } 
/* 10 */   public static <T> T doAsPrivileged(Subject subject, PrivilegedExceptionAction<T> action, AccessControlContext context) throws PrivilegedActionException { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Set<Principal> getPrincipals() { throw new RuntimeException("Stub!"); } 
/* 13 */   public <T extends Principal> Set<T> getPrincipals(Class<T> c) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Set<Object> getPrivateCredentials() { throw new RuntimeException("Stub!"); } 
/* 15 */   public <T> Set<T> getPrivateCredentials(Class<T> c) { throw new RuntimeException("Stub!"); } 
/* 16 */   public Set<Object> getPublicCredentials() { throw new RuntimeException("Stub!"); } 
/* 17 */   public <T> Set<T> getPublicCredentials(Class<T> c) { throw new RuntimeException("Stub!"); } 
/* 18 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setReadOnly() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean isReadOnly() { throw new RuntimeException("Stub!"); } 
/* 21 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 22 */   public static Subject getSubject(AccessControlContext context) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.security.auth.Subject
 * JD-Core Version:    0.6.0
 */