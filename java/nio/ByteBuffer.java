/*    */ package java.nio;
/*    */ 
/*    */ public abstract class ByteBuffer extends Buffer
/*    */   implements Comparable<ByteBuffer>
/*    */ {
/*    */   ByteBuffer()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public static ByteBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static ByteBuffer allocateDirect(int capacity) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static ByteBuffer wrap(byte[] array) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static ByteBuffer wrap(byte[] array, int start, int byteCount) { throw new RuntimeException("Stub!"); } 
/* 11 */   public final byte[] array() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract CharBuffer asCharBuffer();
/*    */ 
/*    */   public abstract DoubleBuffer asDoubleBuffer();
/*    */ 
/*    */   public abstract FloatBuffer asFloatBuffer();
/*    */ 
/*    */   public abstract IntBuffer asIntBuffer();
/*    */ 
/*    */   public abstract LongBuffer asLongBuffer();
/*    */ 
/*    */   public abstract ByteBuffer asReadOnlyBuffer();
/*    */ 
/*    */   public abstract ShortBuffer asShortBuffer();
/*    */ 
/*    */   public abstract ByteBuffer compact();
/*    */ 
/* 21 */   public int compareTo(ByteBuffer otherBuffer) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract ByteBuffer duplicate();
/*    */ 
/* 23 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract byte get();
/*    */ 
/* 25 */   public ByteBuffer get(byte[] dst) { throw new RuntimeException("Stub!"); } 
/* 26 */   public ByteBuffer get(byte[] dst, int dstOffset, int byteCount) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract byte get(int paramInt);
/*    */ 
/*    */   public abstract char getChar();
/*    */ 
/*    */   public abstract char getChar(int paramInt);
/*    */ 
/*    */   public abstract double getDouble();
/*    */ 
/*    */   public abstract double getDouble(int paramInt);
/*    */ 
/*    */   public abstract float getFloat();
/*    */ 
/*    */   public abstract float getFloat(int paramInt);
/*    */ 
/*    */   public abstract int getInt();
/*    */ 
/*    */   public abstract int getInt(int paramInt);
/*    */ 
/*    */   public abstract long getLong();
/*    */ 
/*    */   public abstract long getLong(int paramInt);
/*    */ 
/*    */   public abstract short getShort();
/*    */ 
/*    */   public abstract short getShort(int paramInt);
/*    */ 
/* 40 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); } 
/* 41 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isDirect();
/*    */ 
/* 43 */   public final ByteOrder order() { throw new RuntimeException("Stub!"); } 
/* 44 */   public final ByteBuffer order(ByteOrder byteOrder) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract ByteBuffer put(byte paramByte);
/*    */ 
/* 46 */   public final ByteBuffer put(byte[] src) { throw new RuntimeException("Stub!"); } 
/* 47 */   public ByteBuffer put(byte[] src, int srcOffset, int byteCount) { throw new RuntimeException("Stub!"); } 
/* 48 */   public ByteBuffer put(ByteBuffer src) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract ByteBuffer put(int paramInt, byte paramByte);
/*    */ 
/*    */   public abstract ByteBuffer putChar(char paramChar);
/*    */ 
/*    */   public abstract ByteBuffer putChar(int paramInt, char paramChar);
/*    */ 
/*    */   public abstract ByteBuffer putDouble(double paramDouble);
/*    */ 
/*    */   public abstract ByteBuffer putDouble(int paramInt, double paramDouble);
/*    */ 
/*    */   public abstract ByteBuffer putFloat(float paramFloat);
/*    */ 
/*    */   public abstract ByteBuffer putFloat(int paramInt, float paramFloat);
/*    */ 
/*    */   public abstract ByteBuffer putInt(int paramInt);
/*    */ 
/*    */   public abstract ByteBuffer putInt(int paramInt1, int paramInt2);
/*    */ 
/*    */   public abstract ByteBuffer putLong(long paramLong);
/*    */ 
/*    */   public abstract ByteBuffer putLong(int paramInt, long paramLong);
/*    */ 
/*    */   public abstract ByteBuffer putShort(short paramShort);
/*    */ 
/*    */   public abstract ByteBuffer putShort(int paramInt, short paramShort);
/*    */ 
/*    */   public abstract ByteBuffer slice();
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.ByteBuffer
 * JD-Core Version:    0.6.0
 */