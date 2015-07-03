/*   */ package java.security.cert;
/*   */ 
/*   */ import java.security.PublicKey;
/*   */ 
/*   */ public class PKIXCertPathBuilderResult extends PKIXCertPathValidatorResult
/*   */   implements CertPathBuilderResult
/*   */ {
/*   */   public PKIXCertPathBuilderResult(CertPath certPath, TrustAnchor trustAnchor, PolicyNode policyTree, PublicKey subjectPublicKey)
/*   */   {
/* 6 */     super((TrustAnchor)null, (PolicyNode)null, (PublicKey)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public CertPath getCertPath() { throw new RuntimeException("Stub!"); } 
/* 8 */   public String toString() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.PKIXCertPathBuilderResult
 * JD-Core Version:    0.6.0
 */