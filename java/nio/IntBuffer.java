/*    */ package java.nio;
/*    */ 
/*    */ public abstract class IntBuffer extends Buffer
/*    */   implements Comparable<IntBuffer>
/*    */ {
/*    */   IntBuffer()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public static IntBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static IntBuffer wrap(int[] array) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static IntBuffer wrap(int[] array, int start, int intCount) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final int[] array() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract IntBuffer asReadOnlyBuffer();
/*    */ 
/*    */   public abstract IntBuffer compact();
/*    */ 
/* 14 */   public int compareTo(IntBuffer otherBuffer) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract IntBuffer duplicate();
/*    */ 
/* 16 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int get();
/*    */ 
/* 18 */   public IntBuffer get(int[] dst) { throw new RuntimeException("Stub!"); } 
/* 19 */   public IntBuffer get(int[] dst, int dstOffset, int intCount) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int get(int paramInt);
/*    */ 
/* 21 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); } 
/* 22 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isDirect();
/*    */ 
/*    */   public abstract ByteOrder order();
/*    */ 
/*    */   public abstract IntBuffer put(int paramInt);
/*    */ 
/* 26 */   public final IntBuffer put(int[] src) { throw new RuntimeException("Stub!"); } 
/* 27 */   public IntBuffer put(int[] src, int srcOffset, int intCount) { throw new RuntimeException("Stub!"); } 
/* 28 */   public IntBuffer put(IntBuffer src) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract IntBuffer put(int paramInt1, int paramInt2);
/*    */ 
/*    */   public abstract IntBuffer slice();
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.IntBuffer
 * JD-Core Version:    0.6.0
 */