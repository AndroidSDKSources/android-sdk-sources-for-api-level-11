/*    */ package android.test;
/*    */ 
/*    */ import android.app.Instrumentation;
/*    */ import android.content.Context;
/*    */ import java.util.List;
/*    */ import junit.framework.Test;
/*    */ import junit.framework.TestCase;
/*    */ import junit.framework.TestListener;
/*    */ import junit.framework.TestResult;
/*    */ import junit.runner.BaseTestRunner;
/*    */ 
/*    */ public class AndroidTestRunner extends BaseTestRunner
/*    */ {
/*    */   public AndroidTestRunner()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void setTestClassName(String testClassName, String testMethodName) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setTest(Test test) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void clearTestListeners() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void addTestListener(TestListener testListener) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected TestResult createTestResult() { throw new RuntimeException("Stub!"); } 
/* 11 */   public List<TestCase> getTestCases() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getTestClassName() { throw new RuntimeException("Stub!"); } 
/* 13 */   public TestResult getTestResult() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void runTest() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void runTest(TestResult testResult) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setContext(Context context) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setInstrumentation(Instrumentation instrumentation) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setInstrumentaiton(Instrumentation instrumentation) { throw new RuntimeException("Stub!"); } 
/* 19 */   protected Class loadSuiteClass(String suiteClassName) throws ClassNotFoundException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void testStarted(String testName) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void testEnded(String testName) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void testFailed(int status, Test test, Throwable t) { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void runFailed(String message) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.AndroidTestRunner
 * JD-Core Version:    0.6.0
 */