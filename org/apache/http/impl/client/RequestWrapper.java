/*    */ package org.apache.http.impl.client;
/*    */ 
/*    */ import java.net.URI;
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.ProtocolException;
/*    */ import org.apache.http.ProtocolVersion;
/*    */ import org.apache.http.RequestLine;
/*    */ import org.apache.http.client.methods.HttpUriRequest;
/*    */ import org.apache.http.message.AbstractHttpMessage;
/*    */ 
/*    */ public class RequestWrapper extends AbstractHttpMessage
/*    */   implements HttpUriRequest
/*    */ {
/*    */   public RequestWrapper(HttpRequest request)
/*    */     throws ProtocolException
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public void resetHeaders() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getMethod() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void setMethod(String method) { throw new RuntimeException("Stub!"); } 
/* 10 */   public ProtocolVersion getProtocolVersion() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setProtocolVersion(ProtocolVersion version) { throw new RuntimeException("Stub!"); } 
/* 12 */   public URI getURI() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setURI(URI uri) { throw new RuntimeException("Stub!"); } 
/* 14 */   public RequestLine getRequestLine() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void abort() throws UnsupportedOperationException { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean isAborted() { throw new RuntimeException("Stub!"); } 
/* 17 */   public HttpRequest getOriginal() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean isRepeatable() { throw new RuntimeException("Stub!"); } 
/* 19 */   public int getExecCount() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void incrementExecCount() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.client.RequestWrapper
 * JD-Core Version:    0.6.0
 */