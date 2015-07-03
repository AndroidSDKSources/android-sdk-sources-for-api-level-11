/*   */ package org.apache.http.conn.ssl;
/*   */ 
/*   */ import javax.net.ssl.SSLException;
/*   */ 
/*   */ public class BrowserCompatHostnameVerifier extends AbstractVerifier
/*   */ {
/*   */   public BrowserCompatHostnameVerifier()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public final void verify(String host, String[] cns, String[] subjectAlts) throws SSLException { throw new RuntimeException("Stub!"); } 
/* 7 */   public final String toString() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.ssl.BrowserCompatHostnameVerifier
 * JD-Core Version:    0.6.0
 */