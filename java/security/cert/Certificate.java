/*    */ package java.security.cert;
/*    */ 
/*    */ import java.io.ObjectStreamException;
/*    */ import java.io.Serializable;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.PublicKey;
/*    */ import java.security.SignatureException;
/*    */ 
/*    */ public abstract class Certificate
/*    */   implements Serializable
/*    */ {
/*    */   protected Certificate(String type)
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   public final String getType() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract byte[] getEncoded() throws CertificateEncodingException;
/*    */ 
/*    */   public abstract void verify(PublicKey paramPublicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;
/*    */ 
/*    */   public abstract void verify(PublicKey paramPublicKey, String paramString) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;
/*    */ 
/*    */   public abstract String toString();
/*    */ 
/*    */   public abstract PublicKey getPublicKey();
/*    */ 
/* 20 */   protected Object writeReplace() throws ObjectStreamException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   protected static class CertificateRep
/*    */     implements Serializable
/*    */   {
/*    */     protected CertificateRep(String type, byte[] data)
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     protected Object readResolve() throws ObjectStreamException { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.Certificate
 * JD-Core Version:    0.6.0
 */