/*    */ package org.apache.http.message;
/*    */ 
/*    */ import org.apache.http.Header;
/*    */ import org.apache.http.ProtocolVersion;
/*    */ import org.apache.http.RequestLine;
/*    */ import org.apache.http.StatusLine;
/*    */ import org.apache.http.util.CharArrayBuffer;
/*    */ 
/*    */ public class BasicLineFormatter
/*    */   implements LineFormatter
/*    */ {
/* 20 */   public static final BasicLineFormatter DEFAULT = null;
/*    */ 
/*    */   public BasicLineFormatter()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected CharArrayBuffer initBuffer(CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static final String formatProtocolVersion(ProtocolVersion version, LineFormatter formatter) { throw new RuntimeException("Stub!"); } 
/*  8 */   public CharArrayBuffer appendProtocolVersion(CharArrayBuffer buffer, ProtocolVersion version) { throw new RuntimeException("Stub!"); } 
/*  9 */   protected int estimateProtocolVersionLen(ProtocolVersion version) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static final String formatRequestLine(RequestLine reqline, LineFormatter formatter) { throw new RuntimeException("Stub!"); } 
/* 11 */   public CharArrayBuffer formatRequestLine(CharArrayBuffer buffer, RequestLine reqline) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void doFormatRequestLine(CharArrayBuffer buffer, RequestLine reqline) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static final String formatStatusLine(StatusLine statline, LineFormatter formatter) { throw new RuntimeException("Stub!"); } 
/* 14 */   public CharArrayBuffer formatStatusLine(CharArrayBuffer buffer, StatusLine statline) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void doFormatStatusLine(CharArrayBuffer buffer, StatusLine statline) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static final String formatHeader(Header header, LineFormatter formatter) { throw new RuntimeException("Stub!"); } 
/* 17 */   public CharArrayBuffer formatHeader(CharArrayBuffer buffer, Header header) { throw new RuntimeException("Stub!"); } 
/* 18 */   protected void doFormatHeader(CharArrayBuffer buffer, Header header) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.message.BasicLineFormatter
 * JD-Core Version:    0.6.0
 */