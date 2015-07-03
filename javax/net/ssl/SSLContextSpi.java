/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.security.KeyManagementException;
/*    */ import java.security.SecureRandom;
/*    */ 
/*    */ public abstract class SSLContextSpi
/*    */ {
/*    */   public SSLContextSpi()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void engineInit(KeyManager[] paramArrayOfKeyManager, TrustManager[] paramArrayOfTrustManager, SecureRandom paramSecureRandom) throws KeyManagementException;
/*    */ 
/*    */   protected abstract SSLSocketFactory engineGetSocketFactory();
/*    */ 
/*    */   protected abstract SSLServerSocketFactory engineGetServerSocketFactory();
/*    */ 
/*    */   protected abstract SSLEngine engineCreateSSLEngine(String paramString, int paramInt);
/*    */ 
/*    */   protected abstract SSLEngine engineCreateSSLEngine();
/*    */ 
/*    */   protected abstract SSLSessionContext engineGetServerSessionContext();
/*    */ 
/*    */   protected abstract SSLSessionContext engineGetClientSessionContext();
/*    */ 
/* 12 */   protected SSLParameters engineGetDefaultSSLParameters() { throw new RuntimeException("Stub!"); } 
/* 13 */   protected SSLParameters engineGetSupportedSSLParameters() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.SSLContextSpi
 * JD-Core Version:    0.6.0
 */