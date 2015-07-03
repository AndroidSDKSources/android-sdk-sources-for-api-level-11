/*    */ package java.security;
/*    */ 
/*    */ import java.security.spec.InvalidKeySpecException;
/*    */ import java.security.spec.KeySpec;
/*    */ 
/*    */ public class KeyFactory
/*    */ {
/*    */   protected KeyFactory(KeyFactorySpi keyFacSpi, Provider provider, String algorithm)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static KeyFactory getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  6 */   public static KeyFactory getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static KeyFactory getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  8 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final PublicKey generatePublic(KeySpec keySpec) throws InvalidKeySpecException { throw new RuntimeException("Stub!"); } 
/* 11 */   public final PrivateKey generatePrivate(KeySpec keySpec) throws InvalidKeySpecException { throw new RuntimeException("Stub!"); } 
/* 12 */   public final <T extends KeySpec> T getKeySpec(Key key, Class<T> keySpec) throws InvalidKeySpecException { throw new RuntimeException("Stub!"); } 
/* 13 */   public final Key translateKey(Key key) throws InvalidKeyException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.KeyFactory
 * JD-Core Version:    0.6.0
 */