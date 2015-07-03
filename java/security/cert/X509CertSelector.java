/*    */ package java.security.cert;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.math.BigInteger;
/*    */ import java.security.PublicKey;
/*    */ import java.util.Collection;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import javax.security.auth.x500.X500Principal;
/*    */ 
/*    */ public class X509CertSelector
/*    */   implements CertSelector
/*    */ {
/*    */   public X509CertSelector()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void setCertificate(X509Certificate certificate) { throw new RuntimeException("Stub!"); } 
/*  7 */   public X509Certificate getCertificate() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setSerialNumber(BigInteger serialNumber) { throw new RuntimeException("Stub!"); } 
/*  9 */   public BigInteger getSerialNumber() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setIssuer(X500Principal issuer) { throw new RuntimeException("Stub!"); } 
/* 11 */   public X500Principal getIssuer() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setIssuer(String issuerName) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public String getIssuerAsString() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setIssuer(byte[] issuerDN) throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public byte[] getIssuerAsBytes() throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setSubject(X500Principal subject) { throw new RuntimeException("Stub!"); } 
/* 17 */   public X500Principal getSubject() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setSubject(String subjectDN) throws IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public String getSubjectAsString() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setSubject(byte[] subjectDN) throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public byte[] getSubjectAsBytes() throws IOException { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setSubjectKeyIdentifier(byte[] subjectKeyIdentifier) { throw new RuntimeException("Stub!"); } 
/* 23 */   public byte[] getSubjectKeyIdentifier() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setAuthorityKeyIdentifier(byte[] authorityKeyIdentifier) { throw new RuntimeException("Stub!"); } 
/* 25 */   public byte[] getAuthorityKeyIdentifier() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setCertificateValid(Date certificateValid) { throw new RuntimeException("Stub!"); } 
/* 27 */   public Date getCertificateValid() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setPrivateKeyValid(Date privateKeyValid) { throw new RuntimeException("Stub!"); } 
/* 29 */   public Date getPrivateKeyValid() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setSubjectPublicKeyAlgID(String oid) throws IOException { throw new RuntimeException("Stub!"); } 
/* 31 */   public String getSubjectPublicKeyAlgID() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setSubjectPublicKey(PublicKey key) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setSubjectPublicKey(byte[] key) throws IOException { throw new RuntimeException("Stub!"); } 
/* 34 */   public PublicKey getSubjectPublicKey() { throw new RuntimeException("Stub!"); } 
/* 35 */   public void setKeyUsage(boolean[] keyUsage) { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean[] getKeyUsage() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void setExtendedKeyUsage(Set<String> keyUsage) throws IOException { throw new RuntimeException("Stub!"); } 
/* 38 */   public Set<String> getExtendedKeyUsage() { throw new RuntimeException("Stub!"); } 
/* 39 */   public void setMatchAllSubjectAltNames(boolean matchAllNames) { throw new RuntimeException("Stub!"); } 
/* 40 */   public boolean getMatchAllSubjectAltNames() { throw new RuntimeException("Stub!"); } 
/* 41 */   public void setSubjectAlternativeNames(Collection<List<?>> names) throws IOException { throw new RuntimeException("Stub!"); } 
/* 42 */   public void addSubjectAlternativeName(int tag, String name) throws IOException { throw new RuntimeException("Stub!"); } 
/* 43 */   public void addSubjectAlternativeName(int tag, byte[] name) throws IOException { throw new RuntimeException("Stub!"); } 
/* 44 */   public Collection<List<?>> getSubjectAlternativeNames() { throw new RuntimeException("Stub!"); } 
/* 45 */   public void setNameConstraints(byte[] bytes) throws IOException { throw new RuntimeException("Stub!"); } 
/* 46 */   public byte[] getNameConstraints() { throw new RuntimeException("Stub!"); } 
/* 47 */   public void setBasicConstraints(int pathLen) { throw new RuntimeException("Stub!"); } 
/* 48 */   public int getBasicConstraints() { throw new RuntimeException("Stub!"); } 
/* 49 */   public void setPolicy(Set<String> policies) throws IOException { throw new RuntimeException("Stub!"); } 
/* 50 */   public Set<String> getPolicy() { throw new RuntimeException("Stub!"); } 
/* 51 */   public void setPathToNames(Collection<List<?>> names) throws IOException { throw new RuntimeException("Stub!"); } 
/* 52 */   public void addPathToName(int type, String name) throws IOException { throw new RuntimeException("Stub!"); } 
/* 53 */   public void addPathToName(int type, byte[] name) throws IOException { throw new RuntimeException("Stub!"); } 
/* 54 */   public Collection<List<?>> getPathToNames() { throw new RuntimeException("Stub!"); } 
/* 55 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 56 */   public boolean match(Certificate certificate) { throw new RuntimeException("Stub!"); } 
/* 57 */   public Object clone() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.X509CertSelector
 * JD-Core Version:    0.6.0
 */