/*    */ package java.math;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class BigDecimal extends Number
/*    */   implements Comparable<BigDecimal>, Serializable
/*    */ {
/* 93 */   public static final BigDecimal ZERO = null; public static final BigDecimal ONE = null; public static final BigDecimal TEN = null;
/*    */   public static final int ROUND_UP = 0;
/*    */   public static final int ROUND_DOWN = 1;
/*    */   public static final int ROUND_CEILING = 2;
/*    */   public static final int ROUND_FLOOR = 3;
/*    */   public static final int ROUND_HALF_UP = 4;
/*    */   public static final int ROUND_HALF_DOWN = 5;
/*    */   public static final int ROUND_HALF_EVEN = 6;
/*    */   public static final int ROUND_UNNECESSARY = 7;
/*    */ 
/*    */   public BigDecimal(char[] in, int offset, int len)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public BigDecimal(char[] in, int offset, int len, MathContext mc) { throw new RuntimeException("Stub!"); } 
/*  8 */   public BigDecimal(char[] in) { throw new RuntimeException("Stub!"); } 
/*  9 */   public BigDecimal(char[] in, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 10 */   public BigDecimal(String val) { throw new RuntimeException("Stub!"); } 
/* 11 */   public BigDecimal(String val, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 12 */   public BigDecimal(double val) { throw new RuntimeException("Stub!"); } 
/* 13 */   public BigDecimal(double val, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 14 */   public BigDecimal(BigInteger val) { throw new RuntimeException("Stub!"); } 
/* 15 */   public BigDecimal(BigInteger val, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 16 */   public BigDecimal(BigInteger unscaledVal, int scale) { throw new RuntimeException("Stub!"); } 
/* 17 */   public BigDecimal(BigInteger unscaledVal, int scale, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 18 */   public BigDecimal(int val) { throw new RuntimeException("Stub!"); } 
/* 19 */   public BigDecimal(int val, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 20 */   public BigDecimal(long val) { throw new RuntimeException("Stub!"); } 
/* 21 */   public BigDecimal(long val, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 22 */   public static BigDecimal valueOf(long unscaledVal, int scale) { throw new RuntimeException("Stub!"); } 
/* 23 */   public static BigDecimal valueOf(long unscaledVal) { throw new RuntimeException("Stub!"); } 
/* 24 */   public static BigDecimal valueOf(double val) { throw new RuntimeException("Stub!"); } 
/* 25 */   public BigDecimal add(BigDecimal augend) { throw new RuntimeException("Stub!"); } 
/* 26 */   public BigDecimal add(BigDecimal augend, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 27 */   public BigDecimal subtract(BigDecimal subtrahend) { throw new RuntimeException("Stub!"); } 
/* 28 */   public BigDecimal subtract(BigDecimal subtrahend, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 29 */   public BigDecimal multiply(BigDecimal multiplicand) { throw new RuntimeException("Stub!"); } 
/* 30 */   public BigDecimal multiply(BigDecimal multiplicand, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 31 */   public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode) { throw new RuntimeException("Stub!"); } 
/* 32 */   public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode) { throw new RuntimeException("Stub!"); } 
/* 33 */   public BigDecimal divide(BigDecimal divisor, int roundingMode) { throw new RuntimeException("Stub!"); } 
/* 34 */   public BigDecimal divide(BigDecimal divisor, RoundingMode roundingMode) { throw new RuntimeException("Stub!"); } 
/* 35 */   public BigDecimal divide(BigDecimal divisor) { throw new RuntimeException("Stub!"); } 
/* 36 */   public BigDecimal divide(BigDecimal divisor, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 37 */   public BigDecimal divideToIntegralValue(BigDecimal divisor) { throw new RuntimeException("Stub!"); } 
/* 38 */   public BigDecimal divideToIntegralValue(BigDecimal divisor, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 39 */   public BigDecimal remainder(BigDecimal divisor) { throw new RuntimeException("Stub!"); } 
/* 40 */   public BigDecimal remainder(BigDecimal divisor, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 41 */   public BigDecimal[] divideAndRemainder(BigDecimal divisor) { throw new RuntimeException("Stub!"); } 
/* 42 */   public BigDecimal[] divideAndRemainder(BigDecimal divisor, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 43 */   public BigDecimal pow(int n) { throw new RuntimeException("Stub!"); } 
/* 44 */   public BigDecimal pow(int n, MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 45 */   public BigDecimal abs() { throw new RuntimeException("Stub!"); } 
/* 46 */   public BigDecimal abs(MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 47 */   public BigDecimal negate() { throw new RuntimeException("Stub!"); } 
/* 48 */   public BigDecimal negate(MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 49 */   public BigDecimal plus() { throw new RuntimeException("Stub!"); } 
/* 50 */   public BigDecimal plus(MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 51 */   public int signum() { throw new RuntimeException("Stub!"); } 
/* 52 */   public int scale() { throw new RuntimeException("Stub!"); } 
/* 53 */   public int precision() { throw new RuntimeException("Stub!"); } 
/* 54 */   public BigInteger unscaledValue() { throw new RuntimeException("Stub!"); } 
/* 55 */   public BigDecimal round(MathContext mc) { throw new RuntimeException("Stub!"); } 
/* 56 */   public BigDecimal setScale(int newScale, RoundingMode roundingMode) { throw new RuntimeException("Stub!"); } 
/* 57 */   public BigDecimal setScale(int newScale, int roundingMode) { throw new RuntimeException("Stub!"); } 
/* 58 */   public BigDecimal setScale(int newScale) { throw new RuntimeException("Stub!"); } 
/* 59 */   public BigDecimal movePointLeft(int n) { throw new RuntimeException("Stub!"); } 
/* 60 */   public BigDecimal movePointRight(int n) { throw new RuntimeException("Stub!"); } 
/* 61 */   public BigDecimal scaleByPowerOfTen(int n) { throw new RuntimeException("Stub!"); } 
/* 62 */   public BigDecimal stripTrailingZeros() { throw new RuntimeException("Stub!"); } 
/* 63 */   public int compareTo(BigDecimal val) { throw new RuntimeException("Stub!"); } 
/* 64 */   public boolean equals(Object x) { throw new RuntimeException("Stub!"); } 
/* 65 */   public BigDecimal min(BigDecimal val) { throw new RuntimeException("Stub!"); } 
/* 66 */   public BigDecimal max(BigDecimal val) { throw new RuntimeException("Stub!"); } 
/* 67 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 68 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 69 */   public String toEngineeringString() { throw new RuntimeException("Stub!"); } 
/* 70 */   public String toPlainString() { throw new RuntimeException("Stub!"); } 
/* 71 */   public BigInteger toBigInteger() { throw new RuntimeException("Stub!"); } 
/* 72 */   public BigInteger toBigIntegerExact() { throw new RuntimeException("Stub!"); } 
/* 73 */   public long longValue() { throw new RuntimeException("Stub!"); } 
/* 74 */   public long longValueExact() { throw new RuntimeException("Stub!"); } 
/* 75 */   public int intValue() { throw new RuntimeException("Stub!"); } 
/* 76 */   public int intValueExact() { throw new RuntimeException("Stub!"); } 
/* 77 */   public short shortValueExact() { throw new RuntimeException("Stub!"); } 
/* 78 */   public byte byteValueExact() { throw new RuntimeException("Stub!"); } 
/* 79 */   public float floatValue() { throw new RuntimeException("Stub!"); } 
/* 80 */   public double doubleValue() { throw new RuntimeException("Stub!"); } 
/* 81 */   public BigDecimal ulp() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.math.BigDecimal
 * JD-Core Version:    0.6.0
 */