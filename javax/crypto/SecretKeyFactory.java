/*    */ package javax.crypto;
/*    */ 
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.spec.InvalidKeySpecException;
/*    */ import java.security.spec.KeySpec;
/*    */ 
/*    */ public class SecretKeyFactory
/*    */ {
/*    */   protected SecretKeyFactory(SecretKeyFactorySpi keyFacSpi, Provider provider, String algorithm)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/*  6 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static final SecretKeyFactory getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static final SecretKeyFactory getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static final SecretKeyFactory getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 10 */   public final SecretKey generateSecret(KeySpec keySpec) throws InvalidKeySpecException { throw new RuntimeException("Stub!"); } 
/* 11 */   public final KeySpec getKeySpec(SecretKey key, Class keySpec) throws InvalidKeySpecException { throw new RuntimeException("Stub!"); } 
/* 12 */   public final SecretKey translateKey(SecretKey key) throws InvalidKeyException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.SecretKeyFactory
 * JD-Core Version:    0.6.0
 */