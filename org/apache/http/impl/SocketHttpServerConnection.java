/*    */ package org.apache.http.impl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ import org.apache.http.HttpInetConnection;
/*    */ import org.apache.http.io.SessionInputBuffer;
/*    */ import org.apache.http.io.SessionOutputBuffer;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public class SocketHttpServerConnection extends AbstractHttpServerConnection
/*    */   implements HttpInetConnection
/*    */ {
/*    */   public SocketHttpServerConnection()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   protected void assertNotOpen() { throw new RuntimeException("Stub!"); } 
/*  8 */   protected void assertOpen() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected SessionInputBuffer createHttpDataReceiver(Socket socket, int buffersize, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   protected SessionOutputBuffer createHttpDataTransmitter(Socket socket, int buffersize, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void bind(Socket socket, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   protected Socket getSocket() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean isOpen() { throw new RuntimeException("Stub!"); } 
/* 14 */   public InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getLocalPort() { throw new RuntimeException("Stub!"); } 
/* 16 */   public InetAddress getRemoteAddress() { throw new RuntimeException("Stub!"); } 
/* 17 */   public int getRemotePort() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setSocketTimeout(int timeout) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getSocketTimeout() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void shutdown() throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public void close() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.SocketHttpServerConnection
 * JD-Core Version:    0.6.0
 */