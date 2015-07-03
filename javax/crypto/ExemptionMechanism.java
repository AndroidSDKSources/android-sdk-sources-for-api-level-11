/*    */ package javax.crypto;
/*    */ 
/*    */ import java.security.AlgorithmParameters;
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public class ExemptionMechanism
/*    */ {
/*    */   protected ExemptionMechanism(ExemptionMechanismSpi exmechSpi, Provider provider, String mechanism)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final String getName() { throw new RuntimeException("Stub!"); } 
/*  6 */   public static final ExemptionMechanism getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static final ExemptionMechanism getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static final ExemptionMechanism getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  9 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final boolean isCryptoAllowed(Key key) throws ExemptionMechanismException { throw new RuntimeException("Stub!"); } 
/* 11 */   public final int getOutputSize(int inputLen) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void init(Key key) throws InvalidKeyException, ExemptionMechanismException { throw new RuntimeException("Stub!"); } 
/* 13 */   public final void init(Key key, AlgorithmParameters param) throws InvalidKeyException, InvalidAlgorithmParameterException, ExemptionMechanismException { throw new RuntimeException("Stub!"); } 
/* 14 */   public final void init(Key key, AlgorithmParameterSpec param) throws InvalidKeyException, InvalidAlgorithmParameterException, ExemptionMechanismException { throw new RuntimeException("Stub!"); } 
/* 15 */   public final byte[] genExemptionBlob() throws IllegalStateException, ExemptionMechanismException { throw new RuntimeException("Stub!"); } 
/* 16 */   public final int genExemptionBlob(byte[] output) throws IllegalStateException, ShortBufferException, ExemptionMechanismException { throw new RuntimeException("Stub!"); } 
/* 17 */   public final int genExemptionBlob(byte[] output, int outputOffset) throws IllegalStateException, ShortBufferException, ExemptionMechanismException { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void finalize() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.ExemptionMechanism
 * JD-Core Version:    0.6.0
 */