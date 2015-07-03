/*    */ package java.sql;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Iterator;
/*    */ 
/*    */ public class SQLException extends Exception
/*    */   implements Serializable, Iterable<Throwable>
/*    */ {
/*    */   public SQLException()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public SQLException(String theReason) { throw new RuntimeException("Stub!"); } 
/*  8 */   public SQLException(String theReason, String theSQLState) { throw new RuntimeException("Stub!"); } 
/*  9 */   public SQLException(String theReason, String theSQLState, int theErrorCode) { throw new RuntimeException("Stub!"); } 
/* 10 */   public SQLException(Throwable theCause) { throw new RuntimeException("Stub!"); } 
/* 11 */   public SQLException(String theReason, Throwable theCause) { throw new RuntimeException("Stub!"); } 
/* 12 */   public SQLException(String theReason, String theSQLState, Throwable theCause) { throw new RuntimeException("Stub!"); } 
/* 13 */   public SQLException(String theReason, String theSQLState, int theErrorCode, Throwable theCause) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getErrorCode() { throw new RuntimeException("Stub!"); } 
/* 15 */   public SQLException getNextException() { throw new RuntimeException("Stub!"); } 
/* 16 */   public String getSQLState() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setNextException(SQLException ex) { throw new RuntimeException("Stub!"); } 
/* 18 */   public Iterator<Throwable> iterator() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.SQLException
 * JD-Core Version:    0.6.0
 */