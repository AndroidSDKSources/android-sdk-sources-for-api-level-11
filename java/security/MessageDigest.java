/*    */ package java.security;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ public abstract class MessageDigest extends MessageDigestSpi
/*    */ {
/*    */   protected MessageDigest(String algorithm)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static MessageDigest getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static MessageDigest getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static MessageDigest getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void reset() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void update(byte arg0) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void update(byte[] input, int offset, int len) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void update(byte[] input) { throw new RuntimeException("Stub!"); } 
/* 13 */   public byte[] digest() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int digest(byte[] buf, int offset, int len) throws DigestException { throw new RuntimeException("Stub!"); } 
/* 15 */   public byte[] digest(byte[] input) { throw new RuntimeException("Stub!"); } 
/* 16 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 17 */   public static boolean isEqual(byte[] digesta, byte[] digestb) { throw new RuntimeException("Stub!"); } 
/* 18 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/* 19 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/* 20 */   public final int getDigestLength() { throw new RuntimeException("Stub!"); } 
/* 21 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); } 
/* 22 */   public final void update(ByteBuffer input) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.MessageDigest
 * JD-Core Version:    0.6.0
 */