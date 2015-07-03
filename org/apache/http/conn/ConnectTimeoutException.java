/*   */ package org.apache.http.conn;
/*   */ 
/*   */ import java.io.InterruptedIOException;
/*   */ 
/*   */ public class ConnectTimeoutException extends InterruptedIOException
/*   */ {
/*   */   public ConnectTimeoutException()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public ConnectTimeoutException(String message) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.ConnectTimeoutException
 * JD-Core Version:    0.6.0
 */