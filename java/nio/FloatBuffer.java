/*    */ package java.nio;
/*    */ 
/*    */ public abstract class FloatBuffer extends Buffer
/*    */   implements Comparable<FloatBuffer>
/*    */ {
/*    */   FloatBuffer()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public static FloatBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static FloatBuffer wrap(float[] array) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static FloatBuffer wrap(float[] array, int start, int floatCount) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final float[] array() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract FloatBuffer asReadOnlyBuffer();
/*    */ 
/*    */   public abstract FloatBuffer compact();
/*    */ 
/* 14 */   public int compareTo(FloatBuffer otherBuffer) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract FloatBuffer duplicate();
/*    */ 
/* 16 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract float get();
/*    */ 
/* 18 */   public FloatBuffer get(float[] dst) { throw new RuntimeException("Stub!"); } 
/* 19 */   public FloatBuffer get(float[] dst, int dstOffset, int floatCount) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract float get(int paramInt);
/*    */ 
/* 21 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); } 
/* 22 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isDirect();
/*    */ 
/*    */   public abstract ByteOrder order();
/*    */ 
/*    */   public abstract FloatBuffer put(float paramFloat);
/*    */ 
/* 26 */   public final FloatBuffer put(float[] src) { throw new RuntimeException("Stub!"); } 
/* 27 */   public FloatBuffer put(float[] src, int srcOffset, int floatCount) { throw new RuntimeException("Stub!"); } 
/* 28 */   public FloatBuffer put(FloatBuffer src) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract FloatBuffer put(int paramInt, float paramFloat);
/*    */ 
/*    */   public abstract FloatBuffer slice();
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.FloatBuffer
 * JD-Core Version:    0.6.0
 */