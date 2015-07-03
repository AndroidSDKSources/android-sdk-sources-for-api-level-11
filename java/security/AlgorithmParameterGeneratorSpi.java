/*   */ package java.security;
/*   */ 
/*   */ import java.security.spec.AlgorithmParameterSpec;
/*   */ 
/*   */ public abstract class AlgorithmParameterGeneratorSpi
/*   */ {
/*   */   public AlgorithmParameterGeneratorSpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract void engineInit(int paramInt, SecureRandom paramSecureRandom);
/*   */ 
/*   */   protected abstract void engineInit(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom)
/*   */     throws InvalidAlgorithmParameterException;
/*   */ 
/*   */   protected abstract AlgorithmParameters engineGenerateParameters();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.AlgorithmParameterGeneratorSpi
 * JD-Core Version:    0.6.0
 */