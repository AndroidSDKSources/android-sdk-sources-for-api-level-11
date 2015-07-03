/*    */ package java.sql;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class BatchUpdateException extends SQLException
/*    */   implements Serializable
/*    */ {
/*    */   public BatchUpdateException()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public BatchUpdateException(Throwable cause) { throw new RuntimeException("Stub!"); } 
/*  8 */   public BatchUpdateException(int[] updateCounts, Throwable cause) { throw new RuntimeException("Stub!"); } 
/*  9 */   public BatchUpdateException(String reason, int[] updateCounts, Throwable cause) { throw new RuntimeException("Stub!"); } 
/* 10 */   public BatchUpdateException(String reason, String SQLState, int[] updateCounts, Throwable cause) { throw new RuntimeException("Stub!"); } 
/* 11 */   public BatchUpdateException(String reason, String SQLState, int vendorCode, int[] updateCounts, Throwable cause) { throw new RuntimeException("Stub!"); } 
/* 12 */   public BatchUpdateException(int[] updateCounts) { throw new RuntimeException("Stub!"); } 
/* 13 */   public BatchUpdateException(String reason, int[] updateCounts) { throw new RuntimeException("Stub!"); } 
/* 14 */   public BatchUpdateException(String reason, String SQLState, int[] updateCounts) { throw new RuntimeException("Stub!"); } 
/* 15 */   public BatchUpdateException(String reason, String SQLState, int vendorCode, int[] updateCounts) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int[] getUpdateCounts() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.BatchUpdateException
 * JD-Core Version:    0.6.0
 */