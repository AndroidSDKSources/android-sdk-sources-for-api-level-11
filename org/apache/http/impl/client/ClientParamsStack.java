/*    */ package org.apache.http.impl.client;
/*    */ 
/*    */ import org.apache.http.params.AbstractHttpParams;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public class ClientParamsStack extends AbstractHttpParams
/*    */ {
/*    */   protected final HttpParams applicationParams;
/*    */   protected final HttpParams clientParams;
/*    */   protected final HttpParams requestParams;
/*    */   protected final HttpParams overrideParams;
/*    */ 
/*    */   public ClientParamsStack(HttpParams aparams, HttpParams cparams, HttpParams rparams, HttpParams oparams)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ClientParamsStack(ClientParamsStack stack) { throw new RuntimeException("Stub!"); } 
/*  7 */   public ClientParamsStack(ClientParamsStack stack, HttpParams aparams, HttpParams cparams, HttpParams rparams, HttpParams oparams) { throw new RuntimeException("Stub!"); } 
/*  8 */   public final HttpParams getApplicationParams() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final HttpParams getClientParams() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final HttpParams getRequestParams() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final HttpParams getOverrideParams() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Object getParameter(String name) { throw new RuntimeException("Stub!"); } 
/* 13 */   public HttpParams setParameter(String name, Object value) throws UnsupportedOperationException { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean removeParameter(String name) { throw new RuntimeException("Stub!"); } 
/* 15 */   public HttpParams copy() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.client.ClientParamsStack
 * JD-Core Version:    0.6.0
 */