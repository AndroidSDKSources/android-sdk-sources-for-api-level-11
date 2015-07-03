/*   */ package javax.crypto;
/*   */ 
/*   */ import java.security.InvalidKeyException;
/*   */ import java.security.spec.InvalidKeySpecException;
/*   */ import java.security.spec.KeySpec;
/*   */ 
/*   */ public abstract class SecretKeyFactorySpi
/*   */ {
/*   */   public SecretKeyFactorySpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract SecretKey engineGenerateSecret(KeySpec paramKeySpec)
/*   */     throws InvalidKeySpecException;
/*   */ 
/*   */   protected abstract KeySpec engineGetKeySpec(SecretKey paramSecretKey, Class paramClass)
/*   */     throws InvalidKeySpecException;
/*   */ 
/*   */   protected abstract SecretKey engineTranslateKey(SecretKey paramSecretKey)
/*   */     throws InvalidKeyException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.SecretKeyFactorySpi
 * JD-Core Version:    0.6.0
 */