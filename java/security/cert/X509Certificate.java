/*    */ package java.security.cert;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import java.security.Principal;
/*    */ import java.util.Collection;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import javax.security.auth.x500.X500Principal;
/*    */ 
/*    */ public abstract class X509Certificate extends Certificate
/*    */   implements X509Extension
/*    */ {
/*    */   protected X509Certificate()
/*    */   {
/*  6 */     super((String)null); throw new RuntimeException("Stub!"); } 
/*    */   public abstract void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException;
/*    */ 
/*    */   public abstract void checkValidity(Date paramDate) throws CertificateExpiredException, CertificateNotYetValidException;
/*    */ 
/*    */   public abstract int getVersion();
/*    */ 
/*    */   public abstract BigInteger getSerialNumber();
/*    */ 
/*    */   public abstract Principal getIssuerDN();
/*    */ 
/* 12 */   public X500Principal getIssuerX500Principal() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Principal getSubjectDN();
/*    */ 
/* 14 */   public X500Principal getSubjectX500Principal() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Date getNotBefore();
/*    */ 
/*    */   public abstract Date getNotAfter();
/*    */ 
/*    */   public abstract byte[] getTBSCertificate() throws CertificateEncodingException;
/*    */ 
/*    */   public abstract byte[] getSignature();
/*    */ 
/*    */   public abstract String getSigAlgName();
/*    */ 
/*    */   public abstract String getSigAlgOID();
/*    */ 
/*    */   public abstract byte[] getSigAlgParams();
/*    */ 
/*    */   public abstract boolean[] getIssuerUniqueID();
/*    */ 
/*    */   public abstract boolean[] getSubjectUniqueID();
/*    */ 
/*    */   public abstract boolean[] getKeyUsage();
/*    */ 
/* 25 */   public List<String> getExtendedKeyUsage() throws CertificateParsingException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int getBasicConstraints();
/*    */ 
/* 27 */   public Collection<List<?>> getSubjectAlternativeNames() throws CertificateParsingException { throw new RuntimeException("Stub!"); } 
/* 28 */   public Collection<List<?>> getIssuerAlternativeNames() throws CertificateParsingException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.X509Certificate
 * JD-Core Version:    0.6.0
 */