/*    */ package java.nio;
/*    */ 
/*    */ public abstract class LongBuffer extends Buffer
/*    */   implements Comparable<LongBuffer>
/*    */ {
/*    */   LongBuffer()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public static LongBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static LongBuffer wrap(long[] array) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static LongBuffer wrap(long[] array, int start, int longCount) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final long[] array() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract LongBuffer asReadOnlyBuffer();
/*    */ 
/*    */   public abstract LongBuffer compact();
/*    */ 
/* 14 */   public int compareTo(LongBuffer otherBuffer) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract LongBuffer duplicate();
/*    */ 
/* 16 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract long get();
/*    */ 
/* 18 */   public LongBuffer get(long[] dst) { throw new RuntimeException("Stub!"); } 
/* 19 */   public LongBuffer get(long[] dst, int dstOffset, int longCount) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract long get(int paramInt);
/*    */ 
/* 21 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); } 
/* 22 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isDirect();
/*    */ 
/*    */   public abstract ByteOrder order();
/*    */ 
/*    */   public abstract LongBuffer put(long paramLong);
/*    */ 
/* 26 */   public final LongBuffer put(long[] src) { throw new RuntimeException("Stub!"); } 
/* 27 */   public LongBuffer put(long[] src, int srcOffset, int longCount) { throw new RuntimeException("Stub!"); } 
/* 28 */   public LongBuffer put(LongBuffer src) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract LongBuffer put(int paramInt, long paramLong);
/*    */ 
/*    */   public abstract LongBuffer slice();
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.LongBuffer
 * JD-Core Version:    0.6.0
 */