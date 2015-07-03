/*    */ package org.apache.http.conn;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import org.apache.http.HttpEntity;
/*    */ import org.apache.http.entity.HttpEntityWrapper;
/*    */ 
/*    */ public class BasicManagedEntity extends HttpEntityWrapper
/*    */   implements ConnectionReleaseTrigger, EofSensorWatcher
/*    */ {
/*    */   protected ManagedClientConnection managedConn;
/*    */   protected final boolean attemptReuse;
/*    */ 
/*    */   public BasicManagedEntity(HttpEntity entity, ManagedClientConnection conn, boolean reuse)
/*    */   {
/*  6 */     super((HttpEntity)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean isRepeatable() { throw new RuntimeException("Stub!"); } 
/*  8 */   public InputStream getContent() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void consumeContent() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public void writeTo(OutputStream outstream) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public void releaseConnection() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void abortConnection() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean eofDetected(InputStream wrapped) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean streamClosed(InputStream wrapped) throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean streamAbort(InputStream wrapped) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   protected void releaseManagedConnection() throws IOException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.BasicManagedEntity
 * JD-Core Version:    0.6.0
 */