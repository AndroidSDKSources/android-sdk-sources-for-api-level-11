/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.net.HttpURLConnection;
/*    */ import java.net.URL;
/*    */ import java.security.Principal;
/*    */ import java.security.cert.Certificate;
/*    */ 
/*    */ public abstract class HttpsURLConnection extends HttpURLConnection
/*    */ {
/*    */   protected HostnameVerifier hostnameVerifier;
/*    */ 
/*    */   protected HttpsURLConnection(URL url)
/*    */   {
/*  5 */     super((URL)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public static void setDefaultHostnameVerifier(HostnameVerifier v) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static HostnameVerifier getDefaultHostnameVerifier() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static void setDefaultSSLSocketFactory(SSLSocketFactory sf) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static SSLSocketFactory getDefaultSSLSocketFactory() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract String getCipherSuite();
/*    */ 
/*    */   public abstract Certificate[] getLocalCertificates();
/*    */ 
/*    */   public abstract Certificate[] getServerCertificates() throws SSLPeerUnverifiedException;
/*    */ 
/* 13 */   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); } 
/* 14 */   public Principal getLocalPrincipal() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setHostnameVerifier(HostnameVerifier v) { throw new RuntimeException("Stub!"); } 
/* 16 */   public HostnameVerifier getHostnameVerifier() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setSSLSocketFactory(SSLSocketFactory sf) { throw new RuntimeException("Stub!"); } 
/* 18 */   public SSLSocketFactory getSSLSocketFactory() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.HttpsURLConnection
 * JD-Core Version:    0.6.0
 */