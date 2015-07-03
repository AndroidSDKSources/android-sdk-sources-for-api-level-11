/*    */ package java.nio.channels.spi;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.Channel;
/*    */ import java.nio.channels.DatagramChannel;
/*    */ import java.nio.channels.Pipe;
/*    */ import java.nio.channels.ServerSocketChannel;
/*    */ import java.nio.channels.SocketChannel;
/*    */ 
/*    */ public abstract class SelectorProvider
/*    */ {
/*    */   protected SelectorProvider()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static synchronized SelectorProvider provider() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract DatagramChannel openDatagramChannel() throws IOException;
/*    */ 
/*    */   public abstract Pipe openPipe() throws IOException;
/*    */ 
/*    */   public abstract AbstractSelector openSelector() throws IOException;
/*    */ 
/*    */   public abstract ServerSocketChannel openServerSocketChannel() throws IOException;
/*    */ 
/*    */   public abstract SocketChannel openSocketChannel() throws IOException;
/*    */ 
/* 11 */   public Channel inheritedChannel() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.spi.SelectorProvider
 * JD-Core Version:    0.6.0
 */