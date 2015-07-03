/*    */ package java.math;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Random;
/*    */ 
/*    */ public class BigInteger extends Number
/*    */   implements Comparable<BigInteger>, Serializable
/*    */ {
/* 59 */   public static final BigInteger ZERO = null; public static final BigInteger ONE = null; public static final BigInteger TEN = null;
/*    */ 
/*    */   public BigInteger(int numBits, Random random)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public BigInteger(int bitLength, int certainty, Random unused) { throw new RuntimeException("Stub!"); } 
/*  8 */   public BigInteger(String value) { throw new RuntimeException("Stub!"); } 
/*  9 */   public BigInteger(String value, int radix) { throw new RuntimeException("Stub!"); } 
/* 10 */   public BigInteger(int signum, byte[] magnitude) { throw new RuntimeException("Stub!"); } 
/* 11 */   public BigInteger(byte[] value) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static BigInteger valueOf(long value) { throw new RuntimeException("Stub!"); } 
/* 13 */   public byte[] toByteArray() { throw new RuntimeException("Stub!"); } 
/* 14 */   public BigInteger abs() { throw new RuntimeException("Stub!"); } 
/* 15 */   public BigInteger negate() { throw new RuntimeException("Stub!"); } 
/* 16 */   public BigInteger add(BigInteger value) { throw new RuntimeException("Stub!"); } 
/* 17 */   public BigInteger subtract(BigInteger value) { throw new RuntimeException("Stub!"); } 
/* 18 */   public int signum() { throw new RuntimeException("Stub!"); } 
/* 19 */   public BigInteger shiftRight(int n) { throw new RuntimeException("Stub!"); } 
/* 20 */   public BigInteger shiftLeft(int n) { throw new RuntimeException("Stub!"); } 
/* 21 */   public int bitLength() { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean testBit(int n) { throw new RuntimeException("Stub!"); } 
/* 23 */   public BigInteger setBit(int n) { throw new RuntimeException("Stub!"); } 
/* 24 */   public BigInteger clearBit(int n) { throw new RuntimeException("Stub!"); } 
/* 25 */   public BigInteger flipBit(int n) { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getLowestSetBit() { throw new RuntimeException("Stub!"); } 
/* 27 */   public int bitCount() { throw new RuntimeException("Stub!"); } 
/* 28 */   public BigInteger not() { throw new RuntimeException("Stub!"); } 
/* 29 */   public BigInteger and(BigInteger value) { throw new RuntimeException("Stub!"); } 
/* 30 */   public BigInteger or(BigInteger value) { throw new RuntimeException("Stub!"); } 
/* 31 */   public BigInteger xor(BigInteger value) { throw new RuntimeException("Stub!"); } 
/* 32 */   public BigInteger andNot(BigInteger value) { throw new RuntimeException("Stub!"); } 
/* 33 */   public int intValue() { throw new RuntimeException("Stub!"); } 
/* 34 */   public long longValue() { throw new RuntimeException("Stub!"); } 
/* 35 */   public float floatValue() { throw new RuntimeException("Stub!"); } 
/* 36 */   public double doubleValue() { throw new RuntimeException("Stub!"); } 
/* 37 */   public int compareTo(BigInteger value) { throw new RuntimeException("Stub!"); } 
/* 38 */   public BigInteger min(BigInteger value) { throw new RuntimeException("Stub!"); } 
/* 39 */   public BigInteger max(BigInteger value) { throw new RuntimeException("Stub!"); } 
/* 40 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 41 */   public boolean equals(Object x) { throw new RuntimeException("Stub!"); } 
/* 42 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 43 */   public String toString(int radix) { throw new RuntimeException("Stub!"); } 
/* 44 */   public BigInteger gcd(BigInteger value) { throw new RuntimeException("Stub!"); } 
/* 45 */   public BigInteger multiply(BigInteger value) { throw new RuntimeException("Stub!"); } 
/* 46 */   public BigInteger pow(int exp) { throw new RuntimeException("Stub!"); } 
/* 47 */   public BigInteger[] divideAndRemainder(BigInteger divisor) { throw new RuntimeException("Stub!"); } 
/* 48 */   public BigInteger divide(BigInteger divisor) { throw new RuntimeException("Stub!"); } 
/* 49 */   public BigInteger remainder(BigInteger divisor) { throw new RuntimeException("Stub!"); } 
/* 50 */   public BigInteger modInverse(BigInteger m) { throw new RuntimeException("Stub!"); } 
/* 51 */   public BigInteger modPow(BigInteger exponent, BigInteger m) { throw new RuntimeException("Stub!"); } 
/* 52 */   public BigInteger mod(BigInteger m) { throw new RuntimeException("Stub!"); } 
/* 53 */   public boolean isProbablePrime(int certainty) { throw new RuntimeException("Stub!"); } 
/* 54 */   public BigInteger nextProbablePrime() { throw new RuntimeException("Stub!"); } 
/* 55 */   public static BigInteger probablePrime(int bitLength, Random unused) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.math.BigInteger
 * JD-Core Version:    0.6.0
 */