/*    */ package javax.crypto;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.security.AlgorithmParameters;
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.SecureRandom;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public abstract class CipherSpi
/*    */ {
/*    */   public CipherSpi()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void engineSetMode(String paramString) throws NoSuchAlgorithmException;
/*    */ 
/*    */   protected abstract void engineSetPadding(String paramString) throws NoSuchPaddingException;
/*    */ 
/*    */   protected abstract int engineGetBlockSize();
/*    */ 
/*    */   protected abstract int engineGetOutputSize(int paramInt);
/*    */ 
/*    */   protected abstract byte[] engineGetIV();
/*    */ 
/*    */   protected abstract AlgorithmParameters engineGetParameters();
/*    */ 
/*    */   protected abstract void engineInit(int paramInt, Key paramKey, SecureRandom paramSecureRandom) throws InvalidKeyException;
/*    */ 
/*    */   protected abstract void engineInit(int paramInt, Key paramKey, AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException;
/*    */ 
/*    */   protected abstract void engineInit(int paramInt, Key paramKey, AlgorithmParameters paramAlgorithmParameters, SecureRandom paramSecureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException;
/*    */ 
/*    */   protected abstract byte[] engineUpdate(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
/*    */ 
/*    */   protected abstract int engineUpdate(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3) throws ShortBufferException;
/*    */ 
/* 16 */   protected int engineUpdate(ByteBuffer input, ByteBuffer output) throws ShortBufferException { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract byte[] engineDoFinal(byte[] paramArrayOfByte, int paramInt1, int paramInt2) throws IllegalBlockSizeException, BadPaddingException;
/*    */ 
/*    */   protected abstract int engineDoFinal(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException;
/*    */ 
/* 19 */   protected int engineDoFinal(ByteBuffer input, ByteBuffer output) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); } 
/* 20 */   protected byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 21 */   protected Key engineUnwrap(byte[] wrappedKey, String wrappedKeyAlgorithm, int wrappedKeyType) throws InvalidKeyException, NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 22 */   protected int engineGetKeySize(Key key) throws InvalidKeyException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.CipherSpi
 * JD-Core Version:    0.6.0
 */