/*   */ package javax.net.ssl;
/*   */ 
/*   */ import java.security.InvalidAlgorithmParameterException;
/*   */ import java.security.KeyStore;
/*   */ import java.security.KeyStoreException;
/*   */ 
/*   */ public abstract class TrustManagerFactorySpi
/*   */ {
/*   */   public TrustManagerFactorySpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract void engineInit(KeyStore paramKeyStore)
/*   */     throws KeyStoreException;
/*   */ 
/*   */   protected abstract void engineInit(ManagerFactoryParameters paramManagerFactoryParameters)
/*   */     throws InvalidAlgorithmParameterException;
/*   */ 
/*   */   protected abstract TrustManager[] engineGetTrustManagers();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.TrustManagerFactorySpi
 * JD-Core Version:    0.6.0
 */