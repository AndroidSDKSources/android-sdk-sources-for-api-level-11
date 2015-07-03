/*    */ package java.lang;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import java.nio.charset.Charset;
/*    */ import java.util.Comparator;
/*    */ import java.util.Locale;
/*    */ 
/*    */ public final class String
/*    */   implements Serializable, Comparable<String>, CharSequence
/*    */ {
/* 86 */   public static final Comparator<String> CASE_INSENSITIVE_ORDER = null;
/*    */ 
/*    */   public String()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String(byte[] data) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String(byte[] data, int high) { throw new RuntimeException("Stub!"); } 
/*  8 */   public String(byte[] data, int offset, int byteCount) { throw new RuntimeException("Stub!"); } 
/*  9 */   public String(byte[] data, int high, int offset, int byteCount) { throw new RuntimeException("Stub!"); } 
/* 10 */   public String(byte[] data, int offset, int byteCount, String charsetName) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 11 */   public String(byte[] data, String charsetName) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 12 */   public String(byte[] data, int offset, int byteCount, Charset charset) { throw new RuntimeException("Stub!"); } 
/* 13 */   public String(byte[] data, Charset charset) { throw new RuntimeException("Stub!"); } 
/* 14 */   public String(char[] data) { throw new RuntimeException("Stub!"); } 
/* 15 */   public String(char[] data, int offset, int charCount) { throw new RuntimeException("Stub!"); } 
/* 16 */   public String(String toCopy) { throw new RuntimeException("Stub!"); } 
/* 17 */   public String(StringBuffer stringBuffer) { throw new RuntimeException("Stub!"); } 
/* 18 */   public String(int[] codePoints, int offset, int count) { throw new RuntimeException("Stub!"); } 
/* 19 */   public String(StringBuilder stringBuilder) { throw new RuntimeException("Stub!"); } 
/* 20 */   public char charAt(int index) { throw new RuntimeException("Stub!"); } 
/* 21 */   public int compareTo(String string) { throw new RuntimeException("Stub!"); } 
/* 22 */   public int compareToIgnoreCase(String string) { throw new RuntimeException("Stub!"); } 
/* 23 */   public String concat(String string) { throw new RuntimeException("Stub!"); } 
/* 24 */   public static String copyValueOf(char[] data) { throw new RuntimeException("Stub!"); } 
/* 25 */   public static String copyValueOf(char[] data, int start, int length) { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean endsWith(String suffix) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean equalsIgnoreCase(String string) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void getBytes(int start, int end, byte[] data, int index) { throw new RuntimeException("Stub!"); } 
/* 30 */   public byte[] getBytes() { throw new RuntimeException("Stub!"); } 
/* 31 */   public byte[] getBytes(String charsetName) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); } 
/* 32 */   public byte[] getBytes(Charset charset) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void getChars(int start, int end, char[] buffer, int index) { throw new RuntimeException("Stub!"); } 
/* 34 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 35 */   public int indexOf(int c) { throw new RuntimeException("Stub!"); } 
/* 36 */   public int indexOf(int c, int start) { throw new RuntimeException("Stub!"); } 
/* 37 */   public int indexOf(String string) { throw new RuntimeException("Stub!"); } 
/* 38 */   public int indexOf(String subString, int start) { throw new RuntimeException("Stub!"); } 
/*    */   public native String intern();
/*    */ 
/* 40 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 41 */   public int lastIndexOf(int c) { throw new RuntimeException("Stub!"); } 
/* 42 */   public int lastIndexOf(int c, int start) { throw new RuntimeException("Stub!"); } 
/* 43 */   public int lastIndexOf(String string) { throw new RuntimeException("Stub!"); } 
/* 44 */   public int lastIndexOf(String subString, int start) { throw new RuntimeException("Stub!"); } 
/* 45 */   public int length() { throw new RuntimeException("Stub!"); } 
/* 46 */   public boolean regionMatches(int thisStart, String string, int start, int length) { throw new RuntimeException("Stub!"); } 
/* 47 */   public boolean regionMatches(boolean ignoreCase, int thisStart, String string, int start, int length) { throw new RuntimeException("Stub!"); } 
/* 48 */   public String replace(char oldChar, char newChar) { throw new RuntimeException("Stub!"); } 
/* 49 */   public String replace(CharSequence target, CharSequence replacement) { throw new RuntimeException("Stub!"); } 
/* 50 */   public boolean startsWith(String prefix) { throw new RuntimeException("Stub!"); } 
/* 51 */   public boolean startsWith(String prefix, int start) { throw new RuntimeException("Stub!"); } 
/* 52 */   public String substring(int start) { throw new RuntimeException("Stub!"); } 
/* 53 */   public String substring(int start, int end) { throw new RuntimeException("Stub!"); } 
/* 54 */   public char[] toCharArray() { throw new RuntimeException("Stub!"); } 
/* 55 */   public String toLowerCase() { throw new RuntimeException("Stub!"); } 
/* 56 */   public String toLowerCase(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 57 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 58 */   public String toUpperCase() { throw new RuntimeException("Stub!"); } 
/* 59 */   public String toUpperCase(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 60 */   public String trim() { throw new RuntimeException("Stub!"); } 
/* 61 */   public static String valueOf(char[] data) { throw new RuntimeException("Stub!"); } 
/* 62 */   public static String valueOf(char[] data, int start, int length) { throw new RuntimeException("Stub!"); } 
/* 63 */   public static String valueOf(char value) { throw new RuntimeException("Stub!"); } 
/* 64 */   public static String valueOf(double value) { throw new RuntimeException("Stub!"); } 
/* 65 */   public static String valueOf(float value) { throw new RuntimeException("Stub!"); } 
/* 66 */   public static String valueOf(int value) { throw new RuntimeException("Stub!"); } 
/* 67 */   public static String valueOf(long value) { throw new RuntimeException("Stub!"); } 
/* 68 */   public static String valueOf(Object value) { throw new RuntimeException("Stub!"); } 
/* 69 */   public static String valueOf(boolean value) { throw new RuntimeException("Stub!"); } 
/* 70 */   public boolean contentEquals(StringBuffer strbuf) { throw new RuntimeException("Stub!"); } 
/* 71 */   public boolean contentEquals(CharSequence cs) { throw new RuntimeException("Stub!"); } 
/* 72 */   public boolean matches(String regularExpression) { throw new RuntimeException("Stub!"); } 
/* 73 */   public String replaceAll(String regularExpression, String replacement) { throw new RuntimeException("Stub!"); } 
/* 74 */   public String replaceFirst(String regularExpression, String replacement) { throw new RuntimeException("Stub!"); } 
/* 75 */   public String[] split(String regularExpression) { throw new RuntimeException("Stub!"); } 
/* 76 */   public String[] split(String regularExpression, int limit) { throw new RuntimeException("Stub!"); } 
/* 77 */   public CharSequence subSequence(int start, int end) { throw new RuntimeException("Stub!"); } 
/* 78 */   public int codePointAt(int index) { throw new RuntimeException("Stub!"); } 
/* 79 */   public int codePointBefore(int index) { throw new RuntimeException("Stub!"); } 
/* 80 */   public int codePointCount(int start, int end) { throw new RuntimeException("Stub!"); } 
/* 81 */   public boolean contains(CharSequence cs) { throw new RuntimeException("Stub!"); } 
/* 82 */   public int offsetByCodePoints(int index, int codePointOffset) { throw new RuntimeException("Stub!"); } 
/* 83 */   public static String format(String format, Object[] args) { throw new RuntimeException("Stub!"); } 
/* 84 */   public static String format(Locale locale, String format, Object[] args) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.String
 * JD-Core Version:    0.6.0
 */