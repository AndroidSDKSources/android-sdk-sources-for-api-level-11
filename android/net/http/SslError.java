/*    */ package android.net.http;
/*    */ 
/*    */ import java.security.cert.X509Certificate;
/*    */ 
/*    */ public class SslError
/*    */ {
/*    */   public static final int SSL_NOTYETVALID = 0;
/*    */   public static final int SSL_EXPIRED = 1;
/*    */   public static final int SSL_IDMISMATCH = 2;
/*    */   public static final int SSL_UNTRUSTED = 3;
/*    */   public static final int SSL_MAX_ERROR = 4;
/*    */ 
/*    */   public SslError(int error, SslCertificate certificate)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public SslError(int error, X509Certificate certificate) { throw new RuntimeException("Stub!"); } 
/*  6 */   public SslCertificate getCertificate() { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean addError(int error) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean hasError(int error) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getPrimaryError() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.http.SslError
 * JD-Core Version:    0.6.0
 */