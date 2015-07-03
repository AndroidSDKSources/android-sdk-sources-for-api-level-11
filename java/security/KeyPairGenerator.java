/*    */ package java.security;
/*    */ 
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public abstract class KeyPairGenerator extends KeyPairGeneratorSpi
/*    */ {
/*    */   protected KeyPairGenerator(String algorithm)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static KeyPairGenerator getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static KeyPairGenerator getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static KeyPairGenerator getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 10 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void initialize(int keysize) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void initialize(AlgorithmParameterSpec param) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 13 */   public final KeyPair genKeyPair() { throw new RuntimeException("Stub!"); } 
/* 14 */   public KeyPair generateKeyPair() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void initialize(int keysize, SecureRandom random) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void initialize(AlgorithmParameterSpec param, SecureRandom random) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.KeyPairGenerator
 * JD-Core Version:    0.6.0
 */