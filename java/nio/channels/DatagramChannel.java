/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.DatagramSocket;
/*    */ import java.net.SocketAddress;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.channels.spi.AbstractSelectableChannel;
/*    */ import java.nio.channels.spi.SelectorProvider;
/*    */ 
/*    */ public abstract class DatagramChannel extends AbstractSelectableChannel
/*    */   implements ByteChannel, ScatteringByteChannel, GatheringByteChannel
/*    */ {
/*    */   protected DatagramChannel(SelectorProvider selectorProvider)
/*    */   {
/*  6 */     super((SelectorProvider)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public static DatagramChannel open() throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public final int validOps() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract DatagramSocket socket();
/*    */ 
/*    */   public abstract boolean isConnected();
/*    */ 
/*    */   public abstract DatagramChannel connect(SocketAddress paramSocketAddress) throws IOException;
/*    */ 
/*    */   public abstract DatagramChannel disconnect() throws IOException;
/*    */ 
/*    */   public abstract SocketAddress receive(ByteBuffer paramByteBuffer) throws IOException;
/*    */ 
/*    */   public abstract int send(ByteBuffer paramByteBuffer, SocketAddress paramSocketAddress) throws IOException;
/*    */ 
/*    */   public abstract int read(ByteBuffer paramByteBuffer) throws IOException;
/*    */ 
/*    */   public abstract long read(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) throws IOException;
/*    */ 
/* 17 */   public final synchronized long read(ByteBuffer[] targets) throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int write(ByteBuffer paramByteBuffer) throws IOException;
/*    */ 
/*    */   public abstract long write(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) throws IOException;
/*    */ 
/* 20 */   public final synchronized long write(ByteBuffer[] sources) throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.DatagramChannel
 * JD-Core Version:    0.6.0
 */