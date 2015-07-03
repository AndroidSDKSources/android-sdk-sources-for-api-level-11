/*   */ package org.apache.http.impl.io;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.net.Socket;
/*   */ import org.apache.http.params.HttpParams;
/*   */ 
/*   */ public class SocketInputBuffer extends AbstractSessionInputBuffer
/*   */ {
/*   */   public SocketInputBuffer(Socket socket, int buffersize, HttpParams params)
/*   */     throws IOException
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public boolean isDataAvailable(int timeout) throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.impl.io.SocketInputBuffer
 * JD-Core Version:    0.6.0
 */