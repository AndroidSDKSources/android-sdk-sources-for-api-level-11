/*   */ package java.security.cert;
/*   */ 
/*   */ import java.security.InvalidAlgorithmParameterException;
/*   */ 
/*   */ public abstract class CertPathBuilderSpi
/*   */ {
/*   */   public CertPathBuilderSpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract CertPathBuilderResult engineBuild(CertPathParameters paramCertPathParameters)
/*   */     throws CertPathBuilderException, InvalidAlgorithmParameterException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.CertPathBuilderSpi
 * JD-Core Version:    0.6.0
 */