/*    */ package java.security.cert;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.math.BigInteger;
/*    */ import java.util.Collection;
/*    */ import java.util.Date;
/*    */ import javax.security.auth.x500.X500Principal;
/*    */ 
/*    */ public class X509CRLSelector
/*    */   implements CRLSelector
/*    */ {
/*    */   public X509CRLSelector()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void setIssuers(Collection<X500Principal> issuers) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setIssuerNames(Collection<?> names) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public void addIssuer(X500Principal issuer) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void addIssuerName(String iss_name) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void addIssuerName(byte[] iss_name) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setMinCRLNumber(BigInteger minCRL) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setMaxCRLNumber(BigInteger maxCRL) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setDateAndTime(Date dateAndTime) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setCertificateChecking(X509Certificate cert) { throw new RuntimeException("Stub!"); } 
/* 15 */   public Collection<X500Principal> getIssuers() { throw new RuntimeException("Stub!"); } 
/* 16 */   public Collection<Object> getIssuerNames() { throw new RuntimeException("Stub!"); } 
/* 17 */   public BigInteger getMinCRL() { throw new RuntimeException("Stub!"); } 
/* 18 */   public BigInteger getMaxCRL() { throw new RuntimeException("Stub!"); } 
/* 19 */   public Date getDateAndTime() { throw new RuntimeException("Stub!"); } 
/* 20 */   public X509Certificate getCertificateChecking() { throw new RuntimeException("Stub!"); } 
/* 21 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean match(CRL crl) { throw new RuntimeException("Stub!"); } 
/* 23 */   public Object clone() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.X509CRLSelector
 * JD-Core Version:    0.6.0
 */