/*   */ package java.security.cert;
/*   */ 
/*   */ import java.util.Collection;
/*   */ import java.util.Set;
/*   */ 
/*   */ public abstract class PKIXCertPathChecker
/*   */   implements Cloneable
/*   */ {
/*   */   protected PKIXCertPathChecker()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public Object clone() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void init(boolean paramBoolean)
/*   */     throws CertPathValidatorException;
/*   */ 
/*   */   public abstract boolean isForwardCheckingSupported();
/*   */ 
/*   */   public abstract Set<String> getSupportedExtensions();
/*   */ 
/*   */   public abstract void check(Certificate paramCertificate, Collection<String> paramCollection)
/*   */     throws CertPathValidatorException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.PKIXCertPathChecker
 * JD-Core Version:    0.6.0
 */