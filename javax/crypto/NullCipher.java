/*   */ package javax.crypto;
/*   */ 
/*   */ import java.security.Provider;
/*   */ 
/*   */ public class NullCipher extends Cipher
/*   */ {
/*   */   public NullCipher()
/*   */   {
/* 5 */     super((CipherSpi)null, (Provider)null, (String)null); throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.NullCipher
 * JD-Core Version:    0.6.0
 */