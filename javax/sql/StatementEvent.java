/*   */ package javax.sql;
/*   */ 
/*   */ import java.sql.PreparedStatement;
/*   */ import java.sql.SQLException;
/*   */ import java.util.EventObject;
/*   */ 
/*   */ public class StatementEvent extends EventObject
/*   */ {
/*   */   public StatementEvent(PooledConnection con, PreparedStatement statement, SQLException exception)
/*   */   {
/* 5 */     super((Object)null); throw new RuntimeException("Stub!"); } 
/* 6 */   public StatementEvent(PooledConnection con, PreparedStatement statement) { super((Object)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public PreparedStatement getStatement() { throw new RuntimeException("Stub!"); } 
/* 8 */   public SQLException getSQLException() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.sql.StatementEvent
 * JD-Core Version:    0.6.0
 */