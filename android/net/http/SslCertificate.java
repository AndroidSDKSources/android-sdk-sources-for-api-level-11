/*    */ package android.net.http;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import java.security.cert.X509Certificate;
/*    */ import java.util.Date;
/*    */ 
/*    */ public class SslCertificate
/*    */ {
/*    */   public SslCertificate(String issuedTo, String issuedBy, String validNotBefore, String validNotAfter)
/*    */   {
/* 12 */     throw new RuntimeException("Stub!"); } 
/* 13 */   public SslCertificate(String issuedTo, String issuedBy, Date validNotBefore, Date validNotAfter) { throw new RuntimeException("Stub!"); } 
/* 14 */   public SslCertificate(X509Certificate certificate) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static Bundle saveState(SslCertificate certificate) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static SslCertificate restoreState(Bundle bundle) { throw new RuntimeException("Stub!"); } 
/* 17 */   public Date getValidNotBeforeDate() { throw new RuntimeException("Stub!"); } 
/* 18 */   public String getValidNotBefore() { throw new RuntimeException("Stub!"); } 
/* 19 */   public Date getValidNotAfterDate() { throw new RuntimeException("Stub!"); } 
/* 20 */   public String getValidNotAfter() { throw new RuntimeException("Stub!"); } 
/* 21 */   public DName getIssuedTo() { throw new RuntimeException("Stub!"); } 
/* 22 */   public DName getIssuedBy() { throw new RuntimeException("Stub!"); } 
/* 23 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public class DName
/*    */   {
/*    */     public DName(String dName)
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     public String getDName() { throw new RuntimeException("Stub!"); } 
/*  8 */     public String getCName() { throw new RuntimeException("Stub!"); } 
/*  9 */     public String getOName() { throw new RuntimeException("Stub!"); } 
/* 10 */     public String getUName() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.http.SslCertificate
 * JD-Core Version:    0.6.0
 */