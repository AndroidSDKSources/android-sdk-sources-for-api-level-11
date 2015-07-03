/*    */ package java.nio.channels.spi;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.ClosedChannelException;
/*    */ import java.nio.channels.SelectableChannel;
/*    */ import java.nio.channels.SelectionKey;
/*    */ import java.nio.channels.Selector;
/*    */ 
/*    */ public abstract class AbstractSelectableChannel extends SelectableChannel
/*    */ {
/*    */   protected AbstractSelectableChannel(SelectorProvider selectorProvider)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public final SelectorProvider provider() { throw new RuntimeException("Stub!"); } 
/*  7 */   public final synchronized boolean isRegistered() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final synchronized SelectionKey keyFor(Selector selector) { throw new RuntimeException("Stub!"); } 
/*  9 */   public final SelectionKey register(Selector selector, int interestSet, Object attachment) throws ClosedChannelException { throw new RuntimeException("Stub!"); } 
/* 10 */   protected final synchronized void implCloseChannel() throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void implCloseSelectableChannel() throws IOException;
/*    */ 
/* 12 */   public final boolean isBlocking() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final Object blockingLock() { throw new RuntimeException("Stub!"); } 
/* 14 */   public final SelectableChannel configureBlocking(boolean blockingMode) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   protected abstract void implConfigureBlocking(boolean paramBoolean)
/*    */     throws IOException;
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.spi.AbstractSelectableChannel
 * JD-Core Version:    0.6.0
 */