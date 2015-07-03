/*    */ package android.database.sqlite;
/*    */ 
/*    */ import android.content.ContentValues;
/*    */ import android.database.Cursor;
/*    */ import android.database.DatabaseErrorHandler;
/*    */ import android.database.SQLException;
/*    */ import android.util.Pair;
/*    */ import java.io.File;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class SQLiteDatabase extends SQLiteClosable
/*    */ {
/*    */   public static final int CONFLICT_ROLLBACK = 1;
/*    */   public static final int CONFLICT_ABORT = 2;
/*    */   public static final int CONFLICT_FAIL = 3;
/*    */   public static final int CONFLICT_IGNORE = 4;
/*    */   public static final int CONFLICT_REPLACE = 5;
/*    */   public static final int CONFLICT_NONE = 0;
/*    */   public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
/*    */   public static final int OPEN_READWRITE = 0;
/*    */   public static final int OPEN_READONLY = 1;
/*    */   public static final int NO_LOCALIZED_COLLATORS = 16;
/*    */   public static final int CREATE_IF_NECESSARY = 268435456;
/*    */   public static final int MAX_SQL_CACHE_SIZE = 100;
/*    */ 
/*    */   SQLiteDatabase()
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   protected void onAllReferencesReleased() { throw new RuntimeException("Stub!"); } 
/*    */   public static native int releaseMemory();
/*    */ 
/* 12 */   public void setLockingEnabled(boolean lockingEnabled) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void beginTransaction() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void beginTransactionNonExclusive() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void endTransaction() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setTransactionSuccessful() { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean inTransaction() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean isDbLockedByCurrentThread() { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean isDbLockedByOtherThreads() { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean yieldIfContended() { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean yieldIfContendedSafely() { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean yieldIfContendedSafely(long sleepAfterYieldDelay) { throw new RuntimeException("Stub!"); } 
/* 25 */   public Map<String, String> getSyncedTables() { throw new RuntimeException("Stub!"); } 
/* 26 */   public static SQLiteDatabase openDatabase(String path, CursorFactory factory, int flags) { throw new RuntimeException("Stub!"); } 
/* 27 */   public static SQLiteDatabase openDatabase(String path, CursorFactory factory, int flags, DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); } 
/* 28 */   public static SQLiteDatabase openOrCreateDatabase(File file, CursorFactory factory) { throw new RuntimeException("Stub!"); } 
/* 29 */   public static SQLiteDatabase openOrCreateDatabase(String path, CursorFactory factory) { throw new RuntimeException("Stub!"); } 
/* 30 */   public static SQLiteDatabase openOrCreateDatabase(String path, CursorFactory factory, DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); } 
/* 31 */   public static SQLiteDatabase create(CursorFactory factory) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 33 */   public int getVersion() { throw new RuntimeException("Stub!"); } 
/* 34 */   public void setVersion(int version) { throw new RuntimeException("Stub!"); } 
/* 35 */   public long getMaximumSize() { throw new RuntimeException("Stub!"); } 
/* 36 */   public long setMaximumSize(long numBytes) { throw new RuntimeException("Stub!"); } 
/* 37 */   public long getPageSize() { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setPageSize(long numBytes) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void markTableSyncable(String table, String deletedTable) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void markTableSyncable(String table, String foreignKey, String updateTable) { throw new RuntimeException("Stub!"); } 
/* 41 */   public static String findEditTable(String tables) { throw new RuntimeException("Stub!"); } 
/* 42 */   public SQLiteStatement compileStatement(String sql) throws SQLException { throw new RuntimeException("Stub!"); } 
/* 43 */   public Cursor query(boolean distinct, String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit) { throw new RuntimeException("Stub!"); } 
/* 44 */   public Cursor queryWithFactory(CursorFactory cursorFactory, boolean distinct, String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit) { throw new RuntimeException("Stub!"); } 
/* 45 */   public Cursor query(String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy) { throw new RuntimeException("Stub!"); } 
/* 46 */   public Cursor query(String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit) { throw new RuntimeException("Stub!"); } 
/* 47 */   public Cursor rawQuery(String sql, String[] selectionArgs) { throw new RuntimeException("Stub!"); } 
/* 48 */   public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String sql, String[] selectionArgs, String editTable) { throw new RuntimeException("Stub!"); } 
/* 49 */   public long insert(String table, String nullColumnHack, ContentValues values) { throw new RuntimeException("Stub!"); } 
/* 50 */   public long insertOrThrow(String table, String nullColumnHack, ContentValues values) throws SQLException { throw new RuntimeException("Stub!"); } 
/* 51 */   public long replace(String table, String nullColumnHack, ContentValues initialValues) { throw new RuntimeException("Stub!"); } 
/* 52 */   public long replaceOrThrow(String table, String nullColumnHack, ContentValues initialValues) throws SQLException { throw new RuntimeException("Stub!"); } 
/* 53 */   public long insertWithOnConflict(String table, String nullColumnHack, ContentValues initialValues, int conflictAlgorithm) { throw new RuntimeException("Stub!"); } 
/* 54 */   public int delete(String table, String whereClause, String[] whereArgs) { throw new RuntimeException("Stub!"); } 
/* 55 */   public int update(String table, ContentValues values, String whereClause, String[] whereArgs) { throw new RuntimeException("Stub!"); } 
/* 56 */   public int updateWithOnConflict(String table, ContentValues values, String whereClause, String[] whereArgs, int conflictAlgorithm) { throw new RuntimeException("Stub!"); } 
/* 57 */   public void execSQL(String sql) throws SQLException { throw new RuntimeException("Stub!"); } 
/* 58 */   public void execSQL(String sql, Object[] bindArgs) throws SQLException { throw new RuntimeException("Stub!"); } 
/* 59 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/* 60 */   public boolean isReadOnly() { throw new RuntimeException("Stub!"); } 
/* 61 */   public boolean isOpen() { throw new RuntimeException("Stub!"); } 
/* 62 */   public boolean needUpgrade(int newVersion) { throw new RuntimeException("Stub!"); } 
/* 63 */   public final String getPath() { throw new RuntimeException("Stub!"); } 
/* 64 */   public void setLocale(Locale locale) { throw new RuntimeException("Stub!"); } 
/* 65 */   public void setMaxSqlCacheSize(int cacheSize) { throw new RuntimeException("Stub!"); } 
/* 66 */   public boolean enableWriteAheadLogging() { throw new RuntimeException("Stub!"); } 
/* 67 */   public List<Pair<String, String>> getAttachedDbs() { throw new RuntimeException("Stub!"); } 
/* 68 */   public boolean isDatabaseIntegrityOk() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface CursorFactory
/*    */   {
/*    */     public abstract Cursor newCursor(SQLiteDatabase paramSQLiteDatabase, SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteQuery paramSQLiteQuery);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.database.sqlite.SQLiteDatabase
 * JD-Core Version:    0.6.0
 */