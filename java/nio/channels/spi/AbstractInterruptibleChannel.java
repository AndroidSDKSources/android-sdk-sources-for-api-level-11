/*   */ package java.nio.channels.spi;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.nio.channels.AsynchronousCloseException;
/*   */ import java.nio.channels.Channel;
/*   */ import java.nio.channels.InterruptibleChannel;
/*   */ 
/*   */ public abstract class AbstractInterruptibleChannel
/*   */   implements Channel, InterruptibleChannel
/*   */ {
/*   */   protected AbstractInterruptibleChannel()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public final synchronized boolean isOpen() { throw new RuntimeException("Stub!"); } 
/* 7 */   public final void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 8 */   protected final void begin() { throw new RuntimeException("Stub!"); } 
/* 9 */   protected final void end(boolean success) throws AsynchronousCloseException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract void implCloseChannel()
/*   */     throws IOException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.spi.AbstractInterruptibleChannel
 * JD-Core Version:    0.6.0
 */