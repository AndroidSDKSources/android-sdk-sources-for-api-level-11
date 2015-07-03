/*   */ package org.apache.http.impl.io;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import org.apache.http.HttpException;
/*   */ import org.apache.http.HttpMessage;
/*   */ import org.apache.http.HttpResponseFactory;
/*   */ import org.apache.http.ParseException;
/*   */ import org.apache.http.io.SessionInputBuffer;
/*   */ import org.apache.http.message.LineParser;
/*   */ import org.apache.http.params.HttpParams;
/*   */ 
/*   */ public class HttpResponseParser extends AbstractMessageParser
/*   */ {
/*   */   public HttpResponseParser(SessionInputBuffer buffer, LineParser parser, HttpResponseFactory responseFactory, HttpParams params)
/*   */   {
/* 5 */     super((SessionInputBuffer)null, (LineParser)null, (HttpParams)null); throw new RuntimeException("Stub!"); } 
/* 6 */   protected HttpMessage parseHead(SessionInputBuffer sessionBuffer) throws IOException, HttpException, ParseException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.io.HttpResponseParser
 * JD-Core Version:    0.6.0
 */