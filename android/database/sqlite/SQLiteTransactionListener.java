package android.database.sqlite;

public abstract interface SQLiteTransactionListener
{
  public abstract void onBegin();

  public abstract void onCommit();

  public abstract void onRollback();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.database.sqlite.SQLiteTransactionListener
 * JD-Core Version:    0.6.0
 */