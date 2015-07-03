/*   */ package javax.sql;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ import java.sql.SQLException;
/*   */ import java.util.EventObject;
/*   */ 
/*   */ public class ConnectionEvent extends EventObject
/*   */   implements Serializable
/*   */ {
/*   */   public ConnectionEvent(PooledConnection theConnection)
/*   */   {
/* 6 */     super((Object)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public ConnectionEvent(PooledConnection theConnection, SQLException theException) { super((Object)null); throw new RuntimeException("Stub!"); } 
/* 8 */   public SQLException getSQLException() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.sql.ConnectionEvent
 * JD-Core Version:    0.6.0
 */