/*   */ package javax.security.auth;
/*   */ 
/*   */ import java.security.DomainCombiner;
/*   */ import java.security.ProtectionDomain;
/*   */ 
/*   */ public class SubjectDomainCombiner
/*   */   implements DomainCombiner
/*   */ {
/*   */   public SubjectDomainCombiner(Subject subject)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public Subject getSubject() { throw new RuntimeException("Stub!"); } 
/* 7 */   public ProtectionDomain[] combine(ProtectionDomain[] currentDomains, ProtectionDomain[] assignedDomains) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.security.auth.SubjectDomainCombiner
 * JD-Core Version:    0.6.0
 */