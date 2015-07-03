/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.security.KeyManagementException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.SecureRandom;
/*    */ 
/*    */ public class SSLContext
/*    */ {
/*    */   protected SSLContext(SSLContextSpi contextSpi, Provider provider, String protocol)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static SSLContext getDefault() throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  6 */   public static void setDefault(SSLContext sslContext) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static SSLContext getInstance(String protocol) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static SSLContext getInstance(String protocol, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static SSLContext getInstance(String protocol, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); } 
/* 10 */   public final String getProtocol() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void init(KeyManager[] km, TrustManager[] tm, SecureRandom sr) throws KeyManagementException { throw new RuntimeException("Stub!"); } 
/* 13 */   public final SSLSocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); } 
/* 14 */   public final SSLServerSocketFactory getServerSocketFactory() { throw new RuntimeException("Stub!"); } 
/* 15 */   public final SSLEngine createSSLEngine() { throw new RuntimeException("Stub!"); } 
/* 16 */   public final SSLEngine createSSLEngine(String peerHost, int peerPort) { throw new RuntimeException("Stub!"); } 
/* 17 */   public final SSLSessionContext getServerSessionContext() { throw new RuntimeException("Stub!"); } 
/* 18 */   public final SSLSessionContext getClientSessionContext() { throw new RuntimeException("Stub!"); } 
/* 19 */   public final SSLParameters getDefaultSSLParameters() { throw new RuntimeException("Stub!"); } 
/* 20 */   public final SSLParameters getSupportedSSLParameters() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.SSLContext
 * JD-Core Version:    0.6.0
 */