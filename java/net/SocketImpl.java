/*    */ package java.net;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public abstract class SocketImpl
/*    */   implements SocketOptions
/*    */ {
/*    */   protected InetAddress address;
/*    */   protected int port;
/*    */   protected FileDescriptor fd;
/*    */   protected int localport;
/*    */ 
/*    */   public SocketImpl()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void accept(SocketImpl paramSocketImpl) throws IOException;
/*    */ 
/*    */   protected abstract int available() throws IOException;
/*    */ 
/*    */   protected abstract void bind(InetAddress paramInetAddress, int paramInt) throws IOException;
/*    */ 
/*    */   protected abstract void close() throws IOException;
/*    */ 
/*    */   protected abstract void connect(String paramString, int paramInt) throws IOException;
/*    */ 
/*    */   protected abstract void connect(InetAddress paramInetAddress, int paramInt) throws IOException;
/*    */ 
/*    */   protected abstract void create(boolean paramBoolean) throws IOException;
/*    */ 
/* 13 */   protected FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected InetAddress getInetAddress() { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract InputStream getInputStream() throws IOException;
/*    */ 
/* 16 */   protected int getLocalPort() { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract OutputStream getOutputStream() throws IOException;
/*    */ 
/* 18 */   protected int getPort() { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void listen(int paramInt) throws IOException;
/*    */ 
/* 20 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void shutdownInput() throws IOException { throw new RuntimeException("Stub!"); } 
/* 22 */   protected void shutdownOutput() throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void connect(SocketAddress paramSocketAddress, int paramInt) throws IOException;
/*    */ 
/* 24 */   protected boolean supportsUrgentData() { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void sendUrgentData(int paramInt) throws IOException;
/*    */ 
/* 26 */   protected void setPerformancePreferences(int connectionTime, int latency, int bandwidth) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.SocketImpl
 * JD-Core Version:    0.6.0
 */