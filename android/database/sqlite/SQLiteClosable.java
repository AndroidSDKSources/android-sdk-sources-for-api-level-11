/*   */ package android.database.sqlite;
/*   */ 
/*   */ public abstract class SQLiteClosable
/*   */ {
/*   */   public SQLiteClosable()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/*   */   protected abstract void onAllReferencesReleased();
/*   */ 
/* 6 */   protected void onAllReferencesReleasedFromContainer() { throw new RuntimeException("Stub!"); } 
/* 7 */   public void acquireReference() { throw new RuntimeException("Stub!"); } 
/* 8 */   public void releaseReference() { throw new RuntimeException("Stub!"); } 
/* 9 */   public void releaseReferenceFromContainer() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.database.sqlite.SQLiteClosable
 * JD-Core Version:    0.6.0
 */