/*   */ package java.security.spec;
/*   */ 
/*   */ import java.math.BigInteger;
/*   */ import java.security.interfaces.DSAParams;
/*   */ 
/*   */ public class DSAParameterSpec
/*   */   implements AlgorithmParameterSpec, DSAParams
/*   */ {
/*   */   public DSAParameterSpec(BigInteger p, BigInteger q, BigInteger g)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public BigInteger getG() { throw new RuntimeException("Stub!"); } 
/* 7 */   public BigInteger getP() { throw new RuntimeException("Stub!"); } 
/* 8 */   public BigInteger getQ() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.spec.DSAParameterSpec
 * JD-Core Version:    0.6.0
 */