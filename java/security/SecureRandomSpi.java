/*   */ package java.security;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ 
/*   */ public abstract class SecureRandomSpi
/*   */   implements Serializable
/*   */ {
/*   */   public SecureRandomSpi()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract void engineSetSeed(byte[] paramArrayOfByte);
/*   */ 
/*   */   protected abstract void engineNextBytes(byte[] paramArrayOfByte);
/*   */ 
/*   */   protected abstract byte[] engineGenerateSeed(int paramInt);
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.SecureRandomSpi
 * JD-Core Version:    0.6.0
 */