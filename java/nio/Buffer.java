/*    */ package java.nio;
/*    */ 
/*    */ public abstract class Buffer
/*    */ {
/*    */   Buffer()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract Object array();
/*    */ 
/*    */   public abstract int arrayOffset();
/*    */ 
/*  7 */   public final int capacity() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final Buffer clear() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final Buffer flip() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean hasArray();
/*    */ 
/* 11 */   public final boolean hasRemaining() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isDirect();
/*    */ 
/*    */   public abstract boolean isReadOnly();
/*    */ 
/* 14 */   public final int limit() { throw new RuntimeException("Stub!"); } 
/* 15 */   public final Buffer limit(int newLimit) { throw new RuntimeException("Stub!"); } 
/* 16 */   public final Buffer mark() { throw new RuntimeException("Stub!"); } 
/* 17 */   public final int position() { throw new RuntimeException("Stub!"); } 
/* 18 */   public final Buffer position(int newPosition) { throw new RuntimeException("Stub!"); } 
/* 19 */   public final int remaining() { throw new RuntimeException("Stub!"); } 
/* 20 */   public final Buffer reset() { throw new RuntimeException("Stub!"); } 
/* 21 */   public final Buffer rewind() { throw new RuntimeException("Stub!"); } 
/* 22 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.Buffer
 * JD-Core Version:    0.6.0
 */