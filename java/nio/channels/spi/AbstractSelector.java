/*    */ package java.nio.channels.spi;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.SelectionKey;
/*    */ import java.nio.channels.Selector;
/*    */ import java.util.Set;
/*    */ 
/*    */ public abstract class AbstractSelector extends Selector
/*    */ {
/*    */   protected AbstractSelector(SelectorProvider selectorProvider)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public final void close() throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void implCloseSelector() throws IOException;
/*    */ 
/*  8 */   public final boolean isOpen() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final SelectorProvider provider() { throw new RuntimeException("Stub!"); } 
/* 10 */   protected final Set<SelectionKey> cancelledKeys() { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract SelectionKey register(AbstractSelectableChannel paramAbstractSelectableChannel, int paramInt, Object paramObject);
/*    */ 
/* 12 */   protected final void deregister(AbstractSelectionKey key) { throw new RuntimeException("Stub!"); } 
/* 13 */   protected final void begin() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected final void end() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.spi.AbstractSelector
 * JD-Core Version:    0.6.0
 */