/*    */ package org.apache.http.client.methods;
/*    */ 
/*    */ import org.apache.http.HttpEntity;
/*    */ import org.apache.http.HttpEntityEnclosingRequest;
/*    */ 
/*    */ public abstract class HttpEntityEnclosingRequestBase extends HttpRequestBase
/*    */   implements HttpEntityEnclosingRequest
/*    */ {
/*    */   public HttpEntityEnclosingRequestBase()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public HttpEntity getEntity() { throw new RuntimeException("Stub!"); } 
/*  8 */   public void setEntity(HttpEntity entity) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean expectContinue() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.client.methods.HttpEntityEnclosingRequestBase
 * JD-Core Version:    0.6.0
 */