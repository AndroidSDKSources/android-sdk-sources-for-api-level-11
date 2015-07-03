/*   */ package java.security.cert;
/*   */ 
/*   */ public abstract class CRL
/*   */ {
/*   */   protected CRL(String type)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public final String getType() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract boolean isRevoked(Certificate paramCertificate);
/*   */ 
/*   */   public abstract String toString();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.CRL
 * JD-Core Version:    0.6.0
 */