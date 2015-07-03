/*    */ package org.apache.http.client.methods;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.URI;
/*    */ import org.apache.http.ProtocolVersion;
/*    */ import org.apache.http.RequestLine;
/*    */ import org.apache.http.conn.ClientConnectionRequest;
/*    */ import org.apache.http.conn.ConnectionReleaseTrigger;
/*    */ import org.apache.http.message.AbstractHttpMessage;
/*    */ 
/*    */ public abstract class HttpRequestBase extends AbstractHttpMessage
/*    */   implements HttpUriRequest, AbortableHttpRequest, Cloneable
/*    */ {
/*    */   public HttpRequestBase()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract String getMethod();
/*    */ 
/*  8 */   public ProtocolVersion getProtocolVersion() { throw new RuntimeException("Stub!"); } 
/*  9 */   public URI getURI() { throw new RuntimeException("Stub!"); } 
/* 10 */   public RequestLine getRequestLine() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setURI(URI uri) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setConnectionRequest(ClientConnectionRequest connRequest) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setReleaseTrigger(ConnectionReleaseTrigger releaseTrigger) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void abort() { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean isAborted() { throw new RuntimeException("Stub!"); } 
/* 16 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.client.methods.HttpRequestBase
 * JD-Core Version:    0.6.0
 */