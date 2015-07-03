/*    */ package java.security;
/*    */ 
/*    */ public abstract class Policy
/*    */ {
/* 21 */   public static final PermissionCollection UNSUPPORTED_EMPTY_COLLECTION = null;
/*    */ 
/*    */   public Policy()
/*    */   {
/*  7 */     throw new RuntimeException("Stub!"); } 
/*  8 */   public static Policy getInstance(String type, Parameters params) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static Policy getInstance(String type, Parameters params, String provider) throws NoSuchProviderException, NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 10 */   public static Policy getInstance(String type, Parameters params, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 11 */   public Parameters getParameters() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Provider getProvider() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String getType() { throw new RuntimeException("Stub!"); } 
/* 14 */   public PermissionCollection getPermissions(CodeSource cs) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void refresh() { throw new RuntimeException("Stub!"); } 
/* 16 */   public PermissionCollection getPermissions(ProtectionDomain domain) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean implies(ProtectionDomain domain, Permission permission) { throw new RuntimeException("Stub!"); } 
/* 18 */   public static Policy getPolicy() { throw new RuntimeException("Stub!"); } 
/* 19 */   public static void setPolicy(Policy policy) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface Parameters
/*    */   {
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.Policy
 * JD-Core Version:    0.6.0
 */