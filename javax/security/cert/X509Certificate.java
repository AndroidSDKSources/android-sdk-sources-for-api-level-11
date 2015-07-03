/*   */ package javax.security.cert;
/*   */ 
/*   */ import java.io.InputStream;
/*   */ import java.math.BigInteger;
/*   */ import java.security.Principal;
/*   */ import java.util.Date;
/*   */ 
/*   */ public abstract class X509Certificate extends Certificate
/*   */ {
/*   */   public X509Certificate()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public static final X509Certificate getInstance(InputStream inStream) throws CertificateException { throw new RuntimeException("Stub!"); } 
/* 7 */   public static final X509Certificate getInstance(byte[] certData) throws CertificateException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void checkValidity()
/*   */     throws CertificateExpiredException, CertificateNotYetValidException;
/*   */ 
/*   */   public abstract void checkValidity(Date paramDate)
/*   */     throws CertificateExpiredException, CertificateNotYetValidException;
/*   */ 
/*   */   public abstract int getVersion();
/*   */ 
/*   */   public abstract BigInteger getSerialNumber();
/*   */ 
/*   */   public abstract Principal getIssuerDN();
/*   */ 
/*   */   public abstract Principal getSubjectDN();
/*   */ 
/*   */   public abstract Date getNotBefore();
/*   */ 
/*   */   public abstract Date getNotAfter();
/*   */ 
/*   */   public abstract String getSigAlgName();
/*   */ 
/*   */   public abstract String getSigAlgOID();
/*   */ 
/*   */   public abstract byte[] getSigAlgParams();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.security.cert.X509Certificate
 * JD-Core Version:    0.6.0
 */