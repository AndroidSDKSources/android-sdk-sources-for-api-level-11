/*    */ package java.util.logging;
/*    */ 
/*    */ import java.beans.PropertyChangeListener;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.Enumeration;
/*    */ 
/*    */ public class LogManager
/*    */ {
/*    */   public static final String LOGGING_MXBEAN_NAME = "java.util.logging:type=Logging";
/*    */ 
/*    */   protected LogManager()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static LoggingMXBean getLoggingMXBean() { throw new RuntimeException("Stub!"); } 
/*  6 */   public void checkAccess() { throw new RuntimeException("Stub!"); } 
/*  7 */   public synchronized boolean addLogger(Logger logger) { throw new RuntimeException("Stub!"); } 
/*  8 */   public synchronized Logger getLogger(String name) { throw new RuntimeException("Stub!"); } 
/*  9 */   public synchronized Enumeration<String> getLoggerNames() { throw new RuntimeException("Stub!"); } 
/* 10 */   public static LogManager getLogManager() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getProperty(String name) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void readConfiguration() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void readConfiguration(InputStream ins) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public synchronized void reset() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void addPropertyChangeListener(PropertyChangeListener l) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void removePropertyChangeListener(PropertyChangeListener l) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.logging.LogManager
 * JD-Core Version:    0.6.0
 */