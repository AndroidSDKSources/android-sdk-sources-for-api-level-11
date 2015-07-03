/*   */ package java.nio.channels;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.net.ServerSocket;
/*   */ import java.nio.channels.spi.AbstractSelectableChannel;
/*   */ import java.nio.channels.spi.SelectorProvider;
/*   */ 
/*   */ public abstract class ServerSocketChannel extends AbstractSelectableChannel
/*   */ {
/*   */   protected ServerSocketChannel(SelectorProvider selectorProvider)
/*   */   {
/* 5 */     super((SelectorProvider)null); throw new RuntimeException("Stub!"); } 
/* 6 */   public static ServerSocketChannel open() throws IOException { throw new RuntimeException("Stub!"); } 
/* 7 */   public final int validOps() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract ServerSocket socket();
/*   */ 
/*   */   public abstract SocketChannel accept()
/*   */     throws IOException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.ServerSocketChannel
 * JD-Core Version:    0.6.0
 */