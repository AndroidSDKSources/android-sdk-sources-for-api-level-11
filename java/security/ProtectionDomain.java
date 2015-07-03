/*    */ package java.security;
/*    */ 
/*    */ public class ProtectionDomain
/*    */ {
/*    */   public ProtectionDomain(CodeSource cs, PermissionCollection permissions)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public ProtectionDomain(CodeSource cs, PermissionCollection permissions, ClassLoader cl, Principal[] principals) { throw new RuntimeException("Stub!"); } 
/*  6 */   public final ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final CodeSource getCodeSource() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final PermissionCollection getPermissions() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final Principal[] getPrincipals() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean implies(Permission permission) { throw new RuntimeException("Stub!"); } 
/* 11 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.ProtectionDomain
 * JD-Core Version:    0.6.0
 */