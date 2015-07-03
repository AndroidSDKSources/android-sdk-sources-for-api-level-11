/*    */ package java.util.logging;
/*    */ 
/*    */ import java.util.ResourceBundle;
/*    */ 
/*    */ public class Logger
/*    */ {
/*    */   public static final String GLOBAL_LOGGER_NAME = "global";
/* 52 */   public static final Logger global = null;
/*    */ 
/*    */   protected Logger(String name, String resourceBundleName)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static Logger getAnonymousLogger() { throw new RuntimeException("Stub!"); } 
/*  6 */   public static Logger getAnonymousLogger(String resourceBundleName) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static Logger getLogger(String name) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static Logger getLogger(String name, String resourceBundleName) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void addHandler(Handler handler) { throw new RuntimeException("Stub!"); } 
/* 10 */   public Handler[] getHandlers() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void removeHandler(Handler handler) { throw new RuntimeException("Stub!"); } 
/* 12 */   public Filter getFilter() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setFilter(Filter newFilter) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Level getLevel() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setLevel(Level newLevel) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean getUseParentHandlers() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setUseParentHandlers(boolean notifyParentHandlers) { throw new RuntimeException("Stub!"); } 
/* 18 */   public Logger getParent() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setParent(Logger parent) { throw new RuntimeException("Stub!"); } 
/* 20 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 21 */   public ResourceBundle getResourceBundle() { throw new RuntimeException("Stub!"); } 
/* 22 */   public String getResourceBundleName() { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean isLoggable(Level l) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void entering(String sourceClass, String sourceMethod) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void entering(String sourceClass, String sourceMethod, Object param) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void entering(String sourceClass, String sourceMethod, Object[] params) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void exiting(String sourceClass, String sourceMethod) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void exiting(String sourceClass, String sourceMethod, Object result) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void throwing(String sourceClass, String sourceMethod, Throwable thrown) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void severe(String msg) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void warning(String msg) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void info(String msg) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void config(String msg) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void fine(String msg) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void finer(String msg) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void finest(String msg) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void log(Level logLevel, String msg) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void log(Level logLevel, String msg, Object param) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void log(Level logLevel, String msg, Object[] params) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void log(Level logLevel, String msg, Throwable thrown) { throw new RuntimeException("Stub!"); } 
/* 41 */   public void log(LogRecord record) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void logp(Level logLevel, String sourceClass, String sourceMethod, String msg) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void logp(Level logLevel, String sourceClass, String sourceMethod, String msg, Object param) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void logp(Level logLevel, String sourceClass, String sourceMethod, String msg, Object[] params) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void logp(Level logLevel, String sourceClass, String sourceMethod, String msg, Throwable thrown) { throw new RuntimeException("Stub!"); } 
/* 46 */   public void logrb(Level logLevel, String sourceClass, String sourceMethod, String bundleName, String msg) { throw new RuntimeException("Stub!"); } 
/* 47 */   public void logrb(Level logLevel, String sourceClass, String sourceMethod, String bundleName, String msg, Object param) { throw new RuntimeException("Stub!"); } 
/* 48 */   public void logrb(Level logLevel, String sourceClass, String sourceMethod, String bundleName, String msg, Object[] params) { throw new RuntimeException("Stub!"); } 
/* 49 */   public void logrb(Level logLevel, String sourceClass, String sourceMethod, String bundleName, String msg, Throwable thrown) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.logging.Logger
 * JD-Core Version:    0.6.0
 */