/*    */ package java.sql;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.Enumeration;
/*    */ import java.util.Properties;
/*    */ 
/*    */ public class DriverManager
/*    */ {
/*    */   DriverManager()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static void deregisterDriver(Driver driver) throws SQLException { throw new RuntimeException("Stub!"); } 
/*  6 */   public static Connection getConnection(String url) throws SQLException { throw new RuntimeException("Stub!"); } 
/*  7 */   public static Connection getConnection(String url, Properties info) throws SQLException { throw new RuntimeException("Stub!"); } 
/*  8 */   public static Connection getConnection(String url, String user, String password) throws SQLException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static Driver getDriver(String url) throws SQLException { throw new RuntimeException("Stub!"); } 
/* 10 */   public static Enumeration<Driver> getDrivers() { throw new RuntimeException("Stub!"); } 
/* 11 */   public static int getLoginTimeout() { throw new RuntimeException("Stub!"); } 
/* 12 */   public static PrintStream getLogStream() { throw new RuntimeException("Stub!"); } 
/* 13 */   public static PrintWriter getLogWriter() { throw new RuntimeException("Stub!"); } 
/* 14 */   public static void println(String message) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static void registerDriver(Driver driver) throws SQLException { throw new RuntimeException("Stub!"); } 
/* 16 */   public static void setLoginTimeout(int seconds) { throw new RuntimeException("Stub!"); } 
/* 17 */   public static void setLogStream(PrintStream out) { throw new RuntimeException("Stub!"); } 
/* 18 */   public static void setLogWriter(PrintWriter out) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.DriverManager
 * JD-Core Version:    0.6.0
 */