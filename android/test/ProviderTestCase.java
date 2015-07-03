/*    */ package android.test;
/*    */ 
/*    */ import android.content.ContentProvider;
/*    */ import android.content.ContentResolver;
/*    */ import android.content.Context;
/*    */ import android.test.mock.MockContentResolver;
/*    */ 
/*    */ @Deprecated
/*    */ public abstract class ProviderTestCase<T extends ContentProvider> extends InstrumentationTestCase
/*    */ {
/*    */   public ProviderTestCase(Class<T> providerClass, String providerAuthority)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public T getProvider() { throw new RuntimeException("Stub!"); } 
/*  8 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); } 
/*  9 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); } 
/* 10 */   public MockContentResolver getMockContentResolver() { throw new RuntimeException("Stub!"); } 
/* 11 */   public IsolatedContext getMockContext() { throw new RuntimeException("Stub!"); } 
/* 12 */   public static <T extends ContentProvider> ContentResolver newResolverWithContentProviderFromSql(Context targetContext, Class<T> providerClass, String authority, String databaseName, int databaseVersion, String sql) throws IllegalAccessException, InstantiationException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.ProviderTestCase
 * JD-Core Version:    0.6.0
 */