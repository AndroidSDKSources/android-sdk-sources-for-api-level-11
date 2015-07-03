/*   */ package javax.security.cert;
/*   */ 
/*   */ import java.security.InvalidKeyException;
/*   */ import java.security.NoSuchAlgorithmException;
/*   */ import java.security.NoSuchProviderException;
/*   */ import java.security.PublicKey;
/*   */ import java.security.SignatureException;
/*   */ 
/*   */ public abstract class Certificate
/*   */ {
/*   */   public Certificate()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 6 */   public int hashCode() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract byte[] getEncoded()
/*   */     throws CertificateEncodingException;
/*   */ 
/*   */   public abstract void verify(PublicKey paramPublicKey)
/*   */     throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;
/*   */ 
/*   */   public abstract void verify(PublicKey paramPublicKey, String paramString)
/*   */     throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;
/*   */ 
/*   */   public abstract String toString();
/*   */ 
/*   */   public abstract PublicKey getPublicKey();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.security.cert.Certificate
 * JD-Core Version:    0.6.0
 */