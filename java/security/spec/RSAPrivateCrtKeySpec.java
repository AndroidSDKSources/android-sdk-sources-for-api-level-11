/*    */ package java.security.spec;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ 
/*    */ public class RSAPrivateCrtKeySpec extends RSAPrivateKeySpec
/*    */ {
/*    */   public RSAPrivateCrtKeySpec(BigInteger modulus, BigInteger publicExponent, BigInteger privateExponent, BigInteger primeP, BigInteger primeQ, BigInteger primeExponentP, BigInteger primeExponentQ, BigInteger crtCoefficient)
/*    */   {
/*  5 */     super((BigInteger)null, (BigInteger)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public BigInteger getCrtCoefficient() { throw new RuntimeException("Stub!"); } 
/*  7 */   public BigInteger getPrimeExponentP() { throw new RuntimeException("Stub!"); } 
/*  8 */   public BigInteger getPrimeExponentQ() { throw new RuntimeException("Stub!"); } 
/*  9 */   public BigInteger getPrimeP() { throw new RuntimeException("Stub!"); } 
/* 10 */   public BigInteger getPrimeQ() { throw new RuntimeException("Stub!"); } 
/* 11 */   public BigInteger getPublicExponent() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.spec.RSAPrivateCrtKeySpec
 * JD-Core Version:    0.6.0
 */