/*   */ package javax.crypto.spec;
/*   */ 
/*   */ import java.math.BigInteger;
/*   */ import java.security.spec.AlgorithmParameterSpec;
/*   */ 
/*   */ public class DHParameterSpec
/*   */   implements AlgorithmParameterSpec
/*   */ {
/*   */   public DHParameterSpec(BigInteger p, BigInteger g)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public DHParameterSpec(BigInteger p, BigInteger g, int l) { throw new RuntimeException("Stub!"); } 
/* 7 */   public BigInteger getP() { throw new RuntimeException("Stub!"); } 
/* 8 */   public BigInteger getG() { throw new RuntimeException("Stub!"); } 
/* 9 */   public int getL() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.spec.DHParameterSpec
 * JD-Core Version:    0.6.0
 */