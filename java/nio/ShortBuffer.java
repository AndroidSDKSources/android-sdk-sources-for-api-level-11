/*    */ package java.nio;
/*    */ 
/*    */ public abstract class ShortBuffer extends Buffer
/*    */   implements Comparable<ShortBuffer>
/*    */ {
/*    */   ShortBuffer()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public static ShortBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static ShortBuffer wrap(short[] array) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static ShortBuffer wrap(short[] array, int start, int shortCount) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final short[] array() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract ShortBuffer asReadOnlyBuffer();
/*    */ 
/*    */   public abstract ShortBuffer compact();
/*    */ 
/* 14 */   public int compareTo(ShortBuffer otherBuffer) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract ShortBuffer duplicate();
/*    */ 
/* 16 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract short get();
/*    */ 
/* 18 */   public ShortBuffer get(short[] dst) { throw new RuntimeException("Stub!"); } 
/* 19 */   public ShortBuffer get(short[] dst, int dstOffset, int shortCount) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract short get(int paramInt);
/*    */ 
/* 21 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); } 
/* 22 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isDirect();
/*    */ 
/*    */   public abstract ByteOrder order();
/*    */ 
/*    */   public abstract ShortBuffer put(short paramShort);
/*    */ 
/* 26 */   public final ShortBuffer put(short[] src) { throw new RuntimeException("Stub!"); } 
/* 27 */   public ShortBuffer put(short[] src, int srcOffset, int shortCount) { throw new RuntimeException("Stub!"); } 
/* 28 */   public ShortBuffer put(ShortBuffer src) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract ShortBuffer put(int paramInt, short paramShort);
/*    */ 
/*    */   public abstract ShortBuffer slice();
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.ShortBuffer
 * JD-Core Version:    0.6.0
 */