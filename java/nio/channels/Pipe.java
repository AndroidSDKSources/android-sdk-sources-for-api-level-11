/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.spi.AbstractSelectableChannel;
/*    */ import java.nio.channels.spi.SelectorProvider;
/*    */ 
/*    */ public abstract class Pipe
/*    */ {
/*    */   protected Pipe()
/*    */   {
/* 18 */     throw new RuntimeException("Stub!"); } 
/* 19 */   public static Pipe open() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract SinkChannel sink();
/*    */ 
/*    */   public abstract SourceChannel source();
/*    */ 
/*    */   public static abstract class SourceChannel extends AbstractSelectableChannel
/*    */     implements ReadableByteChannel, ScatteringByteChannel
/*    */   {
/*    */     protected SourceChannel(SelectorProvider provider)
/*    */     {
/* 15 */       super(); throw new RuntimeException("Stub!"); } 
/* 16 */     public final int validOps() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract class SinkChannel extends AbstractSelectableChannel
/*    */     implements WritableByteChannel, GatheringByteChannel
/*    */   {
/*    */     protected SinkChannel(SelectorProvider provider)
/*    */     {
/*  8 */       super(); throw new RuntimeException("Stub!"); } 
/*  9 */     public final int validOps() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.Pipe
 * JD-Core Version:    0.6.0
 */