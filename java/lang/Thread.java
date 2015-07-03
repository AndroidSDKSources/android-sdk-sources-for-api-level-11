/*    */ package java.lang;
/*    */ 
/*    */ import java.util.Map;
/*    */ 
/*    */ public class Thread
/*    */   implements Runnable
/*    */ {
/*    */   public static final int MAX_PRIORITY = 10;
/*    */   public static final int MIN_PRIORITY = 1;
/*    */   public static final int NORM_PRIORITY = 5;
/*    */ 
/*    */   public Thread()
/*    */   {
/* 18 */     throw new RuntimeException("Stub!"); } 
/* 19 */   public Thread(Runnable runnable) { throw new RuntimeException("Stub!"); } 
/* 20 */   public Thread(Runnable runnable, String threadName) { throw new RuntimeException("Stub!"); } 
/* 21 */   public Thread(String threadName) { throw new RuntimeException("Stub!"); } 
/* 22 */   public Thread(ThreadGroup group, Runnable runnable) { throw new RuntimeException("Stub!"); } 
/* 23 */   public Thread(ThreadGroup group, Runnable runnable, String threadName) { throw new RuntimeException("Stub!"); } 
/* 24 */   public Thread(ThreadGroup group, String threadName) { throw new RuntimeException("Stub!"); } 
/* 25 */   public Thread(ThreadGroup group, Runnable runnable, String threadName, long stackSize) { throw new RuntimeException("Stub!"); } 
/* 26 */   public static int activeCount() { throw new RuntimeException("Stub!"); } 
/* 27 */   public final void checkAccess() { throw new RuntimeException("Stub!"); } 
/* 28 */   public int countStackFrames() { throw new RuntimeException("Stub!"); } 
/* 29 */   public static Thread currentThread() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void destroy() { throw new RuntimeException("Stub!"); } 
/* 31 */   public static void dumpStack() { throw new RuntimeException("Stub!"); } 
/* 32 */   public static int enumerate(Thread[] threads) { throw new RuntimeException("Stub!"); } 
/* 33 */   public static Map<Thread, StackTraceElement[]> getAllStackTraces() { throw new RuntimeException("Stub!"); } 
/* 34 */   public ClassLoader getContextClassLoader() { throw new RuntimeException("Stub!"); } 
/* 35 */   public static UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() { throw new RuntimeException("Stub!"); } 
/* 36 */   public long getId() { throw new RuntimeException("Stub!"); } 
/* 37 */   public final String getName() { throw new RuntimeException("Stub!"); } 
/* 38 */   public final int getPriority() { throw new RuntimeException("Stub!"); } 
/* 39 */   public StackTraceElement[] getStackTrace() { throw new RuntimeException("Stub!"); } 
/* 40 */   public State getState() { throw new RuntimeException("Stub!"); } 
/* 41 */   public final ThreadGroup getThreadGroup() { throw new RuntimeException("Stub!"); } 
/* 42 */   public UncaughtExceptionHandler getUncaughtExceptionHandler() { throw new RuntimeException("Stub!"); } 
/* 43 */   public void interrupt() { throw new RuntimeException("Stub!"); } 
/* 44 */   public static boolean interrupted() { throw new RuntimeException("Stub!"); } 
/* 45 */   public final boolean isAlive() { throw new RuntimeException("Stub!"); } 
/* 46 */   public final boolean isDaemon() { throw new RuntimeException("Stub!"); } 
/* 47 */   public boolean isInterrupted() { throw new RuntimeException("Stub!"); } 
/* 48 */   public final void join() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 49 */   public final void join(long millis) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 50 */   public final void join(long millis, int nanos) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 51 */   public final void resume() { throw new RuntimeException("Stub!"); } 
/* 52 */   public void run() { throw new RuntimeException("Stub!"); } 
/* 53 */   public void setContextClassLoader(ClassLoader cl) { throw new RuntimeException("Stub!"); } 
/* 54 */   public final void setDaemon(boolean isDaemon) { throw new RuntimeException("Stub!"); } 
/* 55 */   public static void setDefaultUncaughtExceptionHandler(UncaughtExceptionHandler handler) { throw new RuntimeException("Stub!"); } 
/* 56 */   public final void setName(String threadName) { throw new RuntimeException("Stub!"); } 
/* 57 */   public final void setPriority(int priority) { throw new RuntimeException("Stub!"); } 
/* 58 */   public void setUncaughtExceptionHandler(UncaughtExceptionHandler handler) { throw new RuntimeException("Stub!"); } 
/* 59 */   public static void sleep(long time) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 60 */   public static void sleep(long millis, int nanos) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 61 */   public synchronized void start() { throw new RuntimeException("Stub!"); } 
/* 62 */   public final void stop() { throw new RuntimeException("Stub!"); } 
/* 63 */   public final synchronized void stop(Throwable throwable) { throw new RuntimeException("Stub!"); } 
/* 64 */   public final void suspend() { throw new RuntimeException("Stub!"); } 
/* 65 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 66 */   public static void yield() { throw new RuntimeException("Stub!"); } 
/* 67 */   public static boolean holdsLock(Object object) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface UncaughtExceptionHandler
/*    */   {
/*    */     public abstract void uncaughtException(Thread paramThread, Throwable paramThrowable);
/*    */   }
/*    */ 
/*    */   public static enum State
/*    */   {
/*  7 */     BLOCKED, 
/*  8 */     NEW, 
/*  9 */     RUNNABLE, 
/* 10 */     TERMINATED, 
/* 11 */     TIMED_WAITING, 
/* 12 */     WAITING;
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.Thread
 * JD-Core Version:    0.6.0
 */