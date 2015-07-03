/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.MappedByteBuffer;
/*    */ import java.nio.channels.spi.AbstractInterruptibleChannel;
/*    */ 
/*    */ public abstract class FileChannel extends AbstractInterruptibleChannel
/*    */   implements GatheringByteChannel, ScatteringByteChannel, ByteChannel
/*    */ {
/*    */   protected FileChannel()
/*    */   {
/* 15 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract void force(boolean paramBoolean) throws IOException;
/*    */ 
/* 17 */   public final FileLock lock() throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract FileLock lock(long paramLong1, long paramLong2, boolean paramBoolean) throws IOException;
/*    */ 
/*    */   public abstract MappedByteBuffer map(MapMode paramMapMode, long paramLong1, long paramLong2) throws IOException;
/*    */ 
/*    */   public abstract long position() throws IOException;
/*    */ 
/*    */   public abstract FileChannel position(long paramLong) throws IOException;
/*    */ 
/*    */   public abstract int read(ByteBuffer paramByteBuffer) throws IOException;
/*    */ 
/*    */   public abstract int read(ByteBuffer paramByteBuffer, long paramLong) throws IOException;
/*    */ 
/* 24 */   public final long read(ByteBuffer[] buffers) throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract long read(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) throws IOException;
/*    */ 
/*    */   public abstract long size() throws IOException;
/*    */ 
/*    */   public abstract long transferFrom(ReadableByteChannel paramReadableByteChannel, long paramLong1, long paramLong2) throws IOException;
/*    */ 
/*    */   public abstract long transferTo(long paramLong1, long paramLong2, WritableByteChannel paramWritableByteChannel) throws IOException;
/*    */ 
/*    */   public abstract FileChannel truncate(long paramLong) throws IOException;
/*    */ 
/* 30 */   public final FileLock tryLock() throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract FileLock tryLock(long paramLong1, long paramLong2, boolean paramBoolean) throws IOException;
/*    */ 
/*    */   public abstract int write(ByteBuffer paramByteBuffer) throws IOException;
/*    */ 
/*    */   public abstract int write(ByteBuffer paramByteBuffer, long paramLong) throws IOException;
/*    */ 
/* 34 */   public final long write(ByteBuffer[] buffers) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract long write(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2)
/*    */     throws IOException;
/*    */ 
/*    */   public static class MapMode
/*    */   {
/* 13 */     public static final MapMode PRIVATE = null; public static final MapMode READ_ONLY = null; public static final MapMode READ_WRITE = null;
/*    */ 
/*    */     MapMode()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public String toString() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.FileChannel
 * JD-Core Version:    0.6.0
 */