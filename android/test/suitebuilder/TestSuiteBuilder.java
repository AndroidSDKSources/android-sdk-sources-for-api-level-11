/*    */ package android.test.suitebuilder;
/*    */ 
/*    */ import com.android.internal.util.Predicate;
/*    */ import java.util.List;
/*    */ import junit.framework.TestCase;
/*    */ import junit.framework.TestSuite;
/*    */ 
/*    */ public class TestSuiteBuilder
/*    */ {
/*    */   public TestSuiteBuilder(Class clazz)
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public TestSuiteBuilder(String name, ClassLoader classLoader) { throw new RuntimeException("Stub!"); } 
/* 12 */   public TestSuiteBuilder includePackages(String[] packageNames) { throw new RuntimeException("Stub!"); } 
/* 13 */   public TestSuiteBuilder excludePackages(String[] packageNames) { throw new RuntimeException("Stub!"); } 
/* 14 */   public TestSuiteBuilder addRequirements(List<Predicate<TestMethod>> predicates) { throw new RuntimeException("Stub!"); } 
/* 15 */   public final TestSuiteBuilder includeAllPackagesUnderHere() { throw new RuntimeException("Stub!"); } 
/* 16 */   public TestSuiteBuilder named(String newSuiteName) { throw new RuntimeException("Stub!"); } 
/* 17 */   public final TestSuite build() { throw new RuntimeException("Stub!"); } 
/* 18 */   protected String getSuiteName() { throw new RuntimeException("Stub!"); } 
/* 19 */   public final TestSuiteBuilder addRequirements(Predicate<TestMethod>[] predicates) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class FailedToCreateTests extends TestCase
/*    */   {
/*    */     public FailedToCreateTests(Exception exception)
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public void testSuiteConstructionFailed() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.suitebuilder.TestSuiteBuilder
 * JD-Core Version:    0.6.0
 */