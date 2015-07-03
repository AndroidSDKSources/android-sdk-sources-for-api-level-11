package android.database;

public abstract interface CrossProcessCursor extends Cursor
{
  public abstract CursorWindow getWindow();

  public abstract void fillWindow(int paramInt, CursorWindow paramCursorWindow);

  public abstract boolean onMove(int paramInt1, int paramInt2);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.database.CrossProcessCursor
 * JD-Core Version:    0.6.0
 */