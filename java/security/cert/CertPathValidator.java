/*    */ package java.security.cert;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ 
/*    */ public class CertPathValidator
/*    */ {
/*    */   protected CertPathValidator(CertPathValidatorSpi validatorSpi, Provider provider, String algorithm)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/*  6 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static CertPathValidator getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static CertPathValidator getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static CertPathValidator getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 10 */   public final CertPathValidatorResult validate(CertPath certPath, CertPathParameters params) throws CertPathValidatorException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 11 */   public static final String getDefaultType() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.CertPathValidator
 * JD-Core Version:    0.6.0
 */