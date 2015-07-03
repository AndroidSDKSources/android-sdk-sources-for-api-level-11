/*    */ package javax.crypto;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.SecureRandom;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public class KeyGenerator
/*    */ {
/*    */   protected KeyGenerator(KeyGeneratorSpi keyGenSpi, Provider provider, String algorithm)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/*  6 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static final KeyGenerator getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static final KeyGenerator getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static final KeyGenerator getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 10 */   public final SecretKey generateKey() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final void init(AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void init(AlgorithmParameterSpec params, SecureRandom random) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 13 */   public final void init(int keysize) { throw new RuntimeException("Stub!"); } 
/* 14 */   public final void init(int keysize, SecureRandom random) { throw new RuntimeException("Stub!"); } 
/* 15 */   public final void init(SecureRandom random) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.KeyGenerator
 * JD-Core Version:    0.6.0
 */