/*    */ package java.security.spec;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ 
/*    */ public class RSAKeyGenParameterSpec
/*    */   implements AlgorithmParameterSpec
/*    */ {
/* 10 */   public static final BigInteger F0 = null; public static final BigInteger F4 = null;
/*    */ 
/*    */   public RSAKeyGenParameterSpec(int keysize, BigInteger publicExponent)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int getKeysize() { throw new RuntimeException("Stub!"); } 
/*  7 */   public BigInteger getPublicExponent() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.spec.RSAKeyGenParameterSpec
 * JD-Core Version:    0.6.0
 */