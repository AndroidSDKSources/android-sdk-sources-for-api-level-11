/*    */ package org.apache.http.conn.ssl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.security.cert.X509Certificate;
/*    */ import javax.net.ssl.SSLException;
/*    */ import javax.net.ssl.SSLSession;
/*    */ import javax.net.ssl.SSLSocket;
/*    */ 
/*    */ public abstract class AbstractVerifier
/*    */   implements X509HostnameVerifier
/*    */ {
/*    */   public AbstractVerifier()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public final void verify(String host, SSLSocket ssl) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public final boolean verify(String host, SSLSession session) { throw new RuntimeException("Stub!"); } 
/*  8 */   public final void verify(String host, X509Certificate cert) throws SSLException { throw new RuntimeException("Stub!"); } 
/*  9 */   public final void verify(String host, String[] cns, String[] subjectAlts, boolean strictWithSubDomains) throws SSLException { throw new RuntimeException("Stub!"); } 
/* 10 */   public static boolean acceptableCountryWildcard(String cn) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static String[] getCNs(X509Certificate cert) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static String[] getDNSSubjectAlts(X509Certificate cert) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static int countDots(String s) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.ssl.AbstractVerifier
 * JD-Core Version:    0.6.0
 */