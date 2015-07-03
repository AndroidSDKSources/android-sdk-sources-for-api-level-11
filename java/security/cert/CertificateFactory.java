/*    */ package java.security.cert;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ 
/*    */ public class CertificateFactory
/*    */ {
/*    */   protected CertificateFactory(CertificateFactorySpi certFacSpi, Provider provider, String type)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static final CertificateFactory getInstance(String type) throws CertificateException { throw new RuntimeException("Stub!"); } 
/*  6 */   public static final CertificateFactory getInstance(String type, String provider) throws CertificateException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static final CertificateFactory getInstance(String type, Provider provider) throws CertificateException { throw new RuntimeException("Stub!"); } 
/*  8 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final String getType() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final Certificate generateCertificate(InputStream inStream) throws CertificateException { throw new RuntimeException("Stub!"); } 
/* 11 */   public final Iterator<String> getCertPathEncodings() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final CertPath generateCertPath(InputStream inStream) throws CertificateException { throw new RuntimeException("Stub!"); } 
/* 13 */   public final CertPath generateCertPath(InputStream inStream, String encoding) throws CertificateException { throw new RuntimeException("Stub!"); } 
/* 14 */   public final CertPath generateCertPath(List<? extends Certificate> certificates) throws CertificateException { throw new RuntimeException("Stub!"); } 
/* 15 */   public final Collection<? extends Certificate> generateCertificates(InputStream inStream) throws CertificateException { throw new RuntimeException("Stub!"); } 
/* 16 */   public final CRL generateCRL(InputStream inStream) throws CRLException { throw new RuntimeException("Stub!"); } 
/* 17 */   public final Collection<? extends CRL> generateCRLs(InputStream inStream) throws CRLException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.CertificateFactory
 * JD-Core Version:    0.6.0
 */