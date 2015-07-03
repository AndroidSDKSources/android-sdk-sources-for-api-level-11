/*    */ package javax.crypto;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.security.AlgorithmParameters;
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.SecureRandom;
/*    */ import java.security.cert.Certificate;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public class Cipher
/*    */ {
/*    */   public static final int DECRYPT_MODE = 2;
/*    */   public static final int ENCRYPT_MODE = 1;
/*    */   public static final int PRIVATE_KEY = 2;
/*    */   public static final int PUBLIC_KEY = 1;
/*    */   public static final int SECRET_KEY = 3;
/*    */   public static final int UNWRAP_MODE = 4;
/*    */   public static final int WRAP_MODE = 3;
/*    */ 
/*    */   protected Cipher(CipherSpi cipherSpi, Provider provider, String transformation)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static final Cipher getInstance(String transformation) throws NoSuchAlgorithmException, NoSuchPaddingException { throw new RuntimeException("Stub!"); } 
/*  6 */   public static final Cipher getInstance(String transformation, String provider) throws NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static final Cipher getInstance(String transformation, Provider provider) throws NoSuchAlgorithmException, NoSuchPaddingException { throw new RuntimeException("Stub!"); } 
/*  8 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final int getBlockSize() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final int getOutputSize(int inputLen) { throw new RuntimeException("Stub!"); } 
/* 12 */   public final byte[] getIV() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final AlgorithmParameters getParameters() { throw new RuntimeException("Stub!"); } 
/* 14 */   public final ExemptionMechanism getExemptionMechanism() { throw new RuntimeException("Stub!"); } 
/* 15 */   public final void init(int opmode, Key key) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 16 */   public final void init(int opmode, Key key, SecureRandom random) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 17 */   public final void init(int opmode, Key key, AlgorithmParameterSpec params) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 18 */   public final void init(int opmode, Key key, AlgorithmParameterSpec params, SecureRandom random) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 19 */   public final void init(int opmode, Key key, AlgorithmParameters params) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 20 */   public final void init(int opmode, Key key, AlgorithmParameters params, SecureRandom random) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 21 */   public final void init(int opmode, Certificate certificate) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 22 */   public final void init(int opmode, Certificate certificate, SecureRandom random) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 23 */   public final byte[] update(byte[] input) { throw new RuntimeException("Stub!"); } 
/* 24 */   public final byte[] update(byte[] input, int inputOffset, int inputLen) { throw new RuntimeException("Stub!"); } 
/* 25 */   public final int update(byte[] input, int inputOffset, int inputLen, byte[] output) throws ShortBufferException { throw new RuntimeException("Stub!"); } 
/* 26 */   public final int update(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset) throws ShortBufferException { throw new RuntimeException("Stub!"); } 
/* 27 */   public final int update(ByteBuffer input, ByteBuffer output) throws ShortBufferException { throw new RuntimeException("Stub!"); } 
/* 28 */   public final byte[] doFinal() throws IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); } 
/* 29 */   public final int doFinal(byte[] output, int outputOffset) throws IllegalBlockSizeException, ShortBufferException, BadPaddingException { throw new RuntimeException("Stub!"); } 
/* 30 */   public final byte[] doFinal(byte[] input) throws IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); } 
/* 31 */   public final byte[] doFinal(byte[] input, int inputOffset, int inputLen) throws IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); } 
/* 32 */   public final int doFinal(byte[] input, int inputOffset, int inputLen, byte[] output) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); } 
/* 33 */   public final int doFinal(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); } 
/* 34 */   public final int doFinal(ByteBuffer input, ByteBuffer output) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); } 
/* 35 */   public final byte[] wrap(Key key) throws IllegalBlockSizeException, InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 36 */   public final Key unwrap(byte[] wrappedKey, String wrappedKeyAlgorithm, int wrappedKeyType) throws InvalidKeyException, NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 37 */   public static final int getMaxAllowedKeyLength(String transformation) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 38 */   public static final AlgorithmParameterSpec getMaxAllowedParameterSpec(String transformation) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.Cipher
 * JD-Core Version:    0.6.0
 */