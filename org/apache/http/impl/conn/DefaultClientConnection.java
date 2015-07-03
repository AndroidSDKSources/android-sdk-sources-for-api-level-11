/*    */ package org.apache.http.impl.conn;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.Socket;
/*    */ import org.apache.http.HttpException;
/*    */ import org.apache.http.HttpHost;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.HttpResponse;
/*    */ import org.apache.http.HttpResponseFactory;
/*    */ import org.apache.http.conn.OperatedClientConnection;
/*    */ import org.apache.http.impl.SocketHttpClientConnection;
/*    */ import org.apache.http.io.HttpMessageParser;
/*    */ import org.apache.http.io.SessionInputBuffer;
/*    */ import org.apache.http.io.SessionOutputBuffer;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public class DefaultClientConnection extends SocketHttpClientConnection
/*    */   implements OperatedClientConnection
/*    */ {
/*    */   public DefaultClientConnection()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public final HttpHost getTargetHost() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final boolean isSecure() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final Socket getSocket() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void opening(Socket sock, HttpHost target) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void openCompleted(boolean secure, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void shutdown() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   protected SessionInputBuffer createSessionInputBuffer(Socket socket, int buffersize, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   protected SessionOutputBuffer createSessionOutputBuffer(Socket socket, int buffersize, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   protected HttpMessageParser createResponseParser(SessionInputBuffer buffer, HttpResponseFactory responseFactory, HttpParams params) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void update(Socket sock, HttpHost target, boolean secure, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public HttpResponse receiveResponseHeader() throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public void sendRequestHeader(HttpRequest request) throws HttpException, IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.DefaultClientConnection
 * JD-Core Version:    0.6.0
 */