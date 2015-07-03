/*   */ package java.security.spec;
/*   */ 
/*   */ public abstract class EncodedKeySpec
/*   */   implements KeySpec
/*   */ {
/*   */   public EncodedKeySpec(byte[] encodedKey)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public byte[] getEncoded() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract String getFormat();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.spec.EncodedKeySpec
 * JD-Core Version:    0.6.0
 */