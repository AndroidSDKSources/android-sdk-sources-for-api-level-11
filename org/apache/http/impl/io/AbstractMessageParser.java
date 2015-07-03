/*   */ package org.apache.http.impl.io;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import org.apache.http.Header;
/*   */ import org.apache.http.HttpException;
/*   */ import org.apache.http.HttpMessage;
/*   */ import org.apache.http.ParseException;
/*   */ import org.apache.http.io.HttpMessageParser;
/*   */ import org.apache.http.io.SessionInputBuffer;
/*   */ import org.apache.http.message.LineParser;
/*   */ import org.apache.http.params.HttpParams;
/*   */ 
/*   */ public abstract class AbstractMessageParser
/*   */   implements HttpMessageParser
/*   */ {
/*   */   protected final LineParser lineParser;
/*   */ 
/*   */   public AbstractMessageParser(SessionInputBuffer buffer, LineParser parser, HttpParams params)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public static Header[] parseHeaders(SessionInputBuffer inbuffer, int maxHeaderCount, int maxLineLen, LineParser parser) throws HttpException, IOException { throw new RuntimeException("Stub!"); } 
/*   */   protected abstract HttpMessage parseHead(SessionInputBuffer paramSessionInputBuffer) throws IOException, HttpException, ParseException;
/*   */ 
/* 8 */   public HttpMessage parse() throws IOException, HttpException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.io.AbstractMessageParser
 * JD-Core Version:    0.6.0
 */