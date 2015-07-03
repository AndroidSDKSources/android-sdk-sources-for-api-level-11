/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.security.Principal;
/*    */ import java.security.cert.Certificate;
/*    */ import java.util.EventObject;
/*    */ import javax.security.cert.X509Certificate;
/*    */ 
/*    */ public class HandshakeCompletedEvent extends EventObject
/*    */ {
/*    */   public HandshakeCompletedEvent(SSLSocket sock, SSLSession s)
/*    */   {
/*  5 */     super((Object)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public SSLSession getSession() { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getCipherSuite() { throw new RuntimeException("Stub!"); } 
/*  8 */   public Certificate[] getLocalCertificates() { throw new RuntimeException("Stub!"); } 
/*  9 */   public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); } 
/* 10 */   public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); } 
/* 11 */   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); } 
/* 12 */   public Principal getLocalPrincipal() { throw new RuntimeException("Stub!"); } 
/* 13 */   public SSLSocket getSocket() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.HandshakeCompletedEvent
 * JD-Core Version:    0.6.0
 */