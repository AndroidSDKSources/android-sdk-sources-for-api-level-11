package javax.sql;

import java.util.EventListener;

public abstract interface RowSetListener extends EventListener
{
  public abstract void cursorMoved(RowSetEvent paramRowSetEvent);

  public abstract void rowChanged(RowSetEvent paramRowSetEvent);

  public abstract void rowSetChanged(RowSetEvent paramRowSetEvent);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.sql.RowSetListener
 * JD-Core Version:    0.6.0
 */