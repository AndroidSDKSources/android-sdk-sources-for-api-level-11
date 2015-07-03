/*   */ package java.security.cert;
/*   */ 
/*   */ import java.security.InvalidAlgorithmParameterException;
/*   */ import java.security.KeyStore;
/*   */ import java.security.KeyStoreException;
/*   */ import java.util.Set;
/*   */ 
/*   */ public class PKIXBuilderParameters extends PKIXParameters
/*   */ {
/*   */   public PKIXBuilderParameters(Set<TrustAnchor> trustAnchors, CertSelector targetConstraints)
/*   */     throws InvalidAlgorithmParameterException
/*   */   {
/* 5 */     super((Set)null); throw new RuntimeException("Stub!"); } 
/* 6 */   public PKIXBuilderParameters(KeyStore keyStore, CertSelector targetConstraints) throws KeyStoreException, InvalidAlgorithmParameterException { super((KeyStore)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public int getMaxPathLength() { throw new RuntimeException("Stub!"); } 
/* 8 */   public void setMaxPathLength(int maxPathLength) { throw new RuntimeException("Stub!"); } 
/* 9 */   public String toString() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.PKIXBuilderParameters
 * JD-Core Version:    0.6.0
 */