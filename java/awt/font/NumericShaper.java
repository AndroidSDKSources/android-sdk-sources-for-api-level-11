/*    */ package java.awt.font;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public final class NumericShaper
/*    */   implements Serializable
/*    */ {
/*    */   public static final int EUROPEAN = 1;
/*    */   public static final int ARABIC = 2;
/*    */   public static final int EASTERN_ARABIC = 4;
/*    */   public static final int DEVANAGARI = 8;
/*    */   public static final int BENGALI = 16;
/*    */   public static final int GURMUKHI = 32;
/*    */   public static final int GUJARATI = 64;
/*    */   public static final int ORIYA = 128;
/*    */   public static final int TAMIL = 256;
/*    */   public static final int TELUGU = 512;
/*    */   public static final int KANNADA = 1024;
/*    */   public static final int MALAYALAM = 2048;
/*    */   public static final int THAI = 4096;
/*    */   public static final int LAO = 8192;
/*    */   public static final int TIBETAN = 16384;
/*    */   public static final int MYANMAR = 32768;
/*    */   public static final int ETHIOPIC = 65536;
/*    */   public static final int KHMER = 131072;
/*    */   public static final int MONGOLIAN = 262144;
/*    */   public static final int ALL_RANGES = 524287;
/*    */ 
/*    */   NumericShaper()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/*  8 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  9 */   public static NumericShaper getContextualShaper(int ranges, int defaultContext) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static NumericShaper getContextualShaper(int ranges) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getRanges() { throw new RuntimeException("Stub!"); } 
/* 12 */   public static NumericShaper getShaper(int singleRange) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isContextual() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void shape(char[] text, int start, int count, int context) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void shape(char[] text, int start, int count) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.awt.font.NumericShaper
 * JD-Core Version:    0.6.0
 */