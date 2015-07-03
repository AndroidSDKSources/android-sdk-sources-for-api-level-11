/*   */ package org.apache.http.conn;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.io.InputStream;
/*   */ 
/*   */ public class BasicEofSensorWatcher
/*   */   implements EofSensorWatcher
/*   */ {
/*   */   protected ManagedClientConnection managedConn;
/*   */   protected boolean attemptReuse;
/*   */ 
/*   */   public BasicEofSensorWatcher(ManagedClientConnection conn, boolean reuse)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public boolean eofDetected(InputStream wrapped) throws IOException { throw new RuntimeException("Stub!"); } 
/* 7 */   public boolean streamClosed(InputStream wrapped) throws IOException { throw new RuntimeException("Stub!"); } 
/* 8 */   public boolean streamAbort(InputStream wrapped) throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.BasicEofSensorWatcher
 * JD-Core Version:    0.6.0
 */