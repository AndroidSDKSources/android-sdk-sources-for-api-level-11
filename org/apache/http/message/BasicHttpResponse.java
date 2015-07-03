/*    */ package org.apache.http.message;
/*    */ 
/*    */ import java.util.Locale;
/*    */ import org.apache.http.HttpEntity;
/*    */ import org.apache.http.HttpResponse;
/*    */ import org.apache.http.ProtocolVersion;
/*    */ import org.apache.http.ReasonPhraseCatalog;
/*    */ import org.apache.http.StatusLine;
/*    */ 
/*    */ public class BasicHttpResponse extends AbstractHttpMessage
/*    */   implements HttpResponse
/*    */ {
/*    */   public BasicHttpResponse(StatusLine statusline, ReasonPhraseCatalog catalog, Locale locale)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public BasicHttpResponse(StatusLine statusline) { throw new RuntimeException("Stub!"); } 
/*  8 */   public BasicHttpResponse(ProtocolVersion ver, int code, String reason) { throw new RuntimeException("Stub!"); } 
/*  9 */   public ProtocolVersion getProtocolVersion() { throw new RuntimeException("Stub!"); } 
/* 10 */   public StatusLine getStatusLine() { throw new RuntimeException("Stub!"); } 
/* 11 */   public HttpEntity getEntity() { throw new RuntimeException("Stub!"); } 
/* 12 */   public Locale getLocale() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setStatusLine(StatusLine statusline) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void setStatusLine(ProtocolVersion ver, int code) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setStatusLine(ProtocolVersion ver, int code, String reason) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setStatusCode(int code) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setReasonPhrase(String reason) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setEntity(HttpEntity entity) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setLocale(Locale loc) { throw new RuntimeException("Stub!"); } 
/* 20 */   protected String getReason(int code) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.message.BasicHttpResponse
 * JD-Core Version:    0.6.0
 */