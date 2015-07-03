/*    */ package java.util;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.math.BigDecimal;
/*    */ import java.math.BigInteger;
/*    */ import java.nio.channels.ReadableByteChannel;
/*    */ import java.util.regex.MatchResult;
/*    */ import java.util.regex.Pattern;
/*    */ 
/*    */ public final class Scanner
/*    */   implements Iterator<String>
/*    */ {
/*    */   public Scanner(File src)
/*    */     throws FileNotFoundException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public Scanner(File src, String charsetName) throws FileNotFoundException { throw new RuntimeException("Stub!"); } 
/*  7 */   public Scanner(String src) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Scanner(InputStream src) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Scanner(InputStream src, String charsetName) { throw new RuntimeException("Stub!"); } 
/* 10 */   public Scanner(Readable src) { throw new RuntimeException("Stub!"); } 
/* 11 */   public Scanner(ReadableByteChannel src) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Scanner(ReadableByteChannel src, String charsetName) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 14 */   public Pattern delimiter() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String findInLine(Pattern pattern) { throw new RuntimeException("Stub!"); } 
/* 16 */   public String findInLine(String pattern) { throw new RuntimeException("Stub!"); } 
/* 17 */   public String findWithinHorizon(Pattern pattern, int horizon) { throw new RuntimeException("Stub!"); } 
/* 18 */   public String findWithinHorizon(String pattern, int horizon) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean hasNext() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean hasNext(Pattern pattern) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean hasNext(String pattern) { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean hasNextBigDecimal() { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean hasNextBigInteger() { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean hasNextBigInteger(int radix) { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean hasNextBoolean() { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean hasNextByte() { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean hasNextByte(int radix) { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean hasNextDouble() { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean hasNextFloat() { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean hasNextInt() { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean hasNextInt(int radix) { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean hasNextLine() { throw new RuntimeException("Stub!"); } 
/* 33 */   public boolean hasNextLong() { throw new RuntimeException("Stub!"); } 
/* 34 */   public boolean hasNextLong(int radix) { throw new RuntimeException("Stub!"); } 
/* 35 */   public boolean hasNextShort() { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean hasNextShort(int radix) { throw new RuntimeException("Stub!"); } 
/* 37 */   public IOException ioException() { throw new RuntimeException("Stub!"); } 
/* 38 */   public Locale locale() { throw new RuntimeException("Stub!"); } 
/* 39 */   public MatchResult match() { throw new RuntimeException("Stub!"); } 
/* 40 */   public String next() { throw new RuntimeException("Stub!"); } 
/* 41 */   public String next(Pattern pattern) { throw new RuntimeException("Stub!"); } 
/* 42 */   public String next(String pattern) { throw new RuntimeException("Stub!"); } 
/* 43 */   public BigDecimal nextBigDecimal() { throw new RuntimeException("Stub!"); } 
/* 44 */   public BigInteger nextBigInteger() { throw new RuntimeException("Stub!"); } 
/* 45 */   public BigInteger nextBigInteger(int radix) { throw new RuntimeException("Stub!"); } 
/* 46 */   public boolean nextBoolean() { throw new RuntimeException("Stub!"); } 
/* 47 */   public byte nextByte() { throw new RuntimeException("Stub!"); } 
/* 48 */   public byte nextByte(int radix) { throw new RuntimeException("Stub!"); } 
/* 49 */   public double nextDouble() { throw new RuntimeException("Stub!"); } 
/* 50 */   public float nextFloat() { throw new RuntimeException("Stub!"); } 
/* 51 */   public int nextInt() { throw new RuntimeException("Stub!"); } 
/* 52 */   public int nextInt(int radix) { throw new RuntimeException("Stub!"); } 
/* 53 */   public String nextLine() { throw new RuntimeException("Stub!"); } 
/* 54 */   public long nextLong() { throw new RuntimeException("Stub!"); } 
/* 55 */   public long nextLong(int radix) { throw new RuntimeException("Stub!"); } 
/* 56 */   public short nextShort() { throw new RuntimeException("Stub!"); } 
/* 57 */   public short nextShort(int radix) { throw new RuntimeException("Stub!"); } 
/* 58 */   public int radix() { throw new RuntimeException("Stub!"); } 
/* 59 */   public Scanner skip(Pattern pattern) { throw new RuntimeException("Stub!"); } 
/* 60 */   public Scanner skip(String pattern) { throw new RuntimeException("Stub!"); } 
/* 61 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 62 */   public Scanner useDelimiter(Pattern pattern) { throw new RuntimeException("Stub!"); } 
/* 63 */   public Scanner useDelimiter(String pattern) { throw new RuntimeException("Stub!"); } 
/* 64 */   public Scanner useLocale(Locale l) { throw new RuntimeException("Stub!"); } 
/* 65 */   public Scanner useRadix(int radix) { throw new RuntimeException("Stub!"); } 
/* 66 */   public void remove() { throw new RuntimeException("Stub!"); } 
/* 67 */   public Scanner reset() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.Scanner
 * JD-Core Version:    0.6.0
 */