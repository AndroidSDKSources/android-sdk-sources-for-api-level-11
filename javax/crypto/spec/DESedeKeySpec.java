/*   */ package javax.crypto.spec;
/*   */ 
/*   */ import java.security.InvalidKeyException;
/*   */ import java.security.spec.KeySpec;
/*   */ 
/*   */ public class DESedeKeySpec
/*   */   implements KeySpec
/*   */ {
/*   */   public static final int DES_EDE_KEY_LEN = 24;
/*   */ 
/*   */   public DESedeKeySpec(byte[] key)
/*   */     throws InvalidKeyException
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public DESedeKeySpec(byte[] key, int offset) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 7 */   public byte[] getKey() { throw new RuntimeException("Stub!"); } 
/* 8 */   public static boolean isParityAdjusted(byte[] key, int offset) throws InvalidKeyException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.spec.DESedeKeySpec
 * JD-Core Version:    0.6.0
 */