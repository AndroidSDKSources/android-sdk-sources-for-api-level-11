/*    */ package android.database.sqlite;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class SQLiteQueryBuilder
/*    */ {
/*    */   public SQLiteQueryBuilder()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void setDistinct(boolean distinct) { throw new RuntimeException("Stub!"); } 
/*  6 */   public String getTables() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setTables(String inTables) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void appendWhere(CharSequence inWhere) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void appendWhereEscapeString(String inWhere) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void setProjectionMap(Map<String, String> columnMap) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setCursorFactory(SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static String buildQueryString(boolean distinct, String tables, String[] columns, String where, String groupBy, String having, String orderBy, String limit) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static void appendColumns(StringBuilder s, String[] columns) { throw new RuntimeException("Stub!"); } 
/* 14 */   public Cursor query(SQLiteDatabase db, String[] projectionIn, String selection, String[] selectionArgs, String groupBy, String having, String sortOrder) { throw new RuntimeException("Stub!"); } 
/* 15 */   public Cursor query(SQLiteDatabase db, String[] projectionIn, String selection, String[] selectionArgs, String groupBy, String having, String sortOrder, String limit) { throw new RuntimeException("Stub!"); } 
/* 16 */   public String buildQuery(String[] projectionIn, String selection, String groupBy, String having, String sortOrder, String limit) { throw new RuntimeException("Stub!"); } 
/* 17 */   public String buildQuery(String[] projectionIn, String selection, String[] selectionArgs, String groupBy, String having, String sortOrder, String limit) { throw new RuntimeException("Stub!"); } 
/* 18 */   public String buildUnionSubQuery(String typeDiscriminatorColumn, String[] unionColumns, Set<String> columnsPresentInTable, int computedColumnsOffset, String typeDiscriminatorValue, String selection, String groupBy, String having) { throw new RuntimeException("Stub!"); } 
/* 19 */   public String buildUnionSubQuery(String typeDiscriminatorColumn, String[] unionColumns, Set<String> columnsPresentInTable, int computedColumnsOffset, String typeDiscriminatorValue, String selection, String[] selectionArgs, String groupBy, String having) { throw new RuntimeException("Stub!"); } 
/* 20 */   public String buildUnionQuery(String[] subQueries, String sortOrder, String limit) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.database.sqlite.SQLiteQueryBuilder
 * JD-Core Version:    0.6.0
 */