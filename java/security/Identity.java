/*    */ package java.security;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ @Deprecated
/*    */ public abstract class Identity
/*    */   implements Principal, Serializable
/*    */ {
/*    */   protected Identity()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public Identity(String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Identity(String name, IdentityScope scope) throws KeyManagementException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void addCertificate(Certificate certificate) throws KeyManagementException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void removeCertificate(Certificate certificate) throws KeyManagementException { throw new RuntimeException("Stub!"); } 
/* 11 */   public Certificate[] certificates() { throw new RuntimeException("Stub!"); } 
/* 12 */   protected boolean identityEquals(Identity identity) { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString(boolean detailed) { throw new RuntimeException("Stub!"); } 
/* 14 */   public final IdentityScope getScope() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setPublicKey(PublicKey key) throws KeyManagementException { throw new RuntimeException("Stub!"); } 
/* 16 */   public PublicKey getPublicKey() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setInfo(String info) { throw new RuntimeException("Stub!"); } 
/* 18 */   public String getInfo() { throw new RuntimeException("Stub!"); } 
/* 19 */   public final boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 20 */   public final String getName() { throw new RuntimeException("Stub!"); } 
/* 21 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 22 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.Identity
 * JD-Core Version:    0.6.0
 */