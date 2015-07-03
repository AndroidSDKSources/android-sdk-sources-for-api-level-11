/*   */ package javax.crypto;
/*   */ 
/*   */ import java.security.AlgorithmParameters;
/*   */ import java.security.InvalidAlgorithmParameterException;
/*   */ import java.security.InvalidKeyException;
/*   */ import java.security.Key;
/*   */ import java.security.spec.AlgorithmParameterSpec;
/*   */ 
/*   */ public abstract class ExemptionMechanismSpi
/*   */ {
/*   */   public ExemptionMechanismSpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract byte[] engineGenExemptionBlob()
/*   */     throws ExemptionMechanismException;
/*   */ 
/*   */   protected abstract int engineGenExemptionBlob(byte[] paramArrayOfByte, int paramInt)
/*   */     throws ShortBufferException, ExemptionMechanismException;
/*   */ 
/*   */   protected abstract int engineGetOutputSize(int paramInt);
/*   */ 
/*   */   protected abstract void engineInit(Key paramKey)
/*   */     throws InvalidKeyException, ExemptionMechanismException;
/*   */ 
/*   */   protected abstract void engineInit(Key paramKey, AlgorithmParameters paramAlgorithmParameters)
/*   */     throws InvalidKeyException, InvalidAlgorithmParameterException, ExemptionMechanismException;
/*   */ 
/*   */   protected abstract void engineInit(Key paramKey, AlgorithmParameterSpec paramAlgorithmParameterSpec)
/*   */     throws InvalidKeyException, InvalidAlgorithmParameterException, ExemptionMechanismException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.ExemptionMechanismSpi
 * JD-Core Version:    0.6.0
 */