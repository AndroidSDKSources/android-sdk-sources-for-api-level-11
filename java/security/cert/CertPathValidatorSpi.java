/*   */ package java.security.cert;
/*   */ 
/*   */ import java.security.InvalidAlgorithmParameterException;
/*   */ 
/*   */ public abstract class CertPathValidatorSpi
/*   */ {
/*   */   public CertPathValidatorSpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract CertPathValidatorResult engineValidate(CertPath paramCertPath, CertPathParameters paramCertPathParameters)
/*   */     throws CertPathValidatorException, InvalidAlgorithmParameterException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.CertPathValidatorSpi
 * JD-Core Version:    0.6.0
 */