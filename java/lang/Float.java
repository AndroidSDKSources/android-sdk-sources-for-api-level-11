/*    */ package java.lang;
/*    */ 
/*    */ public final class Float extends Number
/*    */   implements Comparable<Float>
/*    */ {
/*    */   public static final float MAX_VALUE = 3.4028235E+38F;
/*    */   public static final float MIN_VALUE = 1.4E-45F;
/*    */   public static final float NaN = (0.0F / 0.0F);
/*    */   public static final float POSITIVE_INFINITY = (1.0F / 1.0F);
/*    */   public static final float NEGATIVE_INFINITY = (1.0F / -1.0F);
/*    */   public static final float MIN_NORMAL = 1.175494E-038F;
/*    */   public static final int MAX_EXPONENT = 127;
/*    */   public static final int MIN_EXPONENT = -126;
/* 42 */   public static final Class<Float> TYPE = null;
/*    */   public static final int SIZE = 32;
/*    */ 
/*    */   public Float(float value)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public Float(double value) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Float(String string) throws NumberFormatException { throw new RuntimeException("Stub!"); } 
/*  9 */   public int compareTo(Float object) { throw new RuntimeException("Stub!"); } 
/* 10 */   public byte byteValue() { throw new RuntimeException("Stub!"); } 
/* 11 */   public double doubleValue() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/*    */   public static native int floatToIntBits(float paramFloat);
/*    */ 
/*    */   public static native int floatToRawIntBits(float paramFloat);
/*    */ 
/* 15 */   public float floatValue() { throw new RuntimeException("Stub!"); } 
/* 16 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*    */   public static native float intBitsToFloat(int paramInt);
/*    */ 
/* 18 */   public int intValue() { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean isInfinite() { throw new RuntimeException("Stub!"); } 
/* 20 */   public static boolean isInfinite(float f) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean isNaN() { throw new RuntimeException("Stub!"); } 
/* 22 */   public static boolean isNaN(float f) { throw new RuntimeException("Stub!"); } 
/* 23 */   public long longValue() { throw new RuntimeException("Stub!"); } 
/* 24 */   public static float parseFloat(String string) throws NumberFormatException { throw new RuntimeException("Stub!"); } 
/* 25 */   public short shortValue() { throw new RuntimeException("Stub!"); } 
/* 26 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 27 */   public static String toString(float f) { throw new RuntimeException("Stub!"); } 
/* 28 */   public static Float valueOf(String string) throws NumberFormatException { throw new RuntimeException("Stub!"); } 
/* 29 */   public static int compare(float float1, float float2) { throw new RuntimeException("Stub!"); } 
/* 30 */   public static Float valueOf(float f) { throw new RuntimeException("Stub!"); } 
/* 31 */   public static String toHexString(float f) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.Float
 * JD-Core Version:    0.6.0
 */