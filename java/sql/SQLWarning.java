/*    */ package java.sql;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class SQLWarning extends SQLException
/*    */   implements Serializable
/*    */ {
/*    */   public SQLWarning()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public SQLWarning(String theReason) { throw new RuntimeException("Stub!"); } 
/*  8 */   public SQLWarning(String theReason, String theSQLState) { throw new RuntimeException("Stub!"); } 
/*  9 */   public SQLWarning(String theReason, String theSQLState, int theErrorCode) { throw new RuntimeException("Stub!"); } 
/* 10 */   public SQLWarning(Throwable cause) { throw new RuntimeException("Stub!"); } 
/* 11 */   public SQLWarning(String reason, Throwable cause) { throw new RuntimeException("Stub!"); } 
/* 12 */   public SQLWarning(String reason, String SQLState, Throwable cause) { throw new RuntimeException("Stub!"); } 
/* 13 */   public SQLWarning(String reason, String SQLState, int vendorCode, Throwable cause) { throw new RuntimeException("Stub!"); } 
/* 14 */   public SQLWarning getNextWarning() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setNextWarning(SQLWarning w) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.SQLWarning
 * JD-Core Version:    0.6.0
 */