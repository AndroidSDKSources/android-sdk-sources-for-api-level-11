/*    */ package java.security.cert;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ 
/*    */ public abstract class CertificateFactorySpi
/*    */ {
/*    */   public CertificateFactorySpi()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract Certificate engineGenerateCertificate(InputStream paramInputStream) throws CertificateException;
/*    */ 
/*    */   public abstract Collection<? extends Certificate> engineGenerateCertificates(InputStream paramInputStream) throws CertificateException;
/*    */ 
/*    */   public abstract CRL engineGenerateCRL(InputStream paramInputStream) throws CRLException;
/*    */ 
/*    */   public abstract Collection<? extends CRL> engineGenerateCRLs(InputStream paramInputStream) throws CRLException;
/*    */ 
/*  9 */   public CertPath engineGenerateCertPath(InputStream inStream) throws CertificateException { throw new RuntimeException("Stub!"); } 
/* 10 */   public CertPath engineGenerateCertPath(InputStream inStream, String encoding) throws CertificateException { throw new RuntimeException("Stub!"); } 
/* 11 */   public CertPath engineGenerateCertPath(List<? extends Certificate> certificates) throws CertificateException { throw new RuntimeException("Stub!"); } 
/* 12 */   public Iterator<String> engineGetCertPathEncodings() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.CertificateFactorySpi
 * JD-Core Version:    0.6.0
 */