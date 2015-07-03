/*   */ package java.security;
/*   */ 
/*   */ public abstract class PolicySpi
/*   */ {
/*   */   public PolicySpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/*   */   protected abstract boolean engineImplies(ProtectionDomain paramProtectionDomain, Permission paramPermission);
/*   */ 
/* 6 */   protected void engineRefresh() { throw new RuntimeException("Stub!"); } 
/* 7 */   protected PermissionCollection engineGetPermissions(CodeSource codesource) { throw new RuntimeException("Stub!"); } 
/* 8 */   protected PermissionCollection engineGetPermissions(ProtectionDomain domain) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.PolicySpi
 * JD-Core Version:    0.6.0
 */