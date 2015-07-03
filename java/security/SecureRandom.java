/*    */ package java.security;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ public class SecureRandom extends Random
/*    */ {
/*    */   public SecureRandom()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public SecureRandom(byte[] seed) { throw new RuntimeException("Stub!"); } 
/*  7 */   protected SecureRandom(SecureRandomSpi secureRandomSpi, Provider provider) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static SecureRandom getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static SecureRandom getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/* 10 */   public static SecureRandom getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 11 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/* 13 */   public synchronized void setSeed(byte[] seed) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setSeed(long seed) { throw new RuntimeException("Stub!"); } 
/* 15 */   public synchronized void nextBytes(byte[] bytes) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected final int next(int numBits) { throw new RuntimeException("Stub!"); } 
/* 17 */   public static byte[] getSeed(int numBytes) { throw new RuntimeException("Stub!"); } 
/* 18 */   public byte[] generateSeed(int numBytes) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.SecureRandom
 * JD-Core Version:    0.6.0
 */