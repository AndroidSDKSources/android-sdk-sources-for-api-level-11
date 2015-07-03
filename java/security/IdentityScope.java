/*    */ package java.security;
/*    */ 
/*    */ import java.util.Enumeration;
/*    */ 
/*    */ @Deprecated
/*    */ public abstract class IdentityScope extends Identity
/*    */ {
/*    */   protected IdentityScope()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public IdentityScope(String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public IdentityScope(String name, IdentityScope scope) throws KeyManagementException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static IdentityScope getSystemScope() { throw new RuntimeException("Stub!"); } 
/* 10 */   protected static void setSystemScope(IdentityScope scope) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int size();
/*    */ 
/*    */   public abstract Identity getIdentity(String paramString);
/*    */ 
/* 13 */   public Identity getIdentity(Principal principal) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Identity getIdentity(PublicKey paramPublicKey);
/*    */ 
/*    */   public abstract void addIdentity(Identity paramIdentity) throws KeyManagementException;
/*    */ 
/*    */   public abstract void removeIdentity(Identity paramIdentity) throws KeyManagementException;
/*    */ 
/*    */   public abstract Enumeration<Identity> identities();
/*    */ 
/* 18 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.IdentityScope
 * JD-Core Version:    0.6.0
 */