/*   */ package javax.crypto;
/*   */ 
/*   */ import java.security.InvalidAlgorithmParameterException;
/*   */ import java.security.SecureRandom;
/*   */ import java.security.spec.AlgorithmParameterSpec;
/*   */ 
/*   */ public abstract class KeyGeneratorSpi
/*   */ {
/*   */   public KeyGeneratorSpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract SecretKey engineGenerateKey();
/*   */ 
/*   */   protected abstract void engineInit(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom)
/*   */     throws InvalidAlgorithmParameterException;
/*   */ 
/*   */   protected abstract void engineInit(int paramInt, SecureRandom paramSecureRandom);
/*   */ 
/*   */   protected abstract void engineInit(SecureRandom paramSecureRandom);
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.KeyGeneratorSpi
 * JD-Core Version:    0.6.0
 */