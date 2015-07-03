/*   */ package java.security;
/*   */ 
/*   */ import java.security.spec.InvalidKeySpecException;
/*   */ import java.security.spec.KeySpec;
/*   */ 
/*   */ public abstract class KeyFactorySpi
/*   */ {
/*   */   public KeyFactorySpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract PublicKey engineGeneratePublic(KeySpec paramKeySpec)
/*   */     throws InvalidKeySpecException;
/*   */ 
/*   */   protected abstract PrivateKey engineGeneratePrivate(KeySpec paramKeySpec)
/*   */     throws InvalidKeySpecException;
/*   */ 
/*   */   protected abstract <T extends KeySpec> T engineGetKeySpec(Key paramKey, Class<T> paramClass)
/*   */     throws InvalidKeySpecException;
/*   */ 
/*   */   protected abstract Key engineTranslateKey(Key paramKey)
/*   */     throws InvalidKeyException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.KeyFactorySpi
 * JD-Core Version:    0.6.0
 */