/*    */ package java.security.cert;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.util.Collection;
/*    */ 
/*    */ public class CertStore
/*    */ {
/*    */   protected CertStore(CertStoreSpi storeSpi, Provider provider, String type, CertStoreParameters params)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static CertStore getInstance(String type, CertStoreParameters params) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  6 */   public static CertStore getInstance(String type, CertStoreParameters params, String provider) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static CertStore getInstance(String type, CertStoreParameters params, Provider provider) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/*  8 */   public final String getType() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final CertStoreParameters getCertStoreParameters() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final Collection<? extends Certificate> getCertificates(CertSelector selector) throws CertStoreException { throw new RuntimeException("Stub!"); } 
/* 12 */   public final Collection<? extends CRL> getCRLs(CRLSelector selector) throws CertStoreException { throw new RuntimeException("Stub!"); } 
/* 13 */   public static final String getDefaultType() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.CertStore
 * JD-Core Version:    0.6.0
 */