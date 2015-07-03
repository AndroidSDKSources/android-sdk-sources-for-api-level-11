/*    */ package java.nio;
/*    */ 
/*    */ public abstract class DoubleBuffer extends Buffer
/*    */   implements Comparable<DoubleBuffer>
/*    */ {
/*    */   DoubleBuffer()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public static DoubleBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static DoubleBuffer wrap(double[] array) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static DoubleBuffer wrap(double[] array, int start, int doubleCount) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final double[] array() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract DoubleBuffer asReadOnlyBuffer();
/*    */ 
/*    */   public abstract DoubleBuffer compact();
/*    */ 
/* 14 */   public int compareTo(DoubleBuffer otherBuffer) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract DoubleBuffer duplicate();
/*    */ 
/* 16 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract double get();
/*    */ 
/* 18 */   public DoubleBuffer get(double[] dst) { throw new RuntimeException("Stub!"); } 
/* 19 */   public DoubleBuffer get(double[] dst, int dstOffset, int doubleCount) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract double get(int paramInt);
/*    */ 
/* 21 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); } 
/* 22 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isDirect();
/*    */ 
/*    */   public abstract ByteOrder order();
/*    */ 
/*    */   public abstract DoubleBuffer put(double paramDouble);
/*    */ 
/* 26 */   public final DoubleBuffer put(double[] src) { throw new RuntimeException("Stub!"); } 
/* 27 */   public DoubleBuffer put(double[] src, int srcOffset, int doubleCount) { throw new RuntimeException("Stub!"); } 
/* 28 */   public DoubleBuffer put(DoubleBuffer src) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract DoubleBuffer put(int paramInt, double paramDouble);
/*    */ 
/*    */   public abstract DoubleBuffer slice();
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.DoubleBuffer
 * JD-Core Version:    0.6.0
 */