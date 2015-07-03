/*   */ package java.security.spec;
/*   */ 
/*   */ import java.math.BigInteger;
/*   */ 
/*   */ public class ECParameterSpec
/*   */   implements AlgorithmParameterSpec
/*   */ {
/*   */   public ECParameterSpec(EllipticCurve curve, ECPoint generator, BigInteger order, int cofactor)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public int getCofactor() { throw new RuntimeException("Stub!"); } 
/* 7 */   public EllipticCurve getCurve() { throw new RuntimeException("Stub!"); } 
/* 8 */   public ECPoint getGenerator() { throw new RuntimeException("Stub!"); } 
/* 9 */   public BigInteger getOrder() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.spec.ECParameterSpec
 * JD-Core Version:    0.6.0
 */