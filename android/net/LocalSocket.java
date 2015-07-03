/*    */ package android.net;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class LocalSocket
/*    */ {
/*    */   public LocalSocket()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public String toString() { throw new RuntimeException("Stub!"); } 
/*  6 */   public void connect(LocalSocketAddress endpoint) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public void bind(LocalSocketAddress bindpoint) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public LocalSocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); } 
/*  9 */   public InputStream getInputStream() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public OutputStream getOutputStream() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void shutdownInput() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void shutdownOutput() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setReceiveBufferSize(int size) throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getReceiveBufferSize() throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setSoTimeout(int n) throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public int getSoTimeout() throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setSendBufferSize(int n) throws IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getSendBufferSize() throws IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public LocalSocketAddress getRemoteSocketAddress() { throw new RuntimeException("Stub!"); } 
/* 21 */   public synchronized boolean isConnected() { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean isClosed() { throw new RuntimeException("Stub!"); } 
/* 23 */   public synchronized boolean isBound() { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean isOutputShutdown() { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean isInputShutdown() { throw new RuntimeException("Stub!"); } 
/* 26 */   public void connect(LocalSocketAddress endpoint, int timeout) throws IOException { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setFileDescriptorsForSend(FileDescriptor[] fds) { throw new RuntimeException("Stub!"); } 
/* 28 */   public FileDescriptor[] getAncillaryFileDescriptors() throws IOException { throw new RuntimeException("Stub!"); } 
/* 29 */   public Credentials getPeerCredentials() throws IOException { throw new RuntimeException("Stub!"); } 
/* 30 */   public FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.LocalSocket
 * JD-Core Version:    0.6.0
 */