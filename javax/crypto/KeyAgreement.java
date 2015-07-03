/*    */ package javax.crypto;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.SecureRandom;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public class KeyAgreement
/*    */ {
/*    */   protected KeyAgreement(KeyAgreementSpi keyAgreeSpi, Provider provider, String algorithm)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/*  6 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static final KeyAgreement getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static final KeyAgreement getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static final KeyAgreement getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 10 */   public final void init(Key key) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 11 */   public final void init(Key key, SecureRandom random) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void init(Key key, AlgorithmParameterSpec params) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 13 */   public final void init(Key key, AlgorithmParameterSpec params, SecureRandom random) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 14 */   public final Key doPhase(Key key, boolean lastPhase) throws InvalidKeyException, IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 15 */   public final byte[] generateSecret() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 16 */   public final int generateSecret(byte[] sharedSecret, int offset) throws IllegalStateException, ShortBufferException { throw new RuntimeException("Stub!"); } 
/* 17 */   public final SecretKey generateSecret(String algorithm) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.KeyAgreement
 * JD-Core Version:    0.6.0
 */