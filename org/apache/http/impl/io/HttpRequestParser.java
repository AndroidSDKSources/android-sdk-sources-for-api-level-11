/*   */ package org.apache.http.impl.io;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import org.apache.http.HttpException;
/*   */ import org.apache.http.HttpMessage;
/*   */ import org.apache.http.HttpRequestFactory;
/*   */ import org.apache.http.ParseException;
/*   */ import org.apache.http.io.SessionInputBuffer;
/*   */ import org.apache.http.message.LineParser;
/*   */ import org.apache.http.params.HttpParams;
/*   */ 
/*   */ public class HttpRequestParser extends AbstractMessageParser
/*   */ {
/*   */   public HttpRequestParser(SessionInputBuffer buffer, LineParser parser, HttpRequestFactory requestFactory, HttpParams params)
/*   */   {
/* 5 */     super((SessionInputBuffer)null, (LineParser)null, (HttpParams)null); throw new RuntimeException("Stub!"); } 
/* 6 */   protected HttpMessage parseHead(SessionInputBuffer sessionBuffer) throws IOException, HttpException, ParseException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.io.HttpRequestParser
 * JD-Core Version:    0.6.0
 */