/*    */ package org.apache.http.impl.conn;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InterruptedIOException;
/*    */ import java.net.InetAddress;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import javax.net.ssl.SSLSession;
/*    */ import org.apache.http.HttpConnectionMetrics;
/*    */ import org.apache.http.HttpEntityEnclosingRequest;
/*    */ import org.apache.http.HttpException;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.HttpResponse;
/*    */ import org.apache.http.conn.ClientConnectionManager;
/*    */ import org.apache.http.conn.ManagedClientConnection;
/*    */ import org.apache.http.conn.OperatedClientConnection;
/*    */ 
/*    */ public abstract class AbstractClientConnAdapter
/*    */   implements ManagedClientConnection
/*    */ {
/*    */   protected AbstractClientConnAdapter(ClientConnectionManager mgr, OperatedClientConnection conn)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected void detach() { throw new RuntimeException("Stub!"); } 
/*  7 */   protected OperatedClientConnection getWrappedConnection() { throw new RuntimeException("Stub!"); } 
/*  8 */   protected ClientConnectionManager getManager() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected final void assertNotAborted() throws InterruptedIOException { throw new RuntimeException("Stub!"); } 
/* 10 */   protected final void assertValid(OperatedClientConnection wrappedConn) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean isOpen() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isStale() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setSocketTimeout(int timeout) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getSocketTimeout() { throw new RuntimeException("Stub!"); } 
/* 15 */   public HttpConnectionMetrics getMetrics() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isResponseAvailable(int timeout) throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public void receiveResponseEntity(HttpResponse response) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public HttpResponse receiveResponseHeader() throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void sendRequestEntity(HttpEntityEnclosingRequest request) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public void sendRequestHeader(HttpRequest request) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 22 */   public InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getLocalPort() { throw new RuntimeException("Stub!"); } 
/* 24 */   public InetAddress getRemoteAddress() { throw new RuntimeException("Stub!"); } 
/* 25 */   public int getRemotePort() { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean isSecure() { throw new RuntimeException("Stub!"); } 
/* 27 */   public SSLSession getSSLSession() { throw new RuntimeException("Stub!"); } 
/* 28 */   public void markReusable() { throw new RuntimeException("Stub!"); } 
/* 29 */   public void unmarkReusable() { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean isMarkedReusable() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setIdleDuration(long duration, TimeUnit unit) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void releaseConnection() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void abortConnection() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.AbstractClientConnAdapter
 * JD-Core Version:    0.6.0
 */