/*    */ package java.lang;
/*    */ 
/*    */ public final class Double extends Number
/*    */   implements Comparable<Double>
/*    */ {
/*    */   public static final double MAX_VALUE = 1.7976931348623157E+308D;
/*    */   public static final double MIN_VALUE = 4.9E-324D;
/*    */   public static final double NaN = (0.0D / 0.0D);
/*    */   public static final double POSITIVE_INFINITY = (1.0D / 0.0D);
/*    */   public static final double NEGATIVE_INFINITY = (-1.0D / 0.0D);
/*    */   public static final double MIN_NORMAL = 2.225073858507201E-308D;
/*    */   public static final int MAX_EXPONENT = 1023;
/*    */   public static final int MIN_EXPONENT = -1022;
/* 41 */   public static final Class<Double> TYPE = null;
/*    */   public static final int SIZE = 64;
/*    */ 
/*    */   public Double(double value)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public Double(String string) throws NumberFormatException { throw new RuntimeException("Stub!"); } 
/*  8 */   public int compareTo(Double object) { throw new RuntimeException("Stub!"); } 
/*  9 */   public byte byteValue() { throw new RuntimeException("Stub!"); } 
/*    */   public static native long doubleToLongBits(double paramDouble);
/*    */ 
/*    */   public static native long doubleToRawLongBits(double paramDouble);
/*    */ 
/* 12 */   public double doubleValue() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 14 */   public float floatValue() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 16 */   public int intValue() { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isInfinite() { throw new RuntimeException("Stub!"); } 
/* 18 */   public static boolean isInfinite(double d) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean isNaN() { throw new RuntimeException("Stub!"); } 
/* 20 */   public static boolean isNaN(double d) { throw new RuntimeException("Stub!"); } 
/*    */   public static native double longBitsToDouble(long paramLong);
/*    */ 
/* 22 */   public long longValue() { throw new RuntimeException("Stub!"); } 
/* 23 */   public static double parseDouble(String string) throws NumberFormatException { throw new RuntimeException("Stub!"); } 
/* 24 */   public short shortValue() { throw new RuntimeException("Stub!"); } 
/* 25 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 26 */   public static String toString(double d) { throw new RuntimeException("Stub!"); } 
/* 27 */   public static Double valueOf(String string) throws NumberFormatException { throw new RuntimeException("Stub!"); } 
/* 28 */   public static int compare(double double1, double double2) { throw new RuntimeException("Stub!"); } 
/* 29 */   public static Double valueOf(double d) { throw new RuntimeException("Stub!"); } 
/* 30 */   public static String toHexString(double d) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.Double
 * JD-Core Version:    0.6.0
 */