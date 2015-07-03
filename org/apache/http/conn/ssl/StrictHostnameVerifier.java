/*   */ package org.apache.http.conn.ssl;
/*   */ 
/*   */ import javax.net.ssl.SSLException;
/*   */ 
/*   */ public class StrictHostnameVerifier extends AbstractVerifier
/*   */ {
/*   */   public StrictHostnameVerifier()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public final void verify(String host, String[] cns, String[] subjectAlts) throws SSLException { throw new RuntimeException("Stub!"); } 
/* 7 */   public final String toString() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.ssl.StrictHostnameVerifier
 * JD-Core Version:    0.6.0
 */