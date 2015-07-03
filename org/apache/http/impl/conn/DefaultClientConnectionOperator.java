/*   */ package org.apache.http.impl.conn;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.net.InetAddress;
/*   */ import java.net.Socket;
/*   */ import org.apache.http.HttpHost;
/*   */ import org.apache.http.conn.ClientConnectionOperator;
/*   */ import org.apache.http.conn.OperatedClientConnection;
/*   */ import org.apache.http.conn.scheme.SchemeRegistry;
/*   */ import org.apache.http.params.HttpParams;
/*   */ import org.apache.http.protocol.HttpContext;
/*   */ 
/*   */ public class DefaultClientConnectionOperator
/*   */   implements ClientConnectionOperator
/*   */ {
/*   */   protected SchemeRegistry schemeRegistry;
/*   */ 
/*   */   public DefaultClientConnectionOperator(SchemeRegistry schemes)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public OperatedClientConnection createConnection() { throw new RuntimeException("Stub!"); } 
/* 7 */   public void openConnection(OperatedClientConnection conn, HttpHost target, InetAddress local, HttpContext context, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 8 */   public void updateSecureConnection(OperatedClientConnection conn, HttpHost target, HttpContext context, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 9 */   protected void prepareSocket(Socket sock, HttpContext context, HttpParams params) throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.conn.DefaultClientConnectionOperator
 * JD-Core Version:    0.6.0
 */