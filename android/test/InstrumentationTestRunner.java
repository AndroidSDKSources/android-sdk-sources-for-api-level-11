/*    */ package android.test;
/*    */ 
/*    */ import android.app.Instrumentation;
/*    */ import android.os.Bundle;
/*    */ import junit.framework.TestSuite;
/*    */ 
/*    */ public class InstrumentationTestRunner extends Instrumentation
/*    */   implements TestSuiteProvider
/*    */ {
/*    */   public static final String REPORT_VALUE_ID = "InstrumentationTestRunner";
/*    */   public static final String REPORT_KEY_NUM_TOTAL = "numtests";
/*    */   public static final String REPORT_KEY_NUM_CURRENT = "current";
/*    */   public static final String REPORT_KEY_NAME_CLASS = "class";
/*    */   public static final String REPORT_KEY_NAME_TEST = "test";
/*    */   public static final int REPORT_VALUE_RESULT_START = 1;
/*    */   public static final int REPORT_VALUE_RESULT_OK = 0;
/*    */   public static final int REPORT_VALUE_RESULT_ERROR = -1;
/*    */   public static final int REPORT_VALUE_RESULT_FAILURE = -2;
/*    */   public static final String REPORT_KEY_STACK = "stack";
/*    */ 
/*    */   public InstrumentationTestRunner()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public void onCreate(Bundle arguments) { throw new RuntimeException("Stub!"); } 
/*  8 */   protected AndroidTestRunner getAndroidTestRunner() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void onStart() { throw new RuntimeException("Stub!"); } 
/* 10 */   public TestSuite getTestSuite() { throw new RuntimeException("Stub!"); } 
/* 11 */   public TestSuite getAllTests() { throw new RuntimeException("Stub!"); } 
/* 12 */   public ClassLoader getLoader() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.InstrumentationTestRunner
 * JD-Core Version:    0.6.0
 */