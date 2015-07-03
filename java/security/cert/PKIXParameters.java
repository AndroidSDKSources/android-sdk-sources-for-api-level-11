/*    */ package java.security.cert;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.KeyStore;
/*    */ import java.security.KeyStoreException;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class PKIXParameters
/*    */   implements CertPathParameters
/*    */ {
/*    */   public PKIXParameters(Set<TrustAnchor> trustAnchors)
/*    */     throws InvalidAlgorithmParameterException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public PKIXParameters(KeyStore keyStore) throws KeyStoreException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/*  7 */   public Set<TrustAnchor> getTrustAnchors() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setTrustAnchors(Set<TrustAnchor> trustAnchors) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isAnyPolicyInhibited() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setAnyPolicyInhibited(boolean anyPolicyInhibited) { throw new RuntimeException("Stub!"); } 
/* 11 */   public List<PKIXCertPathChecker> getCertPathCheckers() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setCertPathCheckers(List<PKIXCertPathChecker> certPathCheckers) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void addCertPathChecker(PKIXCertPathChecker checker) { throw new RuntimeException("Stub!"); } 
/* 14 */   public List<CertStore> getCertStores() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setCertStores(List<CertStore> certStores) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void addCertStore(CertStore store) { throw new RuntimeException("Stub!"); } 
/* 17 */   public Date getDate() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setDate(Date date) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean isExplicitPolicyRequired() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setExplicitPolicyRequired(boolean explicitPolicyRequired) { throw new RuntimeException("Stub!"); } 
/* 21 */   public Set<String> getInitialPolicies() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setInitialPolicies(Set<String> initialPolicies) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean isPolicyMappingInhibited() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setPolicyMappingInhibited(boolean policyMappingInhibited) { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean getPolicyQualifiersRejected() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void setPolicyQualifiersRejected(boolean policyQualifiersRejected) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean isRevocationEnabled() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setRevocationEnabled(boolean revocationEnabled) { throw new RuntimeException("Stub!"); } 
/* 29 */   public String getSigProvider() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setSigProvider(String sigProvider) { throw new RuntimeException("Stub!"); } 
/* 31 */   public CertSelector getTargetCertConstraints() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setTargetCertConstraints(CertSelector targetCertConstraints) { throw new RuntimeException("Stub!"); } 
/* 33 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/* 34 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.PKIXParameters
 * JD-Core Version:    0.6.0
 */