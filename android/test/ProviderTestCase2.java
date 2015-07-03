/*    */ package android.test;
/*    */ 
/*    */ import android.content.ContentProvider;
/*    */ import android.content.ContentResolver;
/*    */ import android.content.Context;
/*    */ import android.test.mock.MockContentResolver;
/*    */ 
/*    */ public abstract class ProviderTestCase2<T extends ContentProvider> extends AndroidTestCase
/*    */ {
/*    */   public ProviderTestCase2(Class<T> providerClass, String providerAuthority)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public T getProvider() { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); } 
/*  8 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); } 
/*  9 */   public MockContentResolver getMockContentResolver() { throw new RuntimeException("Stub!"); } 
/* 10 */   public IsolatedContext getMockContext() { throw new RuntimeException("Stub!"); } 
/* 11 */   public static <T extends ContentProvider> ContentResolver newResolverWithContentProviderFromSql(Context targetContext, String filenamePrefix, Class<T> providerClass, String authority, String databaseName, int databaseVersion, String sql) throws IllegalAccessException, InstantiationException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.test.ProviderTestCase2
 * JD-Core Version:    0.6.0
 */