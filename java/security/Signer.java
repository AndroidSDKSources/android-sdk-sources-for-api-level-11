/*    */ package java.security;
/*    */ 
/*    */ @Deprecated
/*    */ public abstract class Signer extends Identity
/*    */ {
/*    */   protected Signer()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public Signer(String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Signer(String name, IdentityScope scope) throws KeyManagementException { throw new RuntimeException("Stub!"); } 
/*  9 */   public PrivateKey getPrivateKey() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final void setKeyPair(KeyPair pair) throws InvalidParameterException, KeyException { throw new RuntimeException("Stub!"); } 
/* 11 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.Signer
 * JD-Core Version:    0.6.0
 */