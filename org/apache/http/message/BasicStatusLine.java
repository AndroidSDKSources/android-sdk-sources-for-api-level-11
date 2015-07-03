/*    */ package org.apache.http.message;
/*    */ 
/*    */ import org.apache.http.ProtocolVersion;
/*    */ import org.apache.http.StatusLine;
/*    */ 
/*    */ public class BasicStatusLine
/*    */   implements StatusLine, Cloneable
/*    */ {
/*    */   public BasicStatusLine(ProtocolVersion version, int statusCode, String reasonPhrase)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public int getStatusCode() { throw new RuntimeException("Stub!"); } 
/*  7 */   public ProtocolVersion getProtocolVersion() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getReasonPhrase() { throw new RuntimeException("Stub!"); } 
/*  9 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.message.BasicStatusLine
 * JD-Core Version:    0.6.0
 */