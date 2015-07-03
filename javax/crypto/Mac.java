/*    */ package javax.crypto;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ public class Mac
/*    */   implements Cloneable
/*    */ {
/*    */   protected Mac(MacSpi macSpi, Provider provider, String algorithm)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static final Mac getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static final Mac getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/* 10 */   public static final Mac getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 11 */   public final int getMacLength() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void init(Key key, AlgorithmParameterSpec params) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/* 13 */   public final void init(Key key) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 14 */   public final void update(byte input) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 15 */   public final void update(byte[] input, int offset, int len) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 16 */   public final void update(byte[] input) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 17 */   public final void update(ByteBuffer input) { throw new RuntimeException("Stub!"); } 
/* 18 */   public final byte[] doFinal() throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 19 */   public final void doFinal(byte[] output, int outOffset) throws ShortBufferException, IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 20 */   public final byte[] doFinal(byte[] input) throws IllegalStateException { throw new RuntimeException("Stub!"); } 
/* 21 */   public final void reset() { throw new RuntimeException("Stub!"); } 
/* 22 */   public final Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.Mac
 * JD-Core Version:    0.6.0
 */