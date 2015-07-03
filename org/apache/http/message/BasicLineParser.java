/*    */ package org.apache.http.message;
/*    */ 
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.ParseException;
/*    */ import org.apache.http.ProtocolVersion;
/*    */ import org.apache.http.RequestLine;
/*    */ import org.apache.http.StatusLine;
/*    */ import org.apache.http.util.CharArrayBuffer;
/*    */ 
/*    */ public class BasicLineParser
/*    */   implements LineParser
/*    */ {
/* 22 */   public static final BasicLineParser DEFAULT = null;
/*    */   protected final ProtocolVersion protocol;
/*    */ 
/*    */   public BasicLineParser(ProtocolVersion proto)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public BasicLineParser() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static final ProtocolVersion parseProtocolVersion(String value, LineParser parser) throws ParseException { throw new RuntimeException("Stub!"); } 
/*  8 */   public ProtocolVersion parseProtocolVersion(CharArrayBuffer buffer, ParserCursor cursor) throws ParseException { throw new RuntimeException("Stub!"); } 
/*  9 */   protected ProtocolVersion createProtocolVersion(int major, int minor) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean hasProtocolVersion(CharArrayBuffer buffer, ParserCursor cursor) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static final RequestLine parseRequestLine(String value, LineParser parser) throws ParseException { throw new RuntimeException("Stub!"); } 
/* 12 */   public RequestLine parseRequestLine(CharArrayBuffer buffer, ParserCursor cursor) throws ParseException { throw new RuntimeException("Stub!"); } 
/* 13 */   protected RequestLine createRequestLine(String method, String uri, ProtocolVersion ver) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static final StatusLine parseStatusLine(String value, LineParser parser) throws ParseException { throw new RuntimeException("Stub!"); } 
/* 15 */   public StatusLine parseStatusLine(CharArrayBuffer buffer, ParserCursor cursor) throws ParseException { throw new RuntimeException("Stub!"); } 
/* 16 */   protected StatusLine createStatusLine(ProtocolVersion ver, int status, String reason) { throw new RuntimeException("Stub!"); } 
/* 17 */   public static final Header parseHeader(String value, LineParser parser) throws ParseException { throw new RuntimeException("Stub!"); } 
/* 18 */   public Header parseHeader(CharArrayBuffer buffer) throws ParseException { throw new RuntimeException("Stub!"); } 
/* 19 */   protected void skipWhitespace(CharArrayBuffer buffer, ParserCursor cursor) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.message.BasicLineParser
 * JD-Core Version:    0.6.0
 */