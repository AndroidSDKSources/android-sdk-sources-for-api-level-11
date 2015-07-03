/*   */ package java.net;
/*   */ 
/*   */ import java.security.Principal;
/*   */ import java.security.cert.Certificate;
/*   */ import java.util.List;
/*   */ import javax.net.ssl.SSLPeerUnverifiedException;
/*   */ 
/*   */ public abstract class SecureCacheResponse extends CacheResponse
/*   */ {
/*   */   public SecureCacheResponse()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract String getCipherSuite();
/*   */ 
/*   */   public abstract List<Certificate> getLocalCertificateChain();
/*   */ 
/*   */   public abstract List<Certificate> getServerCertificateChain()
/*   */     throws SSLPeerUnverifiedException;
/*   */ 
/*   */   public abstract Principal getPeerPrincipal()
/*   */     throws SSLPeerUnverifiedException;
/*   */ 
/*   */   public abstract Principal getLocalPrincipal();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.SecureCacheResponse
 * JD-Core Version:    0.6.0
 */