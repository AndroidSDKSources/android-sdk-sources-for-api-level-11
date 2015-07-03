/*    */ package android.database.sqlite;
/*    */ 
/*    */ public abstract class SQLiteProgram extends SQLiteClosable
/*    */ {
/*    */   protected SQLiteDatabase mDatabase;
/*    */   protected int nHandle;
/*    */   protected int nStatement;
/*    */ 
/*    */   SQLiteProgram()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected void onAllReferencesReleased() { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void onAllReferencesReleasedFromContainer() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final int getUniqueId() { throw new RuntimeException("Stub!"); } 
/*  9 */   protected void compile(String sql, boolean forceCompilation) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void bindNull(int index) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void bindLong(int index, long value) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void bindDouble(int index, double value) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void bindString(int index, String value) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void bindBlob(int index, byte[] value) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void clearBindings() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void bindAllArgsAsStrings(String[] bindArgs) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   protected final native void native_compile(String paramString);
/*    */ 
/*    */   protected final native void native_finalize();
/*    */ 
/*    */   protected final native void native_bind_null(int paramInt);
/*    */ 
/*    */   protected final native void native_bind_long(int paramInt, long paramLong);
/*    */ 
/*    */   protected final native void native_bind_double(int paramInt, double paramDouble);
/*    */ 
/*    */   protected final native void native_bind_string(int paramInt, String paramString);
/*    */ 
/*    */   protected final native void native_bind_blob(int paramInt, byte[] paramArrayOfByte);
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.database.sqlite.SQLiteProgram
 * JD-Core Version:    0.6.0
 */