/*    */ package org.apache.http.conn.ssl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ import java.net.UnknownHostException;
/*    */ import java.security.KeyManagementException;
/*    */ import java.security.KeyStore;
/*    */ import java.security.KeyStoreException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.SecureRandom;
/*    */ import java.security.UnrecoverableKeyException;
/*    */ import org.apache.http.conn.scheme.HostNameResolver;
/*    */ import org.apache.http.conn.scheme.LayeredSocketFactory;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public class SSLSocketFactory
/*    */   implements LayeredSocketFactory
/*    */ {
/*    */   public static final String TLS = "TLS";
/*    */   public static final String SSL = "SSL";
/*    */   public static final String SSLV2 = "SSLv2";
/* 22 */   public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = null; public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = null; public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = null;
/*    */ 
/*    */   public SSLSocketFactory(String algorithm, KeyStore keystore, String keystorePassword, KeyStore truststore, SecureRandom random, HostNameResolver nameResolver)
/*    */     throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public SSLSocketFactory(KeyStore keystore, String keystorePassword, KeyStore truststore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException { throw new RuntimeException("Stub!"); } 
/*  7 */   public SSLSocketFactory(KeyStore keystore, String keystorePassword) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException { throw new RuntimeException("Stub!"); } 
/*  8 */   public SSLSocketFactory(KeyStore truststore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static SSLSocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Socket createSocket() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public Socket connectSocket(Socket sock, String host, int port, InetAddress localAddress, int localPort, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isSecure(Socket sock) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 13 */   public Socket createSocket(Socket socket, String host, int port, boolean autoClose) throws IOException, UnknownHostException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setHostnameVerifier(X509HostnameVerifier hostnameVerifier) { throw new RuntimeException("Stub!"); } 
/* 15 */   public X509HostnameVerifier getHostnameVerifier() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.ssl.SSLSocketFactory
 * JD-Core Version:    0.6.0
 */