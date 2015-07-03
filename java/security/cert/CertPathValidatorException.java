/*    */ package java.security.cert;
/*    */ 
/*    */ import java.security.GeneralSecurityException;
/*    */ 
/*    */ public class CertPathValidatorException extends GeneralSecurityException
/*    */ {
/*    */   public CertPathValidatorException(String msg, Throwable cause, CertPath certPath, int index)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public CertPathValidatorException(String msg, Throwable cause) { throw new RuntimeException("Stub!"); } 
/*  7 */   public CertPathValidatorException(Throwable cause) { throw new RuntimeException("Stub!"); } 
/*  8 */   public CertPathValidatorException(String msg) { throw new RuntimeException("Stub!"); } 
/*  9 */   public CertPathValidatorException() { throw new RuntimeException("Stub!"); } 
/* 10 */   public CertPath getCertPath() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getIndex() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.CertPathValidatorException
 * JD-Core Version:    0.6.0
 */