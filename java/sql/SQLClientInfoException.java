/*    */ package java.sql;
/*    */ 
/*    */ import java.util.Map;
/*    */ 
/*    */ public class SQLClientInfoException extends SQLException
/*    */ {
/*    */   public SQLClientInfoException()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public SQLClientInfoException(Map<String, ClientInfoStatus> failedProperties) { throw new RuntimeException("Stub!"); } 
/*  7 */   public SQLClientInfoException(Map<String, ClientInfoStatus> failedProperties, Throwable cause) { throw new RuntimeException("Stub!"); } 
/*  8 */   public SQLClientInfoException(String reason, Map<String, ClientInfoStatus> failedProperties) { throw new RuntimeException("Stub!"); } 
/*  9 */   public SQLClientInfoException(String reason, Map<String, ClientInfoStatus> failedProperties, Throwable cause) { throw new RuntimeException("Stub!"); } 
/* 10 */   public SQLClientInfoException(String reason, String sqlState, int vendorCode, Map<String, ClientInfoStatus> failedProperties) { throw new RuntimeException("Stub!"); } 
/* 11 */   public SQLClientInfoException(String reason, String sqlState, int vendorCode, Map<String, ClientInfoStatus> failedProperties, Throwable cause) { throw new RuntimeException("Stub!"); } 
/* 12 */   public SQLClientInfoException(String reason, String sqlState, Map<String, ClientInfoStatus> failedProperties) { throw new RuntimeException("Stub!"); } 
/* 13 */   public SQLClientInfoException(String reason, String sqlState, Map<String, ClientInfoStatus> failedProperties, Throwable cause) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Map<String, ClientInfoStatus> getFailedProperties() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.SQLClientInfoException
 * JD-Core Version:    0.6.0
 */