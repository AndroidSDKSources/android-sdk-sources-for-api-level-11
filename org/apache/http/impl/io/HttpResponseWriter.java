/*   */ package org.apache.http.impl.io;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import org.apache.http.HttpMessage;
/*   */ import org.apache.http.io.SessionOutputBuffer;
/*   */ import org.apache.http.message.LineFormatter;
/*   */ import org.apache.http.params.HttpParams;
/*   */ 
/*   */ public class HttpResponseWriter extends AbstractMessageWriter
/*   */ {
/*   */   public HttpResponseWriter(SessionOutputBuffer buffer, LineFormatter formatter, HttpParams params)
/*   */   {
/* 5 */     super((SessionOutputBuffer)null, (LineFormatter)null, (HttpParams)null); throw new RuntimeException("Stub!"); } 
/* 6 */   protected void writeHeadLine(HttpMessage message) throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.io.HttpResponseWriter
 * JD-Core Version:    0.6.0
 */