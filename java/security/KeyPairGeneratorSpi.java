/*   */ package java.security;
/*   */ 
/*   */ import java.security.spec.AlgorithmParameterSpec;
/*   */ 
/*   */ public abstract class KeyPairGeneratorSpi
/*   */ {
/*   */   public KeyPairGeneratorSpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/*   */   public abstract KeyPair generateKeyPair();
/*   */ 
/*   */   public abstract void initialize(int paramInt, SecureRandom paramSecureRandom);
/*   */ 
/* 7 */   public void initialize(AlgorithmParameterSpec params, SecureRandom random) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.KeyPairGeneratorSpi
 * JD-Core Version:    0.6.0
 */