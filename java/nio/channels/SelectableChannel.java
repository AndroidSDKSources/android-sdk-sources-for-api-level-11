/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.spi.AbstractInterruptibleChannel;
/*    */ import java.nio.channels.spi.SelectorProvider;
/*    */ 
/*    */ public abstract class SelectableChannel extends AbstractInterruptibleChannel
/*    */   implements Channel
/*    */ {
/*    */   protected SelectableChannel()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract Object blockingLock();
/*    */ 
/*    */   public abstract SelectableChannel configureBlocking(boolean paramBoolean) throws IOException;
/*    */ 
/*    */   public abstract boolean isBlocking();
/*    */ 
/*    */   public abstract boolean isRegistered();
/*    */ 
/*    */   public abstract SelectionKey keyFor(Selector paramSelector);
/*    */ 
/*    */   public abstract SelectorProvider provider();
/*    */ 
/* 13 */   public final SelectionKey register(Selector selector, int operations) throws ClosedChannelException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public abstract SelectionKey register(Selector paramSelector, int paramInt, Object paramObject)
/*    */     throws ClosedChannelException;
/*    */ 
/*    */   public abstract int validOps();
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.SelectableChannel
 * JD-Core Version:    0.6.0
 */