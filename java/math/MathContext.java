/*    */ package java.math;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public final class MathContext
/*    */   implements Serializable
/*    */ {
/* 17 */   public static final MathContext DECIMAL128 = null; public static final MathContext DECIMAL32 = null; public static final MathContext DECIMAL64 = null; public static final MathContext UNLIMITED = null;
/*    */ 
/*    */   public MathContext(int precision)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public MathContext(int precision, RoundingMode roundingMode) { throw new RuntimeException("Stub!"); } 
/*  7 */   public MathContext(String val) { throw new RuntimeException("Stub!"); } 
/*  8 */   public int getPrecision() { throw new RuntimeException("Stub!"); } 
/*  9 */   public RoundingMode getRoundingMode() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean equals(Object x) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.math.MathContext
 * JD-Core Version:    0.6.0
 */