/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ public abstract class FileLock
/*    */ {
/*    */   protected FileLock(FileChannel channel, long position, long size, boolean shared)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final FileChannel channel() { throw new RuntimeException("Stub!"); } 
/*  6 */   public final long position() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final long size() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final boolean isShared() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final boolean overlaps(long start, long length) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isValid();
/*    */ 
/*    */   public abstract void release() throws IOException;
/*    */ 
/* 12 */   public final String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.FileLock
 * JD-Core Version:    0.6.0
 */