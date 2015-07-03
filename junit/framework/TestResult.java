/*    */ package junit.framework;
/*    */ 
/*    */ import java.util.Enumeration;
/*    */ import java.util.Vector;
/*    */ 
/*    */ public class TestResult
/*    */ {
/*    */   protected Vector fFailures;
/*    */   protected Vector fErrors;
/*    */   protected Vector fListeners;
/*    */   protected int fRunTests;
/*    */ 
/*    */   public TestResult()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public synchronized void addError(Test test, Throwable t) { throw new RuntimeException("Stub!"); } 
/*  6 */   public synchronized void addFailure(Test test, AssertionFailedError t) { throw new RuntimeException("Stub!"); } 
/*  7 */   public synchronized void addListener(TestListener listener) { throw new RuntimeException("Stub!"); } 
/*  8 */   public synchronized void removeListener(TestListener listener) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void endTest(Test test) { throw new RuntimeException("Stub!"); } 
/* 10 */   public synchronized int errorCount() { throw new RuntimeException("Stub!"); } 
/* 11 */   public synchronized Enumeration errors() { throw new RuntimeException("Stub!"); } 
/* 12 */   public synchronized int failureCount() { throw new RuntimeException("Stub!"); } 
/* 13 */   public synchronized Enumeration failures() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected void run(TestCase test) { throw new RuntimeException("Stub!"); } 
/* 15 */   public synchronized int runCount() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void runProtected(Test test, Protectable p) { throw new RuntimeException("Stub!"); } 
/* 17 */   public synchronized boolean shouldStop() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void startTest(Test test) { throw new RuntimeException("Stub!"); } 
/* 19 */   public synchronized void stop() { throw new RuntimeException("Stub!"); } 
/* 20 */   public synchronized boolean wasSuccessful() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     junit.framework.TestResult
 * JD-Core Version:    0.6.0
 */