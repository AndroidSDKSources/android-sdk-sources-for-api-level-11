/*    */ package android.util;
/*    */ 
/*    */ public final class Log
/*    */ {
/*    */   public static final int VERBOSE = 2;
/*    */   public static final int DEBUG = 3;
/*    */   public static final int INFO = 4;
/*    */   public static final int WARN = 5;
/*    */   public static final int ERROR = 6;
/*    */   public static final int ASSERT = 7;
/*    */ 
/*    */   Log()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static int v(String tag, String msg) { throw new RuntimeException("Stub!"); } 
/*  6 */   public static int v(String tag, String msg, Throwable tr) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static int d(String tag, String msg) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static int d(String tag, String msg, Throwable tr) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static int i(String tag, String msg) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static int i(String tag, String msg, Throwable tr) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static int w(String tag, String msg) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static int w(String tag, String msg, Throwable tr) { throw new RuntimeException("Stub!"); } 
/*    */   public static native boolean isLoggable(String paramString, int paramInt);
/*    */ 
/* 14 */   public static int w(String tag, Throwable tr) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static int e(String tag, String msg) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static int e(String tag, String msg, Throwable tr) { throw new RuntimeException("Stub!"); } 
/* 17 */   public static int wtf(String tag, String msg) { throw new RuntimeException("Stub!"); } 
/* 18 */   public static int wtf(String tag, Throwable tr) { throw new RuntimeException("Stub!"); } 
/* 19 */   public static int wtf(String tag, String msg, Throwable tr) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static String getStackTraceString(Throwable tr) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static int println(int priority, String tag, String msg) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.util.Log
 * JD-Core Version:    0.6.0
 */