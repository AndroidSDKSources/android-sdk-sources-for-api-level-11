/*    */ package org.apache.http.message;
/*    */ 
/*    */ import org.apache.http.HttpRequest;
/*    */ import org.apache.http.ProtocolVersion;
/*    */ import org.apache.http.RequestLine;
/*    */ 
/*    */ public class BasicHttpRequest extends AbstractHttpMessage
/*    */   implements HttpRequest
/*    */ {
/*    */   public BasicHttpRequest(String method, String uri)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public BasicHttpRequest(String method, String uri, ProtocolVersion ver) { throw new RuntimeException("Stub!"); } 
/*  8 */   public BasicHttpRequest(RequestLine requestline) { throw new RuntimeException("Stub!"); } 
/*  9 */   public ProtocolVersion getProtocolVersion() { throw new RuntimeException("Stub!"); } 
/* 10 */   public RequestLine getRequestLine() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.message.BasicHttpRequest
 * JD-Core Version:    0.6.0
 */