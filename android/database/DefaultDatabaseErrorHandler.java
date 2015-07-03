/*   */ package android.database;
/*   */ 
/*   */ import android.database.sqlite.SQLiteDatabase;
/*   */ 
/*   */ public final class DefaultDatabaseErrorHandler
/*   */   implements DatabaseErrorHandler
/*   */ {
/*   */   public DefaultDatabaseErrorHandler()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public void onCorruption(SQLiteDatabase dbObj) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.database.DefaultDatabaseErrorHandler
 * JD-Core Version:    0.6.0
 */