package android.database;

import android.database.sqlite.SQLiteDatabase;

public abstract interface DatabaseErrorHandler
{
  public abstract void onCorruption(SQLiteDatabase paramSQLiteDatabase);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.database.DatabaseErrorHandler
 * JD-Core Version:    0.6.0
 */